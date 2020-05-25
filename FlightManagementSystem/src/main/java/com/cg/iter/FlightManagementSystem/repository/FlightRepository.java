package com.cg.iter.FlightManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.iter.FlightManagementSystem.dto.Flight;


public interface FlightRepository extends JpaRepository<Flight, Long>
{
	@SuppressWarnings("unchecked")
	Flight save(Flight flight);

}
