package com.otaras.testautomation.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;



public class DBConnection {

  public void example() throws Exception {
	  
	  
	  String DBName=ReadTestConfig.Get("DB.NAME");
	  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	  String DBServer = ReadTestConfig.Get("DB.SERVER");
       String DBPort = ReadTestConfig.Get("DB.SERVERPORT");
         String userName = ReadTestConfig.Get("DB.USERNAME");
         String password = ReadTestConfig.Get("DB.PASSWORD");
      Connection con =  DriverManager.getConnection("jdbc:sqlserver://"+DBServer+":"+DBPort+";user="+userName+";password="+password+";database="+DBName+"");
         System.out.println("test");
     System.out.println("connected");
     Statement s1 = con.createStatement();

     ResultSet rs = s1.executeQuery("select DISTINCT Id from dbo.TableName where Id like  '%"+"xxxxxxx"+"%' and cust IS NOT NULL");
  
     if(rs!=null){

     	
     	int i=1;
     	while (rs.next()) {
     	
     		System.out.println(rs.getString("xyz"));
     	
//     		if (i==1)
//     			ID1=rs.getString("abc");
//     		if (i==2)
//     			ID2=rs.getString("ddsfsdf");
//				i=i+1;
     		
     	}

     	 ResultSet rs1 = s1.executeQuery("select * from dbo.xyzTable where Id like  '%"+"asdsada"+"%' order byIdas asc");
     }
     	 
    	  
  }
  
  
  public void testconnection() throws Exception{
  
	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

	  String DBServer = ReadTestConfig.Get("DB.SERVER");
     String DBPort = ReadTestConfig.Get("DB.SERVERPORT");
       String userName = ReadTestConfig.Get("DB.USERNAME");
       String password = ReadTestConfig.Get("DB.PASSWORD");

       Connection con =  DriverManager.getConnection("jdbc:sqlserver://"+DBServer+":"+DBPort+";user="+userName+";password="+password+";database="+"DBNAME mention here"+"");
       System.out.println("test");
   System.out.println("connected");
   Statement s1 = con.createStatement();
   ResultSet rs = s1.executeQuery("Select count(*) AS count from TranffgffdType where Id in (60,61,62,63,64)and TypeId is null");

   if(rs!=null){
//       while (rs.next()){
//           for(int i = 0; i <result.length ;i++)
//           {
//               for(int j = 0; j <result.length;j++)
//               {
//                   result[j]=rs.getString(i);
//               System.out.println(result[j]);
//           }
//           }
//       }
   	//while (rs.next()) {
   	rs.next();
   		System.out.println(rs.getInt("count"));
   }
  
  }
}
