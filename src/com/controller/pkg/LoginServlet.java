package com.controller.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.pkg.Customer;
import com.entity.pkg.Employee;
import com.entity.pkg.Movie;
import com.service.pkg.CustomerService;
import com.service.pkg.EmployeeService;
import com.service.pkg.MovieService;
import com.service.pkg.ValidateUser;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out =  response.getWriter();
		out.print("hello world");
		out.print(request.getParameter("id"));
		
	    response.setContentType("text/html");  
	    out = response.getWriter();  
	    
	    String userType = request.getParameter("userType");
	    out.print(userType + "not this");
	    
	    
	    
	    
	    ArrayList<Movie> movieList = new ArrayList<Movie>();
		Movie movie1  = new Movie("Logan");
		Movie movie2 = new Movie("Lala Land");
		Movie movie3 = new Movie("Bird Man");
		Movie movie4 = new Movie("Batman- dark knight");
		Movie movie5 = new Movie("Avengers");
		movieList.add(movie1);
		movieList.add(movie2);
		movieList.add(movie3);
		movieList.add(movie4);
		movieList.add(movie5);
		HttpSession session = request.getSession();
		session.setAttribute("movieList", movieList);
	    RequestDispatcher rd=request.getRequestDispatcher("/welcome.jsp");  
        rd.forward(request,response);
	    if(userType.equals("customer")){
	    	CustomerService service = new CustomerService(Integer.parseInt(request.getParameter("id")));
	    	
		    if(service.customerExists()){  
		    	Customer customer = service.createUser();
		    	 session = request.getSession();
		    	session.setAttribute("Customer", customer);
		        //RequestDispatcher rd=request.getRequestDispatcher("/videos.jsp");  
		        rd.forward(request,response); 
		    }  
		    else{  
		        out.print("User does not exist");  
		        //RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
		        rd.include(request,response);  
		    }  
	    }
	    	
	    if(userType.equals("employee")){
	    	EmployeeService service = new EmployeeService(Integer.parseInt(request.getParameter("id")));
		    if(service.employeeExists()){  
		    	Employee employee = service.createEmployee();
		    	session = request.getSession();
		    	session.setAttribute("Employee", employee);
		    	if(employee.isManager()){
		    		//RequestDispatcher rd=request.getRequestDispatcher("/managerwelcome.jsp");
		    		rd.forward(request,response); 
		    	}
		    	else{
		    		//RequestDispatcher rd=request.getRequestDispatcher("/employeewelcome.jsp");  
		    		rd.forward(request,response); 
		    	}
		    }  
		    else{  
		        out.print("User does not exist");  
		       // RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
		        rd.include(request,response);  
		    }  
	    }
	    
//	    MovieService movieService = new MovieService();
//	    System.out.println(movieService.getAllMovies());
	    //movieService.addMovie("Fast and furious","Thriller", 5, 5000.00 , 4);
	    //System.out.println(movieService.getAllMovies());
	    //movieService.deleteMovie(5);
	    //System.out.println(movieService.getAllMovies());
//	    movieService.EditName(6, "Forest Gump");
//	    System.out.println(movieService.getAllMovies());
//	    movieService.EditType(6, "Drama");
//	    movieService.EditRating(6, 2);
//	    movieService.EditDistrFee(6, 132);
//	    movieService.EditNumCopies(6, 15);
	    
	    EmployeeService s = new EmployeeService();
	    
	    
	    
	    
	    
//	    s.AddEmployee(444444444,java.sql.Date.valueOf("2017-03-08"), 15, 'e', "Philip", "Lewis", "135 Knowledge Lane", 11790, "5166668888");
//	    s.AddEmployee(333333333,java.sql.Date.valueOf("2011-09-01"), 30, 'e',"Smith", "John", "789 Peace Blvd.", 93536, "3154434321");
//	    s.AddEmployee(12345789,java.sql.Date.valueOf("2015-01-01"), 18, 'e', "Smith", "David", "123 College road", 11790, "5162152345");
//	    s.AddEmployee(789123456,java.sql.Date.valueOf("2000-02-09"), 50, 'm', "Warren", "David", "456 Sunken Street", 11790, "6316329987");
	    
	    
	    
	    
	    
//	    s.deleteEmployee(11);
//	    s.deleteEmployee(12);
	    

	    
	    	
	    
	          out.close();  
	    }  
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
