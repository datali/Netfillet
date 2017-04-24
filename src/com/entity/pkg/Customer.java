package com.entity.pkg;

import java.io.Serializable;
import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Customer implements Serializable {
	
	private String firstName;
	private String lastName;
	private int zipCode;
	private String phoneNumber;
	private String city;
	private String state;
	private String email;
	private String address;
	private int rating;
	private String creditCardNum;
	private int accountId;
	private ArrayList<Integer> orders;
	private ArrayList<Integer> movieQ;
	
	/**
	 * @return the firstName
	 */
	public ArrayList<Integer> getMovieQ() {
		return movieQ;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setMovieQ(ArrayList<Integer> movieQ) {
		this.movieQ = movieQ;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the zipCode
	 */
	public int getZipCode() {
		return zipCode;
	}


	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}


	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}


	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}


	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}


	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}


	/**
	 * @return the creditCardNum
	 */
	public String getCreditCardNum() {
		return creditCardNum;
	}


	/**
	 * @param creditCardNum the creditCardNum to set
	 */
	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}


	/**
	 * @return the accountId
	 */
	public int getAccountId() {
		return accountId;
	}


	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}


	/**
	 * @return the orders
	 */
	public ArrayList<Integer> getOrders() {
		return orders;
	}


	/**
	 * @param orders the orders to set
	 */
	public void setOrders(ArrayList<Integer> orders) {
		this.orders = orders;
	}


	/**
	 * @return the movieQueue
	 */
	public ArrayList<Integer> getMovieQueue() {
		return movieQueue;
	}


	/**
	 * @param movieQueue the movieQueue to set
	 */
	public void setMovieQueue(ArrayList<Integer> movieQueue) {
		this.movieQueue = movieQueue;
	}


	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}


	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	/**
	 * @return the accountCreationDate
	 */
	public String getAccountCreationDate() {
		return accountCreationDate;
	}


	/**
	 * @param accountCreationDate the accountCreationDate to set
	 */
	public void setAccountCreationDate(String accountCreationDate) {
		this.accountCreationDate = accountCreationDate;
	}


	/**
	 * @return the rentalHistory
	 */
	public ArrayList<String> getRentalHistory() {
		return rentalHistory;
	}


	/**
	 * @param rentalHistory the rentalHistory to set
	 */
	public void setRentalHistory(ArrayList<String> rentalHistory) {
		this.rentalHistory = rentalHistory;
	}


	private ArrayList<Integer> movieQueue;
	private String accountType;
	private String accountCreationDate;
	private ArrayList<String> rentalHistory;
	
	
	public Customer(){
		
		super();
		
	}


	
	
	
	
}
