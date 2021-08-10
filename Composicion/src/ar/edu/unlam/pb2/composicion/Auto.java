package ar.edu.unlam.pb2.composicion;

public class Auto {

	private Persona persona;
	// private Radicacion direccion;
	private Direccion direccion;

	public Auto(Persona persona, Direccion direccion) {
		this.persona = persona;
		this.direccion = direccion;
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
