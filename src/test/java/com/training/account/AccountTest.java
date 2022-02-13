package com.training.account;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.base.*;
import com.training.page.AccountPage;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class AccountTest extends BaseTest {
	WebDriver driver;
	LoginPage login;
	HomePage home;
	AccountPage account;
	CommonUtilities common = new CommonUtilities();

	@BeforeMethod
	public void beforeTest(Method method) throws Exception {
		report.startSingleTestReport(method.getName());
		driver = getDriver();
		String url = common.getApplicationProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		login = new LoginPage(driver);
		home = new HomePage(driver);
	   account = new AccountPage(driver);
	   login.loginapplication();
		report.logTestInfo("UserName, Password is entered and Login is clicked");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		account.enterintoAccount();
		Thread.sleep(3000);
		account.clickclosepop();

	}
	@Test(description = "Select Account 10",priority = 1)
	
	public void SelectAccount() throws Exception {
        home.HomePageTitle();
		account.CreatenewAccount();
	    account.ClickAccount();
		Thread.sleep(1000);
		account.AccountName();
		account.enterintoTypeDropdown();
		Thread.sleep(1000);
		account.enterintoTypeDropdown();
		account.enterintoCustomerPriority();
		Thread.sleep(1000);
		account.ClickAccountSave();
		System.out.println("Clicked on Save button..");
		System.out.println("create account is completed");
		
	
	
}
   @Test(description = "Create newview in account 11",priority = 2)
	
	public void Selectnewview() throws Exception {
	    account.SelectViewDropdown();
	    account.ClickEdit();
	    account.deleteAccountName();
	    switchtoAlert(driver);
		account.enterintocreateNewView();
		account.enterViewName();
		account.enterUniqueName();
		Thread.sleep(1000);
		account.SaveCreatenewview();
		Thread.sleep(10000);
		account.ClickViewDropdown();
		System.out.println("Createnewview is completed");
		
}
   @Test(description = "Select Edit view in account 12")

   public void SelectEditview() throws Exception {
      account.ClickViewDropdown();
	  Thread.sleep(20000);
	  account.ClickEdit();
	  Thread.sleep(6000);
	  account.EnterEditviewname();
	  account.SelectFilterField();
	  account.SelectOperator();
      account.Selectvalue();
      Thread.sleep(3000);
      account.SaveEditview();

}
@Test(description = "MergeAccount 13")

public void MergeAccount() throws Exception {
	account.ClickMergeaccount();
	account.Enternameoftheaccount();
	account.ClickFindAccount();
	account.ClickRadiobutton1();
	account.ClickRadiobutton2();
	Thread.sleep(3000);
	account.ClickNext();
	account.ClickMerge();
	switchtoAlert(driver);	
   System.out.println("TC13_MergeAccounts is completed");
	}
@Test(description = "Create account report 14")

public void CreateAccountreport() throws Exception {
	account.Accountwithlastactivity();
	Thread.sleep(6000);
	account.Datefielddropdown();
	account.ClickCreateDate();
	account.CalendarStartdate();
	account.TodayStartdate();
	account.CalendarEnddate();
	Thread.sleep(10000);
	account.TodayEnddate();;
	Thread.sleep(6000);
	account.SaveCreatedate();
	account.EnterreportName();
	account.EnterReportUniqueName();
	Thread.sleep(3000);
	account.ClicksaveandRun();
	System.out.println("create accout report is completed");
	}}
