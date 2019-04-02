package com.chema.entidades;

import com.chema.en.CategoriaVehiculo;
import com.chema.en.EstadoVehiculo;

public class Bicicleta extends Vehiculo{

	private boolean solucion;

	public Bicicleta(EstadoVehiculo estado, CategoriaVehiculo categoria, boolean solucion) {
		super(estado, categoria);
		this.solucion = solucion;
	}

	public boolean isSolucion() {
		return solucion;
	}

	public void setSolucion(boolean solucion) {
		this.solucion = solucion;
	}
	
}
