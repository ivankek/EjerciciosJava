package ar.edu.unlam.pb2.PB2finalJulioKekIvan;

import java.util.Comparator;

public class OrdenPorDni implements Comparator<Paciente> {

	@Override
	public int compare(Paciente paciente1, Paciente paciente2) {

		return paciente2.getDni().compareTo(paciente1.getDni());

	}

}