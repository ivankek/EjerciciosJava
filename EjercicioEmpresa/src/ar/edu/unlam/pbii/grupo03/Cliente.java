package ar.edu.unlam.pbii.grupo03;

public class Cliente extends Persona {

	public Cliente(Integer dni, String nombre) {
		super(dni, nombre);
	}

	public Double getPrecioDelProducto(Producto producto) {
		return producto.getPrecio();
	}

}
