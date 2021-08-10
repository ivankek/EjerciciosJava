package ar.edu.unlam.pb2.composicion;

public class Localidad {
	
	private String nombre;
	private Partido partido;

	public Localidad(String nombre, Partido partido) {
		this.nombre=nombre;
		this.partido=partido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	

}
