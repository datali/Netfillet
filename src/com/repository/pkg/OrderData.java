package com.repository.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
	
	
	public static void RecordOrder(java.sql.Date DateTime, java.sql.Date ReturnDate, int AccountId, int EmployeeId, int MovieId ){
		
		try
		{


			Statement st = createConnection().createStatement();
			String orderQuery = "INSERT INTO Order (DateTime, ReturnDate)" +
					"VALUES ('"+DateTime+"','"+ReturnDate+"')";

			st.executeUpdate(orderQuery);

//			String rentalQuery = "INSERT INTO Rental (AccountId, EmployeeId, OrderId, MovieId)" +
//					"VALUES ('"+AccountId+"','"+EmployeeId+"','"+OrderId+"','"+MovieId+"')";

			//st.executeUpdate(employeeQuery);

			st.close();
		}
		catch (Exception e)
		{
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
		
	}
		  
	
	


}
