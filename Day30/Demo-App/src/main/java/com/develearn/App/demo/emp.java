package com.develearn.App.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// Connect Java Program to Company2025 database
public class emp {
		public static void main(String args[]){  
		try{  
		//step-1 (Load driver)
		Class.forName("com.mysql.jdbc.Driver"); 
		//step-2 (create connection)
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/Company2025","root","root");
		
		 //step-3 (create statement)
		//here Java is database name, root is username and password  
		Statement stmt=con.createStatement();  
		
		//step-4 (execute query)
		ResultSet rs=stmt.executeQuery("select * from emp");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "
		                  +rs.getString(2)+"  "
				          +rs.getFloat(3)); 
		//step-5 (close connection)
		con.close();  
		}
		catch(Exception e)
		{ 
			System.out.println(e);
			}  
		}  
	}  