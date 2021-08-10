package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlatoTest {

	@Test
	public void testQueSePuedanAgregarIngredientesIguales(){
		Ingrediente i2 = new Ingrediente("Milanesas", 4, 2);
		Plato p1 = new Plato("Milanesas con puré");
		p1.agregarIngredienteAPlato(i2, 2);
		
		assertEquals(p1.getIngredientes().size(), 2);
	}
	
	@Test
	public void testQueSeObtengaLaCantidadDeSalCorrecta(){
		Ingrediente i2 = new Ingrediente("Milanesas", 4, 2);
		Plato p1 = new Plato("Milanesas con puré");
		p1.agregarIngredienteAPlato(i2, 2);
		
		assertEquals(p1.obtenerCantidadaDeSal(), 8, 0);
		
	}
	
	@Test
	public void testQueSeObtenegaLaCanidadDeAzucarCorrecta() {
		
		Ingrediente i2 = new Ingrediente("Milanesas", 4, 2);
		Plato p1 = new Plato("Milanesas con puré");
		p1.agregarIngredienteAPlato(i2, 2);
		
		assertEquals(p1.obtenerCantidadDeAzucar(), 4, 0);
		
	}
	
}
