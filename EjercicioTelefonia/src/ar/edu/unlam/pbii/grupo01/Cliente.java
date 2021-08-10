package ar.edu.unlam.pbii.grupo01;

public class Cliente {

	private Integer numeroDeCliente;
	private String nombre;
	
	public Cliente(Integer numeroDeCliente, String nombre) {
		super();
		this.numeroDeCliente = numeroDeCliente;
		this.nombre = nombre;
	}

	public Integer getNumeroDeCliente() {
		return numeroDeCliente;
	}

	public void setNumeroDeCliente(Integer numeroDeCliente) {
		this.numeroDeCliente = numeroDeCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDeCliente == null) ? 0 : numeroDeCliente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (numeroDeCliente == null) {
			if (other.numeroDeCliente != null)
				return false;
		} else if (!numeroDeCliente.equals(other.numeroDeCliente))
			return false;
		return true;
	}

	
}
