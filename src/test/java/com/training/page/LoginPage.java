package com.training.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.training.base.*;
import com.training.utilities.CommonUtilities;

public class LoginPage extends Basepage {
	CommonUtilities common = new CommonUtilities();
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='username']")
	WebElement Uname;
	@FindBy(xpath = "//input[@id='password']")
	WebElement pwd;
	@FindBy(xpath = "//div[@id='error']")
	WebElement errormessage;
	@FindBy(xpath = "//*[@id='Login']")
	WebElement login;
	@FindBy(xpath = "//*[@id='rememberUn']")
	WebElement remember;
	@FindBy(xpath="//div[@aria-label='vasuki@123.com']//span")
	WebElement userfield;
	@FindBy(xpath = "//*[@id='forgot_password_link']")
	WebElement Fpwd;
	@FindBy(xpath = ".//*[@id='un']")
	WebElement Fname;
	@FindBy(xpath ="//input[@name='continue']")
	WebElement Continue;
	@FindBy(xpath ="//body//div//p[1]")
	WebElement forgetpwmessage;
	@FindBy(xpath ="//div[@id='error']")
	WebElement WrongPwAlertMge;


	public void enterintoUsername(String strusername) {
		Uname.sendKeys(strusername);
	}

	public void enterIntoPassword(String strpassword) {
		pwd.sendKeys(strpassword);
	}

	public void clickLoginButton() {
		clickObj(login, "Login");
	}

	public WebElement enterintoUsername() {
		return Uname;
	}
	public void EnterintoUserName() throws Exception {
		String Username = common.getApplicationProperty("Uname");
		enterintoUsername(Username);
	}

	public WebElement enterIntoPassword() {
		return pwd;
	}
	public void EnterIntoPassWord() throws Exception {
		String Password = common.getApplicationProperty("pwd");
		enterText(enterIntoPassword(), Password, "Password");
	}
	
	public void loginapplication() throws Exception {
		EnterintoUserName();
		EnterIntoPassWord();
		clickLoginButton();
	}

	public void loginErrorMessage() {
		String actualErrorMessage = driver.findElement(By.xpath("//div[@id='error']")).getText();
		System.out.println(actualErrorMessage);
		String Expect = "Please enter your password.";
		validateErrormessage(actualErrorMessage, Expect);
	}

	public void checkRememberme() {
		selectCheckBox(remember, "Rememberme");
	}
    
	public WebElement Userfield() {
		return userfield;
	}
	
	public void CheckUserField() {
		String actualtext= Userfield().getText();
		String expectedtext="vasuki@123.com";
		validateErrormessage(actualtext, expectedtext);
	}
	
	public void forgotPassword() {
		clickObj(Fpwd, "forgotpassword");
	}
	public WebElement FUserNamefield() {
		return Fname;
	}
	public void UserNameField() throws Exception {
		String Fname = common.getApplicationProperty("fname");
		enterText(FUserNamefield(),Fname, "UsernameField");
	}
	public void Continue() {
		clickObj(Continue, "Continue");
	}
	public WebElement ForgetPwMessage() {
		return forgetpwmessage;
	}
	public void ForgetPasswordMessage() {
		String actualmessage = ForgetPwMessage().getText();
		String expected="We’ve sent you an email with a link to finish resetting your password.";
		validateErrormessage(actualmessage, expected);
	}
	public void EnterIntoWrongPassword() throws Exception {
	String WrongPassword = common.getApplicationProperty("wrongpassword");
	enterText(enterIntoPassword(), WrongPassword, "Passwordtext");
	}
	public WebElement WrongPwAlertMessage() {
		return WrongPwAlertMge;
	}
	public void WrongPasswordAlertMessage() {
		String alertmessage = WrongPwAlertMge.getText();
		String expected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		Assert.assertEquals(alertmessage, expected);
	}

	
			
}	