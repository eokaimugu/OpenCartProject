package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver); // super keyword used to invoke parent variable or constructor

	}

	// Elements
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement lnkMyAccount;

	@FindBy(linkText = "Register")
	WebElement lnkRegister;

	@FindBy(xpath = "//a[contains(text(), 'Login')]")
	WebElement lnkLogin;

	// Action Methods

	public void clickMyAccount() {
		lnkMyAccount.click();

	}

	public void clickRegister() {
		lnkRegister.click();
	}

	public void clickLogin() {
		lnkLogin.click();
	}

}
