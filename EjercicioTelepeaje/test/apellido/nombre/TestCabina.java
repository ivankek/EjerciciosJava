package apellido.nombre;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCabina {

	@Test
	public void queVerificaQueCuenteCorrectamenteLaCantidadDeVehiculosQuePaSanPorUnacabina() {

		Cabina cabina = new Cabina(1);
		Vehiculo vehiculo1 = new Coche("AB212");
		Vehiculo vehiculo2 = new Coche("AB213");
		Vehiculo vehiculo3 = new Coche("AB214");
		Vehiculo vehiculo4 = new Moto("AB215");
		Vehiculo vehiculo5 = new Moto("AB216");

		cabina.pagar(vehiculo1);
		cabina.pagar(vehiculo2);
		cabina.pagar(vehiculo3);
		cabina.pagar(vehiculo4);
		cabina.pagar(vehiculo4);

		assertEquals(cabina.getContadorDeVehiculos().get("Coche"), 3, 0);
		assertEquals(cabina.getContadorDeVehiculos().get("Moto"), 2, 0);

	}

	@Test
	public void queVerificaQueSeRecaudeCorrectaMenteElPagoDeUnVehiculo() {

		Cabina cabina = new Cabina(1);
		Vehiculo vehiculo1 = new Coche("AB212");
		Vehiculo vehiculo2 = new Coche("AB213");
		Vehiculo vehiculo3 = new Coche("AB214");
		Vehiculo vehiculo4 = new Moto("AB215");
		Vehiculo vehiculo5 = new Moto("AB216");

		cabina.pagar(vehiculo1);
		cabina.pagar(vehiculo2);
		cabina.pagar(vehiculo3);
		cabina.pagar(vehiculo4);
		cabina.pagar(vehiculo4);

		assertEquals(cabina.getRecaudacion(), 400.0, 0);

	}

}
