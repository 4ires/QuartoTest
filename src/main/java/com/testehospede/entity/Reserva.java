package com.testehospede.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reserva")
public class Reserva {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
		
	@ManyToOne
	@JoinColumn(name = "hospede_id", nullable = false)
	private Hospede hospede;
	
	@ManyToOne
	@JoinColumn(name = "quarto_id", nullable = false)
	private Quarto quarto;
	
	private LocalDate checkInData;
	private LocalDate checkOutData;
}
