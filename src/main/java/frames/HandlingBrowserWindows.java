package frames;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowserWindows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();

		// Approach 1 using List collection

		// Capture ids of browser windows
		Set<String> windowIds = driver.getWindowHandles();
		List<String> windows = new ArrayList(windowIds); // This converts set to list

		String parentWindow = windows.get(0);
		String childWindow = windows.get(1);

		/*
		 * Switch to child window driver.switchTo().window(childWindow);
		 * driver.findElement(By.
		 * xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		 * 
		 * //switch to parent window driver.switchTo().window(parentWindow);
		 * driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(
		 * "admin");
		 * driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(
		 * "admin123");
		 * driver.findElement(By.xpath("//button[@type='submit']")).click();
		 */

		// Approach #2 using for loop
		for (String windowId : windowIds) {
			String title = driver.switchTo().window(windowId).getTitle();
			if (title.equals("OrangeHRM HR Software | OrangeHRM")) {
				driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
			}

		}

		// closing a specific browser window

		/*
		 * for(String windowId:windowIds) { String title =
		 * driver.switchTo().window(windowId).getTitle(); if(title.equals("x") ||
		 * title.equals("y") || title.equals("z")) { driver.close(); }
		 * 
		 * }
		 */

		for (String windowId : windowIds) {
			String title = driver.switchTo().window(windowId).getTitle();
			if (title.equals("OrangeHRM")) {
				driver.close();
			}
		}

	}
}