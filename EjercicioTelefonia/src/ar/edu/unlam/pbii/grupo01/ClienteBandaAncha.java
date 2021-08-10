package ar.edu.unlam.pbii.grupo01;

public class ClienteBandaAncha extends Cliente{

	private String EMail;
	
	public ClienteBandaAncha(Integer numeroDeCliente, String nombre, String EMail) {
		super(numeroDeCliente, nombre);
		this.EMail = EMail;
		
	}

	public String getEMail() {
		return EMail;
	}

	public void setEMail(String eMail) {
		EMail = eMail;
	}

	
}
