package com.example.teste.tdd.model;

import java.time.LocalDate;
import java.util.Objects;

public class ReservaModel {

	private String id;
	private String nomeReserva;
	private LocalDate dtCheckIn;
	private LocalDate dtCheckOut;
	private Integer nroConvidados;
	
	public ReservaModel(String id, String nomeReserva, LocalDate dtCheckIn, LocalDate dtCheckOut,
			Integer nroConvidados) {
		super();
		this.id = id;
		this.nomeReserva = nomeReserva;
		this.dtCheckIn = dtCheckIn;
		this.dtCheckOut = dtCheckOut;
		this.nroConvidados = nroConvidados;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomeReserva() {
		return nomeReserva;
	}
	public void setNomeReserva(String nomeReserva) {
		this.nomeReserva = nomeReserva;
	}
	public LocalDate getDtCheckIn() {
		return dtCheckIn;
	}
	public void setDtCheckIn(LocalDate dtCheckIn) {
		this.dtCheckIn = dtCheckIn;
	}
	public LocalDate getDtCheckOut() {
		return dtCheckOut;
	}
	public void setDtCheckOut(LocalDate dtCheckOut) {
		this.dtCheckOut = dtCheckOut;
	}
	public Integer getNroConvidados() {
		return nroConvidados;
	}
	public void setNroConvidados(Integer nroConvidados) {
		this.nroConvidados = nroConvidados;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReservaModel other = (ReservaModel) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
