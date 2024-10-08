package com.testehospede.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HospedeTest {

	private Hospede hospede;
	
	@BeforeEach
	void setUp() {
		hospede = new Hospede(1L, "Otavio Antonio", "otavio@gmail.com", "(00)0000-0000");
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		//Act
		hospede.setId(2L);
		//Assert
		assertEquals(2L, hospede.getId());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNome() {
		//Act
		hospede.setNome("Otavio Antonio");
		//Assert
		assertEquals(2L, hospede.getNome());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo e-mail")
	void testEmail() {
		//Act
		hospede.setEmail("otavio@gmail.com");
		//Assert
		assertEquals(2L, hospede.getEmail());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo telefone")
	void testTelefone() {
		//Act
		hospede.setTelefone("(00)0000-0000");
		//Assert
		assertEquals(2L, hospede.getTelefone());
	}
	
	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testConstrutorAll() {
		//Act
		Hospede novoHospede = new Hospede(3L, "Ana", "ana@gmail.com", "(55)5555-5555");
		//Assertion
		assertAll("novoHospede", 
				()-> assertEquals(3L, novoHospede.getId()),
				()-> assertEquals("Ana", novoHospede.getNome()),
				()-> assertEquals("ana@gmail.com", novoHospede.getEmail()),
				()-> assertEquals("(55)5555-5555", novoHospede.getTelefone()));
	}
}
