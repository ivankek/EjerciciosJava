package ar.edu.unlam.pbii.grupo01;

public class ClienteTri extends Cliente{

   
	private String CodigoDeArea;
	private String Telefono;
	private String CodigoDecodificador;
	private String EMail;
	
	public ClienteTri(Integer numeroDeCliente, String nombre, String CodigoDeArea, String Telefono, String CodigoDecodificador, String EMail) {
		super(numeroDeCliente, nombre);
		this.CodigoDeArea = CodigoDeArea;
		this.Telefono = Telefono;
		this.CodigoDecodificador = CodigoDecodificador;
		this.EMail = EMail;
	}

	public String getCodigoDeArea() {
		return CodigoDeArea;
	}

	public void setCodigoDeArea(String codigoDeArea) {
		CodigoDeArea = codigoDeArea;
	}

	public String getCodigoDecodificador() {
		return CodigoDecodificador;
	}

	public void setCodigoDecodificador(String codigoDecodificador) {
		CodigoDecodificador = codigoDecodificador;
	}

	public String getEMail() {
		return EMail;
	}

	public void setEMail(String eMail) {
		EMail = eMail;
	}
	
	
	
}
