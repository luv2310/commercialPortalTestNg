package com.muDomastic.qa.page;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.muDomastic.qa.base.TestBase;
import com.muDomastic.qa.util.TestUtil;

public class CP_TC_11  {

	// url initialization and launch browser as per the configuration
	TestBase tb = new TestBase();
	Logger log = Logger.getRootLogger();
	TestUtil action = new TestUtil();

	// define all the xpaths here	
	@FindBy(xpath = "//a[contains(text(),'Quick Quotes')]")
	WebElement quickquotelabel;

	@FindBy(xpath = "//input[@value='gas']")
	WebElement selectgas;

	@FindBy(id="postcode")
	WebElement postcode;

	@FindBy(xpath="//span[@class=\"glyphicon glyphicon-search\"]")
	WebElement postcodesearch;

	@FindBy(xpath="//Select[@name=\"address\"]")
	WebElement selectaddress;

	@FindBy(xpath="//Select[@name=\"businessType\"]")
	WebElement selectbusinessType;

	@FindBy(id="mprn")
	WebElement mpanvalid;

	@FindBy(xpath="//input[@name=\"contractEndDate1\"]//..//i")
	WebElement contractenddate;

	@FindBy(xpath="//ul[@class='uib-datepicker-popup dropdown-menu ng-scope']")
	WebElement calendartable;

	@FindBy(xpath="//i[@class=\"glyphicon glyphicon-chevron-right\"]")
	WebElement nextmonth;

	@FindBy(xpath="//button[@class=\"btn btn-default btn-sm uib-title\"]//strong")
	WebElement calendarTitle;

	@FindBy(xpath="//span[contains(text(),'22')]")
	WebElement selectDate;

	@FindBy(id="usage1")
	WebElement kwhusage;

	@FindBy(xpath="//button[contains(text(),'Get Quote')]")
	WebElement getquote;

	@FindBy(xpath="//span[contains(text(),'Best Deal')]//..//button[@class=\"btn btn-sm btn-primary btn-block visible-xs visible-sm margin-top-20\"]")
	WebElement bestdealproceed;

	@FindBy(id="regNumber")
	WebElement registrationnumber;

	@FindBy(xpath="//Select[@name=\"companyContactTitle\"]")
	WebElement companyContactTitle;

	@FindBy(id="companyContactFirstName")
	WebElement companyContactFirstName;

	@FindBy(id="companyContactLastName")
	WebElement companyContactLastName;

	@FindBy(id="companyContactJobTitle")
	WebElement companyContactJobTitle;

	@FindBy(id="companyContactEmail")
	WebElement companyContactEmail;

	@FindBy(id="companyContactLandline")
	WebElement companyContactLandline;

	@FindBy(id="companyContactMobile")
	WebElement companyContactMobile;

	@FindBy(id="isAuthoritySignContract")
	WebElement isAuthoritySignContract;

	@FindBy(id="isAuthoritySignDirectDebit")
	WebElement isAuthoritySignDirectDebit;

	@FindBy(xpath="//button[contains(text(),'Next')]")
	WebElement nextbutton;

	@FindBy(xpath="//button[contains(text(),'Edit Site Payment Details')]")
	WebElement editsitebutton;

	@FindBy(xpath = "//a[@class=\"btn btn-passive\"][contains(text(),'Skip')]")
	WebElement paymentskipbutton;

	@FindBy(id="t&c")
	WebElement tc;

	@FindBy(xpath="//button[contains(text(),'Skip')]")
	WebElement paymentskipbutton2;

	@FindBy(id="chooseAction")
	WebElement chooseAction;

	@FindBy(xpath="(//select[@id='chooseContacts']//option)")
	List<WebElement> chooseContactsOPTIONs;

	@FindBy(id="chooseContacts")
	WebElement chooseContactsOPTION;

	@FindBy(xpath="(//button[contains(text(),'')])")
	List<WebElement> finalbuttons;

	@FindBy(xpath="//label[@for=\"noOfEmployee2\"]")
	WebElement tc_2;

	@FindBy(xpath="(//button[contains(text(),'Next Steps')])[1]")
	WebElement nextStep;

	@FindBy(xpath="//div[@class=\"file-upload btn-block\"]")
	WebElement uploadContract;

	@FindBy(id = "email")
	WebElement enterEmail;

	@FindBy(id = "password")
	WebElement enterPassword;

	@FindBy(xpath = "//button[@class=\"btn btn-primary\"]")
	WebElement login;

	@FindBy(xpath = "//a[contains(text(),'Contract Update')]")
	WebElement contractUpdate;

	@FindBy(xpath = "(//button[contains(text(),'Meter Details')])[1]")
	WebElement meterDetails;

	@FindBy(xpath = "//button[contains(text(),'Lock In')]")
	WebElement lockIn;

	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement confirmYes;

	@FindBy(xpath = "//button[contains(text(),'Live')]")
	WebElement buttonLive;

	@FindBy(xpath = "//span[contains(text(),'Live')]")
	WebElement verifyLive;

