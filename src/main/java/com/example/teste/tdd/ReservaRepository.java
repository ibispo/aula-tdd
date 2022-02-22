package com.example.teste.tdd;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.teste.tdd.model.ReservaModel;

public interface ReservaRepository extends JpaRepository<ReservaModel, String> {
	
	Optional<ReservaModel> findByNomeReserva(String nome); 
	

}
