package com.crimsonlogic.busschedulingandbookingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
//@EnableGlobalMethodSecurity(prePostEnabled = true) 
public class BusSchedulingAndBookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusSchedulingAndBookingSystemApplication.class, args);
	}

}
