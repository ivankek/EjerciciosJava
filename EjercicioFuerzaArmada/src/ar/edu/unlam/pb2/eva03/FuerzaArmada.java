package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FuerzaArmada {

	private Set<Vehiculo> convoy = new HashSet<Vehiculo>();
	private Map<String, Batalla> batallas = new HashMap<String, Batalla>();

	public Boolean agregarVehiculo(Vehiculo vehiculo) {

		return convoy.add(vehiculo);
	}

	public Integer getCapacidadDeDefensa() {
		return convoy.size();
	}

	public Boolean crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {

		batallas.put(nombre, new Batalla(convoy, tipo, latitud, longitud));

		return true;

	}

	public Batalla getBatalla(String nombre) {
		return batallas.get(nombre);
	}

	public Vehiculo buscarVehiculo(Integer numeroVehiculo) {

		Vehiculo vehiculo = null;

		for (Vehiculo vehiculoBuscar : convoy) {

			if (vehiculoBuscar.getNumero().equals(numeroVehiculo)) {

				vehiculo = vehiculoBuscar;
			}

		}

		return vehiculo;

	}

	public Boolean enviarALaBatalla(String nombreBatalla, Integer numeroVehiculo)
			throws VehiculoIncompatible, VehiculoInexistente {

		if (buscarVehiculo(numeroVehiculo) != null) {

			if (batallas.get(nombreBatalla).getTipo() == TipoDeBatalla.TERRESTRE
					&& buscarVehiculo(numeroVehiculo) instanceof Terrestre) {
				return true;
			} else {

				if (batallas.get(nombreBatalla).getTipo() == TipoDeBatalla.NAVAL
						&& buscarVehiculo(numeroVehiculo) instanceof Acuatico) {

					return true;

				} else {

					throw new VehiculoIncompatible("Este vehiculo no es compatible para la batalla");
				}
			}

		}

		else {

			throw new VehiculoInexistente("Este vehiculo no existe");

		}
	}

}
