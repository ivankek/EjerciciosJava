package ar.edu.unlam.pbii.grupo02;

public class Auto extends Vehiculo {

	private String patente;
	private Integer cantidadMaximaDePasajeros;
	private Integer VelocidadMaxima;

	public Auto(Double Latitud, Double Longitud) {
		super(Latitud, Longitud);

	}

	public Auto(String patente, Integer cantidadMaximaDePasajeros, Integer velocidadMaxima, Double Latitud,
			Double Longitud) {
		super(Latitud, Longitud);
		this.patente = patente;
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
		VelocidadMaxima = velocidadMaxima;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getCantidadMaximaDePasajeros() {
		return cantidadMaximaDePasajeros;
	}

	public void setCantidadMaximaDePasajeros(Integer cantidadMaximaDePasajeros) {
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
	}

	public Integer getVelocidadMaxima() {
		return VelocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		VelocidadMaxima = velocidadMaxima;
	}

}