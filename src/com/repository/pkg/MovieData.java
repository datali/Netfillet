package com.repository.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MovieData {
	
	
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
	
	
	
	public static String Name(int MovieId){
		
		String Name = "";
	    try
	    {
	      String query = "SELECT * FROM Movie WHERE MovieId = '"+MovieId+"' ";
	      Statement st = createConnection().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        Name = rs.getString("Name");
	        }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    return Name;
	  }
	
	public static String Type(int MovieId){
			
			String Type = "";
		    try
		    {
		      String query = "SELECT * FROM Movie WHERE MovieId = '"+MovieId+"' ";
		      Statement st = createConnection().createStatement();
		      ResultSet rs = st.executeQuery(query);
		      while (rs.next())
		      {
		        Type = rs.getString("Type");
		        }
		      st.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		    
		    return Type;
		  }
	
	public static int Rating(int MovieId){
				
		int Rating = 0;
		    try
		    {
		      String query = "SELECT * FROM Movie WHERE MovieId = '"+MovieId+"' ";
		      Statement st = createConnection().createStatement();
		      ResultSet rs = st.executeQuery(query);
		      while (rs.next())
		      {
		        Rating = rs.getInt("Rating");
		        }
		      st.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		    
		    return Rating;
		  }
	
	public static double DistFree (int MovieId){
		
		
		double distrFree = 0;
	    try
	    {
	      String query = "SELECT * FROM Movie WHERE DistrFee = '"+MovieId+"' ";
	      Statement st = createConnection().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        distrFree = rs.getDouble("DistrFee");
	        }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    return distrFree;
	  }
	
	public static int NumCopies(int MovieId){
			
		
		int numCopies = 0;
		    try
		    {
		      String query = "SELECT * FROM Movie WHERE MovieId = '"+MovieId+"' ";
		      Statement st = createConnection().createStatement();
		      ResultSet rs = st.executeQuery(query);
		      while (rs.next())
		      {
		        numCopies= rs.getInt("NumCopies");
		        }
		      st.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		    
		    return numCopies;
		  }
	
public static ArrayList<Integer> AllMovies(){
		
		
		
		ArrayList<Integer> allMovies = new ArrayList<Integer>();
		
	    try
	    {
	      String query = "SELECT * FROM Movie";
	      Statement st = createConnection().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        allMovies.add(rs.getInt("MovieId"));
	        }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    return allMovies;
}

	public static void AddMovie(String Name, String Type, int Rating, double DistrFree, int NumCopies){
		
		try
	    {
	    	
	      String query = "INSERT INTO Movie (Name, Type, Rating, DistrFee, NumCopies)" +
	  	        		 "VALUES ('"+Name+"','"+Type+"','"+Rating+"','"+DistrFree+"','"+NumCopies+"')";
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
	
	public static void DeleteMovie(int MovieId){
		
		try
	    {
	    	
	      String query = "DELETE FROM Movie WHERE MovieId = '"+MovieId+"'";
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
	
public static void EditName(int MovieId, String Name){
		
		try
	    {
	    	
	      String query = "UPDATE Movie SET Name = '"+Name+"' WHERE MovieId = '"+MovieId+"'";
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


	
	
	
	}


