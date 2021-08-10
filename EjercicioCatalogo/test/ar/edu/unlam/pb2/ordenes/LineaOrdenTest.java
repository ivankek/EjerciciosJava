package ar.edu.unlam.pb2.ordenes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LineaOrdenTest {

	@Test
	public void queSePuedeCalcularElTotalPorDetalle() {

		Producto producto1 = new Producto(1, "alfajor", 50.0);
		LineaOrden linea = new LineaOrden(producto1, 5);

		assertEquals(302.5, linea.getSubtotal(), 0);

		Producto producto2 = new ProductoDeLujo(1, "Rocklets", 50.0);
		LineaOrden linea2 = new LineaOrden(producto2, 5);

		assertEquals(340.0, linea2.getSubtotal(), 0);

		Orden orden1 = new Orden();

		orden1.agregarLinea(linea);
		orden1.agregarLinea(linea2);

		assertEquals(642.5, orden1.obtenerPrecioTotal(), 0);

	}

}
