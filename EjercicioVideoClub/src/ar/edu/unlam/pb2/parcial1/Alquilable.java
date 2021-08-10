package ar.edu.unlam.pb2.parcial1;

public abstract class Alquilable extends Producto {

	public Alquilable(Integer codigo, String descripcion) {
		super(codigo, descripcion);
	}

	private Double precioAlquiler;

	public abstract Double getPrecioAlquiler();

	public abstract void setPrecioAlquiler(Double precioAlquiler);

}
