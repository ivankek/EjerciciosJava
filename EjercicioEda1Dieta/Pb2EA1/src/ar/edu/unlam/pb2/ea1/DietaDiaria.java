package ar.edu.unlam.pb2.ea1;

import java.util.HashSet;

public class DietaDiaria {

	/**
	 * No se permite repetir platos duarante todo el día.
	 */

	private String dia;
	private HashSet<Plato> dietaDiaria = new HashSet<Plato>();

	public DietaDiaria(String dia) {
		this.dia = dia;
	}

	public boolean agregarPlatoADieta(Plato plato) {
		
		return dietaDiaria.add(plato);
	}

	public Plato buscarPlatoEnDieta(String nombre) {
		Plato platoEncontrado = null;
		for (Plato plato : dietaDiaria) {
			if (plato.getNombreDePlato().equals(nombre)) {
				platoEncontrado = plato;
			}

		}

		return platoEncontrado;

	}

	private Integer totalDeSalEnDieta() {
		Integer cantSalEnDieta = 0;
		for (Plato plato : dietaDiaria) {

			cantSalEnDieta += plato.obtenerCantidadaDeSal();

		}

		return cantSalEnDieta;
	}

	private Integer totalDeAzucarEnDieta() {
		Integer cantAzucarEnDieta = 0;
		for (Plato plato : dietaDiaria) {

			cantAzucarEnDieta += plato.obtenerCantidadDeAzucar();

		}

		return cantAzucarEnDieta;
	}

	public Boolean aptaHipertenso() {
		if (totalDeSalEnDieta() < 4) {
			return true;
		}
		return false;

	}

	public Boolean aptaDiabetico() {
		if (totalDeAzucarEnDieta() <= 25) {
			return true;
		}
		return false;

	}

	public HashSet<Plato> getDietaDiaria() {
		return dietaDiaria;
	}

	public void setDietaDiaria(HashSet<Plato> dietaDiaria) {
		this.dietaDiaria = dietaDiaria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dietaDiaria == null) ? 0 : dietaDiaria.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DietaDiaria other = (DietaDiaria) obj;
		if (dietaDiaria == null) {
			if (other.dietaDiaria != null)
				return false;
		} else if (!dietaDiaria.equals(other.dietaDiaria))
			return false;
		return true;
	}

}
