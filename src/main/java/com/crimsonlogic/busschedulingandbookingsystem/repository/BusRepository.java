package com.crimsonlogic.busschedulingandbookingsystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crimsonlogic.busschedulingandbookingsystem.entity.Bus;

@Repository
public interface  BusRepository extends JpaRepository<Bus, Integer>{
	

}


