package ar.edu.unlam.pb2.ea1;

import java.util.ArrayList;

public class Plato {

	/**
	 * Por ejemplo, si para un Plato se necesitan DOS (2) tomates, se deberá agregar
	 * DOS(2) unidades de tomate.
	 */

	private String nombreDePlato;
	private Integer cantidadIngrediente;
	private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

	public Plato(String nombreDePlato) {
		this.nombreDePlato = nombreDePlato;
	}

	public String getNombreDePlato() {
		return nombreDePlato;
	}

	public void setNombreDePlato(String nombreDePlato) {
		this.nombreDePlato = nombreDePlato;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public boolean agregarIngredienteAPlato(Ingrediente ingrediente, Integer cantidadIngrediente) {
		for (int i = 0; i < cantidadIngrediente; i++) {
			ingredientes.add(ingrediente);
		}
			return true;
	}

	public Integer obtenerCantidadaDeSal() {
		Integer cantidadDeSalEnUnPlato = 0;
		for (Ingrediente ingrediente : ingredientes) {

			cantidadDeSalEnUnPlato += ingrediente.getCantidadSal();

		}

		return cantidadDeSalEnUnPlato;
	}

	public Integer obtenerCantidadDeAzucar() {
		Integer cantidadDeAzucarEnUnPlato = 0;
		for (Ingrediente ingrediente : ingredientes) {

			cantidadDeAzucarEnUnPlato += ingrediente.getCantidadAzucar();

		}

		return cantidadDeAzucarEnUnPlato;
	}

}
