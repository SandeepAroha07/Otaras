package com.otaras.testautomation.common;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.Pages;
import com.otaras.testautomation.aut.testdatarec.TestDataRec;
import com.otaras.testautomation.common.uielement.fieldDecorator;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class GuiValidation {

	
	private WebDriver driver;
	private ExtentTest testReport;
	public Pages pages;
	public ResultLog ResultLog;
	
	public GuiValidation(WebDriver driver,ExtentTest testReport)
	{
		 this.driver=driver;
		 this.testReport=testReport;
		 
		 PageFactory.initElements(new fieldDecorator(driver,testReport), this);
	}
	
	
	public void UITestValidation(Map<Object, Object> tranmap) throws Exception{
	 	
			//Thread.sleep(5000);
		 

		  
		  String pageName="";
		  String webelementName="";
		  String eType="";
		  String eKeyAttribute="";
		  String elementLocator="";
		  String elementValue="";
		  
		  String testPrecondition="";
		  
		  String eExists="";
		  String eStatus="";
		  String eInputValue="";
		  String eDefaultValue="";
		  String ePlaceHolder="";
		  String eMinLength="";
		  String eMaxLength="";
		  String eDropdownValuesPresent="";
		  String eIsSelectable="";
		  String eLabel="";
		  
		  String eIsRequired="";

		  if (tranmap.get("pageName").equals(""))
			  pageName="";
		  else
			  pageName=tranmap.get("pageName").toString().trim();
		  
		  if (tranmap.get("webelementName").equals(""))
			  webelementName="";
		  else
			  webelementName=tranmap.get("webelementName").toString().trim();
		  
		  if (tranmap.get("eType").equals(""))
			  eType="";
		  else
			  eType=tranmap.get("eType").toString().trim();
		  
		  if (tranmap.get("eKeyAttribute").equals(""))
			  eKeyAttribute="";
		  else
			  eKeyAttribute=tranmap.get("eKeyAttribute").toString().trim();
		  
		  if (tranmap.get("elementLocator").equals(""))
			  elementLocator="";
		  else
			  elementLocator=tranmap.get("elementLocator").toString().trim();

		  if (tranmap.get("elementValue").equals(""))
			  elementValue="";
		  else
			  elementValue=tranmap.get("elementValue").toString().trim();

		  if (tranmap.get("testPrecondition").equals(""))
			  testPrecondition="";
		  else
			  testPrecondition=tranmap.get("testPrecondition").toString().trim();

		  if (tranmap.get("eExists").equals(""))
			  eExists="";
		  else
			  eExists=tranmap.get("eExists").toString().trim();
	
		  if (tranmap.get("eStatus").equals(""))
			  eStatus="";
		  else
			  eStatus=tranmap.get("eStatus").toString().trim();
		
		  if (tranmap.get("eInputValue").equals(""))
			  eInputValue="";
		  else
			  eInputValue=tranmap.get("eInputValue").toString().trim();
		
		  if (tranmap.get("eDefaultValue").equals(""))
			  eDefaultValue="";
		  else
			  eDefaultValue=tranmap.get("eDefaultValue").toString().trim();
		 
		  if (tranmap.get("ePlaceHolder").equals(""))
			  ePlaceHolder="";
		  else
			  ePlaceHolder=tranmap.get("ePlaceHolder").toString().trim();
		 
		  if (tranmap.get("eMinLength").equals(""))
			  eMinLength="";
		  else
			  eMinLength=tranmap.get("eMinLength").toString().trim();
		 
		  if (tranmap.get("eMaxLength").equals(""))
			  eMaxLength="";
		  else
			  eMaxLength=tranmap.get("eMaxLength").toString().trim();
		
		  if (tranmap.get("eDropdownValuesPresent").equals(""))
			  eDropdownValuesPresent="";
		  else
			  eDropdownValuesPresent=tranmap.get("eDropdownValuesPresent").toString().trim();
	
		  if (tranmap.get("eIsSelectable").equals(""))
			  eIsSelectable="";
		  else
			  eIsSelectable=tranmap.get("eIsSelectable").toString().trim();
	
		  if (tranmap.get("eLabel").equals(""))
			  eLabel="";
		  else
			  eLabel=tranmap.get("eLabel").toString().trim();

		  if (tranmap.get("eIsRequired").equals(""))
			  eIsRequired="";
		  else
			  eIsRequired=tranmap.get("eIsRequired").toString().trim();
		  

		
		  
		  
		  
		  //TestDataRec.TESTTRANSACTIONDATAMAP=tranmap;
		  //elementValue=TestDataRec.TESTDATAMAP.get("elementValue").trim();
		  //elementValue=tranmap.get("elementValue").toString().trim();
		  
		  
		  //pages.InvokeApplicationPage.isElementPresent(By.id("idOfElement"));
		  
		  
		  //pageName=TestDataRec.TESTDATAMAP.get("pageName").trim();
		  //pageName=tranmap.get("pageName").toString().trim();
		  
		  ResultLog.ReportTestEvent("INFO","######################### UI Validation Starts From Here #########################");
		  ResultLog.ReportTestEvent("INFO","Test Data:   "+tranmap);
		  try{
			  switch (pageName) 
				{
					case "ClientContactsPage":
						//pages.ClientContactsPage.ClientContactsTab.click();
						//driver.findElement(By.cssSelector(".inactive-tab > a:nth-child(1)")).click();
						//Thread.sleep(2000);
						//pages.ClientContactsPage.clickClientContactsTab();
						//driver.findElement(By.cssSelector(".inactive-tab > a:nth-child(1)")).click();
						//Thread.sleep(2000);
						//pages.ClientFirmPage.WaitForPage(pages.ClientContactsPage);
						break;	
				}
		  }
		  catch(Exception e)
		  {
			  ResultLog.ReportTestEvent("FATAL", "*UI*PageNavigationFailed - Exception: Page Name - "+pageName+"; Unable to Navigate to the test page - "+"; Page Name -  "+pageName);
			  ResultLog.ReportTestEvent("FATAL",e.toString());
			  ResultLog.takeScreenShot();
			  throw new NullPointerException("******** Exception Found - Verification GUI Page not found - Test Scenrario Execution Incomplete ********");
		  }
		  
		  WebElement testUIElement;
		  WebElement testUIElementError=null;
		  //Thread.sleep(200);
		  driver.findElement(By.cssSelector(".is-link")).click();;
		 // Thread.sleep(200);
		  if (!elementValue.equalsIgnoreCase("")&&!elementLocator.equalsIgnoreCase(""))
		  {
			  if (elementLocator.equalsIgnoreCase("css"))
				  testUIElement=driver.findElement(By.cssSelector(elementValue));
			  else
				  testUIElement=driver.findElement(By.xpath(elementValue));
			  if (eIsRequired.equalsIgnoreCase("yes"))
				  if (elementLocator.equalsIgnoreCase("css"))
					  testUIElementError=driver.findElement(By.cssSelector(elementValue+"/following-sibling::small"));
				  else
					  testUIElementError=driver.findElement(By.xpath(elementValue+"/following-sibling::small"));
//				  if (driver.findElement(By.xpath(elementValue+"/following-sibling::small")).getText().trim().equalsIgnoreCase("required"))
//				  		ResultLog.ReportTestEvent("PASS","Object Found");
//				  	else
//				  		ResultLog.ReportTestEvent("FAIL","Object Found");
		  }
		  else
		  {
			  if (eKeyAttribute.equalsIgnoreCase(""))
			  {
				  System.out.println("");
				  testUIElement=driver.findElement(By.xpath("//*[contains(text(),'"+webelementName+"')]/parent::div//"+eType+""));
				  if (eIsRequired.equalsIgnoreCase("yes"))
					  testUIElementError=driver.findElement(By.xpath("//*[contains(text(),'"+webelementName+"')]/parent::div//"+eType+"/following-sibling::small"));
//					  if (driver.findElement(By.xpath("//*[contains(text(),'"+webelementName+"')]/parent::div//"+eType+"/following-sibling::small")).getText().trim().equalsIgnoreCase("required"))
//						  ResultLog.ReportTestEvent("PASS","Object Found");
//				  		else
//				  			ResultLog.ReportTestEvent("FAIL","Object Found");
			  }
			  else
			  {
				  System.out.println("");
				  //testUIElement=driver.findElement(By.xpath("//*[contains(text(),'"+webelementName+"')]/parent::div//"+eType+""));
				  testUIElement=driver.findElement(By.xpath("//*[contains(text(),'"+webelementName+"')]/parent::div//*[contains("+eKeyAttribute+")]"));
				  if (eIsRequired.equalsIgnoreCase("yes"))
					  testUIElementError=driver.findElement(By.xpath("//*[contains(text(),'"+webelementName+"')]/parent::div//*[contains("+eKeyAttribute+")]/following-sibling::small"));
//					  if (driver.findElement(By.xpath("//*[contains(text(),'"+webelementName+"')]/parent::div//*[contains("+eKeyAttribute+")]/following-sibling::small")).getText().trim().equalsIgnoreCase("required"))
//						  ResultLog.ReportTestEvent("PASS","Object Found");
//				  		else
//				  			ResultLog.ReportTestEvent("FAIL","Object Found");
			  }
		  }
		  
		  
		  //String xyz=driver.findElement(By.xpath("//input[@name='rfpTranOtherTransactionType']/following-sibling::small")).getText();
		  
		  
		 if (testUIElement.isDisplayed())
			 ResultLog.ReportTestEvent("PASS","Object Found");
		  
		 if (eIsRequired.equalsIgnoreCase("yes"))
			 if (testUIElementError.getText().trim().equalsIgnoreCase("required"))
				 ResultLog.ReportTestEvent("PASS","Is Required");
		 
		 ResultLog.takeScreenShot();
		 
		  if (eExists.equalsIgnoreCase("no"))
		  {
			  try{
					if (testUIElement.isDisplayed())
					{
						ResultLog.ReportTestEvent("FATAL","*UI* - Test Step Failed "+pageName+"; Verification Method - "+"Element Exists"+"; Element Name -  "+webelementName+"; Element Value - "+elementValue);
					}
				}catch (Exception e)
				{
					ResultLog.ReportTestEvent("PASS", "*UI*Exists-No - Exception: Page Name - "+pageName+"; Verification Method - "+"Element Exists"+"; Element Name -  "+webelementName+"; Element Value - "+elementValue);
					ResultLog.ReportTestEvent("PASS",e.toString());
				}
		  }
		  
		  if (!eExists.equalsIgnoreCase("no"))
		  {
			  try
			  {
				  if (testUIElement.isDisplayed())
				  {
						//eExists=tranmap.get("eExists").toString().trim();
						if (eExists.contentEquals("yes"))
						{
							try{
								if (testUIElement.isDisplayed())
								{
									ResultLog.ReportTestEvent("PASS","*UI*Exists-Yes - Test Step Passed "+tranmap.get("pageName").toString()+"; Verification Method - "+"Element Exists"+"; Element Name -  "+tranmap.get("webelementName").toString()+"; Element Value - "+tranmap.get("elementValue").toString());
									//ResultLog.ReportTestEvent("PASS","*UI*Exists-Yes ");
								}
							}catch (Exception e)
							{
								ResultLog.ReportTestEvent("FATAL", "*UI*Exists-Exception - Exception: Page Name - "+tranmap.get("pageName").toString()+"; Verification Method - "+"Element Exists"+"; Element Name -  "+tranmap.get("webelementName").toString()+"; Element Value - "+tranmap.get("elementValue").toString());
								ResultLog.ReportTestEvent("FATAL",e.toString());
							}
						}
						
						//WebElement testUIElement=driver.findElement(By.xpath(elementValue));
						
						//eStatus=tranmap.get("eStatus").toString().trim();
						try{
							switch (eStatus) 
							{
								case "enabled":
									if (testUIElement.isEnabled())
										ResultLog.ReportTestEvent("PASS","*UI*Exists-Enabled-Pass - Test Step Passed "+pageName+"; Verification Method - "+"Element Enabled"+"; Element Name -  "+webelementName+"; Element Value - "+elementValue);
									else
										throw new Exception("Element Disabled");
									break;
								case "disabled":
									if (!testUIElement.isEnabled())
										ResultLog.ReportTestEvent("PASS","*UI*Disabled-Failed - Test Step Failed "+pageName+"; Verification Method - "+"Element Enabled"+"; Element Name -  "+webelementName+"; Element Value - "+elementValue);
									else
										throw new Exception("Element Enabled");
									break;
								default:
									break;
							}
						}catch (Exception e)
						{
							ResultLog.ReportTestEvent("FATAL", "*UI*Enable/Disable-Exception[or not as expected] - Exception: Page Name - "+pageName+"; Verification Method - "+"Element Status not as expected"+"; Element Name -  "+webelementName+"; Element Value - "+elementValue);
							ResultLog.ReportTestEvent("FATAL",e.toString());
						}
						
						//eInputValue=tranmap.get("eInputValue").toString().trim();
						try{
							switch (eInputValue) 
							{
								case "alphanumeric":
									// consider field length here when input data
									testUIElement.sendKeys("#$%^&()*@|");
									if (testUIElement.getText().equalsIgnoreCase(""))
										ResultLog.ReportTestEvent("PASS","*UI*alphanumericCheckPass - Test Step Passed "+pageName+"; Verification Method - "+"Field Accepts Alphanumeric data"+"; Element Name -  "+webelementName+"; Element Value - "+elementValue);
									else
										throw new Exception("Element accepts alphanumeric");
									break;
								case "customalphanumeric":
									break;
								case "numeric":
									break;
								case "email":
									break;
								case "date":
									dateValidation(testUIElement, "10","","", webelementName, eType);
									dateValidation(testUIElement, "","13","", webelementName, eType);
									dateValidation(testUIElement, "","","2000", webelementName, eType);
									dateValidation(testUIElement, "10","","2000", webelementName, eType);
									dateValidation(testUIElement, "","13","2000", webelementName, eType);
									dateValidation(testUIElement, "10","11","", webelementName, eType);
									dateValidation(testUIElement, "","11","2000", webelementName, eType);
									dateValidation(testUIElement, "00","00","0000", webelementName, eType);
									dateValidation(testUIElement, "10","10","2000", webelementName, eType);
									dateValidation(testUIElement, "10","10","1900", webelementName, eType);
//									testUIElement.sendKeys("10");
//									testUIElement.sendKeys(Keys.TAB);
//									if (driver.findElement(By.xpath("//*[contains(text(),'"+webelementName+"')]/parent::div//"+eType+"/following-sibling::small")).isDisplayed())
//										ResultLog.ReportTestEvent("PASS","Application validates invalid date");
//									else
//										ResultLog.ReportTestEvent("FAIL","Application accepts invalid date");
//									String invalidMonth="";
//									invalidMonth=testUIElement.getText(); 
//									System.out.println(isValidDate("02/29/"));
//								    System.out.println(isValidDate("2005-02-29"));
									break;
								default:
									break;
							}
						}catch (Exception e)
						{
							ResultLog.ReportTestEvent("FATAL", "*UI*-Input data not as expected-"+eInputValue+" - Exception: Page Name - "+pageName+"; Verification Method - "+"Element Accepting Input"+"; Element Name -  "+webelementName+"; Element Value - "+elementValue);
							ResultLog.ReportTestEvent("FATAL",e.toString());
						}
						
						//try{  //remove this
						//eIsEditable=tranmap.get("eIsEditable").toString().trim();
//						try{
//							switch (eIsEditable) 
//							{
//								case "yes":
//									break;
//								case "no":
//									break;
//								default:
//									break;
//							}
//						}catch (Exception e)
//						{
//							ResultLog.ReportTestEvent("FATAL", "*UI* - Exception: Page Name - "+pageName+"; Verification Method - "+"Is Editable"+"; Element Name -  "+webelementName+"; Element Value - "+elementValue);
//							ResultLog.ReportTestEvent("FATAL",e.toString());
//						}
						
						//eDefaultValue=tranmap.get("eDefaultValue").toString().trim();
						try{
							switch (eDefaultValue) 
							{
								case "blank":
									if (testUIElement.getText().equalsIgnoreCase(""))
										ResultLog.ReportTestEvent("PASS","*UI*defaultValueCheckPass - Test Step Passed "+pageName+"; Verification Method - "+"Field default value blank"+"; Element Name -  "+webelementName+"; Element Value - "+elementValue);
									else
										throw new Exception("Element default value blank");
									break;
								default:
									String sActualDefaultValue="";
									if (!eDefaultValue.equalsIgnoreCase("")){
										if (eType.equalsIgnoreCase("select")){
											
											Select dropdown = new Select(testUIElement);
											WebElement option = dropdown.getFirstSelectedOption();
											System.out.println(option.getText()); //prints "Option"
											sActualDefaultValue=option.getText();
											//dropdown.selectByVisibleText("5");
	
											//sActualDefaultValue = dropdown.getFirstSelectedOption().getAttribute("value");
											//sActualDefaultValue=testUIElement.getAttribute("value");
										}
										else
											sActualDefaultValue=testUIElement.getText();
										if (sActualDefaultValue.equalsIgnoreCase(eDefaultValue))
											ResultLog.ReportTestEvent("PASS","*UI*defaultValueCheckPass - Test Step Passed "+pageName+"; Verification Method - "+"Field default value :"+eDefaultValue+"; Element Name -  "+webelementName+"; Element Value - "+elementValue);
										else
											throw new Exception("Element default value blank");
									}
									break;
							}
						}catch (Exception e)
						{
							ResultLog.ReportTestEvent("FATAL", "*UI* - Exception: Page Name - "+pageName+"; Verification Method - "+"Default Value"+"; Element Name -  "+webelementName+"; Element Value - "+elementValue);
							ResultLog.ReportTestEvent("FATAL",e.toString());
						}
						
						//ePlaceHolder=tranmap.get("ePlaceHolder").toString().trim();
						try{
							if (!ePlaceHolder.equalsIgnoreCase(""))
							{
								if(testUIElement.getAttribute("placeholder").equalsIgnoreCase(ePlaceHolder))
									ResultLog.ReportTestEvent("PASS","*UI*placeholderCheckPass - Test Step Passed "+pageName+"; Verification Method - "+"Field placeholder as expected"+"; Element Name -  "+webelementName+"; Element Value - "+elementValue);
							}
						}catch (Exception e)
						{
							ResultLog.ReportTestEvent("FATAL", "*UI* - Exception: Page Name - "+pageName+"; Verification Method - "+"Placeholder"+"; Element Name -  "+webelementName+"; Element Value - "+elementValue);
							ResultLog.ReportTestEvent("FATAL",e.toString());
						}
						
						//eMaxLength=tranmap.get("eLength").toString().trim();
						try{
							if (!eMaxLength.trim().equalsIgnoreCase(""))
							{
								ResultLog.ReportTestEvent("FAIL", "*UI* - Max Length -"+"Max length not set: "+eMaxLength);
							}
						}catch (Exception e)
						{
							ResultLog.ReportTestEvent("FATAL", "*UI* - Exception: Page Name - "+pageName+"; Verification Method - "+"Max Length"+"; Element Name -  "+webelementName+"; Element Value - "+elementValue);
							ResultLog.ReportTestEvent("FATAL",e.toString());
						}
						
						try{
							if (!eMinLength.equalsIgnoreCase(""))
							{
								ResultLog.ReportTestEvent("FAIL", "*UI* - Min Length -"+"Min length not set");
							}
						}catch (Exception e)
						{
							ResultLog.ReportTestEvent("FATAL", "*UI* - Exception: Page Name - "+pageName+"; Verification Method - "+"Min Length"+"; Element Name -  "+webelementName+"; Element Value - "+elementValue);
							ResultLog.ReportTestEvent("FATAL",e.toString());
						}
						
						//eDropdownValuesPresent=tranmap.get("eDropdownValuesPresent").toString().trim();
						try{
							if (!eDropdownValuesPresent.equalsIgnoreCase(""))
							{
								//WebElement select=testUIElement;
								Select select = new Select(testUIElement); 
								WebElement option = select.getFirstSelectedOption();
								ResultLog.ReportTestEvent("PASS", "*UI* - eDropdownValuesPresent -"+"eDropdownValuesPresent");
							}
						}catch (Exception e)
						{
							ResultLog.ReportTestEvent("FATAL", "*UI* - Exception: Page Name - "+pageName+"; Verification Method - "+"Dropdown Values NOT Present"+"; Element Name -  "+webelementName+"; Element Value - "+elementValue);
							ResultLog.ReportTestEvent("FATAL",e.toString());
						}
						
						//https://sqa.stackexchange.com/questions/12029/how-do-i-work-with-dropdowns-in-selenium-webdriver
						eIsSelectable=tranmap.get("eIsSelectable").toString().trim();
						try{
							if (!eIsSelectable.equalsIgnoreCase(""))
							{
								Select select = new Select(testUIElement); 
								WebElement option = select.getFirstSelectedOption();

								if (eStatus.equalsIgnoreCase("enabled"))
									select.selectByVisibleText(option.getText());
								
								ResultLog.ReportTestEvent("PASS", "*UI* - eIsSelectable -"+"eIsSelectable");
							}
						}catch (Exception e)
						{
							ResultLog.ReportTestEvent("FATAL", "*UI* - Exception: Page Name - "+pageName+"; Verification Method - "+"Element NOT Selectable"+"; Element Name -  "+webelementName+"; Element Value - "+elementValue);
							ResultLog.ReportTestEvent("FATAL",e.toString());
						}
						
						//eLabel=tranmap.get("eLabel").toString().trim();
						try{
							if (!eLabel.equalsIgnoreCase(""))
							{
								if (testUIElement.getText().trim().equalsIgnoreCase(eLabel))
									ResultLog.ReportTestEvent("PASS", "*UI* - eLabel -"+"eLabel");
								else
									ResultLog.ReportTestEvent("FAIL", "*UI* - eLabel -"+"eLabel - not as expected");
							}
						}catch (Exception e)
						{
							ResultLog.ReportTestEvent("FATAL", "*UI* - Exception: Page Name - "+pageName+"; Verification Method - "+"Element Label"+"; Element Name -  "+webelementName+"; Element Value - "+elementValue);
							ResultLog.ReportTestEvent("FATAL",e.toString());
						}
						//  }catch(Exception e1){}  //remove this
				  	}

			  	}catch (Exception e)
			  	{
			  		ResultLog.ReportTestEvent("FATAL", "*UI* - Exception: Page Name - "+pageName+"; OBJECT NOT FOUND TO PERFORM UI VALIDATION - CHECK APPLICATION/TEST DATA SHEET - "+"Element Label"+"; Element Name -  "+webelementName+"; Element Value - "+elementValue);
					ResultLog.ReportTestEvent("FATAL",e.toString());
					 throw new Exception ("Object Not Found To Perform UI Validation");
			  	}
			 }
			
	}
	
	
	
	public static boolean isValidDate(String inDate) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	    dateFormat.setLenient(false);
	    try {
	      dateFormat.parse(inDate.trim());
	    } catch (ParseException pe) {
	      return false;
	    }
	    return true;
	  }
	
	public void dateValidation(WebElement testUIElement, String sMM, String sDD, String YYYY, String webelementName, String eType) {
	
	String sDate="";
	testUIElement.sendKeys(Keys.SHIFT,Keys.TAB);
	testUIElement.sendKeys(Keys.SHIFT,Keys.TAB);
	testUIElement.sendKeys(Keys.SHIFT,Keys.TAB);
	testUIElement.click();
	
	if (!sMM.equalsIgnoreCase("")){
		testUIElement.sendKeys(sMM);
		testUIElement.sendKeys(Keys.SHIFT,Keys.TAB);
		}
//	else if (sMM.equalsIgnoreCase(""))
//		testUIElement.sendKeys(Keys.TAB);
	
	if (!sDD.equalsIgnoreCase("")&&!sMM.equalsIgnoreCase("")){
		testUIElement.sendKeys(Keys.SHIFT,Keys.TAB);
		testUIElement.sendKeys(sDD);
		testUIElement.sendKeys(Keys.SHIFT,Keys.TAB);
		}
	if (!sDD.equalsIgnoreCase("")&&sMM.equalsIgnoreCase("")){
		testUIElement.sendKeys(Keys.TAB);
		testUIElement.sendKeys(sDD);
		testUIElement.sendKeys(Keys.SHIFT,Keys.TAB);
		}
	
	if (!YYYY.equalsIgnoreCase("")&&!sMM.equalsIgnoreCase("")&&!sDD.equalsIgnoreCase("")){
		testUIElement.sendKeys(sMM);
		testUIElement.sendKeys(sDD);
		testUIElement.sendKeys(YYYY);
		testUIElement.sendKeys(Keys.TAB);
		}
	
	if (!YYYY.equalsIgnoreCase("")&&!sMM.equalsIgnoreCase("")){
		testUIElement.sendKeys(sMM);
		testUIElement.sendKeys(Keys.TAB);
		testUIElement.sendKeys(YYYY);
		testUIElement.sendKeys(Keys.TAB);
		}
	if (!YYYY.equalsIgnoreCase("")&&sMM.equalsIgnoreCase("")&&sDD.equalsIgnoreCase("")){
		testUIElement.sendKeys(Keys.TAB);
		testUIElement.sendKeys(Keys.TAB);
		testUIElement.sendKeys(YYYY);
		testUIElement.sendKeys(Keys.TAB);
		}
	if (!YYYY.equalsIgnoreCase("")&&sMM.equalsIgnoreCase("")&&!sDD.equalsIgnoreCase("")){
		testUIElement.sendKeys(Keys.TAB);
		testUIElement.sendKeys(YYYY);
		testUIElement.sendKeys(Keys.TAB);
		}
//	if (!YYYY.equalsIgnoreCase("")&&!sDD.equalsIgnoreCase("")&&sMM.equalsIgnoreCase("")){
//		testUIElement.sendKeys(Keys.TAB);
//		testUIElement.sendKeys(sDD);
//		testUIElement.sendKeys(YYYY);
//		testUIElement.sendKeys(Keys.TAB);
//		}
	if (!YYYY.equalsIgnoreCase("")&&sDD.equalsIgnoreCase("")&&sMM.equalsIgnoreCase("")){
		testUIElement.sendKeys(Keys.TAB);
		testUIElement.sendKeys(Keys.TAB);
		testUIElement.sendKeys(YYYY);
		testUIElement.sendKeys(Keys.TAB);
		}
	if (!YYYY.equalsIgnoreCase("")&&sDD.equalsIgnoreCase("")&&!sMM.equalsIgnoreCase("")){
		//testUIElement.sendKeys(Keys.TAB);
		testUIElement.sendKeys(sMM);
		testUIElement.sendKeys(Keys.TAB);
		testUIElement.sendKeys(YYYY);
		testUIElement.sendKeys(Keys.TAB);
		}
	//testUIElement.sendKeys(sMM);
	//testUIElement.sendKeys(Keys.TAB);
//	testUIElement.sendKeys(Keys.TAB);
//	testUIElement.sendKeys(Keys.TAB);
//	testUIElement.sendKeys(Keys.TAB);
	driver.findElement(By.cssSelector(".is-link")).click();
	if (driver.findElement(By.xpath("//*[contains(text(),'"+webelementName+"')]/parent::div//"+eType+"/following-sibling::small")).isDisplayed())
		ResultLog.ReportTestEvent("PASS","Application validates invalid date: "+"Actual: "+sMM+"/"+sDD+"/"+YYYY);
	else
		ResultLog.ReportTestEvent("FAIL","Application accepts invalid date: "+"Actual: "+sMM+"/"+sDD+"/"+YYYY+"  Expected Result - No inline error displayed");
	
	// WebElement el = DateHired;//driver.findElement( By.cssSelector( "div.navbar-item:nth-child(2) > a:nth-child(1)" ) );
//     Actions builder = new Actions(driver);
//     builder.moveToElement( el ).click( el );
//     builder.perform();
	
	testUIElement.sendKeys(Keys.TAB);
	testUIElement.sendKeys(Keys.TAB);
	testUIElement.sendKeys(Keys.TAB);
	testUIElement.click();
	
	
//	if (!YYYY.equalsIgnoreCase(""))
		testUIElement.sendKeys(Keys.DELETE);
	//if (!sDD.equalsIgnoreCase(""))
		testUIElement.sendKeys(Keys.TAB);
		testUIElement.sendKeys(Keys.DELETE);
	//if (!sMM.equalsIgnoreCase(""))
		testUIElement.sendKeys(Keys.TAB);
		testUIElement.sendKeys(Keys.DELETE);
	
//	WebElement element = testUIElement;
//	Actions actions = new Actions(driver);
//	actions.moveToElement(element);
//	actions.click(); //.sendKeys("").keyDown(Keys.CONTROL).sendKeys(Keys.chord("A")).keyUp(Keys.CONTROL).perform();
//	actions.perform();
//	testUIElement.sendKeys(Keys.DELETE);
//	testUIElement.sendKeys(Keys.SHIFT,Keys.TAB);
//	testUIElement.sendKeys(Keys.DELETE);
//	testUIElement.sendKeys(Keys.SHIFT,Keys.TAB);
//	testUIElement.sendKeys(Keys.DELETE);
	//testUIElement.clear();
	}
	
	
	
	
	
	
	public void SampleUITestValidation() throws Exception{
		 	
		  String pageName="";
		  String eInputValue="";
		  String eExists="";
		  String eStatus="";
		  String eIsEditable="";
		  String eDefaultValue="";
		  String ePlaceHolder="";
		  String eLength="";
		  String eDropdownValuesPresent="";
		  String eIsSelectable="";
		  String eLabel="";
		  String elementValue="";
		  
		  //elementValue=TestDataRec.TESTDATAMAP.get("elementValue").trim();
		  elementValue=TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString().trim();
		  
		  
		  //pages.InvokeApplicationPage.isElementPresent(By.id("idOfElement"));
		  
		  
		  //pageName=TestDataRec.TESTDATAMAP.get("pageName").trim();
		  pageName=TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString().trim();
		  
		  ResultLog.ReportTestEvent("INFO","######################### UI Validation Starts From Here #########################");
		  
		  try{
			  switch (pageName) 
				{
					case "loginPage":
						//pages.HomePage.clickSignIn();
						pages.InvokeApplicationPage.WaitForPage(pages.LoginPage);
						break;	
				}
		  }
		  catch(Exception e)
		  {
			  ResultLog.ReportTestEvent("FATAL", "*UI*PageNavigationFailed - Exception: Page Name - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString()+"; Unable to Navigate to the test page - "+"; Page Name -  "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString());
			  ResultLog.ReportTestEvent("FATAL",e.toString());
			  ResultLog.takeScreenShot();
		  }
		  
		  if (eExists.equalsIgnoreCase("no"))
		  {
			  try{
					if (driver.findElement(By.xpath(elementValue)).isDisplayed())
					{
						ResultLog.ReportTestEvent("FATAL","*UI* - Test Step Failed "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString()+"; Verification Method - "+"Element Exists"+"; Element Name -  "+TestDataRec.TESTTRANSACTIONDATAMAP.get("webelementName").toString()+"; Element Value - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString());
					}
				}catch (Exception e)
				{
					ResultLog.ReportTestEvent("PASS", "*UI*Exists-No - Exception: Page Name - "+TestDataRec.TESTDATAMAP.get("pageName").toString()+"; Verification Method - "+"Element Exists"+"; Element Name -  "+TestDataRec.TESTDATAMAP.get("webelementName").toString()+"; Element Value - "+TestDataRec.TESTDATAMAP.get("elementValue").toString());
					ResultLog.ReportTestEvent("PASS",e.toString());
				}
		  }
		  
		  if (!eExists.equalsIgnoreCase("no"))
		  {
			  try
			  {
				  if (driver.findElement(By.xpath(elementValue)).isDisplayed())
				  {
						eExists=TestDataRec.TESTTRANSACTIONDATAMAP.get("eExists").toString().trim();
						if (eExists.contentEquals("yes"))
						{
							try{
								if (driver.findElement(By.xpath(elementValue)).isDisplayed())
								{
									ResultLog.ReportTestEvent("PASS","*UI*Exists-Yes - Test Step Passed "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString()+"; Verification Method - "+"Element Exists"+"; Element Name -  "+TestDataRec.TESTTRANSACTIONDATAMAP.get("webelementName").toString()+"; Element Value - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString());
									//ResultLog.ReportTestEvent("PASS","*UI*Exists-Yes ");
								}
							}catch (Exception e)
							{
								ResultLog.ReportTestEvent("FATAL", "*UI*Exists-Exception - Exception: Page Name - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString()+"; Verification Method - "+"Element Exists"+"; Element Name -  "+TestDataRec.TESTTRANSACTIONDATAMAP.get("webelementName").toString()+"; Element Value - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString());
								ResultLog.ReportTestEvent("FATAL",e.toString());
							}
						}
						
						WebElement testUIElement=driver.findElement(By.xpath(elementValue));
						
						eStatus=TestDataRec.TESTTRANSACTIONDATAMAP.get("eStatus").toString().trim();
						try{
							switch (eStatus) 
							{
								case "enabled":
									if (testUIElement.isEnabled())
										ResultLog.ReportTestEvent("PASS","*UI*Exists-Enabled-Pass - Test Step Passed "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString()+"; Verification Method - "+"Element Enabled"+"; Element Name -  "+TestDataRec.TESTTRANSACTIONDATAMAP.get("webelementName").toString()+"; Element Value - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString());
									else
										throw new Exception("Element Disabled");
									break;
								case "disabled":
									if (!testUIElement.isEnabled())
										ResultLog.ReportTestEvent("PASS","*UI*Disabled-Failed - Test Step Failed "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString()+"; Verification Method - "+"Element Enabled"+"; Element Name -  "+TestDataRec.TESTTRANSACTIONDATAMAP.get("webelementName").toString()+"; Element Value - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString());
									else
										throw new Exception("Element Enabled");
									break;
								default:
									break;
							}
						}catch (Exception e)
						{
							ResultLog.ReportTestEvent("FATAL", "*UI*Enable/Disable-Exception[or not as expected] - Exception: Page Name - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString()+"; Verification Method - "+"Element Status not as expected"+"; Element Name -  "+TestDataRec.TESTTRANSACTIONDATAMAP.get("webelementName").toString()+"; Element Value - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString());
							ResultLog.ReportTestEvent("FATAL",e.toString());
						}
						
						eInputValue=TestDataRec.TESTTRANSACTIONDATAMAP.get("eInputValue").toString().trim();
						try{
							switch (eInputValue) 
							{
								case "alphanumeric":
									// consider field length here when input data
									testUIElement.sendKeys("#$%^&()*@|");
									if (testUIElement.getText().equalsIgnoreCase(""))
										ResultLog.ReportTestEvent("PASS","*UI*alphanumericCheckPass - Test Step Passed "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString()+"; Verification Method - "+"Field Accepts Alphanumeric data"+"; Element Name -  "+TestDataRec.TESTTRANSACTIONDATAMAP.get("webelementName").toString()+"; Element Value - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString());
									else
										throw new Exception("Element accepts alphanumeric");
									break;
								case "customalphanumeric":
									break;
								case "numeric":
									break;
								case "email":
									break;
								default:
									break;
							}
						}catch (Exception e)
						{
							ResultLog.ReportTestEvent("FATAL", "*UI*-Input data not as expected-"+eInputValue+" - Exception: Page Name - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString()+"; Verification Method - "+"Element Accepting Input"+"; Element Name -  "+TestDataRec.TESTTRANSACTIONDATAMAP.get("webelementName").toString()+"; Element Value - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString());
							ResultLog.ReportTestEvent("FATAL",e.toString());
						}
						
						eIsEditable=TestDataRec.TESTTRANSACTIONDATAMAP.get("eIsEditable").toString().trim();
						try{
							switch (eIsEditable) 
							{
								case "yes":
									break;
								case "no":
									break;
								default:
									break;
							}
						}catch (Exception e)
						{
							ResultLog.ReportTestEvent("FATAL", "*UI* - Exception: Page Name - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString()+"; Verification Method - "+"Is Editable"+"; Element Name -  "+TestDataRec.TESTTRANSACTIONDATAMAP.get("webelementName").toString()+"; Element Value - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString());
							ResultLog.ReportTestEvent("FATAL",e.toString());
						}
						
						eDefaultValue=TestDataRec.TESTTRANSACTIONDATAMAP.get("eDefaultValue").toString().trim();
						try{
							switch (eDefaultValue) 
							{
								case "blank":
									break;
								default:
									break;
							}
						}catch (Exception e)
						{
							ResultLog.ReportTestEvent("FATAL", "*UI* - Exception: Page Name - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString()+"; Verification Method - "+"Default Value"+"; Element Name -  "+TestDataRec.TESTTRANSACTIONDATAMAP.get("webelementName").toString()+"; Element Value - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString());
							ResultLog.ReportTestEvent("FATAL",e.toString());
						}
						
						ePlaceHolder=TestDataRec.TESTTRANSACTIONDATAMAP.get("ePlaceHolder").toString().trim();
						try{
							if (!ePlaceHolder.equalsIgnoreCase(""))
							{
								
							}
						}catch (Exception e)
						{
							ResultLog.ReportTestEvent("FATAL", "*UI* - Exception: Page Name - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString()+"; Verification Method - "+"Placeholder"+"; Element Name -  "+TestDataRec.TESTTRANSACTIONDATAMAP.get("webelementName").toString()+"; Element Value - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString());
							ResultLog.ReportTestEvent("FATAL",e.toString());
						}
						
						eLength=TestDataRec.TESTTRANSACTIONDATAMAP.get("eLength").toString().trim();
						try{
							if (!eLength.equalsIgnoreCase(""))
							{
								
							}
						}catch (Exception e)
						{
							ResultLog.ReportTestEvent("FATAL", "*UI* - Exception: Page Name - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString()+"; Verification Method - "+"Length"+"; Element Name -  "+TestDataRec.TESTTRANSACTIONDATAMAP.get("webelementName").toString()+"; Element Value - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString());
							ResultLog.ReportTestEvent("FATAL",e.toString());
						}
						
						eDropdownValuesPresent=TestDataRec.TESTTRANSACTIONDATAMAP.get("eDropdownValuesPresent").toString().trim();
						try{
							if (!eDropdownValuesPresent.equalsIgnoreCase(""))
							{
								
							}
						}catch (Exception e)
						{
							ResultLog.ReportTestEvent("FATAL", "*UI* - Exception: Page Name - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString()+"; Verification Method - "+"Dropdown Values Present"+"; Element Name -  "+TestDataRec.TESTTRANSACTIONDATAMAP.get("webelementName").toString()+"; Element Value - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString());
							ResultLog.ReportTestEvent("FATAL",e.toString());
						}
						
						eIsSelectable=TestDataRec.TESTTRANSACTIONDATAMAP.get("eIsSelectable").toString().trim();
						try{
							if (!eIsSelectable.equalsIgnoreCase(""))
							{
								
							}
						}catch (Exception e)
						{
							ResultLog.ReportTestEvent("FATAL", "*UI* - Exception: Page Name - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString()+"; Verification Method - "+"Element Selectable"+"; Element Name -  "+TestDataRec.TESTTRANSACTIONDATAMAP.get("webelementName").toString()+"; Element Value - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString());
							ResultLog.ReportTestEvent("FATAL",e.toString());
						}
						
						eLabel=TestDataRec.TESTTRANSACTIONDATAMAP.get("eLabel").toString().trim();
						try{
							if (!eLabel.equalsIgnoreCase(""))
							{
								
							}
						}catch (Exception e)
						{
							ResultLog.ReportTestEvent("FATAL", "*UI* - Exception: Page Name - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString()+"; Verification Method - "+"Element Label"+"; Element Name -  "+TestDataRec.TESTTRANSACTIONDATAMAP.get("webelementName").toString()+"; Element Value - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString());
							ResultLog.ReportTestEvent("FATAL",e.toString());
						}
				  	}
			  	}catch (Exception e)
			  	{
			  		ResultLog.ReportTestEvent("FATAL", "*UI* - Exception: Page Name - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString()+"; OBJECT NOT FOUND TO PERFORM UI VALIDATION - CHECK APPLICATION/TEST DATA SHEET - "+"Element Label"+"; Element Name -  "+TestDataRec.TESTTRANSACTIONDATAMAP.get("webelementName").toString()+"; Element Value - "+TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString());
					ResultLog.ReportTestEvent("FATAL",e.toString());
					 throw new Exception ("Object Not Found To Perform UI Validation");
			  	}
			 }
			
	}
	
}
