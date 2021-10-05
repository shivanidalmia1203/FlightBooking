package com.example.FlightBooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1.0/flight")
@RestController
public class UserController{
	@Autowired
	UserService userService;
	
	@Autowired
	FlightService flightService;
	
	
	
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
	void searchFlights(@RequestBody Flight flight)
	{
		System.out.println("Enter the details of the flight you want to search : ");
//		 List<Flight> flights = flightService.searchFlight(flight);
//		 return flights;
		
	}
	
	@DeleteMapping("/booking/cancel/{pnr}")
	void cancelTicket(@PathVariable String pnr)
	{
		System.out.println("Cancellation Window");
	}
	

	@PostMapping ("/")
	int saveUser(@RequestBody User user ) {
		userService.Save(user);
		System.out.println("Details of Booking");
		System.out.println(" Name : "+ user.getName());
		System.out.println(" Email : "+ user.getEmail());
		System.out.println(" No. Of Tickets  : "+ user.getNoOfTickets());
		System.out.println(" Flight Id  : "+ user.getFlightId());
		System.out.println(" Gender : "+ user.getGender());
		System.out.println(" Age : "+ user.getAge());
	    int pnr = userService.generatePnr();
	    System.out.println("Pnr Controller : "+pnr);
		return pnr;
	}
	

}


