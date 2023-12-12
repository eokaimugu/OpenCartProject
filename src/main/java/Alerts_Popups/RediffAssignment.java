package Alerts_Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("admin");
		// driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.name("proceed")).click();

		Alert alertWindow = driver.switchTo().alert();
		String windowText = alertWindow.getText();
		if (windowText.equals("Please enter a valid user name")) {
			System.out.println("Well done");
		} else {
			System.out.println("Try again");
		}

	}

}
