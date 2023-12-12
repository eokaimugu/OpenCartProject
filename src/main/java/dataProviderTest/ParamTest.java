package dataProviderTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParamTest {
	WebDriver driver;

	@BeforeMethod
	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	void testLog() {
		try {
			boolean status = driver.findElement(By.xpath("/html/body/nav/div/a/img")).isDisplayed();
			AssertJUnit.assertEquals(status, true);
		} catch (Exception e) {
			AssertJUnit.fail();
		}
	}

	@Test(priority = 2)
	void verifyHp() {
		String pageTitle = driver.getTitle();
		AssertJUnit.assertEquals(pageTitle, "OrangeHRM HR Software | OrangeHRM");
	}

	@AfterClass
	void close() {
		driver.close();
	}
}
