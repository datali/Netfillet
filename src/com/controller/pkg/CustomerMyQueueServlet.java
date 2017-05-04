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
import com.entity.pkg.Movie;
import com.service.pkg.CustomerService;
import com.service.pkg.EmployeeService;
import com.service.pkg.MovieService;
import com.service.pkg.ValidateUser;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/customer_admin/myqueue.jsp")
public class CustomerMyQueueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerMyQueueServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hi");
		PrintWriter out =  response.getWriter();
		Enumeration<String> params = request.getParameterNames(); 
		ArrayList<Integer> movie_array = new ArrayList<Integer>();
		CustomerService service = new CustomerService();
		//movie_array = service.getMovieQ(id);
		HttpSession session = request.getSession();
		Customer customer = (Customer)session.getAttribute("Customer");
		movie_array = service.getMovieQ(customer.getId());
		ArrayList<Movie> movie_list = new ArrayList<Movie>();
		for(int id: movie_array){
			MovieService mservice  = new MovieService();
			Movie movie = mservice.createMovie(id);
			movie_list.add(movie);
			
		}
		session.setAttribute("Queue", movie_list);
		
		RequestDispatcher rd=request.getRequestDispatcher("queue.jsp");  
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
