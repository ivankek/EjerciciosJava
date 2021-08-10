package ar.edu.unlam.pb2.ordenes;

import java.util.HashMap;
import java.util.Set;

/*
 * Mantiene una colección de Productos, los cuales no pueden
 * estar duplicados. Además, por cada Producto se desea mantener 
 * la cantidad del mismo en Stock,
 */
public class Catalogo {

	/*
	 * ¿Cuál es la colección adecuada?
	 */

	private HashMap<Producto, Integer> productos = new HashMap<Producto, Integer>();

	/*
	 * Agregar producto al catálogo. No se permiten Productos duplicados. Criterio:
	 * número de Producto.
	 */
	public Boolean agregarProducto(Producto producto, Integer cantidad) {
		productos.put(producto, cantidad);
		return true;

	}

	public HashMap<Producto, Integer> obtenerCatalogo() {

		return productos;

	}

	/*
	 * Remueve Producto del Catálogo. Lanza una Excepción si el Producto no se
	 * encuentra en el Catálogo.
	 */
	public Boolean quitarProducto(Producto producto) throws ProductoNoEncontradoException {

		if (productos.containsKey(producto)) {

			productos.remove(producto);
			return true;
		} else {

			throw new ProductoNoEncontradoException("No se encontró el producto buscado");

		}

	}

	/*
	 * Descuenta la cantidad deseada de producto del Stock.
	 */

	public Boolean removerStock(Producto producto, Integer cantidad) {

		Integer cantidadActual = productos.get(producto);

		Integer cantidadQueQuedaria = cantidadActual - cantidad;

		productos.replace(producto, cantidadQueQuedaria);
		return true;

	}

	/*
	 * Devuleve la cantidad de Productos en existencia.
	 */
	public Integer obtenerCantidad(Producto producto) {
		return productos.get(producto);
	}
}
