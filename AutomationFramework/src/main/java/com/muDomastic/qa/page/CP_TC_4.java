package com.muDomastic.qa.page;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.muDomastic.qa.base.TestBase;
import com.muDomastic.qa.util.TestUtil;

public class CP_TC_4  {

	// url initialization and launch browser as per the configuration
	TestBase tb = new TestBase();
	Logger log = Logger.getRootLogger();
	TestUtil action = new TestUtil();

	// define all the xpaths here	
	@FindBy(xpath = "//a[contains(text(),'My Customers')]")
	WebElement myCustomer;

	@FindBy(xpath = "//span[contains(text(),'Add New Customer')]")
	WebElement addNewCustomer;


	@FindBy(id="companyName")
	WebElement companyName;

	@FindBy(id="registeredAddressPostcode")
	WebElement registeredAddressPostcode;

	@FindBy(id="registeredAddressCity")
	WebElement registeredAddressCity;

	@FindBy(id="registeredAddressCounty")
	WebElement registeredAddressCounty;

	@FindBy(id="paperBillsSendTo")
	WebElement paperBillsSendToHeadoffice;

	@FindBy(xpath="//select[@name='companyType']")
	WebElement companyType;

	@FindBy(id="companyRegistrationNumber")
	WebElement companyRegistrationNumber;

	@FindBy(xpath="//select[@name='sicCode']")
	WebElement sicCode;

	@FindBy(xpath="//select[@name='vatRate']")
	WebElement  vatRate;

	@FindBy(xpath="//button[contains(text(),'Save & Next')]")
	WebElement saveNNext;

	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement addprimarycontact;

	@FindBy(xpath="//select[@name='title']")
	WebElement  title;

	@FindBy(id="firstName")
	WebElement companyContactFirstName;

	@FindBy(id="lastName")
	WebElement companyContactLastName;

	@FindBy(xpath="//input[@name='jobTitle']")
	WebElement companyContactJobTitle;

	@FindBy(id="email")
	WebElement companyContactEmail;

	@FindBy(id="landline")
	WebElement companyContactLandline;

	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement savebutton;

	@FindBy(xpath="//button[contains(text(),'Next')]")
	WebElement nextbutton;

	@FindBy(id="addElectricSite")
	WebElement addElectricSite;

	@FindBy(id="numberOfMeters")
	WebElement numberOfMeters1;

	@FindBy(xpath="//span[contains(text(),'Search')]")
	WebElement searchBtn;

	@FindBy(xpath="//tr[@class=\"ng-scope\"]//td[3]")
	List<WebElement> listAddress;

	@FindBy(xpath="(//button[contains(text(),'Include')])[1]")
	WebElement includeMeter;

	@FindBy(xpath="//input[@name=\"currentContractEndDate\"]//..//i")
	WebElement currentContractEndDate;

	@FindBy(xpath="//ul[@class='uib-datepicker-popup dropdown-menu ng-scope']")
	WebElement calendartable;

	@FindBy(xpath="//i[@class=\"glyphicon glyphicon-chevron-right\"]")
	WebElement nextmonth;

	@FindBy(xpath="//button[@class=\"btn btn-default btn-sm uib-title\"]//strong")
	WebElement calendarTitle;

	@FindBy(xpath="//span[contains(text(),'22')]")
	WebElement selectDate;

	@FindBy(id="usage")
	WebElement kwhusage;

	@FindBy(xpath="//button[contains(text(),'Quote')]")
	WebElement QuoteButton;


	@FindBy(xpath="(//button[contains(text(),'Proceed')])[2]")
	WebElement ProceedButton;

	@FindBy(id="postcode")
	WebElement postcode;

	@FindBy(xpath="//button[contains(text(),'Edit Site Payment Details')]")
	WebElement editsitebutton;

	@FindBy(xpath = "//a[@class=\"btn btn-passive\"][contains(text(),'Skip')]")
	WebElement paymentskipbutton;

	@FindBy(id="t&c")
	WebElement tc;

	@FindBy(xpath="//label[@for=\"noOfEmployee2\"]")
	WebElement tc_2;







	@FindBy(xpath = "//input[@value='dual']")
	WebElement selectdualenergy;



	@FindBy(xpath="//span[@class=\"glyphicon glyphicon-search\"]")
	WebElement postcodesearch;

	@FindBy(xpath="//Select[@name=\"address\"]")
	WebElement selectaddress;

	@FindBy(xpath="//Select[@name=\"businessType\"]")
	WebElement selectbusinessType;

	@FindBy(xpath="//div[@class=\"mpan-form-element display-mode\"]//span[@class=\"valid-icon\"]")
	WebElement mpanvalid;

