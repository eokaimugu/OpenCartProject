package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrpDownWithoutSelectTag {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();

		// clicking on the drop down
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();

		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class, multiselect)]//label"));

		// total number of options
		System.out.println("Total number of options: " + options.size());

		// Printing all the options from the drop down

		/*
		 * for(int i=0; i<options.size(); i++) {
		 * System.out.println(options.get(i).getText()); }
		 */

		/*
		 * for(int i=0; i<options.size(); i++) { String option =
		 * options.get(i).getText(); if(option.equals("Java")||option.equals("Python"))
		 * { options.get(i).click();
		 * 
		 * } }
		 */

		for (WebElement option : options) {
			String text = option.getText();

			if (text.equals("Java") || text.equals("Python")) {
				option.click();
			}

		}

	}

}
