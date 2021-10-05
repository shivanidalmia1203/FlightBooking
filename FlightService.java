package com.example.FlightBooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
	
	
	@Autowired
	FlightRepository repository;
	
//	List<Flight> searchFlight(Flight flight) {
//		return repository.findBySourceOrDestinationOrStart_timeOrEnd_time(flight.getSource(), flight.getDestination(), flight.getStart_time(), flight.getEnd_time());
//	}



	public void save(Flight flight) {
		repository.save(flight);
		System.out.println("---------SAVED-------");
			
	
	}

}