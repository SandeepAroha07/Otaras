package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.adminbase;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.common.ReadTestData;
import com.otaras.testautomation.labels.labels;
import com.otaras.testautomation.objectrepository.OR;

public class BaseAdminAddUsersPage  extends BasePage{
	
	  public Map<Object, Object> testData;
	  
	   @FindBy(xpath = OR.AdminAddUsersPage_FirstName)	
	    public WebElement FirstName;

	   
	   public boolean Exists(){
	    	return super.Exists(FirstName); 
	    	
		}
	   
	    public String enterNewUserClientData(Map<Object, Object> testData) 
	    {
	    	
	    	try{

	    		Date d=new Date();
				String timestamp=d.toString().replace(":", "").replace(" ", "");
	    		
//	    		String contactType="";
//	    		contactType=testData.get("contactType").toString();
//		    		String array1[]= contactType.split(";");
//		    	       for (String temp: array1){
//		    	          System.out.println(temp);
//		    	          driver.findElement(By.xpath("//input[@value= '"+temp+"']")).click();
//		    	       }
//		    	       
//			    		String accessLevel="";
//			    		accessLevel=testData.get("accessLevel").toString();
//				    		String array2[]= accessLevel.split(";");
//				    	       for (String temp: array2){
//				    	          System.out.println(temp);
//				    	          driver.findElement(By.xpath("//input[@value= '"+temp+"']")).click();
//				    	       }
	    		
	    	/*	enterInput(OR.AdminAddUsersPage_FirstName,testData.get("firstName").toString());
	    		enterInput(OR.AdminAddUsersPage_MiddleName,testData.get("middleName").toString());
	    		enterInput(OR.AdminAddUsersPage_LastName,testData.get("lastName").toString()+timestamp);
	    		//enterInput(OR.AdminAddUsersPage_Email,testData.get("email").toString());
	    		enterInput(OR.AdminAddUsersPage_Email,timestamp+"@autotest.com");
	    		this.selectDropdown(OR.AdminAddUsersPage_SystemAccessLevel, "test");
	    		
	    		 driver.findElement(By.xpath("//div[@class='control']/*[contains(text(),'"+"Save Primary Details"+"')]/parent::div")).click();
				 waitForElementExists("//div/*[contains(text(),'"+"Other Details"+"')]");
	    		
	    		 driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddClientPage_OtherDetailsLbl+"')]")).click();
				  
	    		
	    		
	    		enterInput(OR.AdminAddUsersPage_Phone,testData.get("phone").toString());
	    		enterInput(OR.AdminAddUsersPage_Fax,testData.get("fax").toString());
	    		
	    		
				testData.put("NameKeyToQueryDB",testData.get("lastName").toString()+timestamp);
	    		enterInput(OR.AdminAddUsersPage_EmployeeID,testData.get("employeeID").toString()+timestamp);
	    		enterInput(OR.AdminAddUsersPage_JobTitle,testData.get("jobTitle").toString()+timestamp);
	    		//enterInputValue("Manager's Email",testData.get("managersEmail").toString()+timestamp);
	    		//enterInputValue(driver.findElement(By.xpath("//*[contains(text(),\"Manager's Email\")]/parent::div//input")), testData.get("managersEmail").toString());
	    		enterInput(OR.AdminAddUsersPage_ManagersEmail,testData.get("managersEmail").toString());
	    		
	    		enterDate(OR.AdminAddUsersPage_JoiningDate,testData.get("joiningDate").toString(),testData.get("TestBrowser").toString().trim());
	    		enterDate(OR.AdminAddUsersPage_ExitDate,testData.get("exitDate").toString(),testData.get("TestBrowser").toString().trim());
	    		enterInput(OR.AdminAddUsersPage_CostCenter,testData.get("costCenter").toString());
	    	
	    	*/
	    	
	  //  	sleep();
				String randomString=RandomStringUtils.randomAlphabetic(4).toUpperCase();
	    	enterInput(OR.AdminAddUsersPage_FirstName,testData.get("firstName").toString());
    		enterInput(OR.AdminAddUsersPage_MiddleName,testData.get("middleName").toString());
    		enterInput(OR.AdminAddUsersPage_LastName,testData.get("lastName").toString()+randomString+timestamp);
	    	
	    
    		
    		//enterInput(OR.ContactPage_LastName,testData.get("lastName").toString()+randomString+timestamp);
    		testData.replace("lastName", testData.get("lastName").toString()+randomString+timestamp);
    		enterInput(OR.ContactPage_Email,randomString+"@autotest.com");
    		this.selectDropdown(OR.AdminAddUsersPage_SystemAccessLevel, testData.get("accessLevel").toString());
    		
	    	
    		 String s="Financial Advisor 1";
	    		String add="Add";
	    		String s1=testData.get("contactType").toString();    
	    		String[] arrOfStr = s1.split(",", 22);
	    		
	    		WebElement wb2=driver.findElement(By.xpath(OR.Contact_type));
	    		Actions builder1=new Actions(driver);
	    		Action seriesofactions1=builder1
	    		        .moveToElement(wb2)
	    			   // .click()
	    				.pause(900)
	    				.sendKeys(wb2,arrOfStr[0].toString())
	    				.click()
	    			    .build();
			    	    seriesofactions1.perform();
			    		Thread.sleep(2000);
			    		
			    		wb2.click();
			    	//	WebElement wb4=driver.findElement(By.xpath("(//button[@class='rw-btn rw-btn-select'])[2]"));
			    		
			    		WebElement wb3=driver.findElement(By.xpath("//*[@id='rw_4_listbox_active_option']"));
			    		builder1=new Actions(driver);
			   		            seriesofactions1=builder1
			    				.moveToElement(wb3)
			    				.pause(400)
			    				.click()
			    		//		.moveToElement(wb4)
			    		//		.click()
			    				.build();
					    		seriesofactions1.perform();
			  	
	                         		
				  Thread.sleep(4000);  		
				  
				  
	    		
			  for(int i=1;i<=arrOfStr.length-1;i++)
	                {
		    		System.out.println( arrOfStr[i]);	   
	                
		    		//int z=i+1;
		    		
		    		//String sq="(//li[@role='option'])[]";
		    		
		    		WebElement wb7=driver.findElement(By.xpath(OR.Contact_secondtype));
		    		Actions builder7=new Actions(driver);
		    		Action seriesofactions7=builder7
		    		        .moveToElement(wb2)
		    			   // .click()
		    				.pause(900)
		    				.sendKeys(wb7,arrOfStr[i].toString())
		    				.click()
		    			    .build();
				    	    seriesofactions7.perform();
				    		Thread.sleep(2000);
				    		
				    		wb2.click();
				    	//	WebElement wb8=driver.findElement(By.xpath("(//button[@class='rw-btn rw-btn-select'])[2]"));
				    		
				    		WebElement wb9=driver.findElement(By.xpath("//*[@id='rw_4_listbox_active_option']"));
				    		builder7=new Actions(driver);
				   		            seriesofactions7=builder7
				    				.moveToElement(wb9)
				    				.pause(400)
				    				.click()
				    		//		.moveToElement(wb8)
				    		//		.click()
				    				.build();
						    		seriesofactions7.perform();
				  	
		                         		
					  Thread.sleep(4000);  		
		    		
		    		
		    		
	                }
	    		
	    		
 		
 		
	    		
  		
  		
  		
  		 driver.findElement(By.xpath("//div[@class='control']/*[contains(text(),'"+"Save Primary Details"+"')]/parent::div")).click();
  		 
  		// this.waitForElementExists(OR.SuccessMessage_Greencolor);
  		 
			 waitForElementExists("//div/*[contains(text(),'"+"Other Details"+"')]");
			 driver.findElement(By.xpath("//div/*[contains(text(),'"+"Other Details"+"')]")).click();
			 enterInput(OR.Contact_otherEmail,randomString+"@FirstEmail.com");
			 if(add.equalsIgnoreCase(testData.get("AddmoreOtherEmails").toString()))
	    		{
			 driver.findElement(By.xpath(OR.Add_otherEmailButton)).click();
			 enterInput(OR.Contact_secondOtherEmail,randomString+"@SecondEmail.com");
	    		}

  		
  	
			 
			 enterInput(OR.ContactPage_Phone,testData.get("phone").toString());
  		if(add.equalsIgnoreCase(testData.get("AddmorePhoneNumbers").toString()))
  		{
  		 driver.findElement(By.xpath(OR.Add_phoneButton)).click();
  		 enterInput(OR.Second_phnoNumber,testData.get("SecondPhoneNumbers").toString()); 
  		}
  		
  		
  		
  		
  		enterInput(OR.ContactPage_Fax,testData.get("fax").toString());
  		if(add.equalsIgnoreCase(testData.get("AddmoreFax").toString()))
  		{
  		 driver.findElement(By.xpath(OR.Add_faxButton)).click();
  		 enterInput(OR.Contact_secondFax,testData.get("SecondFax").toString());
  		}
  		
  		
  		
  		 
  		 
  		 enterInput(OR.Contact_employeeId,testData.get("employeeID").toString());
  		 enterInput(OR.Contact_JobTitle,testData.get("jobTitle").toString());
  		 enterInput(OR.Contact_managerEmail,testData.get("managersEmail").toString());
  		 enterDate(OR.Contact_joindate,testData.get("joiningDate").toString(), "");
  		 enterDate(OR.Contact_exitDate,testData.get("exitDate").toString(),"");
  		 enterInput(OR.ContactPage_CostCenter,testData.get("costCenter").toString());
	    	

  		  driver.findElement(By.xpath("//div[@class='control']/*[contains(text(),'"+"Save Other Details"+"')]/parent::div")).click();
  		// this.waitForElementExists(OR.SuccessMessage_Greencolor);
		  waitForElementExists("//div/*[contains(text(),'"+"Other Details"+"')]");
		  
		  
		  
          
		  driver.findElement(By.xpath("//*[@id='main']/section/article[3]/div/div/div[1]/button")).click();
		  
		  driver.findElement(By.xpath(OR.OfficeAdress)).click();
		  
		  driver.findElement(By.xpath(OR.Contact_AddressSave)).click();
		  waitForElementExists("//div[@class='control']/*[contains(text(),'"+"Save Primary Details"+"')]/parent::div");
		 // this.waitForElementExists(OR.SuccessMessage_Greencolor);
		 
		  
		  
		  
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
		
		  
		  System.out.println("succesfull");
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
		  testData.put("NameKeyToQueryDB",testData.get("lastName").toString());
	    	

	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterNewUserClientData: Successful - "+SuccessFontColorSuffix);
	  
	    		return(testData.get("NameKeyToQueryDB").toString());

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Derivative Transaction Page - enterNewUserClientData - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterNewUserClientData - Deal data enty failed");
	    	}
	    }

	    
	    public void enterMaster_AddressData(String sTabName, String sColumnName, String sColumnValue) throws Exception 
	    {
	    	HashMap<String, String> MasterTestDataMap=new HashMap<>();
	    	ReadTestData readtestdata=new ReadTestData();
	    	MasterTestDataMap=readtestdata.getMasterData(sTabName, sColumnName, sColumnValue);
	    	
	    	Exists(driver.findElement(By.xpath(OR.AdminAddUsersPage_AddressName)));
	    	
	    	
	    	
	    	//enterInput(OR.AdminAddUsersPage_AddressName,MasterTestDataMap.get("addressName").toString());
	    	if (MasterTestDataMap.get("isPrimary").toString().equalsIgnoreCase("no"))
	    		driver.findElement(By.xpath("//input[@name= 'isPrimary']")).click();
	    	else if ((driver.findElement(By.xpath("//input[@name= 'isPrimary']")).getAttribute("value").equalsIgnoreCase("false")) && (MasterTestDataMap.get("isPrimary").toString().equalsIgnoreCase("yes")))
	    		driver.findElement(By.xpath("//input[@name= 'isPrimary']")).click();

	    	
	    	enterInput(OR.AdminAddUsersPage_AddressLine1,MasterTestDataMap.get("addressLine1").toString());
	    	selectCombobox(OR.AdminAddUsersPage_Country,MasterTestDataMap.get("country").toString());
	    	selectCombobox(OR.AdminAddUsersPage_State,MasterTestDataMap.get("state").toString());
	    	enterInput(OR.AdminAddUsersPage_City,MasterTestDataMap.get("city").toString());
	    	enterInput(OR.AdminAddUsersPage_Zipcode11,MasterTestDataMap.get("zipcode").toString());
	    }
	    
