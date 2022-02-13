package com.training.page;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.Basepage;

public class ContactsPage extends Basepage{

	public ContactsPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(xpath ="//a[@title='Contacts Tab']")
	WebElement contacts;
	
	@FindBy(xpath="//input[@title='New']")
	WebElement newcontacts;
	
	@FindBy(xpath="//input[@name='name_lastcon2']")
	WebElement contactlastname;
	
	@FindBy(xpath="//input[@name='con4']")
	WebElement contactaccountname;
	
	
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
    WebElement savenewcontact;
			
	@FindBy(xpath ="//form[@name='filter_element']//a[2]")
	WebElement createnewview;
	
	@FindBy(xpath ="//input[@name='fname']")
	WebElement viewname;
	
	@FindBy(xpath ="//input[@name='devname']")
	WebElement viewuniquename;
	
	@FindBy(xpath ="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement savecontacts;
	
	@FindBy(xpath ="//select[@title='Display Selection']")
	WebElement recentlycreated;
	
	@FindBy(xpath ="//tbody/tr[2]/th[1]/a[1]")
	WebElement recentcontactname;
	
	@FindBy(xpath ="//*[@id='editPage']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[2]")
	WebElement errormessage;
	
	@FindBy(xpath ="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[2]")
	WebElement cancelbutton;
	
	@FindBy(xpath ="//input[@name='name_lastcon2']")
	WebElement lastname;
	
	@FindBy(xpath ="//input[@name='con4']")
	WebElement accountname;
	
	@FindBy(xpath ="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[2]")
	WebElement saveandnewbutton;
	
	
	public void EnterContacts() {
		waitforElement(contacts);
    	clickObj(contacts, "contacts");
        }
	public void NewContacts() {
    	clickObj(newcontacts, "newcontacts");
        }
	public void EnterContactslastname() {
    	 contactlastname.clear();
    	 contactlastname.sendKeys("Krish");
        }
	public void WindowHandle(String old) {
		  //String oldWindow = driver.getWindowHandle();
		//Switching driver control to new window.
		Set<String> getAllWindows = driver.getWindowHandles();
		//String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
		//driver.switchTo().window(getWindow[1]);
		
		for(String windowHandle:getAllWindows) {
			if(!windowHandle.equals(old)) {
				driver.switchTo().window(windowHandle);
				break;
			}}
	}
	public void EnterContactsAccountname() {
		waitforElement(contactaccountname);
		contactaccountname.sendKeys("Vasuki");
        }
	public void SaveNewContacts() {
    	clickObj(savenewcontact, "savenewcontact");
        }

	public void CreateNewviewLink() {
		waitforElement(createnewview);
    	waitforElement(createnewview);
    	clickObj(createnewview, "createnewview");
        }
	public void EnterViewname() {
		waitforElement(viewname);
		viewname.sendKeys("DevTharun");
        }
	public void EnterViewname2() {
		waitforElement(viewname);
		viewname.sendKeys("ABCD");
        }
	public void EnterViewUniquename() {
		viewuniquename.clear();
		viewuniquename.sendKeys("Renuga");
        }
	public void EnterViewUniquename2() {
		viewuniquename.clear();
		viewuniquename.sendKeys("EFGH");
        }
	public void SaveContacts() {
		waitforElement(savecontacts);
		clickObj(savecontacts, "save");
        }
	public void Recentlycreateddropdown() {
		clickObj(recentlycreated, "recentlcreated");
		SelectByValue(recentlycreated, "2");
        }
	public void RecentContactName() {
		clickObj(recentcontactname,"contactname");
        }
	public WebElement Errormessage() {
    	return errormessage;
        }
	public void ErrorMessageText() {
		String actualmsg = Errormessage().getText();
		   String errormsg = "Error: You must enter a value";
		   validateErrormessage(actualmsg, errormsg);
	}
	public void ClickcancelButton() {
		waitforElement(cancelbutton);
		   clickObj(cancelbutton, "cancelbutton");
        }
	public void EntertheLastname() {
		waitforElement(lastname);
		lastname.sendKeys("Vasuki");
        }
	public WebElement EntertheAccountname() {
    	return accountname;
        }
	public void ClickSaveAndNew() {
		waitforElement(saveandnewbutton);
		   clickObj(saveandnewbutton, "saveandnewbutton");
        }

}
