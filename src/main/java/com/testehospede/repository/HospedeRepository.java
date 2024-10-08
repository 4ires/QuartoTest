package com.testehospede.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testehospede.entity.Hospede;

public interface HospedeRepository extends JpaRepository<Hospede, Long> {

}