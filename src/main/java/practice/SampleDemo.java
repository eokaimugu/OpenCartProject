package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleDemo {
	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jotform.com/");
		driver.findElement(
				By.xpath("//a[@class='jfHeader-menuListLink jfHeader-dynamicLink jfHeader-signup-action locale']"))
				.click();
		driver.findElement(By.id("signup-with-email")).click();
		driver.findElement(By.name("name")).sendKeys("Cire Iako");
		driver.findElement(By.id("suEmail")).sendKeys("okaius@comcast.net");
		driver.findElement(By.id("suPassword")).sendKeys("sasta123@abc.com");
		// driver.findElement(By.xpath("//label[@class='noTranslate
		// sacl-terms']")).clear();
		driver.findElement(By.xpath("//label[@class='noTranslate sacl-terms']")).click();
		driver.findElement(By.id("signupButton")).click();

	}

}
