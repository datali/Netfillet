package com.entity.pkg;

public class Order {
	
	private java.sql.Date DateTime;
	private java.sql.Date ReturnDate;
	private int movieId;
	private int OrderId;
	private int AccountId;
	private int MovieId;
	
	
	
	public Order(){
		
	}



	public java.sql.Date getDateTime() {
		return DateTime;
	}



	public void setDateTime(java.sql.Date dateTime) {
		DateTime = dateTime;
	}



	public java.sql.Date getReturnDate() {
		return ReturnDate;
	}



	public void setReturnDate(java.sql.Date returnDate) {
		ReturnDate = returnDate;
	}



	public int getMovieId() {
		return movieId;
	}



	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}



	public int getOrderId() {
		return OrderId;
	}



	public void setOrderId(int orderId) {
		OrderId = orderId;
	}



	public int getAccountId() {
		return AccountId;
	}



	public void setAccountId(int accountId) {
		AccountId = accountId;
	}



	



	
	

}
