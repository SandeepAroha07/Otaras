package com.otaras.testautomation.common;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class BrowserUtil {
	private  WebDriver driver;

	private ExtentTest testReport;
	
	public BrowserUtil(WebDriver driver, ExtentTest testReport) {
		  this.driver=driver;
		  this.testReport=testReport;
	}
	
	
	public  void SwitchToBrowserFirstTab()
	{

	String parentWindowHandle = driver.getWindowHandle();
	Set<String> allWindowHandles = driver.getWindowHandles();
	String lastWindowHandle = "";
	for(String handle : allWindowHandles)
	{
		System.out.println("Window handle - > " + handle);
		lastWindowHandle = handle;
		String applicationTitle = driver.getTitle();

//		if (applicationTitle.equalsIgnoreCase("AccountOpening"))
//		{
//			driver.switchTo().window(handle);
//			break;
//		}
		driver.switchTo().window(lastWindowHandle);
		System.out.println("Window Title - > " + applicationTitle);
		break;
	}
	}
	
	
	public void SwitchToBrowserSecondTab()
	{
	int i=1;
	String parentWindowHandle = driver.getWindowHandle();
	Set<String> allWindowHandles = driver.getWindowHandles();
	String lastWindowHandle = "";
	String TempWindowHandle = "";
	for(String handle : allWindowHandles)
	{
		System.out.println("Window handle - > " + handle);
		lastWindowHandle = handle;
		String applicationTitle = driver.getTitle();

		System.out.println("Window Title - > " + applicationTitle); 
		i=i+1;
		if (i==3)
		{
			TempWindowHandle=handle;
			//driver.switchTo().window(lastWindowHandle);
//			break;
		}
	}
	if (i==4)
		driver.switchTo().window(TempWindowHandle);
	else if (i==3)
		driver.switchTo().window(lastWindowHandle);
	}
}
