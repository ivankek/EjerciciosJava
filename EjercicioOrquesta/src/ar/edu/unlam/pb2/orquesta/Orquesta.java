package ar.edu.unlam.pb2.orquesta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Orquesta {
	Banyo banyo;
	Laud laud;
	Instrumento instrumento;
	private List<Instrumento> instrumentos = new ArrayList<>();
	private List<Instrumento> instrumentosDeCuerdas = new ArrayList<>();
	private List<Instrumento> instrumentosDeViento = new ArrayList<>();

	public Orquesta() {

	}

	public void agregarInstrumento(Instrumento instrumento) {

		instrumentos.add(instrumento);

		if (instrumento instanceof InstrumentoDeCuerdas) {

			instrumentosDeCuerdas.add(instrumento);

		}

		else {
			instrumentosDeViento.add(instrumento);

		}

	}

	public List<Instrumento> obtenerInstrumentosDeCuerdas() {

		return instrumentosDeCuerdas;
	}

	public List<Instrumento> obtenerInstrumentosDeViento() {
		return instrumentosDeViento;
	}

	public Integer tamañoInstrumentosDeCuerdas() {
		return instrumentosDeCuerdas.size();
	}

	public Integer tamañoInstrumentosDeViento() {
		return instrumentosDeViento.size();
	}

	public List<String> tocarVientos() {

		List<String> tocarVientos = new ArrayList<>();

		for (Instrumento instrumento : instrumentosDeViento) {
			if (instrumento instanceof InstrumentoDeViento) {

				tocarVientos.add(instrumento.tocar());

			}

		}

		return tocarVientos;

	}

	public List<String> tocarCuerdas() {

		List<String> tocarCuerdas = new ArrayList<>();

		for (Instrumento instrumento : instrumentosDeCuerdas) {
			if (instrumento instanceof InstrumentoDeCuerdas) {

				tocarCuerdas.add(instrumento.tocar());

			}

		}

		return tocarCuerdas;

	}

	public void tocar(Instrumento instrumento) {
		instrumento.tocar();

	}
}