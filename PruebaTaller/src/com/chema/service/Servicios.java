package com.chema.service;

import com.chema.entidades.Vehiculo;

public interface Servicios {

	public void recibir(Vehiculo vehiculo);
	public void reparar(Vehiculo vehiculo);
	public void entregar(Vehiculo vehiculo);
}
