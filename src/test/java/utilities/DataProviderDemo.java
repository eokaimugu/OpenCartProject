package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;

	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
	}

	@Test(dataProvider = "dp")
	void testLogin(String email, String password) {
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("");
		driver.findElement(By.id("Password")).sendKeys("");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

		String exp_title = "nopCommerce demo store. Login";
		String act_title = driver.getTitle();
		Assert.assertEquals(exp_title, act_title);
	}

	@AfterClass
	void tearDown() {
		driver.close();
	}

	@DataProvider(name = "dp")
	String[][] loginData() {
		String data[][] = { { "abcd@gmail.com", "test1234" }, { "efgh@gmail.com", "test456" },
				{ "eokai123@gmail.com", "test6789" }, { "okaius@comcast.net", "2Cor5+vrs17" }

		};

		return data;
	}

}
