package com.repository.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CustomerData {
	
	
	public static Connection createConnection() throws SQLException{
		String myDriver = "org.gjt.mm.mysql.Driver";
	      String myUrl = "jdbc:mysql://localhost/NETFLIX";
	      try {
			Class.forName(myDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      Connection conn = DriverManager.getConnection(myUrl, "root", "password");
	      return conn;
	}
	
	
	public static  String email(int customerId)
	  {
		String email = "";
	    try
	    {
	      String query = "SELECT * FROM Customer WHERE CustomerId = '"+customerId+"' ";
	      Statement st = createConnection().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        email = rs.getString("Email");
	        }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    return email;
	  }
	
	public static String creditCardNumber(int customerId){
		
		String creditCardNumber = "";
	    try
	    {
	      String query = "SELECT * FROM Customer WHERE CustomerId = '"+customerId+"' ";
	      Statement st = createConnection().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        creditCardNumber = rs.getString("CreditCardNumber");
	        }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    return creditCardNumber;
	  }
		
	

	public static int rating(int customerId){
		
		int rating = 0;
	    try
	    {
	      String query = "SELECT * FROM Customer WHERE CustomerId = '"+customerId+"' ";
	      Statement st = createConnection().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        rating = rs.getInt("Rating");
	        }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    return rating;
	  }
		
	

	public static String firstName(int customerId){
		
		String firstName = "";
	    try
	    {
	      String query = "SELECT * FROM Person WHERE Id = '"+customerId+"' ";
	      Statement st = createConnection().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        firstName = rs.getString("FirstName");
	        }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    return firstName;
	  }
	
	public static String lastName(int customerId){
			
			String lastName = "";
		    try
		    {
		      String query = "SELECT * FROM Person WHERE Id = '"+customerId+"' ";
		      Statement st = createConnection().createStatement();
		      ResultSet rs = st.executeQuery(query);
		      while (rs.next())
		      {
		        lastName = rs.getString("LastName");
		        }
		      st.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		    
		    return lastName;
		  }
	
	public static String address(int customerId){
			
			String address = "";
		    try
		    {
		      String query = "SELECT * FROM Person WHERE Id = '"+customerId+"' ";
		      Statement st = createConnection().createStatement();
		      ResultSet rs = st.executeQuery(query);
		      while (rs.next())
		      {
		        address = rs.getString("Address");
		        }
		      st.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		    
		    return address;
		  }
	
	public static int zipcode(int customerId){
		
		int zipcode = 0;
	    try
	    {
	      String query = "SELECT * FROM Person WHERE Id = '"+customerId+"' ";
	      Statement st = createConnection().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        zipcode = rs.getInt("Zipcode");
	        }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    return zipcode;
	  }
	
	public static String telephone(int customerId){
			
			String telephone = "";
		    try
		    {
		      String query = "SELECT * FROM Person WHERE Id = '"+customerId+"' ";
		      Statement st = createConnection().createStatement();
		      ResultSet rs = st.executeQuery(query);
		      while (rs.next())
		      {
		        telephone = rs.getString("Telephone");
		        }
		      st.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		    
		    return telephone;
		  }
	
	public static String state(int customerId){
			
			int zipcode = zipcode(customerId);
			
			String state = "";
		    try
		    {
		      String query = "SELECT * FROM Location WHERE ZipCode = '"+zipcode+"' ";
		      Statement st = createConnection().createStatement();
		      ResultSet rs = st.executeQuery(query);
		      while (rs.next())
		      {
		        state = rs.getString("State");
		        }
		      st.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		    
		    return state;
	  }
	
	public static String city(int customerId){
		
		int zipcode = zipcode(customerId);
		
		String city = "";
	    try
	    {
	      String query = "SELECT * FROM Location WHERE ZipCode = '"+zipcode+"' ";
	      Statement st = createConnection().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        city = rs.getString("City");
	        }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    return city;
  }
	
	public static int accountId(int customerId){
			
			
			int accountId = 0;
		    try
		    {
		      String query = "SELECT * FROM Account WHERE Customer = '"+customerId+"' ";
		      Statement st = createConnection().createStatement();
		      ResultSet rs = st.executeQuery(query);
		      while (rs.next())
		      {
		        accountId = rs.getInt("AccountId");
		        }
		      st.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		    
		    return accountId;
  }
	
	public static String accountType(int customerId){
		
		
		String accountType = "";
	    try
	    {
	      String query = "SELECT * FROM Account WHERE Customer = '"+customerId+"' ";
	      Statement st = createConnection().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        accountType = rs.getString("Type");
	        }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    return accountType;
}
	
	public static String accountCreationDate(int customerId){
			
			
			String accountCreationDate = "";
		    try
		    {
		      String query = "SELECT * FROM Account WHERE Customer = '"+customerId+"' ";
		      Statement st = createConnection().createStatement();
		      ResultSet rs = st.executeQuery(query);
		      while (rs.next())
		      {
		        accountCreationDate = rs.getString("DateOpened");
		        }
		      st.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		    
		    return accountCreationDate;
	}
	
	public static ArrayList<Integer> orders(int customerId){
		
		
		int accountId = accountId(customerId);
		ArrayList<Integer> orders = new ArrayList<Integer>();
		
	    try
	    {
	      String query = "SELECT * FROM Orders WHERE AccountId = '"+accountId+"' ";
	      Statement st = createConnection().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        orders.add(rs.getInt("OrderId"));
	        }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    return orders;
}
	
public static ArrayList<Integer> movieQ(int customerId){
		
		
		int accountId = accountId(customerId);
		ArrayList<Integer> movieQ = new ArrayList<Integer>();
		
	    try
	    {
	      String query = "SELECT * FROM MovieQ WHERE AccountId = '"+accountId+"' ";
	      Statement st = createConnection().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        movieQ.add(rs.getInt("MovieId"));
	        }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    return movieQ;
}

public static void AddCustomer(int SSN, String Email, int Rating, String CreditCardNumber, String FirstName, String LastName, String Address, int ZipCode, String Telephone){
	
	try
    {
	
	  
	  Statement st = createConnection().createStatement();
      String personQuery = "INSERT INTO Person (SSN, LastName, FirstName, Address, ZipCode, Telephone)" +
       		 "VALUES ('"+SSN+"','"+LastName+"','"+FirstName+"','"+Address+"','"+ZipCode+"','"+Telephone+"')";
      
      st.executeUpdate(personQuery);
      
      String customerQuery = "INSERT INTO Customer (CustomerId, , Email, Rating, CreditCardNumber)" +
       		 "VALUES ('"+SSN+"','"+Email+"','"+Rating+"','"+CreditCardNumber+"')";
      
      st.executeUpdate(customerQuery);
      
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
    
    
}

public static void DeleteCustomer(int Id){
	
	try
    {
      	
      String employeeQuery = "DELETE FROM Customer WHERE Id = '"+Id+"'";
      String personQuery = "DELETE FROM Person WHERE SSN = '"+Id+"'";
      Statement st = createConnection().createStatement();
      st.executeUpdate(employeeQuery);
      st.executeUpdate(personQuery);
      
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
    
    
}

	
}


