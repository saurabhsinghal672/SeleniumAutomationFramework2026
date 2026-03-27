package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ExtentReportManager;

public class LoginTest extends BaseTest{
	
	@Test
	public void testValidLogin() {
		
		utils.Log.info("Starting the login test....");
		test = ExtentReportManager.createTest("Login Test");
		test.info("Navigating to url...");
		LoginPage loginpage = new LoginPage(driver);
		
		utils.Log.info("Adding credentials..");
		test.info("Adding the credentials");
		loginpage.enterUsername("admin@yourstore.com");
		loginpage.enterPassword("admin");
		test.info("Clicking the login button");
		loginpage.clickLogin();
		System.out.println(driver.getTitle());
		utils.Log.info("Verifying page title...");
		Assert.assertEquals(driver.getTitle(), "Dashboard / nopCommerce administration");
		test.pass("Login Successfull");
	}
	


}
