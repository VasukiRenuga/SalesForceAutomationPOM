package com.training.test.login;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.*;
import com.training.log.Log;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class LoginTest extends BaseTest {

	WebDriver driver;
	LoginPage login;
	HomePage home;
	CommonUtilities common = new CommonUtilities();

	@BeforeMethod
	public void beforeTest() throws IOException {
		driver = getDriver();
		String url = common.getApplicationProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		login = new LoginPage(driver);
		home = new HomePage(driver);
		}

	@Test(description = "Login Error Message - 1",priority = 1)
	public void LoginErrorMessage1() throws Exception {
		report.startSingleTestReport(Thread.currentThread().getStackTrace()[1].getMethodName());
         log4jXMLReport();
         Log.startTestCase("LoginErrorMessage1()");
         Log.info("LoginErrorMessage1() is the first test case");
		login.EnterintoUserName();
		report.logTestInfo("UserName is entered");
		login.clickLoginButton();
		login.loginErrorMessage();
		System.out.println("Login error message is completed");
		report.logTestInfo("Testcase 1 Login error message is completed");
     }

	@Test(description = "Login To SalesForce -2",priority = 2)
	public void LoginToSalesForce2() throws Exception {
		report.startSingleTestReport(Thread.currentThread().getStackTrace()[1].getMethodName());
		login.loginapplication();
		report.logTestInfo("UserName, Password is entered and Login is clicked");
		System.out.println("Login to Salesforce is completed");
		report.logTestInfo("Testcase 2 Login to Salesforce is completed");
		
		}

	@Test(description = "Check RemeberMe - 3", priority = 3)
	public void Check_RemeberMe_3() throws Exception {
		report.startSingleTestReport(Thread.currentThread().getStackTrace()[1].getMethodName());
		login.EnterintoUserName();
		report.logTestInfo("Username is entered");
		login.EnterIntoPassWord();
		report.logTestInfo("Password is entered");
		login.checkRememberme();
		report.logTestInfo("RememberMe is selected");
		login.clickLoginButton();
		report.logTestInfo("Login is clicked");
		home.HomePageTitle();
		home.enterintoUsermenu();
		report.logTestInfo("UserMenu is clicked");
		home.enterintologout();
		report.logTestInfo("Logout is clicked");
		login.CheckUserField();
		System.out.println("Check Remember Me is completed");
		report.logTestInfo("Testcase 3 Check Remember Me is completed");
}
	   
	
	@Test(description = "Forgot Password- 4A",priority = 4)
	public void Forgot_Password_4_A() throws Exception {
		report.startSingleTestReport(Thread.currentThread().getStackTrace()[1].getMethodName());
		login.EnterintoUserName();
		report.logTestInfo("Username is entered");
		login.forgotPassword();
		login.UserNameField();
		login.Continue();
		login.ForgetPasswordMessage();
		System.out.println("Forget password is completed");
		report.logTestInfo("Testcase 4A Forget password is completed");
	}
	
	@Test(description = "Wrong Password- 4B",priority = 5)
	public void Forgot_Password_4_B() throws Exception {
		report.startSingleTestReport(Thread.currentThread().getStackTrace()[1].getMethodName());
		login.EnterintoUserName();
		report.logTestInfo("Username is entered");
		login.EnterIntoWrongPassword();
		report.logTestInfo("WrongPassword is entered");
		login.clickLoginButton();
		report.logTestInfo("Login is clicked");
		login.WrongPasswordAlertMessage();
			System.out.println("testcase is pass");
			System.out.println("Wrong password is completed");
			report.logTestInfo("Testcase 4B Wrong password is completed");
		}
	}
