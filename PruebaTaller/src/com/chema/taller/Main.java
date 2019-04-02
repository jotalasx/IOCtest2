package com.chema.taller;

import com.chema.en.CategoriaVehiculo;
import com.chema.entidades.Bicicleta;
import com.chema.service.Servicios;
import com.chema.service.impl.ServicioImpl;

public class Main {

	public static void main(String[] args) {
		
		Servicios servicios = new ServicioImpl();
		Bicicleta bicicleta = new Bicicleta(null, CategoriaVehiculo.BICICLETA, true);
		
		System.out.println("�Cu�l es el estado del veh�culo?");
		servicios.recibir(bicicleta);
		servicios.reparar(bicicleta);
		servicios.entregar(bicicleta);

	}

}
