package com.service.pkg;

import com.entity.pkg.Customer;
import com.entity.pkg.Order;
import com.repository.pkg.CustomerData;
import com.repository.pkg.OrderData;

public class OrderService {
	private java.sql.Date date;
	private java.sql.Date returnDate;
	private int id;
	
	
	public OrderService(){
		
	}
	
	public OrderService(int id){
		this.id = id;
	}
	
public boolean customerExists(){
		
		return ValidateUser.validateOrder(id);
	
	}


public Order createOrder(){
	
	Order order = new Order();
	
	java.sql.Date orderDate = OrderData.OrderDate(id);
	order.setDateTime(orderDate);
	
	java.sql.Date returnDate = OrderData.ReturnDate(id);
	order.setReturnDate(returnDate);
	
	
	return order;
	
}

public void RecordOrder(String DateTime, String ReturnDate, int AccountId, int EmployeeId, int MovieId){
	
	OrderData.RecordOrder(DateTime,ReturnDate,AccountId,EmployeeId,MovieId);
	
}





}
