package com.crimsonlogic.busschedulingandbookingsystem.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table(name = "cancelllation_info")
public class Cancellation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cancellationID;

	private LocalDate cancellationDate;

	private Double refundAmount;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bookingId_fk")
	private Booking booking;

}
