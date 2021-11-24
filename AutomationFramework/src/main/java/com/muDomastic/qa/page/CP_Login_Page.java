package com.muDomastic.qa.page;

import static org.testng.Assert.assertEquals;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.muDomastic.qa.base.TestBase;
import com.muDomastic.qa.util.TestUtil;

import jdk.internal.org.jline.utils.Log;


public class CP_Login_Page  {

	// url initialization and launch browser as per the configuration
	TestBase tb = new TestBase();
	Logger log = Logger.getRootLogger();
	TestUtil action = new TestUtil();

	// define all the xpaths here 
	@FindBy(id = "email")
	WebElement enterEmail;

	@FindBy(id = "password")
	WebElement enterPassword;

	@FindBy(xpath = "//button[@class=\"btn btn-primary\"]")
	WebElement login;

	@FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
	WebElement headingDashboard;

	// initialize the Page objects
	public CP_Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void login(String email,String password) {
		try {

			action.verifyElementPresent(enterEmail);
			action.sendText(enterEmail, email);
			action.verifyElementPresent(enterPassword);
			action.sendText(enterPassword, password);
			action.clickWithjavascriptattempt(login);
			action.verifyElementPresent(headingDashboard);			
		}
		catch (Exception e) {
			log.error(" :: Exception Occured, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
	}
}

