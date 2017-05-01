package com.controller.pkg;

import java.io.IOException;
import java.io.PrintWriter;

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
		    		RequestDispatcher rd=request.getRequestDispatcher("/managerwelcome.jsp");
		    		rd.forward(request,response); 
		    	}
		    	else{
		    		RequestDispatcher rd=request.getRequestDispatcher("/employeewelcome.jsp");  
		    		rd.forward(request,response); 
		    	}
		    }  
		    else{  
		        out.print("User does not exist");  
		        RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
		        rd.include(request,response);  
		    }  
	    }
	    
	    MovieService movieService = new MovieService();
	    System.out.println(movieService.getAllMovies());
	    //movieService.addMovie("Fast and furious","Thriller", 5, 5000.00 , 4);
	    //System.out.println(movieService.getAllMovies());
	    //movieService.deleteMovie(5);
	    //System.out.println(movieService.getAllMovies());
	    movieService.EditName(6, "Forest Gump");
	    System.out.println(movieService.getAllMovies());

	    
	    	
	    
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
