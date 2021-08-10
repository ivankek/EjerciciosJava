import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	@Test
	public void testQueSePuedaDividirPor0() {

		Calculadora c1 = new Calculadora(8.0, 4.0);

		assertEquals(2.0, c1.dividir(), 0);

	}

	@Test
	public void testQueNoSePuedaDividirPor0() {

	}

}
