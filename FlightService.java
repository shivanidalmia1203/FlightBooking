package com.example.FlightBooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	UserRepository userRepository;

	public void save(Flight flight) {
		flightRepository.save(flight);
		System.out.println("Flight  : " + flight);
	}

//	public List<Flight> SearchFlightByFlightId(int flight_id) {
//
//		List<Flight> listOfFlights = flightRepository.findAll();
//		List<Flight> newList = new ArrayList<>();
//		for (Flight f : listOfFlights) {
//			 
//			if (flight_id == f.getFlight_id())
//				newList.add(f);
//		}
//		return newList;
//	}
//	
//	public List<Flight> searchAllFlight()
//	{
//		List<Flight> allFlights = flightRepository.findAll();
//		return allFlights;
//	}
//	
//	public void SearchFlightByPnr (int pnr) {
//
//		List<BookedFlights>booked = userRepository.findAll();
//		
//		for(BookedFlights b: booked)
//		{
//			if (pnr == b.getPnr())
//			{
//				System.out.println("PNR : " + pnr + "Flight Id : " + b.getFlightId());
//			}
//		}
//	}

}