package com.testehospede.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testehospede.entity.Quarto;

public interface QuartoRepository  extends JpaRepository<Quarto, Long> {
}
