package com.otaras.testautomation.common;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import groovy.util.ScriptException;


public class Common {
	public WebDriver driver;
	public ExtentTest testReport;
	
	public String ErrorFontColorPrefix="<span style='font-weight:bold;'><font color='red';font-size:16px; line-height:20px>";
	public String ErrorFontColorSuffix="</font></span>";
	public String InfoFontColorPrefix="<span style='font-weight:bold;'><font color='gold';font-size:16px; line-height:20px>";
	public String InfoFontColorSuffix="</font></span>";
	public String SuccessFontColorPrefix="<span style='font-weight:bold;'><font color='green';font-size:16px; line-height:20px>";
	public String SuccessFontColorSuffix="</font></span>";	
	public String INFOFontColorPrefix="<span><font color='blue';font-size:16px; line-height:20px>";
	public String INFOFontColorSuffix="</font></span>";	
	public String FatalFontColorPrefix="<span><font color='red';font-size:16px; line-height:20px>";
	public String FatalFontColorSuffix="</font></span>";
	
	public void commonTestMethod(){
		
	}
	
	public void commonlaunchApplication() 
	  {
		//TestDataRec.TESTDATALOGINMAP.get("url");
		driver.get("http://automationpractice.com/index.php");
		//driver.get(TestDataRec.TESTDATALOGINMAP.get("url"));
		
	  }
	
	
public void takeScreenShot() {     //throws IOException
		
		String skipScreenshot=ReadTestConfig.GetProperty("SKIP.SCREENSHOT");
		if (skipScreenshot.equalsIgnoreCase("no"))
		{
			try{
			
			
			//if (skipScreenshot.equalsIgnoreCase("yes"))
			//{
				String sProjectName=ReadTestConfig.GetProperty("TESTPROJECT.NAME");
				
				 Random ran = new Random();
				  int randomInt;
				  int i=0;
				  int minNumber=1;  //Min set to 1
				  int maxAttachments=9;  //Default = 1 >> INCREASE THIS NUMBER FOR MORE THAN ONE
				  int randomAttachments = minNumber + ran.nextInt(maxAttachments - minNumber + 1);
				
				
				Date d=new Date();
				String screenshotFile=d.toString().replace(":", "_").replace(" ", "_")+randomAttachments+".png";
				File classpathRoot = new File(System.getProperty("user.dir"));
				
				//Creates or saves screenshots in this folderpath SA
				File app = new File("src//test//resources//testReport//"+sProjectName+"//", ReadTestConfig.Get("TEST.APPNAME")+"//screenshots//" );
				String filePath=app.toString()+"//"+screenshotFile;
				
				// store screenshot in that file
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				

				try {
					//String relative = new File(base).toURI().relativize(new File(path).toURI()).getPath();
					FileUtils.copyFile(scrFile, new File(filePath));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				File appScreenshot = new File("screenshots//");
				String filePathScreenshot=appScreenshot.toString()+"//"+screenshotFile;//SA
				
				testReport.info("details").addScreenCaptureFromPath(filePathScreenshot);
			
				
				testReport.log(Status.INFO,"#TAKE SCREENSHOT" + driver.getTitle() +" * SCREENSHOT CAPTURED * " );
			}
			catch (Exception e)
			{
				testReport.log(Status.INFO,"#TAKE SCREENSHOT" + driver.getTitle() +" * UNABLE TO CAPTURE SCREENSHOT* " );
			}
		}
	}
	

public void takeScreenShotForCompare( BufferedImage diffImage) {     //throws IOException
	
	String skipScreenshot=ReadTestConfig.GetProperty("SKIP.SCREENSHOT");
	if (skipScreenshot.equalsIgnoreCase("no"))
	{
		try{
		
		
		//if (skipScreenshot.equalsIgnoreCase("yes"))
		//{
			String sProjectName=ReadTestConfig.GetProperty("TESTPROJECT.NAME");
			
			Date d=new Date();
			String screenshotFile=d.toString().replace(":", "_").replace(" ", "_")+".png";
			File classpathRoot = new File(System.getProperty("user.dir"));
			
			//Creates or saves screenshots in this folderpath SA
			File app = new File("src//test//resources//testReport//"+sProjectName+"//", ReadTestConfig.Get("TEST.APPNAME")+"//screenshotscheck//" );
			String filePath=app.toString()+"//"+screenshotFile;
			
			// store screenshot in that file
			//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			

//			try {
//				//String relative = new File(base).toURI().relativize(new File(path).toURI()).getPath();
//				FileUtils.copyFile(scrFile, new File(filePath));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

			File appScreenshot = new File("screenshotscheck//");
			String filePathScreenshot=appScreenshot.toString()+"//"+screenshotFile;//SA
			
			testReport.info("details").addScreenCaptureFromPath(filePathScreenshot);
		

			testReport.log(Status.INFO,"#TAKE SCREENSHOT" + driver.getTitle() +" * SCREENSHOT CAPTURED * " );
		}
		catch (Exception e)
		{
			testReport.log(Status.INFO,"#TAKE SCREENSHOT" + driver.getTitle() +" * UNABLE TO CAPTURE SCREENSHOT* " );
		}
	}
}


public void WaitForPage(Common page) throws InterruptedException, IOException{
	boolean bExists=false;

		//verifyAppLoading();
		bExists = page.Exists();
		
		if (bExists==true)
		{
			Thread.sleep(300);
		////	break;
		}
			
		else
		Thread.sleep(20);

	////}
	
	if (bExists==false)
	{
	
		try{
		//fail();
		//Assert.fail();
			throw new IOException ("Page not found");
		}
		catch (Exception e){
			testReport.log(Status.FATAL, "element.toString()" +" NOT EXISTS - "+e );
			testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
			throw new IOException ("Page not found");
		}
	}
	else{
		testReport.log(Status.PASS,SuccessFontColorPrefix+"Wait for Page [Page Navigation] - WaitForPage Successful - Navigated To: "+page.toString()+SuccessFontColorSuffix);
	//	Common.Logger.LogData("navigated from "+this.getClass().getName()+" to "+ page.getClass().getName() + " is Passed");
		//test.log(Status.PASS,UDFCommonfontPrefix+"#UDF-COMMON-WAITFORPAGE" + driver.getTitle() +"navigated from "+this.getClass().getName()+" to "+ page.getClass().getName() + " is Passed"+UDFCommonfontSuffix);
		//test.log(Status.PASS,UDFPassCommonfontPrefix+"UDF" + "element.toString()" +" NOT EXISTS " +UDFPassCommonfontSuffix);
		
	//	fail();
	}

}

public boolean Exists() throws IOException {
	// TODO Auto-generated method stub
	return true;
}

public boolean Exists(WebElement element)
{
	
	boolean bExists=false;

	try{
		

		int globalWait=Integer.parseInt(ReadTestConfig.Get("SYNCHRONIZATION.TIME"));
		System.out.println("Global synchronization time "+globalWait);
		System.out.println("Waiting for element "+element.toString());
		WebDriverWait wait = new WebDriverWait(this.driver, globalWait);
		Thread.sleep(150);
		  // Comment wait.until(ExpectedConditions.visibilityOf(element)); when running through command line. This is kind of not required as impicit wait added
		if (!ReadTestConfig.Get("COMMANDLINE.EXECUTION").toString().trim().equalsIgnoreCase("yes"))
			//wait.until(ExpectedConditions.visibilityOf(element)); 
			wait.until(ExpectedConditions.visibilityOf(element)); 
			//wait.until(ExpectedConditions.visibilityOfElementLocated(element)); 
		//wait.until(ExpectedConditions.stalenessOf(element));	
		else//{
			//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			//wait.until(ExpectedConditions.elementToBeClickable(element)); 
			//wait.until(ExpectedConditions.p.presenceOfElementLocated(element)); 
//			boolean objectFound=false;
//			int i=0;
//		while(objectFound==false){
//			if (driver.findElement(element)){
//				wait(100);
//				objectFound=true;
//			}
//			i=i+1;
//			if (i==20)
//				objectFound=true;
//		}
		//}
			Thread.sleep(200);
		return true;
	}
	catch (Exception e){
		testReport.log(Status.FATAL,"element.toString()" +" NOT EXISTS - "+e);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	}
	return bExists;
}


public boolean ExistsCheck(WebElement element)
{
	
	boolean bExists=false;

	try{
		

		int globalWait=Integer.parseInt(ReadTestConfig.Get("SYNCHRONIZATION.TIME"));
		System.out.println("Global synchronization time "+globalWait);
		System.out.println("Waiting for element "+element.toString());
		WebDriverWait wait = new WebDriverWait(this.driver, globalWait);
		Thread.sleep(150);
		  // Comment wait.until(ExpectedConditions.visibilityOf(element)); when running through command line. This is kind of not required as impicit wait added
		//if (!ReadTestConfig.Get("COMMANDLINE.EXECUTION").toString().trim().equalsIgnoreCase("yes"))
			//wait.until(ExpectedConditions.visibilityOf(element)); 
			wait.until(ExpectedConditions.visibilityOf(element)); 
			//wait.until(ExpectedConditions.visibilityOfElementLocated(element)); 
		//wait.until(ExpectedConditions.stalenessOf(element));	
		//else//{
			//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			//wait.until(ExpectedConditions.elementToBeClickable(element)); 
			//wait.until(ExpectedConditions.p.presenceOfElementLocated(element)); 
//			boolean objectFound=false;
//			int i=0;
//		while(objectFound==false){
//			if (driver.findElement(element)){
//				wait(100);
//				objectFound=true;
//			}
//			i=i+1;
//			if (i==20)
//				objectFound=true;
//		}
		//}
			Thread.sleep(100);
		return true;
	}
	catch (Exception e){
		bExists=false;
//		testReport.log(Status.FATAL,"element.toString()" +" NOT EXISTS - "+e);
//		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	}
	return bExists;
}


public void sleep()
{
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
		  
		
		
		
	
	
	



public boolean verifyAppLoading()
{
	boolean bExists=false;
	
	try{
		WebElement element;//=driver.findElement(By.xpath("//img[@src='/images/loader.gif']"));

		int globalWait=Integer.parseInt(ReadTestConfig.Get("SYNCHRONIZATION.TIME"));
		System.out.println("Global synchronization time "+globalWait);
		//System.out.println("Waiting for element "+element.toString());
		int i=1;
		//Thread.sleep(150);
		while (i<1)
		{
//			if (ExistsCheck(element)==false)
//				break;
			try{
				Thread.sleep(100);
				element=driver.findElement(By.xpath("//img[@src='/images/loader.gif']"));
				if (element.isDisplayed()==false)
					break;
				
			}catch(Exception e){}
			i=i+1;
			
		}
		
//		WebDriverWait wait = new WebDriverWait(this.driver, globalWait+globalWait);
//		Thread.sleep(150);
//
//			wait.until(ExpectedConditions.visibilityOf(element)); 
	
		//	Thread.sleep(50);
		return true;
	}
	catch (Exception e){
		bExists=false;
	}
	
	return bExists;
}


public void waitAndClick(By identifer){
    WebDriverWait wait = new WebDriverWait(driver, 30);
    WebElement elem = wait.until(ExpectedConditions.presenceOfElementLocated(identifer));
    elem.click();
}

public void SendData(WebElement element)
{
	element.click();
}

public boolean isElementPresent(By by) {
	  try {
	    driver.findElement(by);
	    return true;
	  }
	catch (org.openqa.selenium.NoSuchElementException e) {
	    return false;
	  }
	}
	


public void selectDropdownValue(String objname, String selectValue) 
{
	try{
		WebElement testElement=driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//select|//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::select"));
		if (Exists(testElement)==false)
			throw new NoSuchElementException ("Element Not Found: "+testElement.toString());
		//ActivitySubtype.sendKeys(activitySubtype);
		Select oSelect = new Select(driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//select")));
		oSelect.selectByVisibleText(selectValue);
		testReport.log(Status.PASS,SuccessFontColorPrefix+"selectDropdown Successful - "+objname+SuccessFontColorSuffix);
	}
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"selectDropdown - unable to Select"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("selectDropdown not selected specified value");
	}
}

public void selectDropdown(String objname, String selectValue) 
{
	try{
		Exists(driver.findElement(By.xpath(objname)));
		WebElement testElement=driver.findElement(By.xpath(objname));
		if (Exists(testElement)==false)
			throw new NoSuchElementException ("Element Not Found: "+testElement.toString());
		//ActivitySubtype.sendKeys(activitySubtype);
		try{
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		Select oSelect = new Select(driver.findElement(By.xpath(objname)));
		oSelect.selectByVisibleText(selectValue);
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(ReadTestConfig.Get("OBJECT.WAITTIME")) , TimeUnit.SECONDS);
		}catch(Exception e){
			
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			Select oSelect = new Select(driver.findElement(By.xpath(objname)));
			oSelect.selectByIndex(1);
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(ReadTestConfig.Get("OBJECT.WAITTIME")) , TimeUnit.SECONDS);
			//driver.findElement(By.xpath("("+sFieldName+"//li[@role='option'])[2]")).click();
			//(//p[@class='title mgmtConTitle'])[2]
		}
		testReport.log(Status.PASS,SuccessFontColorPrefix+"selectDropdown Successful - "+objname+SuccessFontColorSuffix);
	}
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"selectDropdown - unable to Select"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("selectDropdown not selected specified value");
	}
}

public void enterInputValue(String objname, String selectValue) 
{
	try{
		//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::div//input")).getAttribute("class");
		//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")).getAttribute("name")
		WebElement testElement=driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input|//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::div//input"));
		//|//*[contains(text(),'"+objname+"')]/parent::div//"+"input
		//WebElement testElement1=driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::div//input"));
		if (Exists(testElement)==false )
			throw new NoSuchElementException ("Element Not Found: "+testElement.toString());
		if (Exists(testElement)==true)
			testElement.sendKeys(selectValue);

		//Select oSelect = new Select(driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")));
		//oSelect.selectByVisibleText(selectValue);
		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterInputValue Successful - "+objname+SuccessFontColorSuffix);
	}
	
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"enterInputValue - unable to Enter"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("enterInputValue not selected specified value");
	}
}


