package ar.edu.unlam.pb2.ea3;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EquipoDeFutbol {
	private String nombre;
	private Set<Jugador> jugadores;

	public EquipoDeFutbol(String nombre) {
		this.nombre = nombre;
		this.jugadores = new TreeSet<Jugador>();
	}

	/*
	 * La capacidad máxima de un equipo es 23. Cualquier intento de agregar más
	 * jugadores generará una excepción (CapacidadMaximaException). Además, no
	 * deberá permitir duplicar Jugadores (JugadorDuplicadoException).
	 */
	public void agregarJugador(Jugador jugador) throws Exception {

		if (buscarJugador(jugador) != null) {

			throw new JugadorDuplicadoException("No se pueden agregar dos jugadores iguales a la lista");

		}

		if (jugadores.size() < 23) {
			jugadores.add(jugador);
		} else {
			throw new CapacidadMaximaException("No se pueden agregar más de 23 jugadores a la lista");
		}

	}

	public Jugador buscarJugador(Jugador jugador) {
		Jugador jugadorEncontrado = null;
		for (Jugador jugadorLista : jugadores) {
			if (jugadorLista.equals(jugador)) {

				jugadorEncontrado = jugador;
			}

		}
		return jugadorEncontrado;
	}

	/*
	 * Permite cambiar cualquier jugador. Un intento de cambiar un jugador no
	 * presente en el equipo generará una excepción (JugadoreInexistenteException).
	 */
	public Boolean cambiarJugador(Jugador saliente, Jugador entrante) throws JugadorInexistenteException {

		Jugador jugadorSaliente = buscarJugador(saliente);
		Boolean seCambio = false;
		if (buscarJugador(saliente) != null) {
			jugadores.remove(saliente);
			jugadores.add(entrante);
			seCambio = true;
		} else {
			throw new JugadorInexistenteException("No se encontró jugador para cambiar");

		}

		return seCambio;
	}

	public Integer getCantidadJugadores() {
		return jugadores.size();
	}

	public Set<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Set<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNombreDeJugador() {
		ordenPorNombre ordenPorNombre = new ordenPorNombre();
		TreeSet<Jugador> devolverPorOrdenApellidoYNombre = new TreeSet<>(ordenPorNombre);
		devolverPorOrdenApellidoYNombre.addAll(jugadores);
		return devolverPorOrdenApellidoYNombre;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorPrecioDeCompraDeJugador() {
		ordenPorPrecioCompra ordenPorPrecio = new ordenPorPrecioCompra();
		TreeSet<Jugador> devolverPorPrecioDeCompra = new TreeSet<>(ordenPorPrecio);
		devolverPorPrecioDeCompra.addAll(jugadores);
		return devolverPorPrecioDeCompra;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNumeroDeCamisetaDeJugador() {
		ordenPorNroCamiseta ordenPorCamiseta = new ordenPorNroCamiseta();
		TreeSet<Jugador> devolverPorNroCamiseta = new TreeSet<>(ordenPorCamiseta);
		devolverPorNroCamiseta.addAll(jugadores);
		return devolverPorNroCamiseta;
	}

	private TreeSet<Jugador> ordenarELPlantelParaDevolver(Comparator criterioDeOrdenacion) {
		TreeSet<Jugador> equipoOrdenado = new TreeSet<Jugador>(criterioDeOrdenacion);
		equipoOrdenado.addAll(jugadores);
		return equipoOrdenado;
	}
}
