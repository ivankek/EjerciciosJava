package ar.edu.unlam.pbii.grupo01;

import java.util.HashSet;

public class Empresa {

	private String nombreEmpresa;
	private ClienteCable clienteCable;
	HashSet<Cliente> clientes = new HashSet<>();
	
	public Empresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	public void agregarCliente(Cliente cliente) {
		
	 clientes.add(cliente);
		
	}
	
	
	public Integer getCantidadAbonados() {
		return clientes.size();
	}
	
	public boolean habilitarPremium(Premium premium, Cliente cliente) throws NoEsClienteConCableException {

			if(cliente instanceof ClienteCable) {
				
				if(premium.equals(Premium.FUTBOL)) {
					return true;
				}
	
	
		}
			else {
			
			throw new NoEsClienteConCableException("Usted no es un cliente con cable");
		}
	
			
			return false;
	

}
	
}