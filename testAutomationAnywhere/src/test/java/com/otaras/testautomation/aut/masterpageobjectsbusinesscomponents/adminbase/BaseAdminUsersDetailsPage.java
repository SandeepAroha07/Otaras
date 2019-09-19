package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.adminbase;

import java.util.Date;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.objectrepository.OR;

public class BaseAdminUsersDetailsPage  extends BasePage{
	
	
	   @FindBy(xpath = OR.AdminAddUsersPage_FirstName)	
	    public WebElement FirstName;

	   
	   
	   public boolean Exists(){
	    	return super.Exists(FirstName); 
	    	
		}
	   
	 

	   
}
