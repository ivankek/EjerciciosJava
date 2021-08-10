package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BooleanSupplier;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Estado;

public class Videoclub {

	private String nombre;
	private List<Producto> productos = new ArrayList<Producto>();
	private HashMap<Producto, Cliente> venta = new HashMap<Producto, Cliente>();
	private HashMap<Producto, Cliente> alquiler = new HashMap<Producto, Cliente>();

	public Videoclub(String nombre) {

		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean agregarProducto(Producto producto) {

		producto.setEstadoActual(Estado.DISPONIBLE);
		return productos.add(producto);

	}

	public Boolean vender(Producto producto, Cliente cliente) {

		if (producto.getEstadoActual() == Estado.VENDIDO) {

			return false;

		} else {
			venta.put(producto, cliente);
			producto.setEstadoActual(Estado.VENDIDO);
			producto.setClienteQuePoseeElProducto(cliente);
			return true;

		}
	}

	public Producto buscarProducto(Producto producto) {

		if (productos.contains(producto))
			;
		return producto;

	}

	public Boolean alquilar(Producto producto, Cliente cliente) {

		if (producto.getEstadoActual() == Estado.ALQUILADO) {

			return false;

		} else {

			if (producto instanceof Pelicula) {

				if (cliente.getEdad() < 18) {
					return false;

				} else {

					alquiler.put(producto, cliente);
					producto.setEstadoActual(Estado.ALQUILADO);
					producto.setClienteQuePoseeElProducto(cliente);
					return true;
				}

			}

			else {
				alquiler.put(producto, cliente);
				producto.setEstadoActual(Estado.ALQUILADO);
				producto.setClienteQuePoseeElProducto(cliente);
				return true;
			}
		}

	}

	public Boolean devolverProductoAlquilado(Producto producto, Cliente cliente) {

		if (producto.getEstadoActual() == Estado.ALQUILADO) {

			alquiler.remove(producto, cliente);
			producto.setEstadoActual(Estado.DISPONIBLE);
			producto.setClienteQuePoseeElProducto(null);
			return true;

		} else {

			return false;

		}

	}

}
