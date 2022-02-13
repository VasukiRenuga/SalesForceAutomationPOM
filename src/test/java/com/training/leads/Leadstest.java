package com.training.leads;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.training.base.*;
import com.training.page.AccountPage;
import com.training.page.HomePage;
import com.training.page.LeadsPage;
import com.training.page.LoginPage;
import com.training.page.Opportunitypage;
import com.training.utilities.CommonUtilities;

public class Leadstest extends BaseTest{
	WebDriver driver;
	LoginPage login;
	HomePage home;
	AccountPage account;
	Opportunitypage opportunity;
	LeadsPage leads;
	CommonUtilities common = new CommonUtilities();

	@BeforeMethod
	public void beforeTest(Method method) throws Exception {
		report.startSingleTestReport(method.getName());
		driver = getDriver();
		String url = common.getApplicationProperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		home = new HomePage(driver);
		account = new AccountPage(driver);
		opportunity = new Opportunitypage(driver);
		leads = new LeadsPage(driver);
		login.loginapplication();
		report.logTestInfo("UserName, Password is entered and Login is clicked");
		leads.EnterLeads();
		Thread.sleep(10000);
		opportunity.ClickViewPopup();
		

	}
   @Test(description = "LeadsTab 20")
	
	public void LeadsTab() throws Exception {
	    home.HomePageTitle();
	    System.out.println("LeadsTab is completed");
}
   @Test(description = " Listhandle 21")

   public void Listhandle() throws Exception {
	    leads.ListhandleDropdown();
	    System.out.println("LeadsSelectView is completed");
}
   @Test(description = " Defaultview 22")

   public void Defaultview() throws Exception {
        leads.ListhandleDropdown();
	    leads.SelectListhandleDropdownleads();
	    Thread.sleep(3000);
	    home.enterintoUsermenu();
	    home.enterintologout();
	    Thread.sleep(10000);
	    login.loginapplication();
	    Thread.sleep(6000);
	    leads.EnterLeads();
	    Thread.sleep(3000);
	    leads.ClickLeadsGo();
	    System.out.println("Todays leads page is displayed");
	    System.out.println("Functionality of the go button is completed");
	
}

   @Test(description = " TodaysLeads 23")

   public void TodaysLeads() throws Exception {
	   leads.ListhandleDropdown();
	   leads.ListhandleDropdowntodayleads();
	   System.out.println("Todays leads page is displayed");
	   System.out.println("List item TodaysLeads work is completed");

}

@Test(description = " Check NewButton on leads 24")

public void CheckNewButtononleads() throws Exception {
	   leads.ClickNew();
	   Thread.sleep(10000);
	   leads.EnterLastName();
	   leads.EnterCompanyName();
	   leads.ClickSaveLeads();
	   System.out.println("24 Check NewButton on leads completed");
}

}
