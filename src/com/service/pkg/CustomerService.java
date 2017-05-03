package com.service.pkg;

import java.util.ArrayList;

import com.entity.pkg.Customer;
import com.repository.pkg.CustomerData;

public class CustomerService {
	
	private int id;
	private String password;
	
	public CustomerService(int id, String password){
		
		this.id = id;
		this.password = password;
	}
	
public CustomerService(int id){
		
		this.id = id;
	}
	
	public boolean customerExists(){
		
		return ValidateUser.validateCustomer(id);
	
	}
	
	public Customer createUser(){
		
		Customer customer = new Customer();
		
		String email = CustomerData.email(id);
		System.out.println(email);
		customer.setEmail(email);
		
		String creditCardNumber = CustomerData.creditCardNumber(id);
		System.out.println(creditCardNumber);
		customer.setCreditCardNum(creditCardNumber);
		
		int rating = CustomerData.rating(id);
		System.out.println(rating);
		customer.setRating(rating);
		
		String firstName = CustomerData.firstName(id);
		System.out.println(firstName);
		customer.setFirstName(firstName);
		
		String lastName = CustomerData.lastName(id);
		System.out.println(lastName);
		customer.setLastName(lastName);
		
		String address = CustomerData.address(id);
		System.out.println(address);
		customer.setAddress(address);
		
		int zipCode = CustomerData.zipcode(id);
		System.out.println(zipCode);
		customer.setZipCode(zipCode);
		
		String telephone = CustomerData.telephone(id);
		System.out.println(telephone);
		customer.setPhoneNumber(telephone);
		
		String state = CustomerData.state(id);
		System.out.println(state);
		customer.setState(state);
		
		String city = CustomerData.city(id);
		System.out.println(city);
		customer.setCity(city);
		
		int accountId = CustomerData.accountId(id);
		System.out.println(accountId);
		customer.setAccountId(accountId);
		
		String accountType = CustomerData.accountType(id);
		System.out.println(accountType);
		customer.setAccountType(accountType);
		
		String accountCreationDate = CustomerData.accountCreationDate(id);
		System.out.println(accountCreationDate);
		customer.setAccountCreationDate(accountCreationDate);
		
		ArrayList<Integer> orders = CustomerData.orders(id);
		System.out.println(orders);
		customer.setOrders(orders);
		
		ArrayList<Integer> movieQ = CustomerData.movieQ(id);
		System.out.println(movieQ);
		customer.setMovieQueue(movieQ);
		
		
		
		
		return customer;
	}

}
