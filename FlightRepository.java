package com.example.FlightBooking;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight , Integer> {
//	
//	List<Flight> findBySourceOrDestinationOrStart_timeOrEnd_time(String source, String destination,
//			String start_time, String end_time);
}

