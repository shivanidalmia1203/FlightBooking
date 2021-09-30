package com.example.FlightBooking;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api/v1.0/flight")
public class AdminController {
	
	@PostMapping("/airline/register")
	void registerAirline(@RequestBody Airline airline)
	{
		System.out.println("Register a new Airline");
	}
	
	@PostMapping ("/admin/login")
	void adminLogin(@RequestBody Admin admin)
	{
		System.out.println("Enter Your Login Credentials : ");		
	}
	
	@PostMapping("/airline/inventory/add")
	void addInventory(@RequestBody User user)
	{
		System.out.println("********** Add Schedule ************");
	}
	

}
