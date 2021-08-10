package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {

	private String nombre;
	private Set<Deportista> socios = new HashSet<Deportista>();
	private Map<String, Evento> competencias = new HashMap<String, Evento>();
	private Map<Integer, Deportista> inscriptos = new HashMap<Integer, Deportista>();

	public Club(String nombre) {
		this.nombre = nombre;
	}

	public Boolean agregarDeportista(Deportista deportista) {

		return socios.add(deportista);

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Deportista> getSocios() {
		return socios;
	}

	public void setSocios(Set<Deportista> socios) {
		this.socios = socios;
	}

	public Map<String, Evento> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(Map<String, Evento> competencias) {
		this.competencias = competencias;
	}

	public Integer getCantidadSocios() {
		return socios.size();
	}

	public void crearEvento(TipoDeEvento tipoEvento, String nombreEvento) {

		competencias.put(nombreEvento, new Evento(tipoEvento, nombreEvento));

	}

	public Evento buscarEvento(String nombreEvento) {

		if (competencias.containsKey(nombreEvento)) {

			return competencias.get(nombreEvento);

		}

		else {

			return null;
		}
	}

	public Integer inscribirEnEvento(String nombreEvento, Deportista deportista) throws NoEstaPreparado {

		if (buscarEvento(nombreEvento).getTipo() == TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS
				&& deportista instanceof Nadador) {

			if (inscriptos.size() == 0) {

				inscriptos.put(1, deportista);
				buscarEvento(nombreEvento).setParticipantes(inscriptos);
				buscarEvento(nombreEvento).setNumeroDeInscripcion(inscriptos.size());

				return inscriptos.size();

			} else {

				inscriptos.put(inscriptos.size() + 1, deportista);
				buscarEvento(nombreEvento).setParticipantes(inscriptos);
				buscarEvento(nombreEvento).setNumeroDeInscripcion(inscriptos.size());
				return inscriptos.size();

			}

		} else {

			if (buscarEvento(nombreEvento).getTipo() == TipoDeEvento.CARRERA_42K && deportista instanceof Corredor) {

				if (inscriptos.size() == 0) {

					inscriptos.put(1, deportista);
					buscarEvento(nombreEvento).setParticipantes(inscriptos);
					buscarEvento(nombreEvento).setNumeroDeInscripcion(inscriptos.size());
					return inscriptos.size();

				} else {

					inscriptos.put(inscriptos.size() + 1, deportista);
					buscarEvento(nombreEvento).setParticipantes(inscriptos);
					buscarEvento(nombreEvento).setNumeroDeInscripcion(inscriptos.size());
					return inscriptos.size();

				}

			} else {

				if (buscarEvento(nombreEvento).getTipo() == TipoDeEvento.TRIATLON_IRONMAN
						&& deportista instanceof Triatleta) {

					if (inscriptos.size() == 0) {

						inscriptos.put(1, deportista);
						buscarEvento(nombreEvento).setParticipantes(inscriptos);
						buscarEvento(nombreEvento).setNumeroDeInscripcion(inscriptos.size());
						return inscriptos.size();

					} else {

						inscriptos.put(inscriptos.size() + 1, deportista);
						buscarEvento(nombreEvento).setParticipantes(inscriptos);
						buscarEvento(nombreEvento).setNumeroDeInscripcion(inscriptos.size());
						return inscriptos.size();

					}

				} else {

					throw new NoEstaPreparado("Este atleta no esta preparado para la competencia");

				}

			}

		}

	}

}
