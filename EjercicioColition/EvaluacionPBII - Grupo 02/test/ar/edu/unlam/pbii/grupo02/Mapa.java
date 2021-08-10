package ar.edu.unlam.pbii.grupo02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Mapa {

	private String Ciudad;
	private HashSet<Vehiculo> mapa;

	public Mapa(String Ciudad) {

		this.Ciudad = Ciudad;
		this.mapa = new HashSet<Vehiculo>();

	}

	public void agregarVehiculo(Vehiculo vehiculo) throws ColitionException {

		if (this.mapa.contains(vehiculo)) {
			throw new ColitionException("No se puede agregar vehiculos iguales");
		} else {
			this.mapa.add(vehiculo);
		}

	}

	public Boolean hayCoalicion() throws ColitionException {
		for (Vehiculo i : mapa) {

			for (Vehiculo j : mapa) {

				if (!i.equals(j)) {

					if (i.getLatitud().equals(j.getLatitud()) && i.getLongitud().equals(j.getLongitud())) {
						throw new ColitionException("Hay coalicion");

					} else {

						return false;
					}

				}

			}

		}
		return false;
	}

	public Integer getCantidadDeVehiculos() {
		return mapa.size();
	}

}
