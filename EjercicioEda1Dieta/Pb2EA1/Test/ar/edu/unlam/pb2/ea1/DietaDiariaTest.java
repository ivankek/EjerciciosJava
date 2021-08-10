package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DietaDiariaTest {

	@Test
	public void testQueNosePuedanAgregarPlatoRepetidos() {
		Ingrediente i1 = new Ingrediente("Puré", 1, 2);
		Ingrediente i2 = new Ingrediente("Milanesas", 1, 0);
		Plato p1 = new Plato("Milanesas con puré");
		DietaDiaria d1 = new DietaDiaria("Dia1");

		p1.agregarIngredienteAPlato(i1, 1);
		p1.agregarIngredienteAPlato(i2, 2);
		d1.agregarPlatoADieta(p1);
		d1.agregarPlatoADieta(p1);
		assertEquals(1, d1.getDietaDiaria().size());
	}

	@Test
	public void testQueDietaDiariaSeaAptaHipertenso() {

		Ingrediente i1 = new Ingrediente("Puré", 1, 2);
		Ingrediente i2 = new Ingrediente("Milanesas", 1, 0);
		Plato p1 = new Plato("Milanesas con puré");
		DietaDiaria d1 = new DietaDiaria("Dia1");

		p1.agregarIngredienteAPlato(i1, 1);
		p1.agregarIngredienteAPlato(i2, 2);
		d1.agregarPlatoADieta(p1);
		assertTrue(d1.aptaHipertenso());
	}

	@Test
	public void testQueDietaDiariaNoSeaAptaHipertenso() {

		Ingrediente i1 = new Ingrediente("Puré", 1, 2);
		Ingrediente i2 = new Ingrediente("Milanesas", 4, 2);
		Plato p1 = new Plato("Milanesas con puré");
		DietaDiaria d1 = new DietaDiaria("Dia1");

		p1.agregarIngredienteAPlato(i1, 1);
		p1.agregarIngredienteAPlato(i2, 2);
		d1.agregarPlatoADieta(p1);
		assertFalse(d1.aptaHipertenso());

	}

	@Test
	public void testQueDietaDiariaSeaAptaDiabetico() {

		Ingrediente i1 = new Ingrediente("Puré", 1, 20);
		Ingrediente i2 = new Ingrediente("Milanesas", 4, 2);
		Plato p1 = new Plato("Milanesas con puré");
		DietaDiaria d1 = new DietaDiaria("Dia1");

		p1.agregarIngredienteAPlato(i1, 1);
		p1.agregarIngredienteAPlato(i2, 2);
		d1.agregarPlatoADieta(p1);
		assertTrue(d1.aptaDiabetico());

	}

	@Test
	public void testQueDietaDiariaNoSeaAptaDiabetico() {

		Ingrediente i1 = new Ingrediente("Puré", 1, 22);
		Ingrediente i2 = new Ingrediente("Milanesas", 4, 2);
		Plato p1 = new Plato("Milanesas con puré");
		DietaDiaria d1 = new DietaDiaria("Dia1");

		p1.agregarIngredienteAPlato(i1, 1);
		p1.agregarIngredienteAPlato(i2, 2);
		d1.agregarPlatoADieta(p1);
		assertFalse(d1.aptaDiabetico());

	}

}
