package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.adminbase;

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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.codoid.products.fillo.Recordset;
import com.mongodb.client.MongoCollection;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.aut.testdatarec.TestDataRec;
import com.otaras.testautomation.common.MongoDBUtil;
import com.otaras.testautomation.common.ReadTestData;
import com.otaras.testautomation.objectrepository.OR;

public class BaseAdminAddThirdPartyPage  extends BasePage{
	
	   public Map<Object, Object> testData;
	
	   @FindBy(xpath = OR.AdminAddThirdPartyPage_TaxID)	
	    public WebElement TaxID;

	   
	   public boolean Exists(){
	    	return super.Exists(TaxID); 
	    	
		}

	   
}
