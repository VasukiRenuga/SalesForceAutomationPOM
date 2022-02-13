package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.Basepage;
import com.training.utilities.CommonUtilities;

public class Opportunitypage extends Basepage {
	
	CommonUtilities common = new CommonUtilities();
		
	public Opportunitypage(WebDriver driver) {
		super (driver);
	}

    @FindBy(xpath ="//a[@title='Opportunities Tab']")
	WebElement opportunities;
    
    @FindBy(xpath ="/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/select")
	WebElement viewopportunities;
    
    @FindBy(id ="tryLexDialogX")
    WebElement popup;
    
    @FindBy(xpath ="//input[@title='New']")
    WebElement newbutton;
    
    @FindBy(xpath ="/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[3]/table/tbody/tr[3]/td[2]/div/input")
    WebElement opportunityname;
    
    @FindBy(xpath ="//input[@name='opp4']")
    WebElement accountname;
    
    @FindBy(xpath ="//img[@title='Account Name Lookup (New Window)']")
    WebElement lookup;
  
    @FindBy(xpath ="/html/body/form/div/div[2]/input[1]")
    WebElement namelookup;
    
    @FindBy(xpath ="//*[@id='theForm']/div/div[2]/input[2]")
    WebElement go;
    
    @FindBy(xpath ="//body[1]/form[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/th[1]/a[1]")
    WebElement pickaccountname;
    
    @FindBy(xpath ="//input[@name='opp9']")
    WebElement closedate;
   
    @FindBy(xpath ="//tbody/tr/td/div/div[2]/div[1]/a[1]")
    WebElement todaydate;
    
    @FindBy(xpath ="//select[@name='opp11']")
    WebElement stage;
    
    @FindBy(xpath ="//input[@name='opp12']")
    WebElement probability;

    @FindBy(xpath ="//select[@name='opp6']")
    WebElement lead;
    
    @FindBy(xpath ="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
    WebElement saveopportunity;
    
    @FindBy(xpath ="//tbody/tr/td/div/div/div/ul/li[1]/a[1]")
    WebElement opportunitypipeline;
    
    @FindBy(xpath ="//tbody//li[2]//a[1]")
    WebElement stuckopportunitylink;
    
    @FindBy(xpath ="//select[@name='quarter_q']")
    WebElement interval;
    
    @FindBy(xpath ="//select[@name='open']")
    WebElement include;
    
    @FindBy(xpath ="//input[@title='Run Report']")
    WebElement runreport;
    
    
    public void enterintoOpportunities() {
		clickObj(opportunities, "opportunities");
	}
    public void ClickViewOpportunities() {
		clickObj(viewopportunities, "viewopportunities");
	}
    public void ViewOpportunitiesdropdown() {
    	dropDownList(viewopportunities);
    }
    public void ClickViewPopup() {
    	waitforElement(popup);
		clickObj(popup, "popup");
	}
    public void ClickNewButton() {
		clickObj(newbutton, "newbutton");
	}
    public void EnterOpportunityname() {
	 opportunityname.sendKeys("Vasu");;
	}
    public WebElement EnterAccountname() {
		return accountname;
	}
    public void ClickLookup() {
		clickObj(lookup, "lookup");
	}
    public void EnterNameinLookup() {
		namelookup.sendKeys("Vasuki");;
	}
    public void ClickGo() {
		clickObj(go, "go");
	}
    public void PickaccountName() {
		clickObj(pickaccountname, "pickaccountname");
	}
    public WebElement GiveClosedate() {
		return closedate;
	}
    public void Selecttodaydate() {
		clickObj(todaydate, "todaydate");
	}
    public void Stagedropdown() {
		clickObj(stage, "stage");
	}
    public void selectStagedropdown() {
    	SelectByValue(stage, "Qualification");;
    }
    public void EnterProbability() {
    	probability.clear();
    	probability.sendKeys("80"); 
	}
    public void LeadsourceDropdown() {
		SelectByValue(lead, "Other");
	}
    public void Saveopportunity() {
	clickObj(saveopportunity, "saveopportunity");
    }
    public void ClickOpportunitypipeline() {
    	clickObj(opportunitypipeline, "opportunitypipeline");
        }
    public void ClickStuckOpportunitylink() {
    	waitforElement(stuckopportunitylink);
    	clickObj(stuckopportunitylink, "stuckopportunitylink");
        }
    public void Intervaldropdown() {
    	clickObj(interval,"interval");
        SelectByValue(interval, "curnext1");
        }
    public void Includedropdown() {
    	clickObj(include,"include");
        selectByIndex(include, 2);
        }
    public void ClickRunReport() {
    	clickObj(runreport, "runreport");
        }
   

    


    
    
    
    
    
    
    

}
