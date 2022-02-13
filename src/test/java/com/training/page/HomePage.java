package com.training.page;

import java.beans.Visibility;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.base.*;
import com.training.utilities.CommonUtilities;



public class HomePage extends Basepage{
	CommonUtilities common = new CommonUtilities();
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[1]/div[1]")
	WebElement usermenu;
	
	@FindBy(xpath = "//a[@title='My Profile']")
	WebElement myprofile;
	
	@FindBy(xpath = "//*[@title='Edit Profile'][@alt='Edit Profile']")
	WebElement edit;
	
	@FindBy(id="contactInfoContentId")
	WebElement profileiframe;
	
	@FindBy(xpath = "//ul[@role='tablist']//li[1]//a[1]")
	WebElement about;
	
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@value='Save All']")
	WebElement saveall;

	@FindBy(xpath = "//li[@label='TextPost']//span[1]")
	WebElement post;
	
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, publisherRichTextEditor']")
	WebElement postiframe;
	
	@FindBy(xpath = "/html/body")
	WebElement posttext;
	
	@FindBy(xpath = "//input[@title='Share']")
	WebElement share;
	
	@FindBy(xpath = "//li[@label='ContentPost']//span[1]")
	WebElement file;
	
	@FindBy(xpath = "//a[@title='Upload a file from your computer']")
	WebElement uploadfile;
	
	@FindBy(xpath = "//input[@name='chatterFile']")
	WebElement choosefile;
	
	@FindBy(xpath = "//input[@title='Share']")
	WebElement fileshare;
	
	@FindBy(id="displayBadge")
	WebElement moderator;
	
	@FindBy(xpath="//a[@id='uploadLink']")
	WebElement AddPhotolink;
	
	@FindBy(xpath="//iframe[@id='uploadPhotoContentId']")
	WebElement uploadPhotoContentId;
	
	@FindBy(id="j_id0:uploadFileForm:uploadInputFile")
	WebElement choosephotofile;
	
	@FindBy(id="j_id0:j_id7:save")
	WebElement savephoto;
	
	@FindBy(id="j_id0:uploadFileForm:uploadBtn")
	WebElement savephotofile;
	
	@FindBy(xpath="//a[@id='deletePhoto']")
	WebElement deletephoto;

    @FindBy(xpath="//a[@title='My Settings']")
	WebElement mysettings;
	
	@FindBy(xpath="//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('PersonalInfo');\"]")
	WebElement personal;
	
	@FindBy(xpath="//tbody//div//div//div//div[8]//a[1]//span[1]")
	WebElement loginhistory;
	
	@FindBy(xpath="//a[contains(text(),'Download login history for last six months, includ')]")
	WebElement sixmonthsloginhistory;
	
	@FindBy(xpath="//tbody//tr//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('DisplayAndLayout');\"]//span[2]")
	WebElement displayandlayout;

	@FindBy(xpath="//div[3]//div[1]//div[1]//a[1]//span[1]")
	WebElement customize;
	
	@FindBy(xpath="//*[@id=\'p4\']")
	WebElement customapp;
	
	@FindBy(xpath="//select[@name='duel_select_0']")
	WebElement availabletabs;
	
	@FindBy(xpath="//select[@id='duel_select_1']")
	WebElement selectedtabs;
	
	@FindBy(xpath="//img[@title='Add']")
	WebElement add;
	
	@FindBy(xpath="//input[@title='Save']")
	WebElement save;
	
	@FindBy(xpath="//tbody//tr//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('EmailSetup');\"]//span[2]")
	WebElement email;
	
	@FindBy(xpath="//tbody//div//div//div[4]//div[1]//div[1]//a[1]//span[1]")
	WebElement myemail;
	
	@FindBy(xpath="//input[@name='sender_name']")
	WebElement myemailname;

	@FindBy(xpath="//input[@name='sender_email']")
	WebElement myemailid;
	
	@FindBy(xpath="//tbody/tr[7]/td[2]/div[1]/input[1]")
	WebElement radiobutton;
	
	@FindBy(xpath="//input[@title='Save']")
	WebElement emailsave;
	
	@FindBy(xpath="//tbody/tr/td/form[@name='editPage']/div[1]")
	WebElement emailsavedmge;
	
	@FindBy(xpath="//*[@id=\"CalendarAndReminders_font\"]")
	WebElement calendarandreminders;
	
	@FindBy(xpath="//div[6]//div[1]//div[2]//a[1]//span[1]")
	WebElement reminders;
	
	@FindBy(xpath="//input[@title='Open a Test Reminder']")
	WebElement taskreminder;
	
	@FindBy(xpath="//a[@title='Developer Console (New Window)']")
	WebElement developerconsole;
	
	@FindBy(xpath="//a[@title='Logout']")
	WebElement logout;

  public void HomePageTitle() {
	  String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		String actualTitle = driver.getTitle();
		getTitle(actualTitle, actualTitle);
  }
	public void enterintoUsermenu() {
		waitforElement(usermenu);
		clickObj(usermenu, "Usermenu");
		}
	public void enterintomyprofile() {
		clickObj(myprofile, "profile");
}
	public void enterintoedit() {
	   clickObj(edit, "EditLink");
}
	public void enterintoprofileiframe() {
		switchFrame(driver, profileiframe);
}
   public void enterintoabout() {
	   waitforElement(about);
	    clickObj(about, "Aboutlink");
	}
   public void ClearLastname() {
	   clearElement(lastname);
	}
   public WebElement EnterLastname() {
	    return  lastname;
	}
   public void EnterLastNameField() throws Exception {
	   String Lastname = common.getApplicationProperty("Lastname");
	    enterText(EnterLastname(), Lastname, "lastname");
   }
   public void MyProfileSave() {
	   waitforElement(saveall);
		clickObj(saveall, "saveall");;
	}
   public void enterintopost() {
		clickObj(post, "post");
   }
		public void enterintopostiframe() {
			waitforElement(postiframe);
			switchFrame(driver, postiframe);
			
	}
        public WebElement enterintopostText() {
		    return posttext ;
		}
        public void EnterintopostText() throws Exception {
        	String posttext = common.getApplicationProperty("postbodytext");
        	enterText(enterintopostText(),posttext, " postbodytext");
        }
		public void ClickPostShare() {
		   clickObj(share, "PostShare");
		}
		public void Clickonfile() {
		   clickObj(file, "File");
		}
		public void Uploadingfile() {
	       clickObj(uploadfile, "UploadFile");
		}
		public WebElement Choosefile() {
		    return choosefile ;
		}
		public void ChooseFileOption() throws Exception {
			String ChooseFile = common.getApplicationProperty("File");
			enterText(Choosefile(), ChooseFile, "ChooseFile");
			System.out.println("choosefile option is selected");
		}
		public void ClickFileShare() {
			waitforElement(fileshare);
		    clickObj(fileshare, "FileShare");
		}
		public void MouseoverModerator() {
		    mouseOver(driver, moderator);
		    	
		    	}
		 public void ClickAddPhotolink() {
		    	clickObj(AddPhotolink, "AddPhotolink");
		    }
		 public void uploadPhotoContentIdiframe() {
		    	switchFrame(driver, uploadPhotoContentId);
		    }
		 public WebElement Choosephotofile() {
			    return choosephotofile ;
		    }
		 public void ChoosePhotoFilePath() {
			 Choosephotofile().sendKeys("C:\\Users\\vasuk\\OneDrive\\Desktop\\download.jpg");
		 }
		 public void Savephotofile() {
			 waitforElement(savephotofile);
			    clickObj(savephotofile, "savephotofile");  ;
		    }
		 
		 public void Savephoto() {
			 waitforElement(savephoto);
			    clickObj(savephoto, "savephoto");  ;
		    }
		 public WebElement Deletephoto() {
			    return deletephoto ;
		    }

		    	
		public void enterintomysettings() {
		clickObj(mysettings, "mysettings");
	}
	public void enterintopersonal() {
		waitforElement(personal);
		clickObj(personal, "personal");  
	}
	public void enterintologinhistory() {
		waitforElement(loginhistory);
		clickObj(loginhistory, "loginhistory");  
	}
	public void Lastsixmonthsloginhistory() {
		waitforElement(sixmonthsloginhistory);
		clickObj(sixmonthsloginhistory, "sixmonthsloginhistory"); 
		System.out.println("Six months login history is downloaded");
	}
	
	public void enterintodisplayandlayout() {
		waitforElement(displayandlayout);
		clickObj(displayandlayout, "displayandlayout");
	}
	public void enterintocustomizemytab() {
		clickObj(customize, "customize");  
	}
	public void enterintocustomapp() {
		clickObj(customapp, "customapp");  
		}
	public void customdropdown() {
		SelectByValue(customapp, "02u5f000001DPl0");
	}

	public void availabletabs() {
		  selectByVisibleText(availabletabs, "Reports");
	}
	public void clickadd() {
		clickObj(add, "add");
	}
	
	public void clicksave() {
		waitforElement(save);
		clickObj(save, "save");
	}
	public void enterintoemail() {
		clickObj(email, "email");
	}
	public void enterintomyemailsettings() {
		clickObj(myemail, "myemail");
	}
	public WebElement emailname() {
		return  myemailname;
	}
	public void enteremailname() throws Exception {
	clickObj(myemailname, "myemailname");
	clearElement(myemailname);
	String emailname = common.getApplicationProperty("emailname");
	enterText(emailname(), emailname, "name");
	}
	public WebElement emailid() {
		return  myemailid;
	}
	public void enteremailid() throws Exception {
		clickObj(myemailid, "myemailid");  
		clearElement(myemailid);
		String emailid = common.getApplicationProperty("emailid");
		enterText(emailid(), emailid, "id");
	}
	public void Radiobutton() {
		Radiobutton(radiobutton, "Radiobutton");  
	}
	
	public void Emailedmessage() {
		String savedmessage = emailsavedmge.getText();
		if (savedmessage.equals("Your settings have been successfully saved.")) {
			System.out.println("Saved message is been be displayed");
		} else {
			System.out.println("Saved message is not been be displayed");
		}
	}
	public void clickemailsave() {
		clickObj(emailsave, "emailsave");  
	}
	public void enterintoCalendarandReminders() {
		clickObj(calendarandreminders, "calendarandreminders"); 
	}
	public void enterintoActivityReminders() {
		clickObj(reminders, "reminders"); 
	}
	public void ClickopenaTestReminder() {
		clickObj(taskreminder, "taskreminder"); 
	}
	public void windowHandle() {
		String oldWindow=driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		 for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		 }
			driver.close();
			driver.switchTo().window(oldWindow);
	}
	public void enterintoDeveloperConsole() {
		clickObj(developerconsole, "developerconsole");
	}
		public void enterintologout() {
		clickObj(logout, "Logout");
	}

}

