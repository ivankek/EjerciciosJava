package ar.edu.unlam.pb2.ordenes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProductoTest {

	@Test
	public void queSePuedePedirImpuestoSobreProducto() {

		Producto producto1 = new Producto(1, "alfajor", 50.0);

		assertEquals(10.5, producto1.getImpuesto(), 0);
		assertEquals(60.5, producto1.getPrecioFinal(), 0);

	}

	@Test
	public void queSePuedePedirImpuestoSobreProductoDeLujo() {

		ProductoDeLujo producto1 = new ProductoDeLujo(1, "Huevo Kinder", 200.0);

		assertEquals(72, producto1.getImpuesto(), 0);
		assertEquals(272.0, producto1.getPrecioFinal(), 0);

	}

}
