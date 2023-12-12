package Alerts_Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsAndPopups {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

		// driver.switchTo().alert().accept();

		// Alert alertWindow = driver.switchTo().alert();
		Alert alertWindow = mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alertWindow.getText());
		alertWindow.accept(); // this closes the alert window by using the ok button
		// alertWindow.dismiss(); // this closes the alert window by using the cancel
		// button
	}

}
