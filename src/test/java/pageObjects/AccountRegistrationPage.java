package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {

		super(driver);
	}

	// Elements
	@FindBy(id = "input-firstname")
	WebElement txtFirstName;

	@FindBy(name = "lastname")
	WebElement txtLastName;

	@FindBy(name = "email")
	WebElement txtEmail;

	@FindBy(name = "password")
	WebElement txtPswd;

	@FindBy(xpath = "//input[@name='newsletter']")
	WebElement rdBtn;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement selectBtn;

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement continueBtn;

	// Action methods

	public void setFirstName(String firstName) {
		txtFirstName.sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		txtLastName.sendKeys(lastName);
	}

	public void enterEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setPassword(String pswd) {
		txtPswd.sendKeys(pswd);
	}

	public void checkRdButton() {
		rdBtn.clear();
		rdBtn.click();
	}

	public void checkSelectButton()

	{
		selectBtn.clear();
		selectBtn.click();
	}

	public void clickContinueButton() {
		// sol1
		continueBtn.click();

		// sol2
		continueBtn.submit();

		// sol3
		Actions act = new Actions(driver);
		act.moveToElement(continueBtn).click().perform();

		// sol4
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", continueBtn);

		// sol5
		continueBtn.sendKeys(Keys.RETURN);

		// sol6
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		myWait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();

	}

	/*
	 * public String getConfirmationMsg()
	 * 
	 * {
	 * 
	 * try { return(msgConfirmation.); } catch(Exception e) {
	 * return(e.getMessage());
	 * 
	 * }
	 */

}
