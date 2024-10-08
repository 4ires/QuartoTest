package com.testehospede.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MedicamentoTest {

	private Medicamento medicamento;
	
	@BeforeEach
	void setUp() {
		medicamento = new Medicamento(1L, "Dipirona", "Analgésico e antipirético", "01/12/2025");
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		//Act
		medicamento.setId(2L);
		//Assert
		assertEquals(2L, medicamento.getId());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNome() {
		//Act
		medicamento.setNome("Dipirona");
		//Assert
		assertEquals(2L, medicamento.getNome());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo bula")
	void testBula() {
		//Act
		medicamento.setBula("Analgésico e antipirético");
		//Assert
		assertEquals(2L, medicamento.getBula());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo data de validade")
	void testdataValidade() {
		//Act
		medicamento.setDataValidade("01/12/2025");
		//Assert
		assertEquals(2L, medicamento.getDataValidade());
	}
	
	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testConstrutorAll() {
		//Act
		Medicamento novoMedicamento = new Medicamento(3L, "Dipirona", "Analgésico e antipirético", "01/12/2025");
		//Assertion
		assertAll("novoMedicamento", 
				()-> assertEquals(3L, novoMedicamento.getId()),
				()-> assertEquals("Dipirona", novoMedicamento.getNome()),
				()-> assertEquals("Analgésico e antipirético", novoMedicamento.getBula()),
				()-> assertEquals("01/12/2025", novoMedicamento.getDataValidade()));
	}

}
