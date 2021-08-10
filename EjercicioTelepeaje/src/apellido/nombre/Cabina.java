package apellido.nombre;

import java.util.HashMap;

import java.util.Map;

public class Cabina {

	/*
	 * Fornato del Contador de vehiculo ejemplo Clave valor Moto 6 AutoBus 3 Moto 2
	 * 
	 */
	private Map<String, Integer> contadorDeVehiculos = new HashMap<String, Integer>();
	private Integer numero;

	/*
	 * 
	 */
	private Double tarifaCoche;
	private Double tarifaMoto;
	private Double tarifaAutoBus;

	/* recaudacion total de todos los vehiculos que pasaron por dicha cabina */
	private Double recaudacion;

	public Cabina(Integer numero) {
		this.numero = numero;
		this.recaudacion = 0.0;
		this.tarifaAutoBus = 200.0;
		this.tarifaCoche = 100.0;
		this.tarifaMoto = 50.0;

		// Completar la inicializacion de los atributos restantes

	}

	/*
	 * Este metodo realiza el cobro y acumula la recaudacion de la cabina en funcion
	 * al tipo de auto Tambien contabiliza la cantidad de vehiculo ejemplo si es
	 * moto aumenta en uno el contador de moto
	 */
	public void pagar(Vehiculo vehiculo) {

		contarVehiculo(vehiculo);

		if (vehiculo instanceof Coche) {

			setRecaudacion(getRecaudacion() + tarifaCoche);

		} else {

			if (vehiculo instanceof Moto) {

				setRecaudacion(getRecaudacion() + tarifaMoto);

			} else {

				if (vehiculo instanceof AutoBus) {

					setRecaudacion(getRecaudacion() + tarifaAutoBus);

				}

			}

		}

	}

	/*
	 * incrementa el contadorDeVehiculo
	 */
	private void contarVehiculo(Vehiculo vehiculo) {

		if (vehiculo instanceof Coche) {

			if (contadorDeVehiculos.containsKey(vehiculo.getTipo())) {

				contadorDeVehiculos.replace(vehiculo.getTipo(), contadorDeVehiculos.get(vehiculo.getTipo()) + 1);

			} else {

				contadorDeVehiculos.put(vehiculo.getTipo(), 1);

			}

		} else {

			if (vehiculo instanceof Moto) {

				if (contadorDeVehiculos.containsKey(vehiculo.getTipo())) {

					contadorDeVehiculos.replace(vehiculo.getTipo(), contadorDeVehiculos.get(vehiculo.getTipo()) + 1);

				} else {

					contadorDeVehiculos.put(vehiculo.getTipo(), 1);

				}

			} else {

				if (vehiculo instanceof AutoBus) {

					if (contadorDeVehiculos.containsKey(vehiculo.getTipo())) {

						contadorDeVehiculos.replace(vehiculo.getTipo(),
								contadorDeVehiculos.get(vehiculo.getTipo()) + 1);

					} else {

						contadorDeVehiculos.put(vehiculo.getTipo(), 1);

					}

				}

			}

		}

	}

	public Double getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(Double recaudacion) {
		this.recaudacion = recaudacion;
	}

	public Map<String, Integer> getContadorDeVehiculos() {
		return contadorDeVehiculos;
	}

	public void setContadorDeVehiculos(Map<String, Integer> contadorDeVehiculos) {
		this.contadorDeVehiculos = contadorDeVehiculos;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
