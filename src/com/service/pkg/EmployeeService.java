package com.service.pkg;

import java.sql.Date;
import java.util.ArrayList;

import com.entity.pkg.Customer;
import com.entity.pkg.Employee;
import com.repository.pkg.CustomerData;
import com.repository.pkg.EmployeeData;
import com.repository.pkg.MovieData;

public class EmployeeService {
	
	private int id;
	private String password;
	
	public EmployeeService(int id, String password){
		
		this.id = id;
		this.password = password;
	}
	
public EmployeeService(int id){
		
		this.id = id;
	}

public EmployeeService(){
	
	
}
	
	public boolean employeeExists(){
		
		return ValidateUser.validateEmployee(id);
	
	}
	
	public Employee createEmployee(){
		
		Employee employee = new Employee();
		
		String firstName = EmployeeData.firstName(id);
		System.out.println(firstName);
		employee.setFirstName(firstName);
		
		String lastName = EmployeeData.lastName(id);
		System.out.println(lastName);
		employee.setLastName(lastName);
		
		String address = EmployeeData.address(id);
		System.out.println(address);
		employee.setAddress(address);
		
		int zipCode = EmployeeData.zipcode(id);
		System.out.println(zipCode);
		employee.setZipCode(zipCode);
		
		String telephone = EmployeeData.telephone(id);
		System.out.println(telephone);
		employee.setPhoneNumber(telephone);
		
		String state = EmployeeData.state(id);
		System.out.println(state);
		employee.setState(state);
		
		String city = EmployeeData.city(id);
		System.out.println(city);
		employee.setCity(city);
		
		String startDate = EmployeeData.startDate(id);
		System.out.println(startDate);
		employee.setStartDate(startDate);
		
		int hourlyRate = EmployeeData.hourlyRate(id);
		System.out.println(hourlyRate);
		employee.setHourlyRate(hourlyRate);
		
		int ssn = EmployeeData.ssn(id);
		System.out.println(ssn);
		employee.setSsn(ssn);
		
		boolean status = EmployeeData.isManager(id);
		System.out.println(status);
		employee.setManagerStatus(status);
		
		return employee;
	}
	
	public static void AddEmployee(int SSN, java.sql.Date Date, int HourlyRate, char Position, String FirstName, String LastName, String Address, int ZipCode, String Telephone){
		EmployeeData.AddEmployee(SSN, Date, HourlyRate, Position, FirstName,  LastName,  Address, ZipCode, Telephone);
	}
	
	public void deleteEmployee(int id){
		EmployeeData.DeleteEmployee(id);
	}
	
	public void EditName(int Id, String First, String Last){
		EmployeeData.EditFirstName(Id, First);
		EmployeeData.EditLastName(Id, Last);
	}
	
	public static void EditAddress(int Id, String Address){
		EmployeeData.EditAddress(Id, Address);
	}
	
	public static void EditZipCode(int Id, int ZipCode){
		EmployeeData.EditZipCode(Id, ZipCode);
	}
	
	public static void EditTelephone(int Id, String Telephone){
		EmployeeData.EditTelephone(Id, Telephone);
	}
	
	public static void EditSSN(int Id, int SSN){
		EmployeeData.EditSSN(Id, SSN);
	}
	
	
}
