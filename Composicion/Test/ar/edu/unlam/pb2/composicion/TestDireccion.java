package ar.edu.unlam.pb2.composicion;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDireccion {

	@Test
	public void testQueVerificaELPartidoDeUnaDireccion() {

		Partido partido = new Partido("moron");
		Localidad haedo = new Localidad("Haedo", partido);
		Direccion direccion = new Direccion("juan b Justo", 1000, haedo);

		assertEquals("moron", direccion.getLocalidad().getPartido().getNombre());

	}

	public void testQueVerificaLaLocalidadDeUnaDireccion() {
		Partido partido = new Partido("moron");
		Localidad haedo = new Localidad("Haedo", partido);
		Direccion direccion = new Direccion("juan b Justo", 1000, haedo);

		assertEquals("Haedo", direccion.getLocalidad().getNombre());
	}

	public void testQueVerificaLaDireccionDeUnAuto() {

		Partido partido = new Partido("moron");
		Localidad haedo = new Localidad("Haedo", partido);
		Direccion direccion = new Direccion("juan b Justo", 1000, haedo);
		Persona Ivan = new Persona("Ivan", "Kek");
		Auto FordKa = new Auto(Ivan, direccion);

		assertEquals("juan b Justo", FordKa.getDireccion().getCalle());

	}

	public void testQueVerificaElPropietarioDeUnAuto() {

		Partido partido = new Partido("moron");
		Localidad haedo = new Localidad("Haedo", partido);
		Direccion direccion = new Direccion("juan b Justo", 1000, haedo);
		Persona Ivan = new Persona("Ivan", "Kek");
		Auto FordKa = new Auto(Ivan, direccion);

		assertEquals("Ivan", FordKa.getPersona().getNombre());

	}

	public void testQueVerificaElDirectorFabricante() {

		Partido partido = new Partido("moron");
		Localidad haedo = new Localidad("Haedo", partido);
		Direccion direccion = new Direccion("juan b Justo", 1000, haedo);
		Persona Ivan = new Persona("Ivan", "Kek");
		Fabricante Adidas = new Fabricante("Marca de ropa", Ivan, direccion);

		assertEquals("Ivan", Adidas.getPersona().getNombre());

	}

	public void testQueVerificaLaDireccionDeUnFabricante() {

		Partido partido = new Partido("moron");
		Localidad haedo = new Localidad("Haedo", partido);
		Direccion direccion = new Direccion("juan b Justo", 1000, haedo);
		Persona Ivan = new Persona("Ivan", "Kek");
		Fabricante Adidas = new Fabricante("Marca de ropa", Ivan, direccion);

		assertEquals("juan b Justo", Adidas.getDireccion().getCalle());

	}

	public void testQueVerificaElNombreDeUnaPersona() {

		Persona Ivan = new Persona("Ivan", "Kek");

		assertEquals("Ivan", Ivan.getNombre());

	}

}
