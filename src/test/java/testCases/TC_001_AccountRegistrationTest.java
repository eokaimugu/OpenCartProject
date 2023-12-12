package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {

	// Then create the test methods

	@Test
	void test_account_Registration() {
		logger.info("*****Starting TC_001_AccountRegistrationTest****");
		try {
			HomePage hp = new HomePage(driver);
			logger.info("click on My Account Link");
			hp.clickMyAccount();

			logger.info("click on Register Link");
			hp.clickRegister();

			AccountRegistrationPage arp = new AccountRegistrationPage(driver);
			logger.info("Entering customer information");

			arp.setFirstName("Cire");

			arp.setLastName("Iako");

			arp.setPassword("test1223@gmail.com");

			arp.enterEmail(randomString() + "@gmail.com");

			arp.checkRdButton();

			arp.checkSelectButton();

			arp.clickContinueButton();
		} catch (Exception e) {

			Assert.fail();
		}

	}

}
