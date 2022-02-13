package com.training.contacts;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
import com.training.utilities.CommonUtilities;

public class Contactstest extends BaseTest {
	WebDriver driver;
	LoginPage login;
	HomePage home;
	AccountPage account;
	Opportunitypage opportunity;
	LeadsPage leads;
	ContactsPage contacts;
	static Actions action;
	static  WebDriverWait wait;
	CommonUtilities common = new CommonUtilities();
	
	
	@BeforeMethod
	public void beforeMethod(Method method) throws Exception {
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
		login.loginapplication();
		report.logTestInfo("UserName, Password is entered and Login is clicked");
		contacts.EnterContacts();
			Thread.sleep(10000);
		account.clickclosepop();
	}
	
   @Test(description = "Create New contact 25")
   public void CreateNewcontact() throws Exception {
		
		contacts.NewContacts();
		contacts.EnterContactslastname();
		opportunity.ClickLookup();
		Thread.sleep(10000);
		String oldWindow = driver.getWindowHandle();
		contacts.WindowHandle(oldWindow);
		Thread.sleep(3000);
		//switch to first frame
		driver.switchTo().frame("searchFrame");
		opportunity.EnterNameinLookup();
		opportunity.ClickGo();
		//Switching to Lookup Window
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame("resultsFrame");
		Thread.sleep(5000);
		opportunity.PickaccountName();
		driver.switchTo().window(oldWindow);
		//driver.switchTo().window(getWindow[0]);
		contacts.SaveNewContacts();
		System.out.println("Createnewcontact is completed");
		
}
@Test(description = "Create Newview in contact page 26")
	
	public void newviewinContactPage() throws Exception {
        contacts.CreateNewviewLink();
		contacts.EnterViewname();
		contacts.EnterViewUniquename();
		contacts.SaveContacts();
		System.out.println("CreatenewviewintheContactPage is Completed");
		
}
   @Test(description = "Check recently created contact in the contact page 27")

   public void Checkrecentlycreatedcontact() throws Exception {
       contacts.Recentlycreateddropdown();
	   System.out.println("Checkrecentlycreatedcontact is Completed");

}	

   @Test(description = "Check my Contacts in the contact page 28")

   public void CheckMycontacts() throws Exception {
       leads.ListhandleDropdown();
	   leads.SelectListhandleDropdown();
	   Thread.sleep(3000);
	   System.out.println("MyContacts is Completed");

}
   @Test(description = "View Contacts in the contact page 29")

   public void Viewcontacts() throws Exception {

       contacts.RecentContactName();
       System.out.println("ViewcontactinthecontactPage is completed");
}
   
   @Test(description = "Error message in the Create Newview in contact page 30")

   public void ErrorMessage() throws Exception {
       contacts.CreateNewviewLink();
	   contacts.EnterViewUniquename2();
	   Thread.sleep(1000);
	   contacts.SaveContacts();
	   Thread.sleep(3000);
	   contacts.ErrorMessageText();
	   System.out.println("ChecktheContactErrormessage is Completed");
}
   @Test(description = "Check cancel button works fine in the Create Newview in contact page 31")

   public void CheckCancelButton() throws Exception {
       contacts.CreateNewviewLink();
	   contacts.EnterViewname2();
	   contacts.EnterViewUniquename2();
	   contacts.ClickcancelButton();
	   System.out.println("CheckingCancelbutton is Completed");
}

   @Test(description = "Checking Save and Newbutton in contact page 32")

   public void CheckingSaveandNewbutton() throws Exception {
       leads.ClickNew();
       contacts.EnterContactslastname();
	   opportunity.ClickLookup();
	   Thread.sleep(10000);
	   String oldWindow = driver.getWindowHandle();
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
	   opportunity.PickaccountName();
	   driver.switchTo().window(oldWindow);
	   contacts.ClickSaveAndNew();
}
}