package ar.edu.unlam.pbii.grupo03;

public class Producto {

	private Integer Codigo;
	private String Descripcion;
	private Double Precio;

	public Producto(Integer codigo, String descripcion, Double precio) {
		super();
		Codigo = codigo;
		Descripcion = descripcion;
		Precio = precio;
	}

	public Integer getCodigo() {
		return Codigo;
	}

	public void setCodigo(Integer codigo) {
		Codigo = codigo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Double getPrecio() {
		return Precio;
	}

	public void setPrecio(Double pracio) {
		Precio = pracio;
	}

}