	    public void enterUserDocuments(Map<Object, Object> testData) 
	    {
	    	
	    	try{
	    		int j=1;
				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[1]//div[@role='combobox']")));
				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[1]//div[@role='combobox']")).sendKeys(testData.get("category").toString());
				
	    		//commented by anildriver.findElement(By.xpath("//*[contains(text(),'"+"Documents"+"')]/parent::div/following-sibling::div//tr[1]/td[1]//div[@class='Select-multi-value-wrapper']/div")).getAttribute("class")
	    		//driver.findElement(By.xpath("//*[contains(text(),'"+"Documents"+"')]/parent::div/following-sibling::div//tr[1]/td[1]//div[@class='Select-multi-value-wrapper']/div"))
	    		
	    		selectComboboxCustom("//*[contains(text(),'"+OR.AdminAddUsersPage_DocumentsLbl+"')]/parent::div//"+"following-sibling::div//tr["+j+"]/td[1]//div[@class='Select-value']","");
	    		
	    		//old working code - this.selectDropdown("//*[contains(text(),'"+"Documents"+"')]/parent::div/following-sibling::div//tr[1]/td[1]//div[@class='Select-multi-value-wrapper']/div", "");
				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//div[@role='combobox']")));
				//this.selectCombobox("//*[contains(text(),'"+OR.AdminAddUsersPage_DocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//div[@role='combobox']", "");
				//this.selectDropdown("//*[contains(text(),'"+OR.AdminAddUsersPage_DocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//span[@role='option']", "");
	    		selectComboboxCustom("//*[contains(text(),'"+OR.AdminAddUsersPage_DocumentsLbl+"')]/parent::div//"+"following-sibling::div//tr["+j+"]/td[2]//div[@class='Select-value']","");
	    		
	    		
				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//div[@role='combobox']")).sendKeys(testData.get("subcategory").toString());
				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[2]//div[@role='combobox']//li[contains(text(),'"+testData.get("subcategory").toString()+"')]")).click();
				
				Date d=new Date();
				String timestamp=d.toString().replace(":", "").replace(" ", "");
				String randomString=RandomStringUtils.randomAlphabetic(4).toUpperCase();
				Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.AdminAddUsersPage_DocumentsLbl+"')]/parent::div//"+"following-sibling::div//tr["+j+"]/td[3]//div[@class='Select-value']")));
				//driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadDealsDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//div[@role='combobox']")).click();
				//driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadDealsDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//div[@role='combobox']//li[contains(text(),'"+testData.get("type").toString()+"')]"))
				
				//working - this.selectCombobox(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//div[@role='combobox']")), testData.get("type").toString());
				//this.selectCombobox("//*[contains(text(),'"+OR.AdminAddUsersPage_DocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//div[@role='combobox']", "");
				selectComboboxCustom("//*[contains(text(),'"+OR.AdminAddUsersPage_DocumentsLbl+"')]/parent::div//"+"following-sibling::div//tr["+j+"]/td[3]//div[@class='Select-value']","");
	    		
				
				
				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadDealsDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//select")));
				//driver.findElement(By.xpath("//*[contains(text(),'"+labels.DebtDocumentsPage_UploadDealsDocumentsTblNameLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[3]//select")).sendKeys(testData.get("type").toString()+randomString);
				
				randomString=RandomStringUtils.randomAlphabetic(4).toUpperCase();
				//this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[6]//input")));
				//driver.findElement(By.xpath("//*[contains(text(),'"+OR.DebtDocumentsPage_UploadDealsDocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[6]//input")).sendKeys(testData.get("note").toString()+randomString);
				this.enterInput("//*[contains(text(),'"+OR.AdminAddUsersPage_DocumentsLbl+"')]/parent::div/following-sibling::div//tr["+j+"]/td[6]//input",""+randomString);
				
	
	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDebtDocuments_BondIssue: Successful - "+SuccessFontColorSuffix);
	  
	    		

	    	}
	    	catch (Exception e)
	    	{
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Deal Transaction Page - addDebt_BondIssue - unable to enter data"+e+ErrorFontColorSuffix);
	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	    		throw new NoSuchElementException ("enterDebtDetail_BondIssue - Deal data enty failed");
	    	}
	    }
	    
	    
	    public void uploadDocument() throws InterruptedException 
	    {    
	    	//ExistsCheck(driver.findElement(By.xpath("//input[@type='file']")));
	    	this.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+OR.AdminAddUsersPage_DocumentsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[6]//input")));
	    	WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));
		  
		  File classpathRoot = new File(System.getProperty("user.dir"));
		  File dir = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testReport//fileUpload//");
		   int size = 15; //was 10
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
			 boolean sExists=this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.AdminAddUsersPage_DocumentsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.AdminAddUsersPage_DocumentsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.AdminAddUsersPage_DocumentsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 if (sExists=false)
				 sExists= this.ExistsCheck(driver.findElement(By.xpath("//*[contains(text(),'"+OR.AdminAddUsersPage_DocumentsLbl+"')]/parent::div/following-sibling::div//tr["+1+"]/td[5]//a")));
			 Thread.sleep(200);
			 
			 Random ran = new Random();
			// Assumes max and min are non-negative.
			int randomInt = idz + ran.nextInt(15 - idz + 1);
	    }
	    
	   
}
