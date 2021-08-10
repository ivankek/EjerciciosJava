package ar.edu.unlam.pb2.ea3;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class EquipoDeFultbolTest {

	@Test
	public void queSePuedaCrearUnEquipoVacio() {
		EquipoDeFutbol estudiantes = new EquipoDeFutbol("Estudiantes De La Plata");
		assertEquals(0, estudiantes.getJugadores().size());
	}

	@Test
	public void queSePuedanAgregarJugadorAlEquipo() throws Exception {
		EquipoDeFutbol estudiantes = new EquipoDeFutbol("Estudiantes De La Plata");
		Jugador Veron = new Jugador(11, "Juan Sebastian", "Verón", 1000);

		estudiantes.agregarJugador(Veron);
		assertEquals(1, estudiantes.getCantidadJugadores(), 0);
	}

	@Test(expected = Exception.class)
	public void queAlIntentarAgregarUnJugadorExistenetLanceExcepcion() throws Exception {

		EquipoDeFutbol estudiantes = new EquipoDeFutbol("Estudiantes De La Plata");
		Jugador Veron = new Jugador(11, "Juan Sebastian", "Verón", 1000);

		estudiantes.agregarJugador(Veron);
		estudiantes.agregarJugador(Veron);

	}

	@Test(expected = Exception.class)
	public void queAlIntentarAgregarCantidadExcesivaDeJugadoresLanceExcepcion() throws Exception {

		EquipoDeFutbol estudiantes = new EquipoDeFutbol("Estudiantes De La Plata");
		Jugador Veron = new Jugador(11, "Juan Sebastian", "Verón", 10000);
		Jugador Lujambio = new Jugador(12, "Josemir", "Lujambio", 1000);
		Jugador Calderon = new Jugador(9, "Jose Luis", "Calderoón", 4000);
		Jugador Delorte = new Jugador(19, "Alejandro", "Delorte", 2000);
		Jugador Sosa = new Jugador(7, "Jose Ernesto", "Sosa", 6000);
		Jugador Desabato = new Jugador(2, "Leandro", "Desabato", 6000);
		Jugador Braña = new Jugador(22, "Rodrigo", "Braña", 8000);
		Jugador Pavone = new Jugador(16, "Mariano", "Pavone", 5000);
		Jugador Carrusca = new Jugador(23, "Marcelo", "Carrusca", 3000);
		Jugador Luguercio = new Jugador(8, "Pablo Ariel", "Luguercio", 4000);
		Jugador Gelabert = new Jugador(13, "Marcos", "Gelabert", 3000);
		Jugador Andujar = new Jugador(1, "Mariano", "Andujar", 7000);
		Jugador Damonte = new Jugador(5, "Israel", "Damonte", 3000);
		Jugador Alayes = new Jugador(6, "Agustin", "Alayes", 5000);
		Jugador Alvarez = new Jugador(3, "Pablo", "Alvarez", 2000);
		Jugador Casierra = new Jugador(15, "Juan", "Casierra", 3000);
		Jugador Boselli = new Jugador(17, "Mauro", "Boselli", 5000);
		Jugador Carrillo = new Jugador(14, "Guido", "Carrillo", 4000);
		Jugador Correa = new Jugador(21, "Joaquin", "Correa", 6000);
		Jugador Perez = new Jugador(18, "Enzo", "Perez", 8000);
		Jugador Fernandez = new Jugador(10, "Gaston", "Fernandez", 7000);
		Jugador Angeleri = new Jugador(4, "Marcos", "Angeleri", 4000);
		Jugador Cellay = new Jugador(20, "Christian", "Cellay", 3000);
		Jugador Schunke = new Jugador(24, "Jonathan", "Schunke", 1000);

		estudiantes.agregarJugador(Veron);
		estudiantes.agregarJugador(Lujambio);
		estudiantes.agregarJugador(Calderon);
		estudiantes.agregarJugador(Delorte);
		estudiantes.agregarJugador(Sosa);
		estudiantes.agregarJugador(Desabato);
		estudiantes.agregarJugador(Braña);
		estudiantes.agregarJugador(Pavone);
		estudiantes.agregarJugador(Carrusca);
		estudiantes.agregarJugador(Luguercio);
		estudiantes.agregarJugador(Gelabert);
		estudiantes.agregarJugador(Andujar);
		estudiantes.agregarJugador(Damonte);
		estudiantes.agregarJugador(Alayes);
		estudiantes.agregarJugador(Alvarez);
		estudiantes.agregarJugador(Casierra);
		estudiantes.agregarJugador(Boselli);
		estudiantes.agregarJugador(Carrillo);
		estudiantes.agregarJugador(Correa);
		estudiantes.agregarJugador(Perez);
		estudiantes.agregarJugador(Fernandez);
		estudiantes.agregarJugador(Angeleri);
		estudiantes.agregarJugador(Cellay);
		estudiantes.agregarJugador(Schunke);

	}

	@Test
	public void queSePuedaCambiarUnJugador() throws Exception {

		EquipoDeFutbol estudiantes = new EquipoDeFutbol("Estudiantes De La Plata");
		Jugador Veron = new Jugador(11, "Juan Sebastian", "Verón", 10000);
		Jugador Lujambio = new Jugador(12, "Josemir", "Lujambio", 1000);
		Jugador Calderon = new Jugador(9, "Jose Luis", "Calderoón", 4000);
		Jugador Delorte = new Jugador(19, "Alejandro", "Delorte", 2000);

		estudiantes.agregarJugador(Veron);
		estudiantes.agregarJugador(Lujambio);
		estudiantes.agregarJugador(Calderon);
		estudiantes.agregarJugador(Delorte);

		Jugador Giunta = new Jugador(5, "Blas", "Giunta", 5000);

		assertTrue(estudiantes.cambiarJugador(Lujambio, Giunta));
		assertNull(estudiantes.buscarJugador(Lujambio));
		assertNotNull(estudiantes.buscarJugador(Giunta));

	}

	@Test(expected = Exception.class)
	public void queAlCambiarUnJugadorInexistenteLanceExcepcion() throws Exception {

		EquipoDeFutbol estudiantes = new EquipoDeFutbol("Estudiantes De La Plata");
		Jugador Veron = new Jugador(11, "Juan Sebastian", "Verón", 10000);
		Jugador Lujambio = new Jugador(12, "Josemir", "Lujambio", 1000);
		Jugador Calderon = new Jugador(9, "Jose Luis", "Calderoón", 4000);
		Jugador Delorte = new Jugador(19, "Alejandro", "Delorte", 2000);

		estudiantes.agregarJugador(Veron);
		estudiantes.agregarJugador(Lujambio);
		estudiantes.agregarJugador(Calderon);
		estudiantes.agregarJugador(Delorte);

		assertEquals(4, estudiantes.getCantidadJugadores(), 0);

		Jugador jugadorInexistente = new Jugador(8, "Facundo", "Sanchez", 500);
		Jugador Giunta = new Jugador(5, "Blas", "Giunta", 5000);

		assertTrue(estudiantes.cambiarJugador(jugadorInexistente, Giunta));

	}

	@Test
	public void queElEquipoPresenteLosJugadoresOrdenadosPorNombre() throws Exception {
		// Lo ordené por apellido y nombre :)

		EquipoDeFutbol estudiantes = new EquipoDeFutbol("Estudiantes De La Plata");
		ordenPorNombre ordenPorApellidoYNombre = new ordenPorNombre();
		Jugador Veron = new Jugador(11, "Juan Sebastian", "Verón", 10000);
		Jugador Alayes = new Jugador(6, "Agustin", "Alayes", 5000);
		Jugador Cellay = new Jugador(20, "Christian", "Cellay", 3000);

		estudiantes.agregarJugador(Veron);
		estudiantes.agregarJugador(Alayes);
		estudiantes.agregarJugador(Cellay);

		estudiantes.setJugadores(estudiantes.devolverPlanteOrdenadoPorNombreDeJugador());

		Iterator<Jugador> it = estudiantes.getJugadores().iterator();
		Integer i = 1;

		while (it.hasNext()) {
			Jugador j = it.next();
			switch (i) {
			case 1:
				assertEquals("Alayes", j.getApellido());
				i++;
				break;

			case 2:
				assertEquals("Cellay", j.getApellido());
				i++;
				break;

			case 3:
				assertEquals("Verón", j.getApellido());
			}

		}

	}

	@Test
	public void queElEquipoPresenteLosJugadoresOrdenadosPorPrecioDeCompra() throws Exception {
		EquipoDeFutbol estudiantes = new EquipoDeFutbol("Estudiantes De La Plata");
		ordenPorPrecioCompra ordenPorPrecioCompra = new ar.edu.unlam.pb2.ea3.ordenPorPrecioCompra();
		Jugador Veron = new Jugador(11, "Juan Sebastian", "Verón", 10000);
		Jugador Alayes = new Jugador(6, "Agustin", "Alayes", 5000);
		Jugador Cellay = new Jugador(20, "Christian", "Cellay", 3000);

		estudiantes.agregarJugador(Veron);
		estudiantes.agregarJugador(Alayes);
		estudiantes.agregarJugador(Cellay);

		estudiantes.setJugadores(estudiantes.devolverPlanteOrdenadoPorPrecioDeCompraDeJugador());

		Iterator<Jugador> it = estudiantes.getJugadores().iterator();
		Integer i = 1;

		while (it.hasNext()) {
			Jugador j = it.next();
			switch (i) {
			case 1:
				assertEquals(3000, j.getPrecio(), 0.0);
				i++;
				break;

			case 2:
				assertEquals(5000, j.getPrecio(), 0.0);
				i++;
				break;

			case 3:
				assertEquals(10000, j.getPrecio(), 0.0);
				i++;
				break;
			}

		}

	}

	@Test
	public void queElEquipoPresenteLosJugadoresOrdenadosPorNumeroDeCamiseta() throws Exception {

		EquipoDeFutbol estudiantes = new EquipoDeFutbol("Estudiantes De La Plata");
		ordenPorNroCamiseta ordenPorNroCamiseta = new ordenPorNroCamiseta();
		Jugador Veron = new Jugador(11, "Juan Sebastian", "Verón", 10000);
		Jugador Alayes = new Jugador(6, "Agustin", "Alayes", 5000);
		Jugador Cellay = new Jugador(20, "Christian", "Cellay", 3000);

		estudiantes.agregarJugador(Veron);
		estudiantes.agregarJugador(Alayes);
		estudiantes.agregarJugador(Cellay);

		estudiantes.setJugadores(estudiantes.devolverPlanteOrdenadoPorNumeroDeCamisetaDeJugador());

		Iterator<Jugador> it = estudiantes.getJugadores().iterator();
		Integer i = 1;

		while (it.hasNext()) {
			Jugador j = it.next();
			switch (i) {
			case 1:
				assertEquals(6, j.getNumero(), 0.0);
				i++;
				break;

			case 2:
				assertEquals(11, j.getNumero(), 0.0);
				i++;
				break;

			case 3:
				assertEquals(20, j.getNumero(), 0.0);
				i++;
				break;
			}

		}

	}
}
