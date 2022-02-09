package com.muDomastic.qa.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.muDomastic.qa.base.TestBase;


public class TestUtil extends TestBase {
	public static long PAGE_LOAD_TIME = 30;
	public static long ImplicitWait = 20;

	Logger log = Logger.getRootLogger();

	public void clickElement(WebElement webObject) 
	{		
		try {
			webObject.click();
		}
		catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
	}

	public void clickElement(String webObject) 
	{		
		try {
			driver.findElement(By.xpath(webObject)).click();
		}
		catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
	}

	public boolean verifyElementPresent(WebElement webObject) 
	{		
		boolean result = false;
		try {						
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(webObject));		
		}
		catch (NoSuchElementException e) {
			log.info("element not displayed returning false");
		}
		catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
		return result;
	}
	public boolean verifyElementPresentviaXpath(String webObjectXpath) 
	{		
		boolean result = false;
		try {			

			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(webObjectXpath)));		
		}
		catch (NoSuchElementException e) {
			log.info("element not displayed returning false");

		}
		catch (TimeoutException e) {
			log.info("element not displayed waited for sometime, getting timeout exception, returning false");

		}

		catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);

		}
		return result;
	}

	public void clickVerifiedElement(WebElement webObject) 
	{		
		try {
			if(webObject.isDisplayed())
			{
				webObject.click();
			}
		}
		catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);

		}
	}

	public void  sendText(WebElement webObject, String data) 
	{		
		try {

			webObject.sendKeys(data);
		}
		catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
	}

	public void  clearSendText(WebElement webObject, String data) 
	{		
		try {

			webObject.clear();
			webObject.sendKeys(data);
		}
		catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
	}
	public void  openUrl(String url) 
	{		
		try {
			driver.get(url);
		}
		catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
	}
	public void wait(int seconds)
	{		
		try {
			seconds=seconds*1000;
			Thread.sleep(seconds);		
		}
		catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
	}

	public void selectDropDownByValue(WebElement webObject, String value)
	{		
		try {
			Select dropdown = new Select(webObject);
			dropdown.selectByValue(value);	
		}
		catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
	}

	public String selectDropDownByVisibleText(WebElement webObject, String value) 
	{
		String Result = "Fail";	
		try {

			Select dropdown = new Select(webObject);
			dropdown.selectByVisibleText(value);	
			Result = "Pass";
		}
		catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
		return Result;	
	}

	public String randomEmailGenerator() 
	{		
		String saltStr = null;
		try {
			String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			StringBuilder salt = new StringBuilder();
			Random rnd = new Random();
			while (salt.length() < 10) 
			{ 
				int index = (int) (rnd.nextFloat() * SALTCHARS.length());
				salt.append(SALTCHARS.charAt(index));
			}
			saltStr = salt.toString();

		}
		catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
		return saltStr+"@gmail.com";
	}

	public boolean retryingFindClick(By by) {
		boolean result = false;
		int attempts = 1;
		while(attempts < 3) {
			try {
				log.info("attempt number for stale exception : "+attempts);
				driver.findElement(by);
				result = true;
				break;
			} catch(StaleElementReferenceException e) {
				attempts++;
			}
		}
		return result;
	}

	public List<WebElement> listext(WebElement webObject) 
	{		
		List<WebElement> webEleList = null;
		try {
			// Below will return a list of all elements inside element
			webEleList	= webObject.findElements(By.xpath(".//*"));
		}
		catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
		return webEleList;	
	}
	
	public void clickWithAttempt(WebElement webObject) 
	{			
		try {
			int attempt = 5; 
			while(attempt>1) 
			{
				wait(1);
				log.info("clicking with attempt method , left attempt  :: " + attempt);			
				if(webObject.isEnabled())
				{
					clickElement(webObject);
					break;
				}
				attempt--;
			}
		}
		catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
	}

	public void  clickWithAttemptActions(WebElement webObject) 
	{		
		try {
			int attempt = 5; 
			while(attempt>1) 
			{
				wait(1);
				log.info("clicking with attempt using actions method , left attempt  :: " + attempt);
				if(webObject.isEnabled())
				{
					Actions actions = new Actions(driver);
					actions.moveToElement(webObject).click().perform();	
					break;
				}
				attempt--;
			}
		}
		catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
	}

	public void clickWithjavascriptattempt(WebElement webObject) 
	{		
		try {
			int attempt = 5; 
			while(attempt>1) 
			{
				wait(1);
				log.info("clicking with attempt using actions method , left attempt  :: " + attempt);
				if(webObject.isEnabled())
				{
					JavascriptExecutor jse = (JavascriptExecutor)driver;
					jse.executeScript("arguments[0].click();", webObject);
					break;
				}
				attempt--;
			}
		}
		catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
	}

	public void killOpera() 
	{		
		try {
			Runtime rt = Runtime.getRuntime();
			rt.exec("taskkill /F /IM opera.exe");
		}
		catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
	}


	public void moveSlider(WebElement Slider, int  slidingValue) {

		try {	
			int width = Slider.getSize().getWidth();
			Actions act= new Actions(driver);
			act.moveToElement(Slider, ((width*slidingValue)/100), 0).click();
			act.build().perform();
		}catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
	}

	public String findelementsText(String  xpath) {
		String result = null ;
		try {	
			result = driver.findElement(By.xpath(xpath)).getText();
		}catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
			return "exception occured while finding text";
		}
		return result;
	}

	/** send get request with timeout param 
	 * 
	 * @param url
	 * @return
	 */
	public HashMap<Object, Object> sendGetRequestWithParams(String url) {
		HashMap<Object, Object> responseMap = new HashMap<>();
		try
		{
			int timeout = 60 * 1000; //sec 
			RequestConfig requestConfig = RequestConfig.custom()
					.setConnectTimeout(timeout)
					.setConnectionRequestTimeout(timeout)
					.setSocketTimeout(timeout)
					.build();
			HttpClient httpClient = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).build();
			HttpResponse httpResponse = null;
			try {
				httpResponse = httpClient.execute(new HttpGet(url));
			}catch (Exception e) {
				log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
				responseMap.put("statuscode", 404);
			}
			if(httpResponse != null) {

				BufferedReader rd = null;
				try{
					rd = new BufferedReader( new InputStreamReader(httpResponse.getEntity().getContent()));
				}catch(NullPointerException e){
					log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
				}
				StringBuffer response = new StringBuffer();
				if(rd != null){
					String line = "";
					while ((line = rd.readLine()) != null){
						response.append(line);
					}
				}
				responseMap.put("response", response.toString());
				responseMap.put("statuscode", httpResponse.getStatusLine().getStatusCode());
			}

		}catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
		return responseMap;
	}

	public String  postMethd(String passurl, String jsonInputString) 
	{
		String result = "Pass";
		try {
			URL url = new URL (passurl);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json; utf-8");
			con.setRequestProperty("Accept", "application/json");
			con.setDoOutput(true);

			try(OutputStream os = con.getOutputStream()) {
				byte[] input = jsonInputString.getBytes("utf-8");
				os.write(input, 0, input.length);			
			}
			try(BufferedReader br = new BufferedReader(
					new InputStreamReader(con.getInputStream(), "utf-8"))) {
				StringBuilder response = new StringBuilder();
				String responseLine = null;
				while ((responseLine = br.readLine()) != null) {
					response.append(responseLine.trim());
				}
			}
		} catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
			result = "fail";
		}
		return result;
	}
	public String  postMethdReturnResponse(String passurl, String jsonInputString) 
	{
		String result = "Pass";
		try {
			URL url = new URL (passurl);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json; utf-8");
			con.setRequestProperty("Accept", "application/json");
			con.setDoOutput(true);

			try(OutputStream os = con.getOutputStream()) {
				byte[] input = jsonInputString.getBytes("utf-8");
				os.write(input, 0, input.length);			
			}
			try(BufferedReader br = new BufferedReader(
					new InputStreamReader(con.getInputStream(), "utf-8"))) {
				StringBuilder response = new StringBuilder();
				String responseLine = null;
				while ((responseLine = br.readLine()) != null) {
					response.append(responseLine.trim());
				}
				result=response.toString();
			}
		} catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
			result = "fail";
		}
		return result;
	}

	public List<String> getFilteredCombination(String pcwNAME) 
	{					
		List<String> filteredList = new ArrayList();
		try {	
			String missingUrl = "https://api-home-staging.myutilitygenius.co.uk/request/compare/uswitch/request/missing";
			HashMap<Object, Object> getmissingdatamap = new TestUtil().sendGetRequestWithParams(missingUrl);
			JSONArray getmissingdataarray = new JSONArray(getmissingdatamap.get("response").toString());
			for(Object missingdataiterator : getmissingdataarray)
			{
				JSONObject checkmissingdata =new  JSONObject(missingdataiterator.toString());
				if(checkmissingdata.get("pcwSiteName").toString().equalsIgnoreCase(pcwNAME))
				{
					filteredList.add(checkmissingdata.get("supplierName").toString().toLowerCase()
							+"->"+checkmissingdata.get("tariffName").toString().toLowerCase());			
				}
			}		
		}
		catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
		return filteredList;
	}

	public WebElement findelement(String  xpath) {
		WebElement result = null ;
		try {	
			result = driver.findElement(By.xpath(xpath));
		}catch (Exception e) {
			log.error(" :: Exception Occured in class TestUtils Page, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
		return result;
	}
}