public void enterInput(String objname, String selectValue) 
{
	try{
		//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::div//input")).getAttribute("class");
		//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")).getAttribute("name")
		WebElement testElement=driver.findElement(By.xpath(objname));
		//|//*[contains(text(),'"+objname+"')]/parent::div//"+"input
		//WebElement testElement1=driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::div//input"));
		if (Exists(testElement)==false )
			throw new NoSuchElementException ("Element Not Found: "+testElement.toString());
		if (Exists(testElement)==true)
			testElement.sendKeys(selectValue);

		//Select oSelect = new Select(driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")));
		//oSelect.selectByVisibleText(selectValue);
		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterInputValue Successful - "+objname+SuccessFontColorSuffix);
	}
	
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"enterInputValue - unable to Enter"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("enterInputValue not selected specified value");
	}
}

public void clearInput(String objname) 
{
	try{
		//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::div//input")).getAttribute("class");
		//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")).getAttribute("name")
		WebElement testElement=driver.findElement(By.xpath(objname));
		//|//*[contains(text(),'"+objname+"')]/parent::div//"+"input
		//WebElement testElement1=driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::div//input"));
		if (Exists(testElement)==false )
			throw new NoSuchElementException ("Element Not Found: "+testElement.toString());
		if (Exists(testElement)==true){
			testElement.clear();
			testElement.clear();
		}

		//Select oSelect = new Select(driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")));
		//oSelect.selectByVisibleText(selectValue);
		testReport.log(Status.PASS,SuccessFontColorPrefix+"clearInput Successful - "+objname+SuccessFontColorSuffix);
	}
	
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"clearInput - unable to Enter"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("clearInput not selected specified value");
	}
}

