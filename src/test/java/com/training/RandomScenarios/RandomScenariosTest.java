package com.training.RandomScenarios;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.*;
import com.training.page.AccountPage;
import com.training.page.ContactsPage;
import com.training.page.HomePage;
import com.training.page.LeadsPage;
import com.training.page.LoginPage;
import com.training.page.Opportunitypage;
import com.training.page.RandomScenariosPage;
import com.training.utilities.CommonUtilities;

public class RandomScenariosTest extends BaseTest{
	WebDriver driver;
	LoginPage login;
	HomePage home;
	AccountPage account;
	Opportunitypage opportunity;
	LeadsPage leads;
	ContactsPage contacts;
	RandomScenariosPage randomscenarios;
	static Actions action;
	static  WebDriverWait wait;
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
		contacts = new ContactsPage(driver);
		randomscenarios= new RandomScenariosPage(driver);
		login.loginapplication();
		report.logTestInfo("UserName, Password is entered and Login is clicked");
	}
	


    @Test(description = "Verify Firstname and Lastname 33")
	
	public void CreateNewcontact() throws Exception {
       randomscenarios.EnterHome();
       opportunity.ClickViewPopup();
       randomscenarios.ClickNameLink();
       System.out.println("FirstNameLastName page is displayed");

}

   @Test(description = "Verify the Edited Lastname 34")

   public void Editedlastname() throws Exception {
       randomscenarios.EnterHome();
       opportunity.ClickViewPopup();
       randomscenarios.ClickNameLink();
       Thread.sleep(10000);
       home.enterintoedit();
       home.enterintoprofileiframe();
       home.enterintoabout();
       home.ClearLastname();
       home.EnterLastNameField();
       home.MyProfileSave();
       System.out.println("Saved all");
       System.out.println("LastName edited is updated");
}

   @Test(description = "Verify the tab customization 35")

   public void tabCustomization() throws Exception {
      randomscenarios.EnterintoTab();
      Thread.sleep(10000);
      randomscenarios.Customizemytab();
      randomscenarios.SelectChatter();
      randomscenarios.AddChatter(); 
      randomscenarios.RemoveChatter();
      randomscenarios.SaveTab();
      home.enterintoUsermenu();
      Thread.sleep(5000);
      home.enterintologout();
      Thread.sleep(6000);
      login.loginapplication();
      driver.manage().window().maximize();
      System.out.println("Tab Customization is verified");
}

   @Test(description = "Blocking an event in the calendar 36")

   public void BlockinganeventinCalendar() throws Exception {
      randomscenarios.EnterHome();
      opportunity.ClickViewPopup();
      randomscenarios.ClickCurrentDate();
	  randomscenarios.Selecteightpmlink();
	  randomscenarios.ClickSubjectcombo();
	  Set<String> windowHandles = driver.getWindowHandles();
	  String currentHandle = driver.getWindowHandle();
	  windowHandles.remove(currentHandle);
	  String newHandle = windowHandles.iterator().next();
	  driver.switchTo().window(newHandle);
	  randomscenarios.Selectother();
	  driver.switchTo().window(currentHandle);
	  randomscenarios.Endtimedropdown();
	  randomscenarios.EnterNinepm();
	  randomscenarios.Clicksave();
	  randomscenarios.ErrorMessage();
	  System.out.println("Calendar for FirstNameLastName page is displayed with other in 8-9PM time slot");
	
}
   @Test(description = "Blocking an event in the calendar with weekly reccurance 37")
   public void BlockinganeventinCalendarwithweeklyreccurance() throws Exception {
	    randomscenarios.EnterHome();
	    opportunity.ClickViewPopup();;
	    randomscenarios.ClickCurrentDate();
	    Thread.sleep(10000);
		randomscenarios.ClickFourpm();
		randomscenarios.ClickSubjectcombo();
		  Set<String> windowHandles = driver.getWindowHandles();
		  String currentHandle = driver.getWindowHandle();
		  for (String newHandle : windowHandles) {
			  if(!newHandle.equals(currentHandle))
		      driver.switchTo().window(newHandle);}
		  randomscenarios.Selectother();
		  driver.switchTo().window(currentHandle);
		  randomscenarios.Endtimedropdown();
		  randomscenarios.ClickSevenpm();
		  randomscenarios.ClickRecurrence();
		  randomscenarios.ClickWeekly();
		  randomscenarios.ClickCurrentDate();
	      randomscenarios.Date();
		  randomscenarios.ClickRecurrencesave();
	}
   
}