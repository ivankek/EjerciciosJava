package ar.edu.unlam.pbii.grupo03;

public class Empleado extends Persona {

	public Empleado(Integer dni, String nombre) {
		super(dni, nombre);
	}

	public Double getPrecioDelProducto(Producto producto) {
		Double precioEmpleado = producto.getPrecio() - producto.getPrecio() * 0.2;

		return precioEmpleado;
	}

}
