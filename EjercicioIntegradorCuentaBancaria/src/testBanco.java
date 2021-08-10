import static org.junit.Assert.*;

import org.junit.Test;

public class testBanco {

	@Test
	public void testQueSeAgregueUnaCuentaCorriente() {

		CuentaCorriente cuentacorriente = new CuentaCorriente(42, "Roberto", "Carlos", 100, 11, 1);
		Banco banco = new Banco();

		assertTrue(banco.agregarCuentaCorriente(cuentacorriente));

	}

	@Test
	public void testQueSeAgregueUnaCuentaSueldo() {
		CuentaSueldo cuentasueldo = new CuentaSueldo(43, "Carlos", "Rodriguez", 100, 11, 2);
		Banco banco = new Banco();

		assertTrue(banco.agregarCuentaSueldo(cuentasueldo));

	}

	@Test
	public void testQueExtraigaDineroCuentaCorriente() {
		CuentaCorriente cuenta2 = new CuentaCorriente(42, "Roberto", "Carlos", 0.0, 11, 1);

		assertTrue(cuenta2.depositar(100));
		assertTrue(cuenta2.extraer(200));
		assertEquals(-105, cuenta2.getSaldo(), 0.0);
	}

	@Test
	public void testQueSeBusqueUnClienteEnArrayCuentaCorriente() {
		CuentaCorriente cuenta2 = new CuentaCorriente(42, "Roberto", "Carlos", 0.0, 11, 1);
		Banco banco = new Banco();

		banco.agregarCuentaCorriente(cuenta2);

		assertNotNull(banco.buscarCuentaCorriente(11));

	}

	@Test
	public void testQueSeBusqueUnClienteEnArrayCuentaSueldo() {
		CuentaSueldo cuentasueldo = new CuentaSueldo(43, "Carlos", "Rodriguez", 100, 11, 2);
		Banco banco = new Banco();

		banco.agregarCuentaSueldo(cuentasueldo);

		assertNotNull(banco.buscarCuentaSueldo(11));

	}

	@Test
	public void testTransferirEntreCuentasCorriente() {
		Banco banco = new Banco();
		CuentaCorriente cuenta1 = new CuentaCorriente(42, "Roberto", "Carlos", 0, 11, 1);
		CuentaCorriente cuenta2 = new CuentaCorriente(43, "Carlos", "Perez", 0.0, 12, 2);

		banco.agregarCuentaCorriente(cuenta1);
		banco.agregarCuentaCorriente(cuenta2);
		cuenta1.depositar(200);
		banco.transferirEnCuentasCorrientes(11, 12, 200);

		assertEquals(cuenta1.getSaldo(), 0, 0);
		assertEquals(cuenta2.getSaldo(), 200, 0);

	}

	@Test
	public void testTransferirEntreCuentasSueldo() {
		Banco banco = new Banco();
		CuentaSueldo cuenta1 = new CuentaSueldo(42, "Roberto", "Carlos", 0, 11, 1);
		CuentaSueldo cuenta2 = new CuentaSueldo(43, "Carlos", "Perez", 0.0, 12, 2);

		banco.agregarCuentaSueldo(cuenta1);
		banco.agregarCuentaSueldo(cuenta2);
		cuenta1.depositar(200);
		banco.transferirEnCuentaSueldo(11, 12, 200);

		assertEquals(cuenta1.getSaldo(), 0, 0);
		assertEquals(cuenta2.getSaldo(), 200, 0);

	}

	@Test
	public void testObtenerListadoDeClientes() {
		Banco banco = new Banco();
		Cliente cliente1 = new Cliente(42, "Roberto", "Carlos");
		CuentaCorriente cuenta1 = new CuentaCorriente(42, "Roberto", "Carlos", 0, 11, 1);
		CuentaSueldo cuenta2 = new CuentaSueldo(42, "Roberto", "Carlos", 0, 11, 1);

		banco.agregarCuentaCorriente(cuenta1);
		banco.agregarCuentaSueldo(cuenta2);
		banco.obtenerListadoDeCuentasDeUnCliente(11);
		assertEquals(banco.obtenerCantDeCuentasDeUnCliente(42), 2, 0);

	}

	@Test
	public void testCantidadDeCuentasEnElBanco() {

		Banco banco = new Banco();
		CuentaCorriente cuenta1 = new CuentaCorriente(42, "Roberto", "Carlos", 0, 11, 1);
		CuentaSueldo cuenta2 = new CuentaSueldo(43, "Hector", "Carlos", 0, 12, 2);
		CuentaCorriente cuenta3 = new CuentaCorriente(44, "Quique", "Carlos", 0, 13, 3);
		CuentaSueldo cuenta4 = new CuentaSueldo(45, "Rodolfo", "Carlos", 0, 14, 4);

		banco.agregarCuentaCorriente(cuenta1);
		banco.agregarCuentaSueldo(cuenta2);
		banco.agregarCuentaCorriente(cuenta3);
		banco.agregarCuentaSueldo(cuenta4);

		assertEquals(4, banco.cantidadDeCuentasDelBanco(), 0);

	}

}