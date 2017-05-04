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

import com.entity.pkg.Customer;
import com.service.pkg.CustomerService;

/**
 * Servlet implementation class EmployeeEditCustServletCompare
 */
@WebServlet("/EmployeeEditCustServletCompare")
public class EmployeeEditCustServletCompare extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeEditCustServletCompare() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				PrintWriter out =  response.getWriter();
				
				Enumeration<String> params = request.getParameterNames(); 
				ArrayList<String> parameters = new ArrayList<String>();
				ArrayList<String> paramNameArray = new ArrayList<String>();
				
				while(params.hasMoreElements()){
					 String paramName = (String)params.nextElement();
					 paramNameArray.add(paramName);
					 parameters.add(request.getParameter(paramName));
					 }
				
				int id = Integer.parseInt(request.getParameter("customerID"));
				CustomerService service = new CustomerService(Integer.parseInt(request.getParameter("customerID")));
			    if(service.customerExists()){  
			    	Customer customer = service.createUser();
			    	System.out.println(parameters);
			    	System.out.println(paramNameArray);
			    	String rating;
			    	if(request.getParameter("email") != null && !request.getParameter("email").isEmpty()){
			    		service.EditEmail(id, request.getParameter("email"));
			    	
			    	}
			    	if(request.getParameter("rating") != null && !request.getParameter("rating").isEmpty()){
			    		service.EditRating(id, Integer.parseInt(request.getParameter("rating")));
			    	
			    	}
			    	if(request.getParameter("creditCardNumber") != null && !request.getParameter("creditCardNumber").isEmpty()){
			    		service.EditCreditCardNum(id, request.getParameter("creditCardNumber"));
			    	
			    	}
			    	if(request.getParameter("firstname") != null && !request.getParameter("firstname").isEmpty()){
			    		service.EditName(id, request.getParameter("firstname"), request.getParameter("lastname"));
			    	
			    	}
			    	if(request.getParameter("lastname") != null && !request.getParameter("lastname").isEmpty()){
			    		service.EditName(id, request.getParameter("firstname"), request.getParameter("lastname"));
			    	
			    	}
			    	if(request.getParameter("address") != null && !request.getParameter("address").isEmpty()){
			    		service.EditAddress(id, request.getParameter("address"));
			    	
			    	}
			    	if(request.getParameter("zipcode") != null && !request.getParameter("zipcode").isEmpty()){
			    		service.EditZipCode(id, Integer.parseInt(request.getParameter("zipcode")));
			    	
			    	}
			    	if(request.getParameter("city") != null && !request.getParameter("city").isEmpty()){
			    		service.EditCity(id, request.getParameter("city"));
			    	
			    	}
			    	if(request.getParameter("state") != null && !request.getParameter("state").isEmpty()){
			    		service.EditState(id, request.getParameter("state"));
			    	
			    	}
			    	
			    	if(request.getParameter("phonenum") != null && !request.getParameter("phonenum").isEmpty()){
			    		service.EditTelephone(id, request.getParameter("phonenum"));
			    	
			    	}
			    	
			    	
//			    	for (String item : parameters) {
//			    	    if(item == "" || item == null)
//			    	    	continue;
//			    	    
//			    	    if(){
//				    		service.EditSSN(customer.getId(), Integer.parseInt(parameters.get(0)));
//				    	}
//				    	if(!parameters.get(1).equals(customer.getEmail())){
//				    		service.EditEmail(customer.getId(), parameters.get(1));
//				    	}
//				    	if(Integer.parseInt(parameters.get(2)) != customer.getRating()){
//				    		service.EditRating(customer.getRating(), Integer.parseInt(parameters.get(2)));
//				    	}
//				    	if(!parameters.get(3).equals(customer.getCreditCardNum())){
//				    		service.EditCreditCardNum(customer.getId(), parameters.get(3));
//				    	}
//				    	if(!parameters.get(4).equals(customer.getFirstName())){
//				    		service.EditName(customer.getId(), (parameters.get(4)), (parameters.get(5)));
//				    	}
//				    	if(!parameters.get(5).equals(customer.getLastName())){
//				    		service.EditName(customer.getId(), parameters.get(4), parameters.get(5));
//				    	}
//				    	if(!parameters.get(6).equals(customer.getAddress())){
//				    		service.EditAddress(customer.getId(), parameters.get(6));
//				    	}
//				    	if(!parameters.get(7).equals(customer.getCity())){
//				    		service.EditCity(customer.getId(), parameters.get(7));
//				    	}
//				    	if(Integer.parseInt(parameters.get(8)) != (customer.getZipCode())){
//				    		service.EditZipCode(customer.getId(), Integer.parseInt(parameters.get(8)));
//				    	}
//				    	if(!parameters.get(9).equals(customer.getPhoneNumber())){
//				    		service.EditTelephone(customer.getId(), parameters.get(9));
//				    	}
//			    	    
//			    	}
			    	
			    	HttpSession session = request.getSession();
			    	session.setAttribute("Customer", customer);
			    	RequestDispatcher rd=request.getRequestDispatcher("employee_admin/html/edit_customer.jsp");  
		    		rd.forward(request,response); 
			    }
			    else{  
			    	
			        RequestDispatcher rd=request.getRequestDispatcher("/employee_admin/html/CustomerEditValidation.jsp");  
			        rd.include(request,response);  
			    }  
			}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
