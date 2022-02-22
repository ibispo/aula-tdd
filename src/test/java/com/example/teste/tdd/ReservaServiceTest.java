package com.example.teste.tdd;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.teste.tdd.model.ReservaModel;
import com.example.teste.tdd.service.ReservaService;

@RunWith(SpringRunner.class)
public class ReservaServiceTest {

	/**
	 * Este bean só para o escopo de testes
	 * @author negol
	 *
	 */
	@TestConfiguration 
	static class ReservaServiceTestConfiguration {
		
		@Bean
		public ReservaService reservaService() {
			return new ReservaService();
		}
		
	}
	
	@Autowired
	ReservaService reservaService;
	
	@MockBean
	ReservaRepository reservaRepository;
	
	@Test
	public void CalculaDiasReservaTest() {

		String nm = "Bispo";
		int diasReserva = reservaService.getDiasBaseDados(nm);
		Assertions.assertEquals(diasReserva, 10);
		
	}
	
	@Before
	public void setup() {
		
		LocalDate dtCkIn = LocalDate.parse("2021-02-01"); 
		LocalDate dtCkOut = LocalDate.parse("2021-02-11");
		
		ReservaModel reservaModel = new ReservaModel("1", "Bispo", dtCkIn, dtCkOut, 2);
		
		Mockito.when( reservaRepository.findByNomeReserva(reservaModel.getNomeReserva()) )
			.thenReturn( java.util.Optional.of(reservaModel) );
		
		
	}
	
	
}
