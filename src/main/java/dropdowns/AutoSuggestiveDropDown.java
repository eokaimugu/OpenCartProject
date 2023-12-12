package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");

		Thread.sleep(3000);
		List<WebElement> count = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));

		System.out.println("Number of suggestions " + count.size());

		for (int i = 0; i < count.size(); i++) {
			String text = count.get(i).getText();
			// System.out.println(count.get(i).getText());
			if (text.equals("selenium python")) {
				count.get(i).click();
				break;
			}
		}

	}

}
