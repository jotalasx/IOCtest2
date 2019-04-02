package com.chema.entidades;

import com.chema.en.CategoriaVehiculo;
import com.chema.en.EstadoVehiculo;

public class Patinete extends Vehiculo{
	
	private boolean solucion;

	public Patinete(EstadoVehiculo estado, CategoriaVehiculo categoria, boolean solucion) {
		super(estado, categoria);
		this.solucion = solucion;
		// TODO Auto-generated constructor stub
	}

	public boolean isSolucion() {
		return solucion;
	}

	public void setSolucion(boolean solucion) {
		this.solucion = solucion;
	}

}
