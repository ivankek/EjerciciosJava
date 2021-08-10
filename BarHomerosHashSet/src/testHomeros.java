import static org.junit.Assert.*;

import org.junit.Test;

public class testHomeros {

	@Test
	public void testQueNoSePuedanAgregarDosClientesConElMismoNombre() {

		Bar barDeLosHomeros = new Bar("Bar de los homeros");

		Cliente cliente1 = new Cliente("Homero", 38);
		Cliente cliente2 = new Cliente("Homero", 38);

		barDeLosHomeros.agregarCliente(cliente1);
		barDeLosHomeros.agregarCliente(cliente2);
		Integer valorEsperado = 1;

		assertEquals(1, barDeLosHomeros.cantidaDeClientesEnElBar(), 0.0);

	}

}
