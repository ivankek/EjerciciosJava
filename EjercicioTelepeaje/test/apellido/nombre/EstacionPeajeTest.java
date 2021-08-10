package apellido.nombre;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class EstacionPeajeTest {

	@Test
	public void queVericaQueSeCreanTodasCabinasEnUnaEstacionDePeaje() {

		Cabina cabina1 = new Cabina(1);
		Cabina cabina2 = new Cabina(2);
		Cabina cabina3 = new Cabina(3);
		Cabina cabina4 = new Cabina(4);

		EstacionDePeaje estacionDePeaje = new EstacionDePeaje();

		estacionDePeaje.agregarCabinas(cabina1);
		estacionDePeaje.agregarCabinas(cabina2);
		estacionDePeaje.agregarCabinas(cabina3);
		estacionDePeaje.agregarCabinas(cabina4);

		assertEquals(estacionDePeaje.getCantidadDeCabinas(), 4, 0);

	}

	@Test
	public void queQueObtieneListaDeCabinasOrdenaPorImporteDescendente() {

		EstacionDePeaje estacionPeaje = new EstacionDePeaje();
		Cabina cabina = new Cabina(1);
		Cabina cabina2 = new Cabina(2);
		Cabina cabina3 = new Cabina(3);
		Cabina cabina4 = new Cabina(4);
		Coche coche1 = new Coche("1");
		Coche coche2 = new Coche("2");
		Coche coche3 = new Coche("3");
		Coche coche4 = new Coche("4");
		Coche coche5 = new Coche("5");
		Coche coche6 = new Coche("6");
		estacionPeaje.agregarCabinas(cabina2);
		estacionPeaje.agregarCabinas(cabina3);
		estacionPeaje.agregarCabinas(cabina4);
		estacionPeaje.agregarCabinas(cabina);

		cabina.pagar(coche1);
		cabina.pagar(coche2);
		cabina.pagar(coche3);
		cabina2.pagar(coche4);
		cabina2.pagar(coche5);
		cabina4.pagar(coche6);

		assertEquals(4, estacionPeaje.getCantidadDeCabinas(), 0);
		assertEquals(300.0, cabina.getRecaudacion(), 0);
		assertEquals(200.0, cabina2.getRecaudacion(), 0);
		assertEquals(0.0, cabina3.getRecaudacion(), 0);
		assertEquals(100.0, cabina4.getRecaudacion(), 0);
		Orden orden = new Orden();
		estacionPeaje.otenerCabinasOrdenadaImporteDescendente(orden);

		Iterator<Cabina> it = estacionPeaje.otenerCabinasOrdenadaImporteDescendente(orden).iterator();
		Integer i = 1;

		while (it.hasNext()) {
			Cabina j = it.next();
			switch (i) {
			case 1:
				assertEquals(1, j.getNumero(), 0);
				i++;
				break;

			case 2:
				assertEquals(2, j.getNumero(), 0);
				i++;
				break;

			case 3:
				assertEquals(4, j.getNumero(), 0);
				i++;
				break;

			case 4:
				assertEquals(3, j.getNumero(), 0);

			}
		}

	}

}
