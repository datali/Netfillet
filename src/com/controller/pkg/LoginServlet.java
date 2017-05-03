package com.controller.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
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
	    
	    if(userType.equals("customer")){
	    	CustomerService service = new CustomerService(Integer.parseInt(request.getParameter("id")));
		    if(service.customerExists()){  
		    	Customer customer = service.createUser();
		    	HttpSession session = request.getSession();
		    	session.setAttribute("Customer", customer);
		        RequestDispatcher rd=request.getRequestDispatcher("/videos.jsp");  
		        rd.forward(request,response); 
		    }  
		    else{  
		        out.print("User does not exist");  
		        RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
		        rd.include(request,response);  
		    }  
	    }
	    	
	    if(userType.equals("employee")){
	    	EmployeeService service = new EmployeeService(Integer.parseInt(request.getParameter("id")));
		    if(service.employeeExists()){  
		    	Employee employee = service.createEmployee();
		    	HttpSession session = request.getSession();
		    	session.setAttribute("Employee", employee);
		    	if(employee.isManager()){
		    		RequestDispatcher rd=request.getRequestDispatcher("manager_admin/html/index.jsp");
		    		rd.forward(request,response); 
		    	}
		    	else{
		    		RequestDispatcher rd=request.getRequestDispatcher("employee_admin/html/index.jsp");  
		    		rd.forward(request,response); 
		    	}
		    }  
		    else{  
		        out.print("User does not exist");  
		        RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
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
	    
	    //EmployeeService s = new EmployeeService();
	    
	    CustomerService s = new CustomerService();
	   //s.AddCustomer(111111111, "syang@cs.sunysb.edu", 1, "1234567812345678", "Yang", "Shang", "123 Success Street", 11790, "5166328959");
	    //s.DeleteCustomer(111111111);
	    
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
