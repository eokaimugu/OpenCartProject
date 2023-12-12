package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxesDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();

		// selecting a specific check box
		// driver.findElement(By.xpath("//input[@id='monday']"));

		// total number of check boxes
		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@class='form-check-input' and@type='checkbox]'"));
		System.out.println(checkboxes.size());

		// selecting all check boxes
		/*
		 * for(int i=0; i<checkboxes.size(); i++) { checkboxes.get(i).click(); }
		 */

		for (WebElement chkbox : checkboxes) {
			chkbox.click();
		}

		// select last two check boxes
		// total number of check boxes minus how many check boxes to be
		// selected=starting index
		// to select last 3 check boxes 7-3=4 (starting index)

		for (int i = 4; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}

		// selecting only the first two boxes

		/*
		 * for(int i=0; i<2; i++) { checkboxes.get(i).click(); }
		 */

		for (int i = 0; i < checkboxes.size(); i++) {
			if (i < 3) {
				checkboxes.get(i).click();
			}
		}

		for (WebElement chkbox : checkboxes) {
			if (chkbox.isSelected()) {
				chkbox.click();
			}
		}
	}

}
