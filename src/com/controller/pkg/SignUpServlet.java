package com.controller.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.entity.pkg.Customer;
import com.entity.pkg.Employee;
import com.service.pkg.CustomerService;
import com.service.pkg.EmployeeService;
import com.service.pkg.ValidateUser;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =  response.getWriter();
		Enumeration<String> params = request.getParameterNames(); 
		while(params.hasMoreElements()){
			 String paramName = (String)params.nextElement();
			 if(request.getParameter(paramName)!=null && request.getParameter(paramName).isEmpty()){
				 out.print("Please Enter All Field");
				 break;
			 }
			 else{
				 out.println("Parameter Name - "+paramName+", Value - "+request.getParameter(paramName));
			 }
		}
		
		CustomerService custService = new CustomerService();
		//populate  customer object
		Customer customer = custService.createUser();		
		customer.setAccountId(Integer.parseInt(request.getParameter("ssn")));
		customer.setFirstName(request.getParameter("fname"));
		customer.setLastName(request.getParameter("lname"));
		customer.setCity(request.getParameter("city"));
		customer.setState(request.getParameter("state"));
		customer.setEmail(request.getParameter("email"));
		customer.setAddress(request.getParameter("address"));
		customer.setCreditCardNum(request.getParameter("creditcard"));
		
		// to do *** add to server
		
		// plan for account
		String plan = request.getParameter("plan");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
