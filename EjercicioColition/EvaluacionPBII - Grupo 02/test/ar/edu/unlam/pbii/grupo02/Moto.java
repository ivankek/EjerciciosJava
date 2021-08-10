package ar.edu.unlam.pbii.grupo02;

import static org.junit.Assert.assertEquals;

public class Moto extends Vehiculo {

	private String patente;
	private Integer CANTIDAD_MAXIMA_DE_PASAJEROS;
	private Integer VelocidadMaxima;

	public Moto(Double Latitud, Double Longitud) {

		super(Latitud, Longitud);

	}

	public Moto(String patente, Integer velocidadMaxima, Double Latitud,
			Double Longitud) {
		super(Latitud, Longitud);
		this.patente = patente;
		this.CANTIDAD_MAXIMA_DE_PASAJEROS = 2;
		VelocidadMaxima = velocidadMaxima;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getCANTIDAD_MAXIMA_DE_PASAJEROS() {
		return CANTIDAD_MAXIMA_DE_PASAJEROS;
	}

	public void setCANTIDAD_MAXIMA_DE_PASAJEROS(Integer cANTIDAD_MAXIMA_DE_PASAJEROS) {
		CANTIDAD_MAXIMA_DE_PASAJEROS = cANTIDAD_MAXIMA_DE_PASAJEROS;
	}

	public Integer getVelocidadMaxima() {
		return VelocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		VelocidadMaxima = velocidadMaxima;
	}

}
