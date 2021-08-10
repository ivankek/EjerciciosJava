package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PacienteTest {

	@Test
	public void testQueUnDiabeticoIngesteDietaAptaParaDiabetico() {
		Ingrediente i1 = new Ingrediente("Puré", 1, 2);
		Ingrediente i2 = new Ingrediente("Milanesas", 1, 2);
		Plato p1 = new Plato("Milanesas con puré");
		DietaDiaria d1 = new DietaDiaria("Dia1");
		Diabetico diabetico1 = new Diabetico("Josemir", "Lujambio", 42225291, 5);
		p1.agregarIngredienteAPlato(i1, 1);
		p1.agregarIngredienteAPlato(i2, 2);
		d1.agregarPlatoADieta(p1);
		d1.agregarPlatoADieta(p1);
		diabetico1.agregarDietaDiaria(d1);
		assertEquals(diabetico1.getIngesta().size(), 1);

	}

	@Test
	public void testQueUnDiabeticoNoIngesteDietaAptaParaDiabetico() {
		Ingrediente i1 = new Ingrediente("Puré", 1, 25);
		Ingrediente i2 = new Ingrediente("Milanesas", 1, 2);
		Plato p1 = new Plato("Milanesas con puré");
		DietaDiaria d1 = new DietaDiaria("Dia1");
		Diabetico diabetico1 = new Diabetico("Josemir", "Lujambio", 42225291, 5);
		p1.agregarIngredienteAPlato(i1, 1);
		p1.agregarIngredienteAPlato(i2, 2);
		d1.agregarPlatoADieta(p1);
		d1.agregarPlatoADieta(p1);
		diabetico1.agregarDietaDiaria(d1);
		assertEquals(diabetico1.getIngesta().size(), 0);

	}

	@Test
	public void testQueUnHipertendoIngesteDietaAptaParaHipertenso() {

		Ingrediente i1 = new Ingrediente("Puré", 1, 2);
		Ingrediente i2 = new Ingrediente("Milanesas", 1, 2);
		Plato p1 = new Plato("Milanesas con puré");
		DietaDiaria d1 = new DietaDiaria("Dia1");
		Hipertenso hipertenso1 = new Hipertenso("Josemir", "Lujambio", 42225291, 10, 29);
		p1.agregarIngredienteAPlato(i1, 1);
		p1.agregarIngredienteAPlato(i2, 2);
		d1.agregarPlatoADieta(p1);
		d1.agregarPlatoADieta(p1);
		hipertenso1.agregarDietaDiaria(d1);
		assertEquals(hipertenso1.getIngesta().size(), 1);

	}

	@Test
	public void testQueUnHipertendoNoIngesteDietaAptaParaHipertenso() {

		Ingrediente i1 = new Ingrediente("Puré", 4, 2);
		Ingrediente i2 = new Ingrediente("Milanesas", 2, 2);
		Plato p1 = new Plato("Milanesas con puré");
		DietaDiaria d1 = new DietaDiaria("Dia1");
		Hipertenso hipertenso1 = new Hipertenso("Josemir", "Lujambio", 42225291, 10, 29);
		p1.agregarIngredienteAPlato(i1, 1);
		p1.agregarIngredienteAPlato(i2, 2);
		d1.agregarPlatoADieta(p1);
		d1.agregarPlatoADieta(p1);
		hipertenso1.agregarDietaDiaria(d1);
		assertEquals(hipertenso1.getIngesta().size(), 0);
		
	}
}
