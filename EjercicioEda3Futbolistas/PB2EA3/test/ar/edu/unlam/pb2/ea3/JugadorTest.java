package ar.edu.unlam.pb2.ea3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JugadorTest {

	@Test
	public void queUnJugadorSeaIgualAOtroPorSuNombre() {
		Jugador Veron = new Jugador(11, "Juan Sebastian", "Verón", 10000);
		Jugador Veron1 = new Jugador(12, "Juan Sebastian", "Verón", 10000);

		assertEquals(Veron.getNombre(), Veron.getNombre());
	}
}
