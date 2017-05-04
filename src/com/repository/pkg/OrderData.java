package com.repository.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class OrderData {
	
	public static Connection createConnection() throws SQLException{
		String myDriver = "org.gjt.mm.mysql.Driver";
	      String myUrl = "jdbc:mysql://localhost/NETFLIX";
	      try {
			Class.forName(myDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      Connection conn = DriverManager.getConnection(myUrl, "root", "Garces89");
	      return conn;
	}
	
	
	
	public static java.sql.Date OrderDate(int Id){
		
		java.sql.Date date = null;
	    try
	    {
	      String query = "SELECT * FROM Order WHERE OrderId = '"+Id+"' ";
	      Statement st = createConnection().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        date = rs.getDate("DateTime");
	        }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    return date;
	  }
	
	public static java.sql.Date ReturnDate(int Id){
			
		java.sql.Date date = null;
	    try
	    {
	      String query = "SELECT * FROM Order WHERE OrderId = '"+Id+"' ";
	      Statement st = createConnection().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        date = rs.getDate("DateTime");
	        }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    return date;
	  }
	
	
	public static void RecordOrder(String DateTime, String ReturnDate, int AccountId, int EmployeeId, int MovieId){
		
		try
		{
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Statement st = createConnection().createStatement();
			String getIndexQuery = "SELECT MAX(OrderId) AS OrderId FROM Orders";
			ResultSet rs = st.executeQuery(getIndexQuery);
			int OrderId = 0;
			while (rs.next())
		      {
		        OrderId = rs.getInt("OrderId");
		      }
			
			 String orderQuery = "INSERT INTO Orders (DateTime, ReturnDate, AccountId, MovieId)" +
		    		  "VALUES ('"+DateTime+"','"+ReturnDate+"', '"+AccountId+"', '"+MovieId+"')";

		      st.executeUpdate(orderQuery);
			
			
		      String rentalQuery = "INSERT INTO Rental (AccountId, CustRepId, OrderId, MovieId)" +
		    		  "VALUES ('"+AccountId+"','"+EmployeeId+"','"+(OrderId + 1)+"','"+MovieId+"')";

		      st.executeUpdate(rentalQuery);

			
		     

			

			st.close();
		}
		catch (Exception e)
		{
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
		
	}
		  
	
	


}
