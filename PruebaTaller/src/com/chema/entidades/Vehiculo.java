package com.chema.entidades;

import com.chema.en.CategoriaVehiculo;
import com.chema.en.EstadoVehiculo;

public class Vehiculo {
	
	private EstadoVehiculo estado;
	private CategoriaVehiculo categoria;
	public Vehiculo(EstadoVehiculo estado, CategoriaVehiculo categoria) {
		super();
		this.estado = estado;
		this.categoria = categoria;
	}
	public EstadoVehiculo getEstado() {
		return estado;
	}
	public void setEstado(EstadoVehiculo estado) {
		this.estado = estado;
	}
	public CategoriaVehiculo getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaVehiculo categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Vehiculo [estado=" + estado + ", categoria=" + categoria + "]";
	}
	
	

}
