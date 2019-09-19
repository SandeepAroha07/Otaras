package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.newtranbase.task;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bson.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.codoid.products.fillo.Recordset;
import com.mongodb.client.MongoCollection;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.aut.testdatarec.TestDataRec;
import com.otaras.testautomation.common.MongoDBUtil;
import com.otaras.testautomation.common.ReadTestData;
import com.otaras.testautomation.labels.labels;
import com.otaras.testautomation.objectrepository.OR;

public class BaseTaskPage  extends BasePage{
	
	   public Map<Object, Object> testData;
	
	   @FindBy(xpath = OR.TaskPage_TaskName)	
	    public WebElement TaskName;


	   
	   public boolean Exists(){
	    	return super.Exists(TaskName); 
	    	
		}
	   public String NameKeyToQueryDB() 
	    {
	    	return(testData.get("NameKeyToQueryDB").toString());
	    }
	   
	   
	   
	    public String enterTaskData(Map<Object, Object> testData) 
	    {
	    	
	    	try{
	    		
	    		this.enterInput(OR.TaskPage_TaskName, testData.get("taskName").toString());
	    		//driver.findElement(By.xpath("//*[contains(text(),'"+labels.TaskPage_TaskNameLbl+"')]/parent::div//"+"following-sibling::input|//*[contains(text(),'"+labels.TaskPage_TaskNameLbl+"')]/parent::div//"+"following-sibling::div//input")).sendKeys(Keys.TAB);
	    	//	driver.findElement(By.xpath("//*[contains(text(),'Task Type')]/parent::div//"+"div[@role='combobox']")).sendKeys(Keys.ARROW_DOWN);
	    		//driver.findElement(By.xpath("//*[contains(text(),'Task Type')]/parent::div//"+"div[@role='combobox']//*[@id='rw_1_listbox']/li[3]")).sendKeys(Keys.ARROW_DOWN);
	    		
//	    		driver.findElement(By.xpath("//*[contains(text(),'"+"Task Type"+"')]/parent::div//"+"div[@role='combobox']")).click();
//	    		driver.findElement(By.xpath("//*[contains(text(),'"+"Task Type"+"')]/parent::div//"+"div[@role='combobox']")).sendKeys(Keys.ARROW_DOWN);
////	    		driver.findElement(By.xpath("//*[contains(text(),'"+"Task Type"+"')]/parent::div//"+"div[@role='combobox']")).sendKeys(Keys.ARROW_DOWN);
//	    		//driver.findElement(By.xpath("//*[contains(text(),'"+"Task Type"+"')]/parent::div//"+"div[@role='combobox']")).click();
//	    		
//	    		Actions action = new Actions(driver);
//	    		action.moveToElement(driver.findElement(By.xpath("//*[@id='rw_1_listbox']/li[3]"))).perform();
//	    		action.moveToElement(driver.findElement(By.xpath("//*[@id='rw_1_listbox']/li[3]"))).click().build().perform();
//	    		
//	    		//action.moveToElement(elementToHover).click(elementToClick).build().perform();
//	    		
//	    		WebElement yourButton= driver.findElement(By.xpath("//*[contains(text(),'Task Type')]/parent::div//"+"div[@role='combobox']//input"));
//	    		
//	    		JavascriptExecutor js = (JavascriptExecutor) driver;
//	    		//js.executeScript("arguments[0].setAttribute('value','Deals')",yourButton);
//	    		//  js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", yourButton, "value","Deals");
//
//	    		String scriptSetAttrValue = "arguments[0].setAttribute(arguments[1],arguments[2])";
//
//	    	    js.executeScript(scriptSetAttrValue, yourButton, "value", "Deals");
//	    		
//	    		//WebDriverWait wait = new WebDriverWait(driver, 10); // was 20
//	    		//wait.until(ExpectedConditions.elementToBeClickable(yourButton));
//
//	    		
//	    		
//	    		driver.findElement(By.xpath("//*[contains(text(),'Task Type')]/parent::div//"+"div[@role='combobox']//input")).getAttribute("name");
//	    		
//	    		WebElement element = driver.findElement(By.xpath("//*[@id='rw_1_listbox']/li[3]"));
//	    		JavascriptExecutor executor = (JavascriptExecutor)driver;
//	    		executor.executeScript("arguments[0].click();", element);
//	    		
//	    		driver.navigate().refresh();
//	    		this.enterInputValue("Task name:", testData.get("taskName").toString());
//	    		driver.findElement(By.xpath("//*[contains(text(),'"+"Task Type"+"')]/parent::div//"+"div[@role='combobox']")).click();
//	    		driver.findElement(By.xpath("//*[contains(text(),'"+"Task Type"+"')]/parent::div//"+"div[@role='combobox']")).sendKeys(Keys.ARROW_DOWN);
//	    		driver.findElement(By.xpath("//*[contains(text(),'"+"Task Type"+"')]/parent::div//"+"div[@role='combobox']")).sendKeys(Keys.ARROW_DOWN);
//	    		driver.findElement(By.xpath("//*[contains(text(),'"+"Task Type"+"')]/parent::div//"+"div[@role='combobox']")).click();
//	    		
	    		
	    		//driver.findElement(By.xpath("//*[@id='rw_1_listbox']/li[3]")).click();
	    		this.selectDropdown(OR.TaskPage_TaskType, testData.get("taskType").toString());
	    		this.selectDropdown(OR.TaskPage_TaskPriority, testData.get("taskPriority").toString());
	    		//this.selectComboboxElementByName(labels.TaskPage_TaskTypeLbl, testData.get("taskType").toString());
	    		enterDate(OR.TaskPage_StartDate, testData.get("startDate").toString(), "");
	    		enterDate(OR.TaskPage_DueDate, testData.get("dueDate").toString(), "");
	    		//this.selectCombobox(OR.TaskPage_AssignedTo, testData.get("assignedTo").toString());
	    		//driver.findElement(By.xpath(OR.TaskPage_AssignedTo)).click();
//	    		driver.findElement(By.xpath("//section/div/div[3]/div[1]/div/div/div[1]/span/button")).click();
//	    		driver.findElement(By.xpath("//div[@name='taskAssignees']//li[contains(text(),'"+"Ford and Associates | Alvina Theresia"+"')]")).click();
//	    		driver.findElement(By.xpath("//section/div/div[3]/div[1]/div/div/div[1]/span/button")).click();
	    		
	    		//selectCombobox(OR.TaskPage_AssignedTo, testData.get("assignedTo").toString());
	    		//driver.findElement(By.xpath("//div[@name='taskAssignees']/div/span/button")).click();
	    		driver.findElement(By.xpath(OR.TaskPage_AssignedTo)).click();
	    		//driver.findElement(By.xpath("(//div//ul/li)[2]")).click();
	    		driver.findElement(By.xpath(OR.TaskPage_AssignedToValue)).click();
	    		driver.findElement(By.xpath(OR.TaskPage_AssignedTo)).click();
	    		
	    		Date d=new Date();
				String timestamp=d.toString().replace(":", "").replace(" ", "");
	      		testData.put("NameKeyToQueryDB",testData.get("notes").toString()+timestamp);
	    		this.enterInput(OR.TaskPage_Notes, testData.get("notes").toString()+timestamp);
	    		
	    		
//	    		 WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));
//
//	    	        // enter the file path onto the file-selection input field
//	    	     uploadElement.sendKeys("C://mywork//seleniumgit//munivisorautomatedtestSelenium//testAutomationAnywhere//src//test//resources//testReport//expectedscreenshots//RFQPage_firefox.png");
//	    		
//	    	  // click the "UploadFile" button
//	    	        driver.findElement(By.name("send")).click();
	    		
//	    		if (testData.get("entityClientProspect").toString().equalsIgnoreCase("prospect"))
//	    			if (Exists(driver.findElement(By.xpath("//input[@value='Prospect']"))))
//	    				driver.findElement(By.xpath("//input[@value='Prospect']")).click();
//
//	    		this.selectComboboxByName("Entity Type", testData.get("entityType").toString());
//	    		
//	    		if (testData.get("entityType").toString().equalsIgnoreCase("corporation"))
//	    			enterInputValue(driver.findElement(By.xpath("//*[contains(text(),'Entity Name')]/parent::div//input")),testData.get("entityName").toString());
//	    		else
//	    			this.selectCombobox(driver.findElement(By.xpath("//*[contains(text(),'"+"Entity Name"+"')]/parent::div//"+"following-sibling::div/div/div[@role='combobox']")), testData.get("entityName").toString());
//	    		this.selectComboboxByName("Primary Sectors", testData.get("primarySector").toString());
//	    		this.selectComboboxByName("Secondary Sectors", testData.get("secondarySector").toString());
//	    		//driver.findElement(By.xpath("//*[contains(text(),'Tax ID')]/parent::div//"+"following-sibling::div//input"))
//	    		enterInputValue("Tax ID",testData.get("taxID").toString());
//	    		//driver.findElement(By.xpath("//*[contains(text(),\\"Firm's Lead Advisor\\")]/parent::div/div/div")).getAttribute("id")    ---- WORKINg XPATH
//	    		
//	    		//CityIssuer.click();
//	    		String entityType="";
//	    		if (testData.get("entityType").toString().equalsIgnoreCase("governmental entity / issuer")){
//		    		entityType=testData.get("entityType1").toString();
//		    		String array1[]= entityType.split(";");
//		    	       for (String temp: array1){
//		    	          System.out.println(temp);
//		    	          driver.findElement(By.xpath("//input[@value= '"+" "+temp+"']")).click();
//		    	       }
//	    	     }
//	    		
//	    		if  (Exists(driver.findElement(By.xpath("//*[contains(text(),'Previous Advisor Contact Information')]")))==true){
//	    			driver.findElement(By.xpath("//*[contains(text(),'Previous Advisor Contact Information')]")).click();
//	    			Exists(driver.findElement(By.xpath("//*[contains(text(),\"Firm's Lead Advisor\")]/parent::div/div/div")));
//	    		}
//	    		
//	    		this.selectCombobox(driver.findElement(By.xpath("//*[contains(text(),\"Firm's Lead Advisor\")]/parent::div/div/div")), testData.get("leadAdvisor").toString());
//	    		
//	    		Date d=new Date();
//				String timestamp=d.toString().replace(":", "").replace(" ", "");
//	      		testData.put("NameKeyToQueryDB",testData.get("previousLeadAdvisor").toString()+timestamp);
//	    		enterInputValue("Previous Lead Advisor",testData.get("previousLeadAdvisor").toString()+timestamp);
//	    		enterInputValue("Previous Advisor Firm",testData.get("previousAdvisorFirm").toString());
//	    		enterDateInput("Previous Advisory Contract Expiry", testData.get("previousAdvisoryContractExpiry").toString(), ""); 
//	    		enterInputValue("Primary Contact Name in EMMA",testData.get("PrimaryContactNameinEmma").toString());
//	    		enterInputValue("Primary Contact Phone",testData.get("primaryContactPhone").toString());
//	    		enterInputValue("Primary Contact Email",testData.get("primaryContactEmail").toString());
////	    		selectDropdownValue("Activity Subtype",testData.get("activitySubtype").toString());
////	    		
////	    		if (testData.get("activitySubtype").toString().equalsIgnoreCase("Other (please specify)"))
////	    			enterInputValue("Other Activity Subtype",testData.get("otherActivitySubtype").toString());
////	    		
////	    		selectIssuer(testData.get("issuer").toString());
////
////	    		selectDropdownValue("Primary Sector",testData.get("primarySector").toString());
////	    		selectDropdownValue("Secondary Sector",testData.get("secondarySector").toString());
////	    		selectLeadAdvisor(testData.get("leadAdvisor").toString());
////	    		enterIssueName(testData.get("issueName").toString());
////	    		enterInputValue("Project Description / Transaction Name",testData.get("projectDescription").toString());
////	    		selectRelatedTransactionType(testData.get("relatedTransactionType").toString());
////	    		selectRelatedTransactionIds(testData.get("relatedTransactionsIds").toString());
////	    		//enterInputValue("Notes / Instructions",testData.get("notes").toString());
////	    		enterNotes(testData.get("notes").toString());
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterTaskData: Successful - "+SuccessFontColorSuffix);
	  
	    		return(testData.get("NameKeyToQueryDB").toString());

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Derivative Transaction Page - enterDebtDetail_Derivative - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterTaskData - Deal data enty failed");
	    	}
	    }
	    
	
	    public void uploadDocument() throws InterruptedException 
	    {    
	    	//ExistsCheck(driver.findElement(By.xpath("//input[@type='file']")));
	    	//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[6]//input")));
	    	WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));
		  
		  File classpathRoot = new File(System.getProperty("user.dir"));
		  File dir = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//");
		   int size = 4; //was 10
		    String [] fileArray = new String[size];
		    File[] files = dir.listFiles();
		    int idz = (int)(Math.random()*size);
		    fileArray[0]=files[idz].getName();

			  // File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//", "EA706427.pdf");
		    File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//", fileArray[0]);
			String sFilename=app.toString();  // enter the file path onto the file-selection input field
		  
//			File dir = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//");
//		   int size = 10;
//		    String [] fileArray = new String[size];
//		    File[] files = dir.listFiles();
//		    for(int i =0; i<size;i++){
//		        int idz = (int)(Math.random()*size);
//		        fileArray[i]=files[idz].getName();
//		        System.out.print(fileArray[i]);
//		    }
			
	    // uploadElement.sendKeys("C://mywork//seleniumgit//munivisorautomatedtestSelenium//testAutomationAnywhere//src//test//resources//testReport//expectedscreenshots//RFQPage_firefox.png");
		
			 uploadElement.sendKeys(sFilename);
			 boolean sExists=this.ExistsCheck(driver.findElement(By.xpath(OR.TaskPage_AddFile)));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath(OR.TaskPage_AddFile)));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath(OR.TaskPage_AddFile)));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath(OR.TaskPage_AddFile)));
			 Thread.sleep(200);
	    }
	    
	    
	
	   
}