public void Click(String objname) 
{
	try{
		//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::div//input")).getAttribute("class");
		//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")).getAttribute("name")
		WebElement testElement=driver.findElement(By.xpath(objname));
		//|//*[contains(text(),'"+objname+"')]/parent::div//"+"input
		//WebElement testElement1=driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::div//input"));
		if (Exists(testElement)==false )
			throw new NoSuchElementException ("Element Not Found: "+testElement.toString());
		if (Exists(testElement)==true)
			testElement.click();

		//Select oSelect = new Select(driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")));
		//oSelect.selectByVisibleText(selectValue);
		testReport.log(Status.PASS,SuccessFontColorPrefix+"Click Successful - "+objname+SuccessFontColorSuffix);
	}
	
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Click - unable to Enter"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("Click not selected specified value");
	}
}


public void enterInputValue(WebElement wElement, String selectValue) 
{
	try{
		//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::div//input")).getAttribute("class");
		//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")).getAttribute("name")
		WebElement testElement=wElement;//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input"));
		if (Exists(testElement)==false)
			throw new NoSuchElementException ("Element Not Found: "+testElement.toString());
		testElement.sendKeys(selectValue);
		//Select oSelect = new Select(driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")));
		//oSelect.selectByVisibleText(selectValue);
		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterInputValue Successful - "+testElement+SuccessFontColorSuffix);
	}
	
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"enterInputValue - unable to Enter"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("enterInputValue not selected specified value");
	}
}

public void clickButton(String objname) 
{
	try{
		//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")).getAttribute("name")
		Exists(driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]")));
		WebElement testElement=driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]"));
		if (Exists(testElement)==false)
			throw new NoSuchElementException ("Element Not Found: "+testElement.toString());
		testElement.click();
		//Select oSelect = new Select(driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")));
		//oSelect.selectByVisibleText(selectValue);
		testReport.log(Status.PASS,SuccessFontColorPrefix+"clickButton Successful - "+objname+SuccessFontColorSuffix);
	}
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"clickButton - unable to Click"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("clickButton not clicked");
	}
}

