package com.training.test.home;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.training.base.*;

import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class HomeTest extends BaseTest{
	
	
	WebDriver driver;
	LoginPage login;
	HomePage home;
	static Actions action;
	static  WebDriverWait wait;
	CommonUtilities common = new CommonUtilities();
	
	
	@BeforeMethod
	public void beforeMethod(Method method) throws Exception {
		report.startSingleTestReport(method.getName());
		driver = getDriver();
		String url = common.getApplicationProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		login = new LoginPage(driver);
		home = new HomePage(driver);
		login.loginapplication();
		report.logTestInfo("UserName, Password is entered and Login is clicked");
		home.enterintoUsermenu();
				
	}
	
   @Test(description = "Select user menu dropdown 5")
	
   public void Selectusermenu() throws Exception {
	System.out.println("DropDown with My profile, my settings, developerconsole,logout is displayed");
			}

    @Test(description = "Select my profile edit, post and file 6")

    public void selectmyprofile() throws Exception {
    home.enterintomyprofile();
	Thread.sleep(10000);
	home.enterintoedit();
	Thread.sleep(10000);
	home.enterintoprofileiframe();
    Thread.sleep(10000);
    home.enterintoabout();
	home.ClearLastname();
	home.EnterLastNameField();
	home.MyProfileSave();
	System.out.println("Saved all");
	Thread.sleep(10000);
	home.enterintopost();
	home.enterintopostiframe();
	Thread.sleep(2000);
	home.EnterintopostText();
	switchdefaultFrame(driver);
	Thread.sleep(2000);
	home.ClickPostShare();
	home.Clickonfile();
	Thread.sleep(2000);
	home.Uploadingfile();
	home.ChooseFileOption();
	home.ClickFileShare();
	System.out.println("post, file are uploaded");
				}
    
  
  @Test(description = "Select my profile photoupload 6")

  public void uploadingphoto() throws Exception {
	  home.enterintomyprofile();
		Thread.sleep(10000);
		home.MouseoverModerator();
		Thread.sleep(10000);
		home.ClickAddPhotolink();
		Thread.sleep(5000);
		home.uploadPhotoContentIdiframe();
	    Thread.sleep(5000);
	    home.ChoosePhotoFilePath();
	    home.Savephotofile();
	    home.Savephoto();
	    System.out.println("ProfilePhoto is uploaded");
	    
  }



  @Test(description = "Select My settings personal loginhistory, Select Display and layout, CalendarAndReminders 7")
  public void loginhistory() throws Exception{
	home.enterintomysettings();
	Thread.sleep(1000);
	home.enterintopersonal();
	home.enterintologinhistory();
	home.Lastsixmonthsloginhistory();
	home.enterintodisplayandlayout();
	home.enterintocustomizemytab();
	home.enterintocustomapp();
	Thread.sleep(3000);
	home.customdropdown();
	Thread.sleep(3000);
	home.availabletabs();
	home.clickadd();
	home.clicksave();
	Thread.sleep(1000);
	home.enterintoemail();
	home.enterintomyemailsettings();
	home.enteremailname();
	home.enteremailid();
	Thread.sleep(1000);
	home.Radiobutton();
	Thread.sleep(1000);
	home.clickemailsave();
	home.Emailedmessage();
	Thread.sleep(1000);
	home.enterintoCalendarandReminders();
	Thread.sleep(1000);
	home.enterintoActivityReminders();
	home.ClickopenaTestReminder();
	Thread.sleep(1000);
	home.windowHandle();
	System.out.println("Testcase no 7 is completed");
}

  @Test(description = "Select Developers console 8")

  public void selecteDevelopersConsole() throws Exception{
	home.enterintoDeveloperConsole();
	home.windowHandle();
	 System.out.println("DevelopersConsole window is closed");
}
 
  @Test(description = "Logout 9")

  public void logout() throws Exception{

    home.enterintologout();
    System.out.println("Successfully loged out");
	
}
}



    


	



