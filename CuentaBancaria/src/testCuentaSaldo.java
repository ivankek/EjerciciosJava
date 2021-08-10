import static org.junit.Assert.*;

import org.junit.Test;

public class testCuentaSaldo {

	@Test
	public void testQueSePuedaDepositarDinero() {
		CuentaSaldo cuenta1 = new CuentaSaldo("Roberto", 0.0, 11);
		assertTrue(cuenta1.depositar(100));

	}

	@Test
	public void testQueSePuedaExtraerDinero() {
		CuentaSaldo cuenta1 = new CuentaSaldo("Roberto", 0.0, 11);
		assertTrue(cuenta1.depositar(100));
		assertTrue(cuenta1.extraer(100));

	}

	@Test
	public void testQueSeDigaCuantoDineroMeQueda() {
		CuentaSaldo cuenta1 = new CuentaSaldo("Roberto", 0.0, 11);
		assertTrue(cuenta1.depositar(100));
		assertTrue(cuenta1.extraer(80));
		assertEquals(20, cuenta1.getSaldo(), 0.0);

	}

}