public void verifySpecifiedElementExistsByLabel(String actionStatus) 
{
	
	try{
		WebElement actionStatusElement=driver.findElement(By.xpath("//*[contains(text(),'"+actionStatus+"')]"));
		
		if (Exists(actionStatusElement)==false)
			throw new NoSuchElementException ("Element Not Found: "+actionStatusElement.toString());
		else if (Exists(actionStatusElement)==true)
			testReport.log(Status.PASS,SuccessFontColorPrefix+"Submit Transaction Data - Action Performed: "+actionStatus+" Successful - "+"Save: "+actionStatusElement.toString()+SuccessFontColorSuffix);
		this.takeScreenShot();
	}
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Submit Transaction Data - verifyActionStatus - unable to verify"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("verifyActionStatus not entered");
	}
}

public void verifySpecifiedElementExistsByLabel1(String actionStatus) 
{
	
	try{
		WebElement actionStatusElement=driver.findElement(By.xpath("//*[contains(text(),'"+actionStatus+"')]"));
		
		if (Exists(actionStatusElement)==false)
			throw new NoSuchElementException ("Element Not Found: "+actionStatusElement.toString());
		else if (Exists(actionStatusElement)==true)
			testReport.log(Status.PASS,SuccessFontColorPrefix+"Submit Transaction Data - Action Performed: "+actionStatus+" Successful - "+"Save: "+actionStatusElement.toString()+SuccessFontColorSuffix);
		this.takeScreenShot();
	}
	catch (Exception e)
	{
//		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Submit Transaction Data - verifyActionStatus - unable to verify"+e+ErrorFontColorSuffix);
//		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//		throw new NoSuchElementException ("verifyActionStatus not entered");
	}
}


public void enterDateInput(String objname, String selectValue, String testBrowser) 
{
	try{
		//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")).getAttribute("name")
		//objname="Par Amount";
		WebElement testElement=driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input|//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::div/input"));
		//testElement.click();
		//testElement.sendKeys(Keys.TAB);
		if (Exists(testElement)==false)
			throw new NoSuchElementException ("Element Not Found: "+testElement.toString());
		//objname="Pricing Date";
		//testElement=driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input"));
		testElement.click();
		testElement.sendKeys(selectValue);
		testElement.sendKeys(Keys.TAB);
		testElement.sendKeys(Keys.ENTER);
		testElement.sendKeys(Keys.ENTER);
		testElement.sendKeys(selectValue);
		//testElement.sendKeys(Keys.ARROW_DOWN);
		
		Actions actions = new Actions(driver);
		WebElement menuHoverLink = driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input|//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::div/input"));
		actions.moveToElement(menuHoverLink).build().perform();
		
		//driver.findElement(By.cssSelector(".accordion-content > div:nth-child(5) > div:nth-child(2) > input:nth-child(2)")).sendKeys("10102020");
		// String browserName = driver..getBrowserName().toLowerCase();
		if (testBrowser.equalsIgnoreCase("firefox"))
		{
			//WebElement yourButton= driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    String scriptSetAttrValue = "arguments[0].setAttribute(arguments[1],arguments[2])";
		    //js.executeScript(scriptSetAttrValue, driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")), "type", "text");
		    js.executeScript(scriptSetAttrValue, testElement, "type", "text");
		    testElement.sendKeys(selectValue);
		    testElement.sendKeys(Keys.TAB);
		    //js.executeScript(scriptSetAttrValue, testElement, "type", "date");
		}
		    //Select oSelect = new Select(driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")));
		//oSelect.selectByVisibleText(selectValue);
		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDateInput Successful - "+objname+SuccessFontColorSuffix);
	}
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"enterInputValue - unable to Enter"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("enterDateInput not entered specified value");
	}
}

public void enterDate(String objname, String selectValue, String testBrowser) 
{
	try{
		//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")).getAttribute("name")
		//objname="Par Amount";
		WebElement testElement=driver.findElement(By.xpath(objname));
		//testElement.click();
		//testElement.sendKeys(Keys.TAB);
		if (Exists(testElement)==false)
			throw new NoSuchElementException ("Element Not Found: "+testElement.toString());
		//objname="Pricing Date";
		//testElement=driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input"));
		testElement.click();
		testElement.sendKeys(selectValue);
		testElement.sendKeys(Keys.TAB);
		testElement.sendKeys(Keys.ENTER);
		testElement.sendKeys(Keys.ENTER);
		//testElement.sendKeys(selectValue);
		//testElement.sendKeys(Keys.ARROW_DOWN);
		
		Actions actions = new Actions(driver);
		WebElement menuHoverLink = driver.findElement(By.xpath(objname));
		actions.moveToElement(menuHoverLink).build().perform();
		
		//driver.findElement(By.cssSelector(".accordion-content > div:nth-child(5) > div:nth-child(2) > input:nth-child(2)")).sendKeys("10102020");
		// String browserName = driver..getBrowserName().toLowerCase();
		if (testBrowser.equalsIgnoreCase("firefox"))
		{
			//WebElement yourButton= driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    String scriptSetAttrValue = "arguments[0].setAttribute(arguments[1],arguments[2])";
		    //js.executeScript(scriptSetAttrValue, driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")), "type", "text");
		    js.executeScript(scriptSetAttrValue, testElement, "type", "text");
		    testElement.sendKeys(selectValue);
		    testElement.sendKeys(Keys.TAB);
		    //js.executeScript(scriptSetAttrValue, testElement, "type", "date");
		}
		    //Select oSelect = new Select(driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")));
		//oSelect.selectByVisibleText(selectValue);
		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDateInput Successful - "+objname+SuccessFontColorSuffix);
	}
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"enterInputValue - unable to Enter"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("enterDateInput not entered specified value");
	}
}


