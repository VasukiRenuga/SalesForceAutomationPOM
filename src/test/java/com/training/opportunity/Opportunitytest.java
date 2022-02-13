package com.training.opportunity;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.training.base.*;
import com.training.page.AccountPage;
import com.training.page.ContactsPage;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.page.Opportunitypage;
import com.training.utilities.CommonUtilities;

public class Opportunitytest extends BaseTest{
	WebDriver driver;
	LoginPage login;
	HomePage home;
	AccountPage account;
	ContactsPage contacts;
	Opportunitypage opportunity;
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
		contacts = new ContactsPage(driver);
		opportunity = new Opportunitypage(driver);
		login.loginapplication();
		report.logTestInfo("UserName, Password is entered and Login is clicked");
		Thread.sleep(10000);
		opportunity.enterintoOpportunities();
		opportunity.ClickViewPopup();
		

}
   @Test(description = "Opportunities dropdown 15")
	
	public void Opportunitydropdown() throws Exception {
	    opportunity.ClickViewOpportunities();
        //Get all options
	    opportunity.ViewOpportunitiesdropdown();
	    System.out.println("opportunitiesdropdown is completed");
	}
    @Test(description = "Create New opportunity 16")

    public void CreateNewopportunity() throws Exception {
       opportunity.ClickNewButton();
	   opportunity.EnterOpportunityname();
	   opportunity.ClickLookup();
	   Thread.sleep(10000);
	   String oldWindow = driver.getWindowHandle();
	   //Switching driver control to new window.
	   //Set<String> getAllWindows = driver.getWindowHandles();
	   //String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
	   //driver.switchTo().window(getWindow[1]);
	   contacts.WindowHandle(oldWindow);
	   Thread.sleep(3000);
	   //switch to first frame
	   driver.switchTo().frame("searchFrame");
	   opportunity.EnterNameinLookup();
	   opportunity.ClickGo();
	   //Switching to Lookup Window
	   driver.switchTo().defaultContent();
	   //Switching to Insideframe(result)
	   driver.switchTo().frame("resultsFrame");
	   Thread.sleep(5000);
       opportunity.PickaccountName();
	   driver.switchTo().defaultContent();
	   Thread.sleep(2000);
	   opportunity.GiveClosedate();
	   opportunity.Selecttodaydate();
	   Actions action = new Actions(driver);
	   action.sendKeys(Keys.ESCAPE).build().perform();
	   Thread.sleep(2000);
	   opportunity.Stagedropdown();
	   opportunity.selectStagedropdown();
	   Thread.sleep(2000);
	   opportunity.EnterProbability();
	   Thread.sleep(2000);
	   opportunity.LeadsourceDropdown();
	   opportunity.Saveopportunity();
}	

   @Test(description = "Opportunity pipeline 17")

   public void Opportunitypipeline() throws Exception {
       opportunity.ClickOpportunitypipeline();
       System.out.println("Report page with the opportunities that are pipelined will be displayed");
       System.out.println("TestOpportunityPipeline is completed");

}
   @Test(description = "Stuck Opportunities Report 18")

   public void StuckOpportunitiesReport() throws Exception {
	   opportunity.ClickStuckOpportunitylink();
       System.out.println("Report page with the opportunities that are stuck will be displayed");
       System.out.println("TestStuckOpportunitiesReport is completed");
}
   @Test(description = "Quarterly Summary Report 19")

   public void QuarterlySummaryReport() throws Exception {
      opportunity.Intervaldropdown();
      Thread.sleep(2000);
      opportunity.Includedropdown();
      Thread.sleep(2000);
      opportunity.ClickRunReport();
      System.out.println("Report page with the opportunities that satisfies the search criteria will be displayed");
      System.out.println("TestQuarterlySummaryReport is completed");
}


}