	@FindBy(xpath="//input[@name=\"currentContractEndDate\"]//..//i")
	WebElement contractEndDate1;

	@FindBy(xpath="//input[@name=\"contractEndDate1\"]//..//i")
	WebElement contractenddategas;


	@FindBy(id="usage1")
	WebElement kwhusagegas;

	@FindBy(xpath="//button[contains(text(),'Get Quote')]")
	WebElement getquote;

	@FindBy(xpath="//span[contains(text(),'Best Deal')]//..//button[@class=\"btn btn-sm btn-primary btn-block visible-xs visible-sm margin-top-20\"]")
	WebElement bestdealproceed;

	@FindBy(id="regNumber")
	WebElement registrationnumber;

	@FindBy(xpath="//Select[@name=\"companyContactTitle\"]")
	WebElement companyContactTitle;


	@FindBy(id="companyContactMobile")
	WebElement companyContactMobile;

	@FindBy(id="isAuthoritySignContract")
	WebElement isAuthoritySignContract;

	@FindBy(id="isAuthoritySignDirectDebit")
	WebElement isAuthoritySignDirectDebit;





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

	@FindBy(xpath="//button[contains(text(),'Choose')]")
	WebElement choosebutton;

	@FindBy(xpath="(//button[contains(text(),'Proceed')])[1]")
	WebElement proceedbutton;

	@FindBy(xpath="(//span[contains(text(),'1 of 2')])[2]")
	WebElement submit1of2;

	@FindBy(xpath="(//span[contains(text(),'2 of 2')])[2]")
	WebElement submit2of2;


	// initialize the Page objects
	public CP_TC_4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/***
	 * Verify that , a Quick Quote is generated for  Electricity Flow with Confirm with email
	 ***/

	public void TC_04_TS_04() {
		try {

			action.clickWithjavascriptattempt(myCustomer);

			action.clickWithjavascriptattempt(addNewCustomer);

			action.sendText(companyName, "my utility");

			action.sendText(registeredAddressPostcode, "AL109DF");

			action.sendText(registeredAddressCity, "Hatfield");

			action.sendText(registeredAddressCounty, "Hertfordshire");

			action.clickWithjavascriptattempt(paperBillsSendToHeadoffice);

			action.selectDropDownByVisibleText(companyType, "Private Limited Companies (Ltd/Limited/Cyf)");

			action.sendText(companyRegistrationNumber, "23101993");

			action.selectDropDownByVisibleText(sicCode, "Education");

			action.selectDropDownByVisibleText(vatRate, "5%");

			action.clickWithjavascriptattempt(saveNNext);

			action.clickWithjavascriptattempt(addprimarycontact);

			action.selectDropDownByVisibleText(title, "Mr");

			action.sendText(companyContactFirstName, "Luv");

			action.sendText(companyContactLastName, "Mendiratta");

			action.sendText(companyContactJobTitle, "SDET");

			action.sendText(companyContactEmail, "xyz@gmail.com");

			action.sendText(companyContactLandline, "02034680431");

			action.clickWithjavascriptattempt(savebutton);

			action.clickWithjavascriptattempt(nextbutton);

			action.clickWithjavascriptattempt(addElectricSite);

			action.clickWithjavascriptattempt(numberOfMeters1);

			action.clickWithjavascriptattempt(nextbutton);

			action.sendText(postcode, "HA2 7SA");

			action.clickWithjavascriptattempt(searchBtn);
			
			action.wait(10);
			
			List<WebElement> listaddresses =  listAddress;
			int selectHack = 1;
			for (WebElement ele : listaddresses)
			{
				String udhjana = ele.getText();
				
				if(!udhjana.isEmpty())
				{
					String xpath = "(//tr[@class=\"ng-scope\"]//td[4])["+String.valueOf(selectHack)+"]";
					action.clickWithAttemptActions(action.findelement(xpath));
					break ;
				}			
				selectHack++;
			}

			action.clickWithjavascriptattempt(saveNNext);
			action.clickWithjavascriptattempt(includeMeter);
			action.verifyElementPresent(currentContractEndDate);
			action.clickWithjavascriptattempt(currentContractEndDate);		

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

			action.clickWithjavascriptattempt(savebutton);

			action.clickWithjavascriptattempt(QuoteButton);

			action.clickWithjavascriptattempt(ProceedButton);

			action.clickWithjavascriptattempt(editsitebutton);

			action.clickWithjavascriptattempt(paymentskipbutton2);

			action.verifyElementPresent(tc);	
			action.clickWithjavascriptattempt(tc);

			action.verifyElementPresent(tc_2);	
			action.clickWithjavascriptattempt(tc_2);

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
				if(udhjana.contains("DocuSign"))
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
}