public void enterDateInput(WebElement wElement, String selectValue, String testBrowser) 
{
	try{
		//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")).getAttribute("name")
		//objname="Par Amount";
		WebElement testElement=wElement;//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input|//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::div/input"));
		//testElement.click();
		//testElement.sendKeys(Keys.TAB);
		if (Exists(testElement)==false)
			throw new NoSuchElementException ("Element Not Found: "+testElement.toString());
		//objname="Pricing Date";
		//testElement=driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input"));
		testElement.click();
		testElement.sendKeys(selectValue);
		testElement.sendKeys(Keys.TAB);
		testElement.sendKeys(Keys.ENTER);
		testElement.sendKeys(Keys.ENTER);
		testElement.sendKeys(selectValue);
		//testElement.sendKeys(Keys.ARROW_DOWN);
		
		Actions actions = new Actions(driver);
		WebElement menuHoverLink = wElement;//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input|//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::div/input"));
		actions.moveToElement(menuHoverLink).build().perform();
		
		//driver.findElement(By.cssSelector(".accordion-content > div:nth-child(5) > div:nth-child(2) > input:nth-child(2)")).sendKeys("10102020");
		// String browserName = driver..getBrowserName().toLowerCase();
		if (testBrowser.equalsIgnoreCase("firefox"))
		{
			//WebElement yourButton= driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    String scriptSetAttrValue = "arguments[0].setAttribute(arguments[1],arguments[2])";
		    //js.executeScript(scriptSetAttrValue, driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")), "type", "text");
		    js.executeScript(scriptSetAttrValue, testElement, "type", "text");
		    testElement.sendKeys(selectValue);
		    testElement.sendKeys(Keys.TAB);
		    //js.executeScript(scriptSetAttrValue, testElement, "type", "date");
		}
		    //Select oSelect = new Select(driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")));
		//oSelect.selectByVisibleText(selectValue);
		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDateInput Successful - "+""+SuccessFontColorSuffix);
	}
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"enterInputValue - unable to Enter"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("enterDateInput not entered specified value");
	}
}


public void enterDateCustom(String objname, String selectValue, String testBrowser) 
{
	try{
		//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")).getAttribute("name")
		//objname="Par Amount";
		WebElement testElement=driver.findElement(By.xpath(objname));
		//testElement.click();
		//testElement.sendKeys(Keys.TAB);
		if (Exists(testElement)==false)
			throw new NoSuchElementException ("Element Not Found: "+testElement.toString());
		//objname="Pricing Date";
		//testElement=driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input"));
		testElement.click();
		testElement.sendKeys(selectValue);
		testElement.sendKeys(Keys.TAB);
		testElement.sendKeys(Keys.ENTER);
		testElement.sendKeys(Keys.ENTER);
		//testElement.sendKeys(selectValue);
		//testElement.sendKeys(Keys.ARROW_DOWN);
		
		Actions actions = new Actions(driver);
		WebElement menuHoverLink = driver.findElement(By.xpath(objname));
		actions.moveToElement(menuHoverLink).build().perform();
		
		//driver.findElement(By.cssSelector(".accordion-content > div:nth-child(5) > div:nth-child(2) > input:nth-child(2)")).sendKeys("10102020");
		// String browserName = driver..getBrowserName().toLowerCase();
		if (testBrowser.equalsIgnoreCase("firefox"))
		{
			//WebElement yourButton= driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    String scriptSetAttrValue = "arguments[0].setAttribute(arguments[1],arguments[2])";
		    //js.executeScript(scriptSetAttrValue, driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")), "type", "text");
		    js.executeScript(scriptSetAttrValue, testElement, "type", "text");
		    testElement.sendKeys(selectValue);
		    testElement.sendKeys(Keys.TAB);
		    //js.executeScript(scriptSetAttrValue, testElement, "type", "date");
		}
		    //Select oSelect = new Select(driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")));
		//oSelect.selectByVisibleText(selectValue);
		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterDateInput Successful - "+objname+SuccessFontColorSuffix);
	}
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"enterInputValue - unable to Enter"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("enterDateInput not entered specified value");
	}
}

public void clickElementByLabel(String sLabelName) 
{
	try{
		//Debt.click();
		WebElement element = driver.findElement(By.xpath("//*[contains(text(),'"+sLabelName+"')]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		//driver.navigate().refresh();
		//this.Exists(element);
		//driver.findElement(By.cssSelector(".inactive-tab > a:nth-child(1)")).click();
	testReport.log(Status.PASS,SuccessFontColorPrefix+"Client Client Contacts Page - Click"+sLabelName+"  - Successful - "+SuccessFontColorSuffix);
	
	}
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"clickElementByLabel - unable to select Element"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("clickElementByLabel not launched");
	}
}

public void clickElement(WebElement wElement) 
{
	try{
		ExistsCheck(wElement);
		ExistsCheck(wElement);
		//Thread.sleep(500);
		wElement.click();
		testReport.log(Status.PASS,SuccessFontColorPrefix+"Client Client Contacts Page - Click"+wElement+"  - Successful - "+SuccessFontColorSuffix);
	
	}
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"clickElementByLabel - unable to select Element"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("clickElementByLabel not launched");
	}
}

public void waitElementClickable(String sXpath) 
{
	try{
		
		int i=0;
		Thread.sleep(400);
		while(i<100){
			if(driver.findElement(By.xpath(sXpath)).isEnabled()==true)
			{
				break;
				
			}
			Thread.sleep(10);	
			i=i+1;
		}

		testReport.log(Status.PASS,SuccessFontColorPrefix+"waitElementClickable :"+sXpath+"  - Successful - "+SuccessFontColorSuffix);
	
	}
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"waitElementClickable - unable to select Element"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("waitElementClickable not launched");
	}
}

public void clickElementExists(String sXpath) 
{
	try{
		Thread.sleep(600);
		ExistsCheck(driver.findElement(By.xpath(sXpath)));
		ExistsCheck(driver.findElement(By.xpath(sXpath)));
		ExistsCheck(driver.findElement(By.xpath(sXpath)));
		Thread.sleep(500);

		driver.findElement(By.xpath(sXpath)).click();

		testReport.log(Status.PASS,SuccessFontColorPrefix+"Client Client Contacts Page - Click"+sXpath+"  - Successful - "+SuccessFontColorSuffix);
	
	}
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"clickElementByLabel - unable to select Element"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("clickElementByLabel not launched");
	}
}


