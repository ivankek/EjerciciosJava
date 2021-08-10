package ar.edu.unlam.pb2.ordenes;

import java.util.HashMap;
import java.util.Set;

/*
 * Mantiene una colecci�n de Productos, los cuales no pueden
 * estar duplicados. Adem�s, por cada Producto se desea mantener 
 * la cantidad del mismo en Stock,
 */
public class Catalogo {

	/*
	 * �Cu�l es la colecci�n adecuada?
	 */

	private HashMap<Producto, Integer> productos = new HashMap<Producto, Integer>();

	/*
	 * Agregar producto al cat�logo. No se permiten Productos duplicados. Criterio:
	 * n�mero de Producto.
	 */
	public Boolean agregarProducto(Producto producto, Integer cantidad) {
		productos.put(producto, cantidad);
		return true;

	}

	public HashMap<Producto, Integer> obtenerCatalogo() {

		return productos;

	}

	/*
	 * Remueve Producto del Cat�logo. Lanza una Excepci�n si el Producto no se
	 * encuentra en el Cat�logo.
	 */
	public Boolean quitarProducto(Producto producto) throws ProductoNoEncontradoException {

		if (productos.containsKey(producto)) {

			productos.remove(producto);
			return true;
		} else {

			throw new ProductoNoEncontradoException("No se encontr� el producto buscado");

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
