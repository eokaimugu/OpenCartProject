package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebLinksDemo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		driver = new ChromeDriver(options);
		// WebDriverManager.chromedriver().setup(); // not needed in current selenium
		// webdriver.
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		// driver.switchTo().newWindow(WindowType.TAB);
		int list = driver.findElements(By.tagName("a")).size();
		System.out.println(list);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {
			if (link.getText().contains("Sign in")) {
				// Thread.sleep(1000);
				link.click();
			}
		}

	}

}
