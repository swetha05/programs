package programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

// java.sql.PreparedStatement;

import java.sql.Statement;

public class JDBC {

		  
	    public static void main (String[] args) { 
	        try { 
	            String url = "jdbc:msql://200.210.220.1:1114/Demo"; 
	            Connection conn = DriverManager.getConnection(url,"username","password"); 
	            Statement st = conn.createStatement(); 
	            
	            ResultSet rs;
	            
	            rs = st.executeQuery("SELECT Lname FROM Customers WHERE Snum = 2001");
	            while ( rs.next() ) {
	                String lastName = rs.getString("Lname");
	                System.out.println(lastName);
	            }
	            
	            
	        } catch (Exception e) { 
	            System.out.println("Got an exception! "); 
	            System.out.println(e.getMessage()); 
	        } 
	  
	    }
	} 


