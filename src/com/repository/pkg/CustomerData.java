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
	      Connection conn = DriverManager.getConnection(myUrl, "root", "Garces89");
	      return conn;
	}
	
	public static int id(int customerId){
		return customerId;
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
	      String query = "SELECT * FROM Person WHERE SSN = '"+customerId+"' ";
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
		      String query = "SELECT * FROM Person WHERE SSN = '"+customerId+"' ";
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
		      String query = "SELECT * FROM Person WHERE SSN = '"+customerId+"' ";
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
	      String query = "SELECT * FROM Person WHERE SSN = '"+customerId+"' ";
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
		      String query = "SELECT * FROM Person WHERE SSN = '"+customerId+"' ";
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

public static void AddCustomer(int SSN, String Email, int Rating, String CreditCardNumber, String FirstName, String LastName, String Address, String City, String State, int ZipCode, String Telephone){
	
	try
    {
	
	  
	  
	 Statement st = createConnection().createStatement();
	 
	 String locationQuery = "INSERT INTO Location (ZipCode, City, State)" +
    		 "VALUES ('"+ZipCode+"','"+City+"','"+State+"')" + "ON DUPLICATE KEY UPDATE ZipCode ='"+ZipCode+"'";
   
	 st.executeUpdate(locationQuery);
      
	 String personQuery = "INSERT INTO Person (SSN, LastName, FirstName, Address, ZipCode, Telephone)" +
       		 "VALUES ('"+SSN+"','"+LastName+"','"+FirstName+"','"+Address+"','"+ZipCode+"','"+Telephone+"')";
      
      st.executeUpdate(personQuery);
      
      String customerQuery = "INSERT INTO Customer (CustomerId, Email, Rating, CreditCardNumber)" +
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
      	
      String customerQuery = "DELETE FROM Customer WHERE CustomerId = '"+Id+"'";
      String personQuery = "DELETE FROM Person WHERE SSN = '"+Id+"'";
      Statement st = createConnection().createStatement();
      st.executeUpdate(customerQuery);
      st.executeUpdate(personQuery);
      
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
    
    
}

public static void EditFirstName(int Id, String FirstName){

	try
	{

		String query = "UPDATE Person SET FirstName = '"+FirstName+"' WHERE SSN = '"+Id+"'";
		Statement st = createConnection().createStatement();
		st.executeUpdate(query);

		st.close();
	}
	catch (Exception e)
	{
		System.err.println("Got an exception! ");
		System.err.println(e.getMessage());
	}


}

public static void EditLastName(int Id, String LastName){

	try
	{

		String query = "UPDATE Person SET LastName = '"+LastName+"' WHERE SSN = '"+Id+"'";
		Statement st = createConnection().createStatement();
		st.executeUpdate(query);

		st.close();
	}
	catch (Exception e)
	{
		System.err.println("Got an exception! ");
		System.err.println(e.getMessage());
	}


}

public static void EditAddress(int Id, String Address){

	try
	{

		String query = "UPDATE Person SET Address = '"+Address+"' WHERE SSN = '"+Id+"'";
		Statement st = createConnection().createStatement();
		st.executeUpdate(query);

		st.close();
	}
	catch (Exception e)
	{
		System.err.println("Got an exception! ");
		System.err.println(e.getMessage());
	}


}

public static void EditZipCode(int Id, int ZipCode){

	try
	{

		String query = "UPDATE Person SET ZipCode = '"+ZipCode+"' WHERE SSN = '"+Id+"'";
		Statement st = createConnection().createStatement();
		st.executeUpdate(query);

		st.close();
	}
	catch (Exception e)
	{
		System.err.println("Got an exception! ");
		System.err.println(e.getMessage());
	}


}

public static void EditTelephone(int Id, String Telephone){

	try
	{

		String query = "UPDATE Person SET Telephone = '"+Telephone+"' WHERE SSN = '"+Id+"'";
		Statement st = createConnection().createStatement();
		st.executeUpdate(query);

		st.close();
	}
	catch (Exception e)
	{
		System.err.println("Got an exception! ");
		System.err.println(e.getMessage());
	}


}

public static void EditSSN(int Id, int SSN){

	try
	{

		String query = "UPDATE Customer SET CustomerId = '"+SSN+"' WHERE CustomerId = '"+Id+"'";
		Statement st = createConnection().createStatement();
		st.executeUpdate(query);

		st.close();
	}
	catch (Exception e)
	{
		System.err.println("Got an exception! ");
		System.err.println(e.getMessage());
	}


}

public static void EditRating(int Id, int rating){

	try
	{

		String query = "UPDATE Customer SET Rating = '"+rating+"' WHERE CustomerId = '"+Id+"'";
		Statement st = createConnection().createStatement();
		st.executeUpdate(query);

		st.close();
	}
	catch (Exception e)
	{
		System.err.println("Got an exception! ");
		System.err.println(e.getMessage());
	}


}

public static void EditCreditCardNum(int Id, String creditCardNum){

	try
	{

		String query = "UPDATE Customer SET CreditCardNumber = '"+creditCardNum+"' WHERE CustomerId = '"+Id+"'";
		Statement st = createConnection().createStatement();
		st.executeUpdate(query);

		st.close();
	}
	catch (Exception e)
	{
		System.err.println("Got an exception! ");
		System.err.println(e.getMessage());
	}


}

public static void EditEmail(int Id, String email){

	try
	{

		String query = "UPDATE Customer SET Email = '"+email+"' WHERE CustomerId = '"+Id+"'";
		Statement st = createConnection().createStatement();
		st.executeUpdate(query);

		st.close();
	}
	catch (Exception e)
	{
		System.err.println("Got an exception! ");
		System.err.println(e.getMessage());
	}


}

public static void EditCity(int Id, String City){

	try
	{

		int zipCode = zipcode(Id);
		String query = "UPDATE Location SET City = '"+City+"' WHERE ZipCode = '"+zipCode+"'";
		Statement st = createConnection().createStatement();
		st.executeUpdate(query);

		st.close();
	}
	catch (Exception e)
	{
		System.err.println("Got an exception! ");
		System.err.println(e.getMessage());
	}


}

public static void EditState(int Id, String State){

	try
	{

		int zipCode = zipcode(Id);
		String query = "UPDATE Location SET State = '"+State+"' WHERE ZipCode = '"+zipCode+"'";
		Statement st = createConnection().createStatement();
		st.executeUpdate(query);

		st.close();
	}
	catch (Exception e)
	{
		System.err.println("Got an exception! ");
		System.err.println(e.getMessage());
	}


}

public static ArrayList<ArrayList> createMailingList(){

	ArrayList<ArrayList> rs_array = new ArrayList<ArrayList>();
	try
	{

		
		String query = "SELECT  P.SSN, P.FirstName, P.LastName, P.Address, C.Email" + " FROM Customer C, Person P " + "WHERE C.CustomerId = P.SSN ";
		Statement st = createConnection().createStatement();
		//st.executeUpdate(query);
		st.executeQuery(query);
		
		 ResultSet rs = st.executeQuery(query);
		 System.out.println(rs.toString());
		 
		 
	      while (rs.next())
	      {
	    	  ArrayList<String> stringArray = new ArrayList<String>();
	    	  stringArray.add(String.valueOf(rs.getInt("SSN")));
	    	  stringArray.add(rs.getString("FirstName"));
	    	  stringArray.add(rs.getString("LastName"));
	    	  stringArray.add(rs.getString("Address"));
	    	  stringArray.add(rs.getString("Email"));
	    	  
	    	  rs_array.add(stringArray);
	        }
	      st.close();
	      return rs_array;
	      
	    }

		//st.close();
	
	catch (Exception e)
	{
		System.err.println("Got an exception! ");
		System.err.println(e.getMessage());
	}
	
	return rs_array;
	
}
}

	



