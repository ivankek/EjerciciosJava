package ar.edu.unlam.pbii.grupo02;

import static org.junit.Assert.assertEquals;

public class Tren extends Vehiculo {

	private Integer CantidadDeVagones;
	private Integer CantidadDePasajerosPorVagon;
	private Integer VelocidadMaxima;

	public Tren(Integer CantidadDeVagones, Integer CantidadDePasajerosPorVagon, Integer VelocidadMaxima, Double Latitud,
			Double Longitud) {
		super(Latitud, Longitud);
		this.CantidadDeVagones = CantidadDeVagones;
		this.CantidadDePasajerosPorVagon = CantidadDePasajerosPorVagon;
		this.VelocidadMaxima = VelocidadMaxima;

	}

	public Integer getCantidadDeVagones() {
		return CantidadDeVagones;
	}

	public void setCantidadDeVagones(Integer cantidadDeVagones) {
		CantidadDeVagones = cantidadDeVagones;
	}

	public Integer getCantidadDePasajerosPorVagon() {
		return CantidadDePasajerosPorVagon;
	}

	public void setCantidadDePasajerosPorVagon(Integer cantidadDePasajerosPorVagon) {
		CantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
	}

	public Integer getVelocidadMaxima() {
		return VelocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		VelocidadMaxima = velocidadMaxima;
	}

}