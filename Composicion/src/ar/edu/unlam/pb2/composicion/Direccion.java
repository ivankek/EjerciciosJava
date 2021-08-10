package ar.edu.unlam.pb2.composicion;

public class Direccion {

	private String calle;
	private Integer numero;
	private Localidad localidad;

	public Direccion(String nombre, Integer numero, Localidad localidad) {
		
		this.calle=nombre;
		this.numero=numero;
		this.localidad=localidad;
		// TODO Auto-generated constructor stub
	}
	
	public Direccion (String calle, Integer numero, String nombreLocalidad, String nombrePartido) {
		Partido partido=new Partido(nombrePartido);
		this.localidad=new Localidad(nombreLocalidad, partido);
		this.calle=calle;
		this.numero=numero;
		
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String nombre) {
		this.calle = nombre;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	
}
