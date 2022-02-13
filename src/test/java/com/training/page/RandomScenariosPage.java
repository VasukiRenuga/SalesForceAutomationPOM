package com.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.*;
import com.training.utilities.CommonUtilities;

public class RandomScenariosPage extends Basepage{
	CommonUtilities common = new CommonUtilities();
	public RandomScenariosPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//li[@id='home_Tab']//a[contains(text(),'Home')]")
	WebElement home;
	
	@FindBy(xpath="//*[@id=\"tryLexDialogX\"]")
	WebElement popup;
	
	@FindBy(xpath="//tbody//tr//td//div//div//div//div//span//h1//a")
	WebElement namelink;
	
	@FindBy(xpath="//tbody/tr/td/div/div/div/div/span/a[1]")
	WebElement currentdate;
	
	@FindBy(xpath="//div[29]//a[1]")
	WebElement eightpmlink;
	
	@FindBy(xpath="//img[@title='Subject Combo (New Window)']")
	WebElement subjectcombo;
	
	@FindBy(xpath="//li[5]//a[1]")
	WebElement other;
	
	@FindBy(xpath="//input[@name='EndDateTime_time']")
	WebElement endtime;
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement save;
	
	@FindBy(xpath="//a[@title='Busy - Other']//span")
	WebElement errormessage;
	
	@FindBy(xpath="//body//div//div[43]")
	WebElement ninepm;
	
	@FindBy(xpath="//div[21]//a[1]")
	WebElement fourpm;
	
	@FindBy(xpath="//body//div//div[39]")
	WebElement sevenpm;
	
	@FindBy(xpath="//input[@name='IsRecurrence']")
	WebElement recurrence;
	
	@FindBy(xpath="//input[@value='ftw']")
	WebElement weekly;
	
	@FindBy(xpath="//input[@name='RecurrenceEndDateOnly']")
	WebElement recurrenceenddate;
	
	@FindBy(xpath="//td[normalize-space()='24']")
	WebElement date;
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement recurrencesave;
	
	@FindBy(xpath="//img[@title='All Tabs']")
	WebElement tab;
	
	@FindBy(xpath="//input[@title='Customize My Tabs']")
	WebElement customizemytab;
	
	@FindBy(xpath="//option[@value='Chatter']")
	WebElement chatter;
	
	@FindBy(xpath="//img[@title='Add']")
	WebElement addchatter;
	
	@FindBy(xpath="//img[@title='Remove']")
	WebElement removechatter;
	
	@FindBy(xpath="//input[@title='Save']")
	WebElement savetab;
	
	
	
	
	public void EnterHome() {
		waitforElement(home);
	       clickObj(home, "home");
        }
	public WebElement popup() {
    	return popup;
        }
	public void ClickNameLink() {
		waitforElement(namelink);
    	clickObj(namelink, "namelink");
        }
	public void ClickCurrentDate() {
		waitforElement(currentdate);
		  clickObj(currentdate, "currentdate");
        }
	public void Selecteightpmlink() {
		waitforElement(eightpmlink);
		  clickObj(eightpmlink, "eightpmlink");
        }
	public void ClickSubjectcombo() {
		waitforElement(subjectcombo);
		  clickObj(subjectcombo, "subjectcombo");
        }
	public void Selectother() {
    	clickObj(other, "other");
        }
	public void Endtimedropdown() {
		waitforElement(endtime);
		  clickObj(endtime,"endtime");
        }
	public void EnterNinepm() {
		waitforElement(ninepm);
		  clickObj(ninepm,"ninepm");
        }

	public void Clicksave() {
    	clickObj(save, "save");
        }
	public void ErrorMessage() {
	String actual =errormessage.getText();
	  String expected ="Other";
	  validateErrormessage(actual, expected);
	}
	
	public void ClickFourpm() {
		waitforElement(fourpm);
		  clickObj(fourpm,"fourpm");
        }

public void ClickSevenpm() {
	waitforElement(sevenpm);
	  clickObj(sevenpm,"sevenpm");
    }
public void ClickRecurrence() {
	waitforElement(recurrence);
	selectCheckBox(recurrence, "recurrence");
    }

public void ClickWeekly() {
	waitforElement(weekly);
	  clickObj(weekly,"weekly");
    }

public void RecurrenceEndDate() {
	clickObj(recurrenceenddate,"recurrenceenddate");
    }
public void Date() {
	waitforElement(date);
	  clickObj(date,"date");
    }

public void ClickRecurrencesave() {
	waitforElement(recurrencesave);
	  clickObj(recurrencesave,"recurrencesave");
    }
public void EnterintoTab() {
	waitforElement(tab);
    clickObj(tab, "tab");
    }
public void Customizemytab() {
	waitforElement(customizemytab);
    clickObj(customizemytab,"customizemytab");
    }
public void SelectChatter() {
	clickObj(chatter,"chatter");
    }
public void AddChatter() {
	clickObj(addchatter, "addchatter");
    }
public void RemoveChatter() {
	waitforElement(removechatter);
	clickObj(removechatter, "removechatter");
    }
public void SaveTab() {
	waitforElement(savetab);
	clickObj(savetab, "savetab");
    }

}