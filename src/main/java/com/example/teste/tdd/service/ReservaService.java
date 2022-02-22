package com.example.teste.tdd.service;

import java.time.Period;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teste.tdd.ReservaRepository;
import com.example.teste.tdd.model.ReservaModel;

@Service
public class ReservaService {

	@Autowired
	private ReservaRepository reservaRepository;  
	
	public int getDiasBaseDados(String nm) {
		Optional<ReservaModel> reservaModelOptional =  reservaRepository.findByNomeReserva(nm);
		return Period.between( reservaModelOptional.get().getDtCheckIn(), reservaModelOptional.get().getDtCheckOut() ).getDays();
	}


}
