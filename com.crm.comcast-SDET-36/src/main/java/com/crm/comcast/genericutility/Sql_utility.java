package com.crm.comcast.genericutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Sql_utility {
		
			
			static Driver driver;
			static Connection connection;
			static ResultSet result;
		    
			/**
			 * This method will perform the mysql database connection
			 * @throws SQLException 
			 */
			public void connectDB() throws SQLException {
				try {
					driver=new Driver();
					DriverManager.registerDriver(driver);
					connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			/**
			 * This method will close the mysql database
			 * @throws SQLException
			 */
			public void closeDB() throws SQLException {
				try {
				  connection.close();
				}catch (Exception e) {
				}


			}
			/**
			 * This method will execute the querry
			 * @param query
			 * @return
			 * @throws Throwable
			 */
			public ResultSet execyteQuery(String query) throws Throwable {	
					result = connection.createStatement().executeQuery(query);
					return result;		
			}
			
			/**
			 * This method will execute the querry
			 * @param query
			 * @return
			 * @throws Throwable
			 */
			public int execyteUpdate(String query) throws Throwable {
				
					int result = connection.createStatement().executeUpdate(query);
			
				return result;

			}
			public void selectquery(String query) throws SQLException {
		    	  
		    	  Connection conn=null;
		  		try {
		  		com.mysql.cj.jdbc.Driver driverref=new Driver();
		  		DriverManager.registerDriver(driverref);	  		
		  		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
		  		System.out.println("connetcion done");
				java.sql.Statement state=conn.createStatement();
				 String query1 = query;
				ResultSet result=state.executeQuery(query);
				while(result.next())
				{
					System.out.println(result.getString(1)+"\t" +result.getString(2)+"\t" +result.getString(3)+"\t" +result.getString(4));
					
				}}
				catch(Exception e) {
					System.out.println("exception");
				}
				finally
				{
					conn.close();
					System.out.println("close the tabe");
				}}
			
			public void noselectquery(String query) {
				Connection conn=null;
			int result=0;
		try {
			com.mysql.cj.jdbc.Driver driverref=new Driver();
			DriverManager.registerDriver(driverref);
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
			System.out.println("connetcion done");
			java.sql.Statement state=conn.createStatement();
			 String query1 = query;
			 result=state.executeUpdate(query1);
			}
			catch(Exception e)
			{
				System.out.println("exception");
			}finally{
				if(result==1)
				{
					System.out.println("project inserted succesfully");
					
				}
				else
				{
					System.out.println("project is not succesfully");
				}
		
			
			System.out.println("tabe is closed");
			
			}
		
			
			
				
				
				
			
			}
		
	

			
			
			
			
			/**
			 * This method will execute querry based on querry and it will verify the data. 
			 * @param querry
			 * @param columnName
			 * @param expectedData
			 * @return
			 * @throws Throwable
			 */
			public boolean executeQuerryAndVerify(String querry,int columnName,String expectedData) throws Throwable {
				boolean flag=false;
				result=connection.createStatement().executeQuery(querry);
				while(result.next()) {
					if(result.getString(columnName).equals(expectedData)) {
						flag=true;
						break;
					}
				}
				if(flag) {
					System.out.println(expectedData+"==>Data is verified in the data base table");
					return flag;
				}else {
					System.out.println(expectedData+"==>data is not verified in the database");
					return flag;
				}}
		      		      
				
					
				
				
				
				
			}




		

	


