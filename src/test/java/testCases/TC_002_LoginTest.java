package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {

	@Test
	public void loginTest()

	{
		try {

			logger.info("----Starting TC_002LoginTest---");

			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();

			LoginPage lp = new LoginPage(driver);
			lp.setEmail(rb.getString("email"));
			lp.setPassword(rb.getString("password"));
			lp.clickLoginBtn();

			MyAccountPage map = new MyAccountPage(driver);
			boolean targetPage = map.myAccountPageExixts();
			Assert.assertEquals(targetPage, true);

		} catch (Exception e) {
			Assert.fail();
		}

		logger.info("---Finioshed TC-002_loginTest---");
	}

}
