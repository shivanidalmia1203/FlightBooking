package com.example.FlightBooking;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight , Integer> {

}
