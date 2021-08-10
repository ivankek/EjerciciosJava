package ar.edu.unlam.pbii.grupo03;

public abstract class Persona {

	private Integer Dni;
	private String Nombre;

	public Persona(Integer dni, String nombre) {
		super();
		Dni = dni;
		Nombre = nombre;
	}

	public Integer getDni() {
		return Dni;
	}

	public void setDni(Integer dni) {
		Dni = dni;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public abstract Double getPrecioDelProducto(Producto producto);

}
