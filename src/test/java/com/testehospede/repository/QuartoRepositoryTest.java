package com.testehospede.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.testehospede.entity.Quarto;

@DataJpaTest
class QuartoRepositoryTest {

	@Autowired
	private QuartoRepository quartoRepository;
	
	@DisplayName("Testando o Save")
	@Test
	void testSave() {
		
		//Given / Arrange
		Quarto quarto1 = new Quarto (null, "1", "suíte");
		
		//When /Act
		Quarto saveQuarto = quartoRepository.save(quarto1);
		
		//Then /Assert
		assertNotNull(saveQuarto);
		assertTrue(saveQuarto.getId() > 0);
	}
	
	@DisplayName("Testando o GetAll")
	@Test
	void testGetAll() {
		
		// Given / Arrange
		Quarto quarto1 = new Quarto(null, "1", "suíte");
		
		Quarto quarto2 = new Quarto(null, "2", "Casal");
		quartoRepository.save(quarto1);
		quartoRepository.save(quarto2);
		
		// When / Act 
		List<Quarto> quartoList = quartoRepository.findAll();
		
		// Then / Assert
		assertNotNull(quartoList);
		assertEquals(2,quartoList.size());
	}
	
	@DisplayName("Testando o Get by Id")
	@Test
	void testById() {
		
		// Given / Arrange 
		Quarto quarto1 = new Quarto(null, "1", "suíte");
		quartoRepository.save(quarto1);
		
		// When / Act
		Quarto saveQuarto = quartoRepository.findById(quarto1.getId()).get();
		
		// Then / Assert
		assertNotNull(saveQuarto);
		assertEquals(quarto1.getId(), saveQuarto.getId());
	}
	
	@DisplayName("Testando o Update")
	@Test
	void testUpdate(){
		
		// Given / Act
		Quarto quarto1 =new Quarto(null, "1", "suíte");
		quartoRepository.save(quarto1);
	
	// When / Act 
		Quarto saveQuarto = quartoRepository.findById(quarto1.getId()).get();
		quarto1.setNum("3");
		quarto1.setTipo("Duplo solteiro");
		
		Quarto updateQuarto = quartoRepository.save(saveQuarto);
		
		// Then / Assert
		assertNotNull(updateQuarto);
		assertEquals("3", updateQuarto.getNum());
	}
	
	@DisplayName("Testando o Delete")
	@Test
	void testDelete(){
		
		// Given / Act
		Quarto quarto1 =new Quarto(null, "2", "Casal");
		quartoRepository.save(quarto1);
	
		// When / Act 
		quartoRepository.deleteById(quarto1.getId());
	
		Optional<Quarto> quartoOptional = quartoRepository.findById(quarto1.getId());
		
		// Then / Assert
		assertTrue(quartoOptional.isEmpty());
	}
}
