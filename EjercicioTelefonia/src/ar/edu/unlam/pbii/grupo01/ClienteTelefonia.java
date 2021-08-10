package ar.edu.unlam.pbii.grupo01;

public class ClienteTelefonia extends Cliente{

	
	private String CodigoDeArea;
	private String Telefono;
	
	public ClienteTelefonia(Integer numeroDeCliente, String nombre, String CodigoDeArea, String Telefono) {
		super(numeroDeCliente, nombre);
		this.CodigoDeArea = CodigoDeArea;
		this.Telefono = Telefono;
	}

	public String getCodigoDeArea() {
		return CodigoDeArea;
	}

	public void setCodigoDeArea(String codigoDeArea) {
		CodigoDeArea = codigoDeArea;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	
	
	
	
	
}
