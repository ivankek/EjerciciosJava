package ar.edu.unlam.pbii.grupo03;

public class Director extends Persona {

	private String PatenteCorporativa;

	public Director(Integer dni, String nombre, String PatenteCorporativa) {
		super(dni, nombre);
		this.PatenteCorporativa = PatenteCorporativa;

	}

	public String getPatenteCorporativa() {
		return PatenteCorporativa;
	}

	public void setPatenteCorporativa(String patenteCorporativa) {
		PatenteCorporativa = patenteCorporativa;
	}

	@Override
	public Double getPrecioDelProducto(Producto producto) {
		return null;
	}

}
