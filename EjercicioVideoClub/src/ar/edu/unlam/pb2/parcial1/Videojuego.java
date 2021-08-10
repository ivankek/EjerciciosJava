package ar.edu.unlam.pb2.parcial1;

import ar.edu.unlam.pb2.parcial1.Enumeradores.TipoDeConsola;

public class Videojuego extends Alquilable {

	private TipoDeConsola tipo;
	private Double precioAlquiler;
	private Double precioVenta;

	public Videojuego(Integer codigo, String descripcion, TipoDeConsola tipo) {

		super(codigo, descripcion);
		this.tipo = tipo;

	}

	public TipoDeConsola getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeConsola tipo) {
		this.tipo = tipo;
	}

	@Override
	public Double getPrecioAlquiler() {
		return precioAlquiler;
	}

	@Override
	public void setPrecioAlquiler(Double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;

	}

	@Override
	public Double getPrecioVenta() {
		return precioVenta;
	}

	@Override
	public void setPrecioVenta(Double precioVenta) {

		this.precioVenta = precioVenta;

	}

}
