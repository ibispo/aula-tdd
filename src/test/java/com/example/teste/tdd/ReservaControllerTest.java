package com.example.teste.tdd;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ReservaControllerTest {

	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void getAllReservaTest() throws Exception {
		
		mockMvc.perform(get("/reservas"))
			.andExpect(status().isOk());
		
	}
	
}
