package ar.edu.unlam.pb2.ea3;

import java.util.Comparator;

public class ordenPorNombre implements Comparator<Jugador> {

	@Override
	public int compare(Jugador jugador1, Jugador jugador2) {

		if (jugador1.getApellido().compareTo(jugador2.getApellido()) == 0)
			return jugador1.getNombre().compareTo(jugador2.getNombre());
			return jugador1.getApellido().compareTo(jugador2.getApellido());
	}

}
