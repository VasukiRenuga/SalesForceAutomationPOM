package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.Basepage;

public class LeadsPage extends Basepage{

	public LeadsPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath ="/html/body/div/div[1]/div[1]/div/nav/ul/li[6]/a")
	WebElement leads;
	
	@FindBy(xpath ="//select[@title='View:']")
	WebElement listhandledropdown;
	
	@FindBy(xpath ="//input[@title='Go!']")
	WebElement leadsgo;
	
	@FindBy(xpath ="//input[@title='New']")
	WebElement clicknew;
	
	@FindBy(xpath ="//input[@name='name_lastlea2']")
	WebElement lastname;
	
	@FindBy(xpath ="//input[@name='lea3']")
	WebElement companyname;
	
	@FindBy(xpath ="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement saveleads;
	
	public void EnterLeads() {
		waitforElement(leads);
    	clickObj(leads, "leads");
        }
	public void ListhandleDropdown() {
    	clickObj(listhandledropdown, "listhandledropdown");
    	System.out.println(listhandledropdown.getText());
        }
	public void SelectListhandleDropdown() {
		selectByIndex(listhandledropdown, 4);
	}
	public void SelectListhandleDropdownleads() {
		selectByIndex(listhandledropdown, 2);
	}
	public void ListhandleDropdowntodayleads() {
		selectByIndex(listhandledropdown, 3);
	}
	public void ClickLeadsGo() {
    	clickObj(leadsgo, "leadsgo");
        }
	public void ClickNew() {
		waitforElement(clicknew);
	       clickObj(clicknew, "clicknew");
        }
	public void EnterLastName() {
    	 lastname.sendKeys("Krishnasamy");
        }
	public void EnterCompanyName() {
    	 companyname.sendKeys("Krishna");;
        }
	public void ClickSaveLeads() {
		clickObj(saveleads, "saveleads");
        }



}