public void selectCombobox(WebElement wElement, String activityType) 
{
	try{
		//WebElement wCombox=driver.findElement(By.xpath("//*[contains(text(),'"+sFieldName+"')]/parent::div//"+"following-sibling::div//div[@role='combobox']"));
		WebElement wCombox=wElement;
		if (Exists(wCombox)==false)
			throw new NoSuchElementException ("Element Not Found: "+wCombox.toString());
  		//String webelementName="Assigned to";
  		//String eType="input";
  		Thread.sleep(400);
  		wCombox.click();
  		Thread.sleep(400);
  		driver.findElement(By.xpath("//li[contains(text(),'"+activityType+"')]")).click();
  		Thread.sleep(1000);
  		//wCombox.click();
  		//Thread.sleep(1000);
//  		Issuer.click();
//  		Thread.sleep(1000);
	
}
catch (Exception e)
{
	testReport.log(Status.FATAL,ErrorFontColorPrefix+"Select Combox control - selectCombobox - unable to select combobox value"+e+ErrorFontColorSuffix);
	testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	throw new NoSuchElementException ("selectCombobox not selected");
}
}

public void selectCombobox(WebElement wElement) 
{
	try{
		//WebElement wCombox=driver.findElement(By.xpath("//*[contains(text(),'"+sFieldName+"')]/parent::div//"+"following-sibling::div//div[@role='combobox']"));
		WebElement wCombox=wElement;
		if (Exists(wCombox)==false)
			throw new NoSuchElementException ("Element Not Found: "+wCombox.toString());
  		//String webelementName="Assigned to";
  		//String eType="input";
  		Thread.sleep(400);
  		wCombox.click();
  		Thread.sleep(400);
//  		selectItem.click();
//  		Thread.sleep(1000);
  		//wCombox.click();
  		//Thread.sleep(1000);
//  		Issuer.click();
//  		Thread.sleep(1000);
	
}
catch (Exception e)
{
	testReport.log(Status.FATAL,ErrorFontColorPrefix+"Select Combox control - selectCombobox - unable to select combobox value"+e+ErrorFontColorSuffix);
	testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	throw new NoSuchElementException ("selectCombobox not selected");
}
}

public void selectComboboxByName(String sFieldName, String activityType) 
{
	try{
		WebElement wCombox=driver.findElement(By.xpath("//*[contains(text(),'"+sFieldName+"')]/parent::div//"+"following-sibling::div//div[@role='combobox']|//*[contains(text(),'"+sFieldName+"')]/parent::div//"+"div[@role='combobox']"));
		//WebElement wCombox=wElement;
		if (Exists(wCombox)==false)
			throw new NoSuchElementException ("Element Not Found: "+wCombox.toString());
  		//String webelementName="Assigned to";
  		//String eType="input";
  		Thread.sleep(400);
  		wCombox.click();
  		Thread.sleep(400);
  		driver.findElement(By.xpath("//li[contains(text(),'"+activityType+"')]")).click();
  		Thread.sleep(1000);
  		//wCombox.click();
  		//Thread.sleep(1000);
//  		Issuer.click();
//  		Thread.sleep(1000);
	
}
catch (Exception e)
{
	testReport.log(Status.FATAL,ErrorFontColorPrefix+"Select Combox control - selectCombobox - unable to select combobox value"+e+ErrorFontColorSuffix);
	testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	throw new NoSuchElementException ("selectCombobox not selected");
}
}

public void selectCombobox(String sFieldName, String activityType) 
{
	try{
		WebElement wCombox=driver.findElement(By.xpath(sFieldName));
		//WebElement wCombox=wElement;
		if (Exists(wCombox)==false)
			throw new NoSuchElementException ("Element Not Found: "+wCombox.toString());
  		//String webelementName="Assigned to";
  		//String eType="input";
  		Thread.sleep(400);
  		wCombox.click();
  		Thread.sleep(400);
  		try{
  			driver.manage().timeouts().implicitlyWait(0 , TimeUnit.SECONDS);
  			driver.findElement(By.xpath(sFieldName+"//li[contains(text(),'"+activityType+"')]")).click();
  			driver.manage().timeouts().implicitlyWait(Integer.parseInt(ReadTestConfig.Get("OBJECT.WAITTIME")) , TimeUnit.SECONDS);
  		}catch(Exception e){
//  			Select listbox = new Select(driver.findElement(By.xpath(sFieldName+"//li")));
//  			listbox.selectByIndex(1);
  			try{
  			driver.manage().timeouts().implicitlyWait(0 , TimeUnit.SECONDS);
  			driver.findElement(By.xpath("("+sFieldName+"//li[@role='option'])[2]")).click();
  			driver.manage().timeouts().implicitlyWait(Integer.parseInt(ReadTestConfig.Get("OBJECT.WAITTIME")) , TimeUnit.SECONDS);
  			}catch(Exception e1){
  				driver.manage().timeouts().implicitlyWait(0 , TimeUnit.SECONDS);
  	  			driver.findElement(By.xpath("("+sFieldName+"//li[@role='option'])[1]")).click();
  	  			driver.manage().timeouts().implicitlyWait(Integer.parseInt(ReadTestConfig.Get("OBJECT.WAITTIME")) , TimeUnit.SECONDS);
  			}
  			//(//p[@class='title mgmtConTitle'])[2]
  		}
  		Thread.sleep(1000);
  		//wCombox.click();
  		//Thread.sleep(1000);
//  		Issuer.click();
//  		Thread.sleep(1000);
	
}
catch (Exception e)
{
	testReport.log(Status.FATAL,ErrorFontColorPrefix+"Select Combox control - selectCombobox - unable to select combobox value"+e+ErrorFontColorSuffix);
	testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	throw new NoSuchElementException ("selectCombobox not selected");
}
}


