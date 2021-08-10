package ar.edu.unlam.pb2.parcial1;

public class Comestible extends Producto {

	private Double precioVenta;

	public Comestible(Integer codigo, String descripcion) {

		super(codigo, descripcion);

	}

	@Override
	public void setPrecioVenta(Double precioVenta) {

		this.precioVenta = precioVenta;

	}

	@Override
	public Double getPrecioVenta() {
		return precioVenta;
	}

}
