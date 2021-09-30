package com.example.FlightBooking;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1.0/flight")

@RestController
public class UserController {
	
	@GetMapping("/ticket/{pnr}")
	void getBookedTicketDetails (@PathVariable String pnr)
	{
		System.out.println("************  Details  **************");
	}
	
	@GetMapping("/booking/history/{email}")
	void getHistory(@PathVariable String email)
	{
		System.out.println("******************   Booking History ****************");
	}
	
	@PostMapping("/booking/{flight_id}")
	void bookFlight(@PathVariable int flight_id)
	{
		System.out.println("************ Ticket Booking *********");
		System.out.println("Flight Id : " + flight_id);
	}
	
	@PostMapping("/serach")
	void searchFlights(@RequestBody User user)
	{
		System.out.println("Enter the details of the flight you want to search : ");
	}
	
	@DeleteMapping("/booking/cancel/{pnr}")
	void cancelTicket(@PathVariable String pnr)
	{
		System.out.println("Cancellation Window");
	}
	
	

}
