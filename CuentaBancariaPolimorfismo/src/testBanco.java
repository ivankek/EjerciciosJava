import static org.junit.Assert.*;

import org.junit.Test;

public class testBanco {

	@Test
	public void testQueSeAgregueUnaCuenta() {

		CuentaCorriente cuentaCorriente = new CuentaCorriente(42, "Roberto", "Carlos", 100, 11, 1);
		CuentaSueldo cuentaSueldo = new CuentaSueldo(42, "Roberto", "Carlos", 100, 11, 1);
		Banco banco = new Banco();

		assertTrue(banco.agregarCuenta(cuentaCorriente));
		assertTrue(banco.agregarCuenta(cuentaSueldo));

	}

	@Test
	public void testQueSeBusqueUnClienteEnArrayCuenta() {
		CuentaCorriente cuenta1 = new CuentaCorriente(42, "Roberto", "Carlos", 0.0, 11, 1);
		Banco banco1 = new Banco();

		banco1.agregarCuenta(cuenta1);

		assertNotNull(banco1.buscarCuenta(11));

		CuentaSueldo cuenta2 = new CuentaSueldo(42, "Roberto", "Carlos", 0.0, 12, 2);
		Banco banco2 = new Banco();

		banco2.agregarCuenta(cuenta2);

		assertNotNull(banco2.buscarCuenta(12));

	}

	@Test
	public void testTransferirEntreCuentas() {
		Banco banco = new Banco();
		CuentaCorriente cuenta1 = new CuentaCorriente(42, "Roberto", "Carlos", 0.0, 11, 1);
		CuentaSueldo cuenta2 = new CuentaSueldo(43, "Carlos", "Perez", 0.0, 12, 2);


		banco.agregarCuenta(cuenta1);
		cuenta1.depositar(200);
		banco.agregarCuenta(cuenta2);
		banco.transferirACuenta(11, 12, 200);

		assertEquals(cuenta1.getSaldo(), 0, 0);
		assertEquals(cuenta2.getSaldo(), 200, 0);

	}

	@Test
	public void testObtenerListadoDeClientes() {
		Banco banco = new Banco();
		Cliente cliente1 = new Cliente(42, "Roberto", "Carlos");
		CuentaCorriente cuenta1 = new CuentaCorriente(42, "Roberto", "Carlos", 0, 11, 1);
		CuentaSueldo cuenta2 = new CuentaSueldo(42, "Roberto", "Carlos", 0, 11, 1);

		banco.agregarCuenta(cuenta1);
		banco.agregarCuenta(cuenta2);
		banco.obtenerListadoDeCuentasDeUnCliente(11);
		assertEquals(banco.obtenerCantDeCuentasDeUnCliente(42), 2, 0);

	}

}