	// initialize the Page objects
	public CP_TC_11(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/***
	 * Verify that , a Quick Quote is generated for  Electricity Flow with Confirm with email
	 ***/

	public void TC_11_TS_11() {
		try {

			action.verifyElementPresent(quickquotelabel);	
			action.clickWithjavascriptattempt(quickquotelabel);

			action.verifyElementPresent(selectgas);	
			action.clickWithjavascriptattempt(selectgas);

			action.verifyElementPresent(postcode);	
			action.sendText(postcode,"AL109DF");
			action.clickWithjavascriptattempt(postcodesearch);

			action.verifyElementPresent(selectaddress);
			action.selectDropDownByValue(selectaddress, "20");

			action.verifyElementPresent(selectbusinessType);
			action.selectDropDownByValue(selectbusinessType, "7");

			action.verifyElementPresent(mpanvalid);

			action.verifyElementPresent(contractenddate);
			action.clickWithjavascriptattempt(contractenddate);				
			action.verifyElementPresent(calendartable);
			System.out.println(calendarTitle.getText().toString());
			while(!calendarTitle.getText().toString().equalsIgnoreCase("April 2022"))
			{						
				System.out.println(calendarTitle.getText().toString());
				action.clickWithjavascriptattempt(nextmonth);
			}
			action.clickWithjavascriptattempt(selectDate);			

			action.verifyElementPresent(kwhusage);	
			action.sendText(kwhusage,"222");

			action.verifyElementPresent(getquote);	
			action.clickWithjavascriptattempt(getquote);

			action.verifyElementPresent(bestdealproceed);	
			action.clickWithjavascriptattempt(bestdealproceed);

			action.verifyElementPresent(registrationnumber);	
			action.sendText(registrationnumber,"100");

			System.out.println(action.verifyElementPresent(companyContactTitle));
			action.selectDropDownByValue(companyContactTitle, "Mr");

			action.verifyElementPresent(companyContactFirstName);	
			action.sendText(companyContactFirstName,"luv");

			action.verifyElementPresent(companyContactLastName);	
			action.sendText(companyContactLastName,"mendiratta");

			action.verifyElementPresent(companyContactJobTitle);	
			action.sendText(companyContactJobTitle,"sdet");

			action.verifyElementPresent(companyContactEmail);	
			action.sendText(companyContactEmail,"xyz@gmail.com");

			action.verifyElementPresent(companyContactLandline);	
			action.sendText(companyContactLandline,"12312312312");

			action.verifyElementPresent(companyContactMobile);	
			action.sendText(companyContactMobile,"07467123123");

			action.verifyElementPresent(isAuthoritySignContract);	
			action.clickWithjavascriptattempt(isAuthoritySignContract);

			action.verifyElementPresent(isAuthoritySignDirectDebit);	
			action.clickWithjavascriptattempt(isAuthoritySignDirectDebit);

			action.clickWithjavascriptattempt(nextbutton);

			action.verifyElementPresent(paymentskipbutton);	
			action.clickWithjavascriptattempt(paymentskipbutton);

			action.verifyElementPresent(editsitebutton);	
			action.clickWithjavascriptattempt(editsitebutton);

			action.verifyElementPresent(paymentskipbutton2);	
			action.clickWithjavascriptattempt(paymentskipbutton2);

			action.verifyElementPresent(tc_2);	
			action.clickWithjavascriptattempt(tc_2);

			action.verifyElementPresent(tc);	
			action.clickWithjavascriptattempt(tc);

			action.verifyElementPresent(chooseAction);
			action.selectDropDownByValue(chooseAction, "1");

			List<WebElement> listelements =  chooseContactsOPTIONs;
			for (WebElement ele : listelements)
			{
				String udhjana = ele.getText();
				if(udhjana.contains("luv"))
				{
					action.selectDropDownByVisibleText(chooseContactsOPTION, udhjana);
				}				
			}

			List<WebElement> listbuttons =  finalbuttons;
			for (WebElement ele : listbuttons)
			{
				String udhjana = ele.getText();
				if(udhjana.contains("Download"))
				{
					ele.click();
					break;
				}				

			}

		}
		catch (Exception e) {
			log.error(" :: Exception Occured, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
	}

	public void TC_11_TS_11_phase2()
	{
		try {
			//phase 2 started from here. 

			action.verifyElementPresent(nextStep);
			action.clickWithjavascriptattempt(nextStep);
			action.clickWithAttempt(uploadContract);
			action.wait(6);
			String exePath = System.getProperty("user.dir")+"\\driver\\upload.exe";
			Runtime.getRuntime().exec(exePath);
			action.wait(2);

			if(action.verifyElementPresent(nextStep))
			{
				action.wait(5);
			}
			supplierPortalVerification();
		}
		catch (Exception e) {
			log.error(" :: Exception Occured, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);	
		}
	}

	public void supplierPortalVerification()
	{
		try {
			//supplier portal automation check 

			action.openUrl("https://commercialportal-supplier-test.azurewebsites.net/#!/login");

			action.verifyElementPresent(enterEmail);

			action.sendText(enterEmail, "ashwin.kalmady@myutilitygenius.co.uk");

			action.verifyElementPresent(enterPassword);

			action.sendText(enterPassword, "Password3");

			action.clickWithjavascriptattempt(login);					

			action.clickWithjavascriptattempt(contractUpdate);

			action.clickWithjavascriptattempt(meterDetails);

			action.clickWithjavascriptattempt(lockIn);

			action.clickWithjavascriptattempt(confirmYes);

			action.clickWithjavascriptattempt(buttonLive);

			action.clickWithjavascriptattempt(confirmYes);

			action.wait(5);

			action.verifyElementPresent(verifyLive);
		}
		catch (Exception e) {
			log.error(" :: Exception Occured, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);	
		}
	}

}