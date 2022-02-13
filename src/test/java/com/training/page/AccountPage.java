package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.training.base.*;
import com.training.utilities.CommonUtilities;

public class AccountPage extends Basepage {

	CommonUtilities common = new CommonUtilities();
	public AccountPage(WebDriver driver) {
		super(driver);
		
	} 
	

	@FindBy(xpath = "//a[@title='Accounts Tab']")
	WebElement account;
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div/a")
	WebElement closepop;
	
	@FindBy(xpath ="//tbody/tr/td/div/div[1]/div[1]/div[1]/div[1]")
	WebElement createnew;
	
	@FindBy(xpath ="//tbody/tr/td/div/div/div/div/div[2]/a[3]")
	WebElement newaccount ;
	
	@FindBy(xpath ="//input[@name='acc2']")
	WebElement accountname ;
	
	@FindBy(xpath ="//select[@name='acc6']")
	WebElement typedropdown ;
	
	@FindBy(xpath ="//*[@id=\'editPage\']/div[1]/table/tbody/tr/td[2]/input[3]")
	WebElement deleteaccount ;

	@FindBy(xpath ="//select[@name='00N5f000006iJHc']")
	WebElement customerpriority ;
	
	@FindBy(xpath ="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement saveaccount ;
	
	@FindBy(xpath ="//form[@name='filter_element']//a[2]")
	WebElement createnewview ;
	
	@FindBy(xpath ="//input[@name='fname']")
	WebElement viewname;
	
	@FindBy(xpath ="//input[@name='devname']")
	WebElement uniquename;
	
	@FindBy(xpath ="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement saveview;
	
	@FindBy(xpath ="//select[@title='View:']")
	WebElement viewdropdown;
	
	@FindBy(xpath ="//tbody/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[2]/a[1]")
	WebElement edit;
	
	@FindBy(xpath ="//input[@name='fname']")
	WebElement editviewname;
	
	@FindBy(xpath ="//select[@title='Search By 1']")
	WebElement filterfield;

	@FindBy(xpath ="//select[@title='Operator 1']")
	WebElement operator;

	@FindBy(xpath ="//input[@title='Value 1']")
	WebElement value;
	
	@FindBy(xpath ="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement saveedit;
	
	@FindBy(xpath ="//li[4]//span[1]//a[1]")
	WebElement merge;
	
	@FindBy(xpath ="//input[@name='srch']")
	WebElement find;
	
	@FindBy(xpath ="//tbody/tr/td/form[@name='stageForm']/div/div/div/input[2]")
	WebElement findaccount;
	
	@FindBy(xpath ="//input[@title='Select row 0']")
	WebElement radiobutton1;

	@FindBy(xpath ="//input[@title='Select row 1']")
	WebElement radiobutton2;

	@FindBy(xpath ="//input[@title='Select row 2']")
	WebElement radiobutton3;
	
	@FindBy(xpath="//tbody/tr/td/form[@name='stageForm']/div/div/div[1]/div[1]/input[1]")
	WebElement next;
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[5]/div[1]/input[2]")
	WebElement mergeaccount;
	
	@FindBy(xpath ="//tbody/tr/td/div/div/div/ul/li[2]/a[1]")
	WebElement lastactivity;
	
	@FindBy(xpath ="//img[@id='ext-gen148']")
	WebElement datefield;
	
	@FindBy(xpath ="//body/div[15]/div[1]/div[3]")
	WebElement createddate;

	@FindBy(xpath ="//tbody//div[3]//img[1]")
	WebElement calenderstartdate;
	
	@FindBy(xpath ="//button[normalize-space()='Today']")
	WebElement todaystartdate;
	
	
	@FindBy(xpath ="//div[4]//img[1]")
	WebElement calendarenddate;
	
	@FindBy(xpath ="//body[1]/div[17]/ul[1]/li[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]")
	WebElement todayenddate;
	
	@FindBy(xpath ="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]")
	WebElement savecreatedate;
	
	@FindBy(xpath ="//input[@name='reportName']")
	WebElement reportname;

	@FindBy(xpath ="//input[@name='reportDevName']")
	WebElement reportuniquename;

	@FindBy(xpath ="//button[normalize-space()='Save and Run Report']")
	WebElement saveandrun;

    public void enterintoAccount() {
		clickObj(account, "account"); 
	}
	public void clickclosepop() {
		clickObj(closepop, "closepop"); 
		}
	public void CreatenewAccount() {
		clickObj(createnew, "createnew"); 
	}
	public void ClickAccount() {
		clickObj(newaccount, "newaccount");
	}
	public WebElement enterAccountName() {
		return accountname;
	}
	public void AccountName() throws Exception {
		String Accountname = common.getApplicationProperty("Accountname");
		enterText(enterAccountName(), Accountname, "accountname");
	}
	public void enterintoTypeDropdown() {
		clickObj(typedropdown, "typedropdown");
		selectByVisibleText(typedropdown, "Technology Partner");
	}
	public void deleteAccountName() {
		waitforElement(deleteaccount);
		clickObj(deleteaccount, "deleteaccount");
	}
	public void enterintoCustomerPriority() {
		selectByVisibleText(customerpriority, "High"); 
	}
	public void ClickAccountSave() {
		clickObj(saveaccount, "saveaccount"); 
	}
	public void enterintocreateNewView() {
		clickObj(createnewview, "createnewview"); 
	}

	public void enterViewName() {
		viewname.sendKeys("saro");
	}
	public void enterUniqueName() {
		uniquename.clear();
		 uniquename.sendKeys("saro");;
	}
	public void SaveCreatenewview() {
		clickObj(saveview, "saveview"); 
	}
	public void SelectViewDropdown() {
		clickObj(viewdropdown, "viewdropdown"); 
		dropDownoptionsclick(viewdropdown, "saro");
	}
	public void ClickViewDropdown() {
		clickObj(viewdropdown, "viewdropdown"); 
		selectByIndex(viewdropdown, 2);
	}
	public void ClickEdit() {
		clickObj(edit, "edit");
	}
	public void EnterEditviewname() {
		 editviewname.clear();
		 editviewname.sendKeys("VasukiRenuga");
	}

	public void SelectFilterField() {
		clickObj(filterfield, "filterfield"); 
		selectByVisibleText(filterfield, "Account Name");
	}
	public void SelectOperator() {
		clickObj(operator, "operator"); 
		selectByVisibleText(operator, "contains");
	}

	public void Selectvalue() {
	  value.sendKeys("a");;
	}
	public void SaveEditview() {
		clickObj(saveedit, "saveedit");
	}
	public void ClickMergeaccount() {
		clickObj(merge, "merge");
	}
	
	public void Enternameoftheaccount() {
		find.sendKeys("Vasuki");;
	}
	public void ClickFindAccount() {
		clickObj(findaccount,"findaccount");
	}
	public void ClickRadiobutton1() {
		Radiobutton(radiobutton1, "radiobutton1");
	}
	public void ClickRadiobutton2() {
		Radiobutton(radiobutton2, "radiobutton2");
	}
	public WebElement ClickRadiobutton3() {
		return radiobutton3;
	}
	public void ClickNext() {
		clickObj(next, "next");
	}
	public void ClickMerge() {
		clickObj(mergeaccount, "mergeaccount");
	}
	public void Accountwithlastactivity() {
		clickObj(lastactivity, "lastactivity");
	}
	public void Datefielddropdown() {
		selectDropdown(datefield, "datefield");
	}
	public void ClickCreateDate() {
		clickObj(createddate, "createddate");
		}
		public void CalendarStartdate() {
		clickObj(calenderstartdate, "calenderstartdate");
	}
	public void TodayStartdate() {
		clickObj(todaystartdate, "todaystartdate");
	}
			
		public void CalendarEnddate() {
			clickObj(calendarenddate, "calendarenddate");
		}
		public void TodayEnddate() {
			clickObj(todayenddate, "todayenddate");  
		}

	
	public void SaveCreatedate() {
		clickObj(savecreatedate, "savecreatedate");
	}
	public void EnterreportName() {
		reportname.sendKeys("Vasu");;
	}
	public void EnterReportUniqueName() {
		reportuniquename.clear();
		reportuniquename.sendKeys("vasuki");
	}
	public void ClicksaveandRun() {
		clickObj(saveandrun, "saveandrun");
	}

}







