package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/load-dependent-dropdown-on-multi-select-using-php-and-jquery/");
		driver.manage().window().maximize();

		// Select dropdown element
		WebElement drpDown = driver.findElement(By.xpath("//*[@id='country-list']"));

		Select sel = new Select(drpDown);
		// sel.selectByVisibleText("China");
		// sel.selectByValue("5");//use this option only if value attribute is present
		sel.selectByIndex(2);

		// To find the total number of options
		List<WebElement> options = sel.getOptions();
		System.out.println("The total number of options are:" + " " + options.size());

		// To print all the options in on the console

		/*
		 * for(int i=0; i<options.size(); i++) {
		 * System.out.println(options.get(i).getText());
		 * 
		 * }
		 */

		for (WebElement option : options) {
			System.out.println(option.getText());
		}

	}

}