public void selectComboboxNoException(String sFieldName, String activityType) 
{
	try{
		WebElement wCombox=driver.findElement(By.xpath(sFieldName));
		//WebElement wCombox=wElement;
		if (Exists(wCombox)==false)
			throw new NoSuchElementException ("Element Not Found: "+wCombox.toString());
  		//String webelementName="Assigned to";
  		//String eType="input";
  		Thread.sleep(400);
  		wCombox.click();
  		Thread.sleep(400);
  		try{
  			driver.manage().timeouts().implicitlyWait(0 , TimeUnit.SECONDS);
  			driver.findElement(By.xpath(sFieldName+"//li[contains(text(),'"+activityType+"')]")).click();
  			driver.manage().timeouts().implicitlyWait(Integer.parseInt(ReadTestConfig.Get("OBJECT.WAITTIME")) , TimeUnit.SECONDS);
  		}catch(Exception e){
//  			Select listbox = new Select(driver.findElement(By.xpath(sFieldName+"//li")));
//  			listbox.selectByIndex(1);
  			try{
  			driver.manage().timeouts().implicitlyWait(0 , TimeUnit.SECONDS);
  			driver.findElement(By.xpath("("+sFieldName+"//li[@role='option'])[2]")).click();
  			driver.manage().timeouts().implicitlyWait(Integer.parseInt(ReadTestConfig.Get("OBJECT.WAITTIME")) , TimeUnit.SECONDS);
  			}catch(Exception e1){
  				driver.manage().timeouts().implicitlyWait(0 , TimeUnit.SECONDS);
  	  			driver.findElement(By.xpath("("+sFieldName+"//li[@role='option'])[1]")).click();
  	  			driver.manage().timeouts().implicitlyWait(Integer.parseInt(ReadTestConfig.Get("OBJECT.WAITTIME")) , TimeUnit.SECONDS);
  			}
  			//(//p[@class='title mgmtConTitle'])[2]
  		}
  		Thread.sleep(1000);
  		//wCombox.click();
  		//Thread.sleep(1000);
//  		Issuer.click();
//  		Thread.sleep(1000);
	
}
catch (Exception e)
{
	//testReport.log(Status.FATAL,ErrorFontColorPrefix+"Select Combox control - selectCombobox - unable to select combobox value"+e+ErrorFontColorSuffix);
	//testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	//throw new NoSuchElementException ("selectCombobox not selected");
}
}

public void selectComboboxCustom(String sXpath, String sValue) 
{
	try{
	WebElement wb1=driver.findElement(By.xpath(sXpath));
	//https://www.guru99.com/keyboard-mouse-events-files-webdriver.html
	//String randomString=RandomStringUtils.randomAlphabetic(4).toUpperCase();
	Actions builder=new Actions(driver);
	Action seriesofactions=builder
			.moveToElement(wb1)
			.click()
			.sendKeys(wb1,sValue)
			.sendKeys(Keys.TAB)
			.build();
	seriesofactions.perform();
	}
catch (Exception e)
{
	testReport.log(Status.FATAL,ErrorFontColorPrefix+"Select Combox CUstom control - selectComboboxCustom - unable to select combobox value"+e+ErrorFontColorSuffix);
	testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	throw new NoSuchElementException ("selectComboboxCustom not selected");
}
}

public void selectComboboxCustom1(String sXpath, String sValue) 
{
	try{
	WebElement wb1=driver.findElement(By.xpath(sXpath));
	WebElement wb11=driver.findElement(By.xpath("//li[@role='option']"));
	//https://www.guru99.com/keyboard-mouse-events-files-webdriver.html
	//String randomString=RandomStringUtils.randomAlphabetic(4).toUpperCase();
	Actions builder=new Actions(driver);
	Action seriesofactions=builder
			.moveToElement(wb1)
			.click()
			.sendKeys(wb1,sValue)
			.pause(100)
			.sendKeys(Keys.ENTER)
			.pause(100)
			.sendKeys(Keys.TAB)
//			.moveToElement(wb11)
//			.click()
			.pause(100)
			.build();
	Thread.sleep(200);
	seriesofactions.perform();
	//wb1.click();
	}
catch (Exception e)
{
	testReport.log(Status.FATAL,ErrorFontColorPrefix+"Select Combox CUstom control - selectComboboxCustom - unable to select combobox value"+e+ErrorFontColorSuffix);
	testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	throw new NoSuchElementException ("selectComboboxCustom not selected");
}
}

public void selectComboboxElementByName(String sFieldName, String activityType) 
{
	try{
		WebElement wCombox=driver.findElement(By.xpath("//*[contains(text(),'"+sFieldName+"')]/parent::div//"+"div[@role='combobox']"));
		//WebElement wCombox=wElement;
		if (Exists(wCombox)==false)
			throw new NoSuchElementException ("Element Not Found: "+wCombox.toString());
  		//String webelementName="Assigned to";
  		//String eType="input";
  		Thread.sleep(400);
  		wCombox.click();
  		Thread.sleep(400);
  		driver.findElement(By.xpath("//li[contains(text(),'"+activityType+"')]")).click();
  		Thread.sleep(1000);
  		//wCombox.click();
  		//Thread.sleep(1000);
//  		Issuer.click();
//  		Thread.sleep(1000);
	
}
catch (Exception e)
{
	testReport.log(Status.FATAL,ErrorFontColorPrefix+"Select Combox control - selectCombobox - unable to select combobox value"+e+ErrorFontColorSuffix);
	testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	throw new NoSuchElementException ("selectCombobox not selected");
}
}


public void clearInputValue(String objname) 
{
	try{
		//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::div//input")).getAttribute("class");
		//driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")).getAttribute("name")
		WebElement testElement=driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input|//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::div//input"));
		//WebElement testElement1=driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::div//input"));
		if (Exists(testElement)==false )
			throw new NoSuchElementException ("Element Not Found: "+testElement.toString());
		if (Exists(testElement)==true)
			testElement.clear();

		//Select oSelect = new Select(driver.findElement(By.xpath("//*[contains(text(),'"+objname+"')]/parent::div//"+"following-sibling::input")));
		//oSelect.selectByVisibleText(selectValue);
		testReport.log(Status.PASS,SuccessFontColorPrefix+"enterInputValue Successful - "+objname+SuccessFontColorSuffix);
	}
	
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"enterInputValue - unable to Enter"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("enterInputValue not selected specified value");
	}
}


