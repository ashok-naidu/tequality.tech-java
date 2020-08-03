package com.tequality.java.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		     		
	                      try {
	                    	String dbURL = "jdbc:mysql://ipAddress:3306/dbName";
	      		     		String username = "myUserName";
	      	                String password = "myPassword";
	      	                Class.forName("com.mysql.jdbc.Driver");
	      	                Connection con = DriverManager.getConnection(dbURL,username,password);
	      	                       Statement st = con.createStatement();
	      	                String selectquery = "SELECT * FROM <tablename> WHERE <condition>";
	      	                       ResultSet rs = st.executeQuery(selectquery);
	      	                        while (rs.next()) {
	      	                        	System.out.println(rs.getString("transaction_datetime"));
	      	                }
	                    	  
							con.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	     }
		
	

}
