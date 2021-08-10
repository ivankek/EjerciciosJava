package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Genero;

public class Pelicula extends Producto {

	private Genero genero;
	private Integer anoDeEstreno;
	private String director;
	private List<String> actores = new ArrayList<String>();
	private Double precioVenta;

	public Pelicula(Integer codigo, String descripcion, Genero genero, Integer anoDeEstreno, String director) {

		super(codigo, descripcion);
		this.genero = genero;
		this.anoDeEstreno = anoDeEstreno;
		this.director = director;

	}

	public Boolean agregarActor(String actor) {

		return actores.add(actor);

	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Integer getAnoDeEstreno() {
		return anoDeEstreno;
	}

	public void setAnoDeEstreno(Integer anoDeEstreno) {
		this.anoDeEstreno = anoDeEstreno;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public List<String> getActores() {
		return actores;
	}

	public void setActores(List<String> actores) {
		this.actores = actores;
	}

	public Boolean actua(String actor) {

		if (actores.contains(actor)) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public void setPrecioVenta(Double precioVenta) {

		this.precioVenta = precioVenta;

	}

	@Override
	public Double getPrecioVenta() {
		return precioVenta;
	}

}
