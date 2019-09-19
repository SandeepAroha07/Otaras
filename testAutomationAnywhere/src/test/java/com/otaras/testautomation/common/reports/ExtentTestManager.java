package com.otaras.testautomation.common.reports;
//
//import org.testng.annotations.Test;
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//
//import java.util.*;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.ChartLocation;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//import com.companyname.testautomation.common.ExtentManager;
//import com.companyname.testautomation.common.reports.*;
//
//import org.apache.commons.lang3.tuple.Triple;
//import org.apache.log4j.Logger;
//
//https://github.com/anshooarora/extentreports-java/issues/868
//
public class ExtentTestManager {
////    
////    static ExtentReports extent;
////    
////    public static ExtentReports getInstance() {	
////        return extent;
////    }
////    
////    public static synchronized ExtentReports createInstance(String fileName) {
////        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
////        htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
////        htmlReporter.config().setChartVisibilityOnOpen(true);
////        htmlReporter.config().setTheme(Theme.DARK);
////        htmlReporter.config().setDocumentTitle("Lara Admin Login Test");
////        htmlReporter.config().setEncoding("utf-8");
////        htmlReporter.config().setReportName(fileName);
////
////        extent = new ExtentReports();
////        extent.attachReporter(htmlReporter);
////        
////        return extent;
////    }
////    
////}
//
//public class ExtentTestManager {
//private static final Logger logger = Logger.getLogger(ExtentTestManager.class);
//private static ThreadLocal extentTest=new ThreadLocal<>();
//private static ExtentReports extent = ExtentManager.getInstance();
//private static ThreadLocal<List> listOfScreenshots=new ThreadLocal<>();
//
//public synchronized static ExtentTest getTest() {
//    return extentTest.get();
//}
//public synchronized static List<String> getScreenShotLst() {
//    return listOfScreenshots.get();
//}
//
//public synchronized static ExtentTest createTest(String name, String description, String category) {
//
//    ExtentTest test = extent.createTest(name, description);
//
//    List<String> screenShotsLst=new ArrayList<String>();
//    listOfScreenshots.set(screenShotsLst);
//    if (category != null && !category.isEmpty())
//        test.assignCategory(category);
//
//    extentTest.set(test);
//
//    return getTest();
//}
//
//public synchronized static ExtentTest createTest(String name, String description) {
//    return createTest(name, description, null);
//}
//
//public synchronized static ExtentTest setAuthorInfo(Triple authorInfo ){
//    ExtentTestManager.getTest().assignAuthor(authorInfo.getMiddle().toString());
//    return getTest();
//}
//public synchronized static ExtentTest createTest(String name) {
//    return createTest(name, null);
//}
//
//public synchronized static void log(Status s1,String message) {
//    getTest().log(s1,message);
//}
//public synchronized static void logWithScreenShot(Status s1,String message,String path) {
//   try {
//       getTest().log(s1, message).addScreenCaptureFromPath(path,"title");
//   }
//   catch (Exception e){
//       e.printStackTrace();
//   }
//
//}
//
}