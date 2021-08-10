package ar.edu.unlam.pb2.ordenes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CatalogoTest {

	@Test(expected = Exception.class)
	public void queQuitarProductoInexitenteLanceExcepcion() throws ProductoNoEncontradoException {

		Producto producto1 = new Producto(1, "alfajor", 50.0);
		Catalogo catalogo1 = new Catalogo();
		catalogo1.agregarProducto(producto1, 2);
		Producto producto2 = new Producto(2, "galletita", 20.0);

		catalogo1.quitarProducto(producto2);

	}

	@Test
	public void queAlRemoverStockLaCantidadEnExistenciaSeaCorrecta() {

		Producto producto1 = new Producto(1, "alfajor", 50.0);
		Catalogo catalogo1 = new Catalogo();
		catalogo1.agregarProducto(producto1, 50);
		Producto producto2 = new Producto(2, "galletita", 20.0);

		assertEquals(50, catalogo1.obtenerCantidad(producto1), 0);
		catalogo1.removerStock(producto1, 20);
		assertEquals(30, catalogo1.obtenerCantidad(producto1), 0);

		Producto producto3 = new Producto(1, "galletita", 20.0);
		catalogo1.agregarProducto(producto3, 10);
		assertEquals(1, catalogo1.obtenerCatalogo().size(), 0);

	}
}
