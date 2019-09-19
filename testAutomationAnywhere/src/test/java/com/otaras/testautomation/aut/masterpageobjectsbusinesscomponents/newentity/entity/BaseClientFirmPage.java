package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.newentity.entity;
//package com.companyname.testautomation.aut.masterpageobjectsbusinesscomponents.newentity.entity;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.Status;
//import com.companyname.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
//import com.companyname.testautomation.objectrepository.OR;
//
//public class BaseClientFirmPage  extends BasePage{
//	
//	
//	
//	   @FindBy(xpath = OR.ClientFirmPage_ClientFirm)	
//	    public WebElement ClientFirm;
//	   @FindBy(xpath = OR.ClientFirmPage_FirmName)	 
//	    public WebElement FirmName;
//	   
//	   
//	   public boolean Exists(){
//	    	return super.Exists(FirmName); 
//	    	
//		}
//	   
//	    public void selectFirmType() throws InterruptedException 
//	    {
//	    	//Thread.sleep(200);
//	    	  try {
//				    WebElement button =ClientFirm; //driver.findElement(By.xpath("//input[@name='issuerFlags']"));
//				            button.click();
//				}
//				catch(org.openqa.selenium.StaleElementReferenceException ex)
//				{
//				    try{
//					WebElement button =ClientFirm; //driver.findElement(By.xpath("//input[@name='issuerFlags']"));
//				            button.click();
//				    }catch(Exception e){
//				    	testReport.log(Status.FAIL,SuccessFontColorPrefix+"Client Firm Page - selectFirmType Failed - "+ClientFirm.toString()+SuccessFontColorSuffix);
//				    }
//				}
////	    	try{
////	    		//FirstName.click();
////	    	//testReport.log(Status.PASS,SuccessFontColorPrefix+"Client Firm Page - clickNewMenu Successful - "+New.toString()+SuccessFontColorSuffix);
////	    	
////	    	}
////	    	catch (Exception e)
////	    	{
////	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Menu Selection Page - clickNewMenu - unable to Click"+e+ErrorFontColorSuffix);
////	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
////	    		throw new NoSuchElementException ("URL not launched");
////	    	}
//	    }
//	    
//	    public void SelectFirmName() 
//	    {
//	    	try{
//	    		FirmName.click();
////	    		WebElement countryUL= driver.findElement(By.xpath("//[@id='rw_1_input']/div/div/div/ul"));
////	    		List<WebElement> countriesList=countryUL.findElements(By.tagName("li"));
////	    		for (WebElement li : countriesList) {
////	    		if (li.getText().equals("Florda State")) {
////	    		     li.click();
////	    		   }
////	    		}
//	    		
//	    		//FirmName.sendKeys("Florda State");
//	    		driver.findElement(By.cssSelector(".rw-input-reset")).sendKeys("Florda State");
//	    		driver.findElement(By.xpath("//li[contains(text(),'Florda State')]")).click();
////	    		driver.findElement(By.cssSelector(".rw-input-reset")).sendKeys("Florda State");
//	    		//driver.findElement(By.cssSelector(".rw-input-reset")).sendKeys(Keys.TAB);
//	    		//Thread.sleep(500);
//	    	//testReport.log(Status.PASS,SuccessFontColorPrefix+"Client Firm Page - clickNewMenu Successful - "+New.toString()+SuccessFontColorSuffix);
//	    	
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"New Client Firm Page - SelectFirmName - unable to select combobox value"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("URL not launched");
//	    	}
//	    }
//	   
//}
