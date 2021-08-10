import static org.junit.Assert.*;

import org.junit.Test;

public class testCajaDeAhorro {

	@Test
	public void testQueSePuedaDepositarDinero() {
		CajaDeAhorro cuenta2 = new CajaDeAhorro("Roberto", 0.0, 11);
		assertTrue(cuenta2.depositar(100));

	}

	@Test
	public void testQueSePuedaExtraerDinero() {
		CajaDeAhorro cuenta2 = new CajaDeAhorro("Roberto", 0.0, 11);
		assertTrue(cuenta2.depositar(100));
		assertTrue(cuenta2.extraer(10));
		assertEquals(90, cuenta2.getSaldo(), 0.0);
	}

	@Test
	public void testQueSeDigaCuantoDineroMeQueda() {
		CajaDeAhorro cuenta2 = new CajaDeAhorro("Roberto", 0.0, 11);
		assertTrue(cuenta2.depositar(100));
		assertTrue(cuenta2.extraer(10));
		assertTrue(cuenta2.extraer(10));
		assertTrue(cuenta2.extraer(10));
		assertTrue(cuenta2.extraer(10));
		assertTrue(cuenta2.extraer(10));
		assertTrue(cuenta2.extraer(10));
		assertEquals(34, cuenta2.getSaldo(), 0.0);

	}
}
