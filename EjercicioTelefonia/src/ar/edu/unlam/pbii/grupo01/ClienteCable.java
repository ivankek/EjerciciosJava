package ar.edu.unlam.pbii.grupo01;

public class ClienteCable extends Cliente{

	private String CodigoDecodificador;
	
	public ClienteCable(Integer numeroDeCliente, String nombre, String CodigoDecodificador) {
		super(numeroDeCliente, nombre);
		this.CodigoDecodificador = CodigoDecodificador;
	}

	public String getCodigoDecodificador() {
		return CodigoDecodificador;
	}

	public void setCodigoDecodificador(String codigoDecodificador) {
		CodigoDecodificador = codigoDecodificador;
	}
	
	

}
