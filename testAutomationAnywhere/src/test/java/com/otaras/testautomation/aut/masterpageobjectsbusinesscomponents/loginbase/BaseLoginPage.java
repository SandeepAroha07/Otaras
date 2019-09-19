package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.loginbase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.aut.testdatarec.TestDataRec;
import com.otaras.testautomation.common.ReadTestConfig;
import com.otaras.testautomation.common.uielement.TestWebElement;
import com.otaras.testautomation.objectrepository.OR;


public class BaseLoginPage extends BasePage{
  
//	private WebDriver driver;
//	private ExtentTest testReport;
	
//	
//	public BaseLoginPage(WebDriver driver,ExtentTest testReport)
//	{
//		 this.driver=driver;
//		 this.testReport=testReport;
//	}
	
//	final String  opCustomerFirstName= OR.pageA_ZipCode;
//    @FindBy(xpath = opCustomerFirstName)
//    @CacheLookup
//    public WebElement txtCustomerName;
	

    
    //@FindBy(xpath = OR.loginPage_newCustemailAddress)
	//@FindBy(xpath = "//input[@id='email_create']")
	
    //@CacheLookup
//    public WebElement newCustemailAddres;
//
//    @FindBy(xpath = OR.loginPage_createAnAccount)	
//    public WebElement createAnAccount;
//    
//    @FindBy(xpath = OR.loginPage_existCustemailAddress)	
//    public WebElement existCustemailAddress;
//    
//    @FindBy(xpath = OR.loginPage_password)	
//    public WebElement password1;
//
//    @FindBy(xpath = OR.loginPage_forgotYourPassword)	
//    public WebElement forgotYourPassword;
//    
//    @FindBy(xpath = OR.loginPage_signIn)	
//    public WebElement signIn;
//    
//    @FindBy(xpath = OR.loginPage_homeIcon)	
//    public WebElement homeIcon;
    
    //---------------------------------------

    @FindBy(xpath = OR.LoginPage_UserName)	
    public WebElement UserName;
    @FindBy(xpath = OR.LoginPage_Password)	
    public WebElement Password;
    @FindBy(xpath = OR.LoginPage_SignIn)	
    public WebElement SignIn;
    
//    public boolean Exists(){
//    	//testElement.sendKeys("anil");
//	    //return super.Exists(existemail); 
//    	return super.Exists(newCustemailAddres); 
//	}
    public boolean Exists(){
    	//testElement.sendKeys("anil");
	    //return super.Exists(existemail); 
    	return super.Exists(UserName); 
    	
	}
    
    
//    public void enter_newCustemailAddres() 
//    {
//    	//existemail.sendKeys("Test");;
//    	newCustemailAddres.sendKeys("Test");
//    }
    
    
    public void enterUsername() 
    {
    	try{
    		if (Exists(UserName)==false)
    			throw new NoSuchElementException ("Element Not Found: "+UserName.toString());
    		UserName.sendKeys(TestDataRec.TESTDATALOGINMAP.get("loginName"));
    		UserName.sendKeys(Keys.TAB);
    	testReport.log(Status.PASS,SuccessFontColorPrefix+"Login Page - enterUsername Successful - "+UserName.toString()+SuccessFontColorSuffix);
    	
    	}
    	catch (Exception e)
    	{
    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Login Page - enterUsername - unable to Enter"+e+ErrorFontColorSuffix);
    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
    		throw new NoSuchElementException ("URL not launched");
    	}
    }
    
    public void enterPassword() 
    {
    	try{
    		if (Exists(Password)==false)
    			throw new NoSuchElementException ("Element Not Found: "+Password.toString());
    		Password.sendKeys(TestDataRec.TESTDATALOGINMAP.get("loginPassword"));
    		Password.sendKeys(Keys.TAB);
    	testReport.log(Status.PASS,SuccessFontColorPrefix+"Login Page - enterUsername Successful - "+UserName.toString()+SuccessFontColorSuffix);
    	
    	}
    	catch (Exception e)
    	{
    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Login Page - Enter Password - unable to Enter"+e+ErrorFontColorSuffix);
    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
    		throw new NoSuchElementException ("URL not launched");
    	}
    }
    
