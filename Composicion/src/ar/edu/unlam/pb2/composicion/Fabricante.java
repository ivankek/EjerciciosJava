package ar.edu.unlam.pb2.composicion;

public class Fabricante {

	private String razonSocial;
	// private Director persona;
	private Persona persona;
	private Direccion direccion;

	public Fabricante(String razonSocial, Persona persona, Direccion direccion) {

		this.razonSocial = razonSocial;
		this.persona = persona;
		this.direccion = direccion;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

}
