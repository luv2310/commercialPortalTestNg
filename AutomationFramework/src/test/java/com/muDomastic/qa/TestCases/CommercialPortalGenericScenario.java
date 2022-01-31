package com.muDomastic.qa.TestCases;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.muDomastic.qa.base.TestBase;
import com.muDomastic.qa.page.CP_Login_Page;
import com.muDomastic.qa.page.CP_TC_1;
import com.muDomastic.qa.page.CP_TC_10;
import com.muDomastic.qa.page.CP_TC_2;
import com.muDomastic.qa.page.CP_TC_3;
import com.muDomastic.qa.page.CP_TC_5;
import com.muDomastic.qa.page.CP_TC_6;
import com.muDomastic.qa.page.CP_TC_7;
import com.muDomastic.qa.page.CP_TC_8;
import com.muDomastic.qa.page.CP_TC_9;
import com.muDomastic.qa.util.TestUtil;


public class CommercialPortalGenericScenario extends TestBase {

	Logger log = Logger.getRootLogger();
	TestBase testbase = new TestBase();
	TestUtil testUtil = new TestUtil();	


	public  CommercialPortalGenericScenario() {
		//call the base class constructor to initilize the propt
		super();
	}


	@BeforeMethod
	/***
	 * Login Test need to be run before every test
	 ***/
	public void LoginCommercialPortal() {
		testbase.initialization("comercialportal");
		CP_Login_Page cplogin = new CP_Login_Page(driver);
		cplogin.login("darling.rajkhowa@myutilitygenius.co.uk", "Password1");
	}
	
	@Test(priority = 1)
	/***
	 * Verify that, a Quick Quote is generated for Electricity Flow with Confirm with email
	 ***/
	public void CommercialPortal_TC_01() {
		CP_TC_1 cp_tc_1 = new CP_TC_1(driver);
		cp_tc_1.TC_01_TS_01();		
	}

	
	@Test(priority = 2)
	/***
	 * Verify that, a Quick Quote is generated for Electricity Flow with Confirm with email
	 ***/
	public void CommercialPortal_TC_02() {
		CP_TC_2 cp_tc_2 = new CP_TC_2(driver);
		cp_tc_2.TC_02_TS_02();		
	}
	
	@Test(priority = 3)
	/***
	 * Verify that, a Quick Quote is generated for Electricity Flow with Confirm with email
	 ***/
	public void CommercialPortal_TC_03() {
		CP_TC_3 cp_tc_3 = new CP_TC_3(driver);
		cp_tc_3.TC_03_TS_03();		
	}
	
	@Test(priority = 4)
	/***
	 * Verify that, a Quick Quote is generated for Electricity Flow with Confirm with email
	 ***/
	public void CommercialPortal_TC_04() {
		CP_TC_3 cp_tc_3 = new CP_TC_3(driver);
		cp_tc_3.TC_03_TS_03();		
	}
	
	@Test(priority = 5)
	/***
	 * Verify that, a Quick Quote is generated for Electricity Flow with Confirm with email
	 ***/
	public void CommercialPortal_TC_05() {
		CP_TC_5 CP_TC_5 = new CP_TC_5(driver);
		CP_TC_5.TC_05_TS_05();		
	}
	
	@Test(priority = 6)
	/***
	 * Verify that, a Quick Quote is generated for Electricity Flow with Confirm with email
	 ***/
	public void CommercialPortal_TC_06() {
		CP_TC_6 CP_TC_6 = new CP_TC_6(driver);
		CP_TC_6.TC_06_TS_06();		
	}
	
	@Test(priority = 7)
	/***
	 * Verify that, a Quick Quote is generated for Electricity Flow with Confirm with email
	 ***/
	public void CommercialPortal_TC_07() {
		CP_TC_7 CP_TC_7 = new CP_TC_7(driver);
		CP_TC_7.TC_07_TS_07();		
	}
	
	@Test(priority = 8)
	/***
	 * Verify that, a Quick Quote is generated for Electricity Flow with Confirm with email
	 ***/
	public void CommercialPortal_TC_08() {
		CP_TC_8 CP_TC_8 = new CP_TC_8(driver);
		CP_TC_8.TC_08_TS_08();		
	}
	
	@Test(priority = 9)
	/***
	 * Verify that, a Quick Quote is generated for Electricity Flow with Confirm with email
	 ***/
	public void CommercialPortal_TC_09() {
		CP_TC_9 CP_TC_9 = new CP_TC_9(driver);
		CP_TC_9.TC_09_TS_09();		
	}
	
	@Test(priority = 10)
	/***
	 * Verify that, a Quick Quote is generated for Electricity Flow with Confirm with email
	 ***/
	public void CommercialPortal_TC_10() {
		CP_TC_10 CP_TC_10 = new CP_TC_10(driver);
		CP_TC_10.TC_10_TS_10();		
		CP_TC_10.TC_10_TS_10_phase2();
	}
	
	@AfterMethod
	public void driverClose() 
	{
		try {
			driver.close();
			driver.quit();
			Thread.sleep(10000);
			if (!driver.toString().toLowerCase().contains("null"))
			{
				Thread.sleep(20000);
				driver.quit();
			}
		} catch (Exception e) {
			log.error(":: Exception occured in driverClose method of compareTheMarketGenericScenario  :: "+e.getMessage(),e); 
		}
	}
}