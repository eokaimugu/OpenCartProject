package Alerts_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatePopup {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		String text = driver.findElement(By.xpath("//div[@id='content']/div/p")).getText();

		if (text.contains("Congratulations!")) {
			System.out.println("Login is successful");
		} else {
			System.out.println("Login failed");
		}

	}

}