public void selectRelatedTransactionType(WebElement RelatedTransactionType, String relatedTransactionType) 
{
	try{
  		if (Exists(RelatedTransactionType)==false)
			throw new NoSuchElementException ("Element Not Found: "+RelatedTransactionType.toString());
  		RelatedTransactionType.sendKeys(relatedTransactionType);
		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - selectRelatedTransactionType Successful - "+RelatedTransactionType.toString()+SuccessFontColorSuffix);
	}
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - selectRelatedTransactionType - unable to Select"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("selectRelatedTransactionType not entered");
	}
}   

public void selectRelatedTransactionIds(WebElement RelatedTransactionIds, String relatedTransactionIds) 
{
	try{
 		if (Exists(RelatedTransactionIds)==false)
			throw new NoSuchElementException ("Element Not Found: "+RelatedTransactionIds.toString());
  		//String webelementName="Assigned to";
  		//String eType="input";
 		
 		if(relatedTransactionIds.contains(";"))
 		{
 			String [] arrOfStr = relatedTransactionIds.split(";");
 			for (int i=0; i < arrOfStr.length; i++) {
 				Thread.sleep(400);
	      		RelatedTransactionIds.click();
	      		Thread.sleep(400);
	      		driver.findElement(By.xpath("//li[contains(text(),'"+arrOfStr[i]+"')]")).click();
	      		Thread.sleep(400);
	      		RelatedTransactionIds.click();
	      		Thread.sleep(400);
 	        }
 		}else if (!relatedTransactionIds.equalsIgnoreCase(""))
 		{
  		Thread.sleep(400);
  		RelatedTransactionIds.click();
  		Thread.sleep(400);
  		driver.findElement(By.xpath("//li[contains(text(),'"+relatedTransactionIds+"')]")).click();
  		Thread.sleep(400);
  		RelatedTransactionIds.click();
  		Thread.sleep(400);
 		}
  		
  		//RelatedTransactionIds.click();
  		//Thread.sleep(400);
  		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - selectRelatedTransactionIds Successful - "+RelatedTransactionIds.toString()+SuccessFontColorSuffix);
}
catch (Exception e)
{
	testReport.log(Status.FATAL,ErrorFontColorPrefix+"New Transaction-Deal Page - selectRelatedTransactionIds - unable to select combobox value"+e+ErrorFontColorSuffix);
	testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	throw new NoSuchElementException ("selectRelatedTransactionIds not selected");
}
}

public void enterNotes(WebElement Notes, String notes) 
{
	try{
  		if (Exists(Notes)==false)
			throw new NoSuchElementException ("Element Not Found: "+Notes.toString());
  		Notes.sendKeys(notes);
		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - enterNotes Successful - "+Notes.toString()+SuccessFontColorSuffix);
	}
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - enterNotes - unable to Select"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("enterNotes not entered");
	}
}   


public void waitForElementExists(String wElement) 
{
	try{
		boolean bFlag=false;
  		//Thread.sleep(4000);
  		int i=0;
  		while(i<=4)
  		{
  			Thread.sleep(200);
  			try{
  			if (ExistsCheck(driver.findElement(By.xpath(wElement)))==true){
  				bFlag=true;
  				Thread.sleep(200);
  				break;}
  			}catch(Exception e){}
  			i=i+1;
  			System.out.println("Waiting for item to be loaded: "+i);
  		}
  		
//		if (Exists(driver.findElement(By.xpath(wElement)))==false)
//			throw new NoSuchElementException ("Element Not Found: "+wElement.toString());
  		Thread.sleep(700);
  		if(bFlag==true)
  			testReport.log(Status.PASS,SuccessFontColorPrefix+"waitForElementExists Successful - "+wElement.toString()+SuccessFontColorSuffix);
  		else
  			throw new NoSuchElementException ("waitForElementExists not found");
	}
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"waitForElementExists - unable to Select"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("waitForElementExists not found");
	}
}   





public void waitForuntilloading(String wElement) 
{
	try{
		boolean bFlag=false;
  		//Thread.sleep(4000);
  		int i=0;
  		while(i<=15)
  		{
  			Thread.sleep(200);
  			try{
  			if (ExistsCheck(driver.findElement(By.xpath(wElement)))==true){
  				
  			System.out.println("wait");	
  			i=i+1;
  				
  				}
  			}
  			catch(Exception e){
  				bFlag=true;
  				Thread.sleep(200);
  				break;
  			}
  			
  			System.out.println("Waiting for item to be loaded: "+i);
  		}
  		
//		if (Exists(driver.findElement(By.xpath(wElement)))==false)
//			throw new NoSuchElementException ("Element Not Found: "+wElement.toString());
  		Thread.sleep(500);
  		if(bFlag==true)
  			testReport.log(Status.PASS,SuccessFontColorPrefix+"waitForElementExists Successful - "+wElement.toString()+SuccessFontColorSuffix);
  		else
  			throw new NoSuchElementException ("waitForElementExists not found");
	}
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"waitForElementExists - unable to Select"+e+ErrorFontColorSuffix);
	//	testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
	//	throw new NoSuchElementException ("waitForElementExists not found");
	}
}   





































public void clickByJS(String xpath) 
{
	try{
		//Debt.click();
		this.Exists(driver.findElement(By.xpath(xpath)));
		WebElement element = driver.findElement(By.xpath(xpath));//driver.findElement(By.xpath("//div/div/div/div/div[1]/div/section/div[1]/div[1]/article/a"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		//driver.navigate().refresh();
		//this.Exists(element);
		//driver.findElement(By.cssSelector(".inactive-tab > a:nth-child(1)")).click();
	testReport.log(Status.PASS,SuccessFontColorPrefix+"Client Client Contacts Page - clickTransaction Successful - "+element.toString()+SuccessFontColorSuffix);
	
	}
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"New Client Contacts Page - clickDebt - unable to select combobox value"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("clickByJS not clicked");
	}
}

}
