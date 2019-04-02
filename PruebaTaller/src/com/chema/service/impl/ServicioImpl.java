package com.chema.service.impl;

import com.chema.en.EstadoVehiculo;
import com.chema.entidades.Vehiculo;
import com.chema.service.Servicios;

public class ServicioImpl implements Servicios {

	@Override
	public void recibir(Vehiculo vehiculo) {
		vehiculo.setEstado(EstadoVehiculo.RECIBIDO);
		System.out.println(vehiculo.getEstado());
		
	}

	@Override
	public void reparar(Vehiculo vehiculo) {
		vehiculo.setEstado(EstadoVehiculo.REPARANDO);
		System.out.println(vehiculo.getEstado());
		
	}

	@Override
	public void entregar(Vehiculo vehiculo) {
		vehiculo.setEstado(EstadoVehiculo.ENTREGADO);
		System.out.println(vehiculo.getEstado());
		
	}

	

}
