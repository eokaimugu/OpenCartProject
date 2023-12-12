package Alerts_Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsWithInputBox {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

		Alert alertWindow = driver.switchTo().alert();
		System.out.println(alertWindow.getText());
		alertWindow.sendKeys("Welcome");
		alertWindow.accept();

		// Validation
		String text = driver.findElement(By.xpath("//*[@id='result']")).getText();
		String exp_text = "You entered: Welcome";
		if (text.equals(exp_text)) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}

	}

}
