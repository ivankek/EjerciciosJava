package ar.edu.unlam.pb2.orquesta;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class OrquestTest {
	@Test
	public void testQueTodosLosInstrumentosSePuedanTocar() {
		Banyo banyo = new Banyo();
		Flauta flauta = new Flauta();
		Laud laud = new Laud();
		Oboe oboe = new Oboe();
		Tuba tuba = new Tuba();
		Orquesta orquesta = new Orquesta();

		orquesta.tocar(banyo);
		orquesta.tocar(flauta);
		orquesta.tocar(laud);
		orquesta.tocar(oboe);
		orquesta.tocar(tuba);

		assertEquals("Banyo.tocar()", banyo.tocar());
		assertEquals("Flauta.tocar()", flauta.tocar());
		assertEquals("Laud.tocar()", laud.tocar());
		assertEquals("Oboe.tocar()", oboe.tocar());
		assertEquals("Tuba.tocar()", tuba.tocar());

	}

	@Test
	public void testQueUnAfinadorPuedaAfinarSoloAfinables() {

		Banyo banyo = new Banyo();
		Oboe oboe = new Oboe();

		banyo.afinar();
		oboe.afinar();

		assertEquals("Banyo.afinar()", banyo.afinar());
		assertEquals("Oboe.afinar()", oboe.afinar());

	}

	@Test
	public void testQueToquenLosInstrumentosDeViento() {

		Flauta flauta = new Flauta();
		Oboe oboe = new Oboe();
		Tuba tuba = new Tuba();
		Banyo banyo = new Banyo();
		Orquesta orquesta = new Orquesta();

		orquesta.agregarInstrumento(flauta);
		orquesta.agregarInstrumento(oboe);
		orquesta.agregarInstrumento(tuba);
		orquesta.agregarInstrumento(banyo);
		List<String> tocarLosDeViento = new ArrayList<>();
		tocarLosDeViento.add(flauta.tocar());
		tocarLosDeViento.add(oboe.tocar());
		tocarLosDeViento.add(tuba.tocar());

		assertEquals(tocarLosDeViento, orquesta.tocarVientos());

	}

	@Test
	public void testQueToquenLosInstrumentosDeCuerdas() {

		Banyo banyo = new Banyo();
		Laud laud = new Laud();
		Flauta flauta = new Flauta();
		Orquesta orquesta = new Orquesta();

		orquesta.agregarInstrumento(banyo);
		orquesta.agregarInstrumento(laud);
		orquesta.agregarInstrumento(flauta);
		List<String> tocarLosDeCuerdas = new ArrayList<>();

		tocarLosDeCuerdas.add(banyo.tocar());
		tocarLosDeCuerdas.add(laud.tocar());

		assertEquals(tocarLosDeCuerdas, orquesta.tocarCuerdas());

	}
}