    public void clickSignIn() 
    {
    	try{
    		if (Exists(SignIn)==false)
    			throw new NoSuchElementException ("Element Not Found: "+SignIn.toString());
    		//Thread.sleep(1000);
    		UserName.click();
    		Password.click();
    		//Thread.sleep(1000);
    		SignIn.click();
    		//Thread.sleep(1000);
    		//UserName.click();
    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Login Page - clickSignIn Successful - "+SignIn.toString()+SuccessFontColorSuffix);
  	  }
  	catch (Exception e)
  	{
  		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Login Page - Click SignIn failed - unable to Click"+e+ErrorFontColorSuffix);
  		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
  		throw new NoSuchElementException ("URL not launched");
  	}
    }
    
    
//    public void enter_password() 
//    {
//    	try{
//    	password1.sendKeys("Test");
//    	testReport.log(Status.PASS,SuccessFontColorPrefix+"Login Page - enter_password Successful - "+password1.toString()+SuccessFontColorSuffix);
//    	
//    	}
//    	catch (Exception e)
//    	{
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Login Page - Enter Password - unable to Enter"+e+ErrorFontColorSuffix);
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//    		throw new NoSuchElementException ("URL not launched");
//    	}
//    }
    
    
    public void loginToApplication_command() // use when running using command line
    {
    	
    	enterPassword();
		enterUsername();
		UserName.click();
		Password.click();
		if (SignIn.isEnabled()==true)
		{
			UserName.click();
    		Password.click();
			SignIn.click();
		}
			else
		{
			UserName.click();
			//UserName.sendKeys(Keys.TAB);
			Password.click();
			SignIn.click();
		}
    }
    
    
    public void loginToApplication() throws Exception  //do not use when running through commnd line
    {
    	
    	if (ReadTestConfig.Get("COMMANDLINE.EXECUTION").toString().trim().equalsIgnoreCase("yes")){
    		loginToApplication_command();
    	}
    	else{
    	try{
    		Thread.sleep(10);
    		//WebElement yourButton= driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
    		WebElement yourButton= driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
    		
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("arguments[0].removeAttribute('disabled','disabled')",yourButton);

    		WebDriverWait wait = new WebDriverWait(driver, 10); // was 20
    		wait.until(ExpectedConditions.elementToBeClickable(yourButton));

    		//yourButton.click();
    		Thread.sleep((long)(Math.random() * 10));
    		}catch(Exception e){}
    	
    	enterPassword();
		enterUsername();
		Thread.sleep(100);
		UserName.click();
		Thread.sleep(10);
		Password.click();
		Thread.sleep(10);
//		try{
//		WebElement yourButton= driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].removeAttribute('disabled','disabled')",yourButton);
//
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.elementToBeClickable(yourButton));
//
//		//yourButton.click();
//		Thread.sleep((long)(Math.random() * 10));
//		}catch(Exception e){}
		if (SignIn.isEnabled()==true)
			SignIn.click();
		Thread.sleep(50);
//		
//		if (SignIn.isEnabled()==true)
//		{
//			testReport.log(Status.INFO,"Entered SingnIn enabled check condition - true block");
//			UserName.click();
//    		Password.click();
//    		Thread.sleep((long)(Math.random() * 10));
//			SignIn.click();
//		}
//			else
//		{
//				testReport.log(Status.INFO,"Entered SingnIn enabled check condition - false block");
//				UserName.click();
//			//UserName.sendKeys(Keys.TAB);
//				try{
//				int i=0;
//				while (i<5){
//			Password.click();
//			UserName.click();
//			driver.findElement(By.cssSelector("div.field:nth-child(4) > div:nth-child(1) > input:nth-child(1)")).click();
//			Thread.sleep(50);
//			driver.findElement(By.cssSelector(".has-icons-left > input:nth-child(1)")).click();
//			Thread.sleep((long)(Math.random() * 10));
//			SignIn.click();
//			i=i+1;
//				}}catch(Exception e){}
//		}
//    	
    	
    	
//    	enterPassword();
//		enterUsername();
//		
//		//Thread.sleep((long)(Math.random() * 10));
//		Password.click();
//		UserName.click();
//		Thread.sleep(10);
//		try{
//		SignIn.click();
//		}catch(Exception e){
//			Thread.sleep(10);
//			Password.click();
//			UserName.click();
//			Password.click();
//			SignIn.click();
//			
//		}
		
//		driver.findElement(By.cssSelector("div.field:nth-child(4) > div:nth-child(1) > input:nth-child(1)")).click();
//		Thread.sleep(50);
//		driver.findElement(By.cssSelector(".has-icons-left > input:nth-child(1)")).click();
//		Thread.sleep(10);
	//	SignIn.click();
//		Thread.sleep(10);
//		if (SignIn.isEnabled()==true){
//			Thread.sleep(10);
////			UserName.click();
////			Password.click();
//			SignIn.click();
//		}
//		else
//		{
//			Thread.sleep(10);
//			Password.click();
//			UserName.click();
//		
//			SignIn.click();
//		}
		//Thread.sleep((long)(Math.random() * 10));
//		if (SignIn.isEnabled()==true)
//		{
//			Password.click();
//			UserName.click();
//    		
//    	//	Thread.sleep((long)(Math.random() * 10));
//			SignIn.click();
//		//	Thread.sleep((long)(Math.random() * 10));
//		}
//			else
//		{
//				Password.click();
//				UserName.click();
//			//UserName.sendKeys(Keys.TAB);
//			
//			//UserName.sendKeys("");
//		//	Thread.sleep((long)(Math.random() * 10));
//			SignIn.click();
//		//	Thread.sleep((long)(Math.random() * 10));
//		}
    	}
    }
    
    
//    public void clickHome() 
//    {
//    	try{
//    	homeIcon.click();
//    	//testReport.log(Status.PASS,"Click Home Icon: "+TestDataRec.TESTDATALOGINMAP.get("url")+ " launched");
//  	  }
//  	catch (Exception e)
//  	{
//  		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Login Page - Click Home Icon failed - unable to Click"+e+ErrorFontColorSuffix);
//  		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//  		throw new NoSuchElementException ("URL not launched");
//  	}
//    }
    
    

    
    
    
public void enterLoginName() 
  {
	driver.get("http://automationpractice.com/index.php");
  }
}
