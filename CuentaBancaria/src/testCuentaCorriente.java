import static org.junit.Assert.*;

import org.junit.Test;

public class testCuentaCorriente {

	@Test
	public void testQueSePuedaDepositarDinero() {
		CuentaCorriente cuenta2 = new CuentaCorriente("Roberto", 0.0, 11);
		assertTrue(cuenta2.depositar(100));

	}

	@Test
	public void testQueSePuedaExtraerDinero() {
		CuentaCorriente cuenta2 = new CuentaCorriente("Roberto", 0.0, 11);
		assertTrue(cuenta2.depositar(100));
		assertTrue(cuenta2.extraer(200));

	}

	@Test
	public void testQueSeDigaCuantoDineroMeQueda() {
		CuentaCorriente cuenta2 = new CuentaCorriente("Roberto", 0.0, 11);

		assertTrue(cuenta2.depositar(100));
		assertTrue(cuenta2.extraer(200));
		assertEquals(-105, cuenta2.getSaldo(), 0.0);

	}
}
