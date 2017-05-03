package com.controller.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/EmployeeAddCustServlet")
public class EmployeeAddCustServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeAddCustServlet() {
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
		ArrayList<String> parameters = new ArrayList<String>();
			while(params.hasMoreElements()){
			 String paramName = (String)params.nextElement();
			 parameters.add(request.getParameter(paramName));
			 
		}
		
		CustomerService custService = new CustomerService();
		custService.AddCustomer(Integer.parseInt(parameters.get(0)), parameters.get(1), Integer.parseInt(parameters.get(2)),parameters.get(3), parameters.get(4), parameters.get(5), parameters.get(6), (parameters.get(7)), parameters.get(8), Integer.parseInt(parameters.get(9)), parameters.get(10));
    	//HttpSession session = request.getSession();
    	RequestDispatcher rd=request.getRequestDispatcher("employee_admin/html/add_customer.jsp");  
        rd.forward(request,response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
