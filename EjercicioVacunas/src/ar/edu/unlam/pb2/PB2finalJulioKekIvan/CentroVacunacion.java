package ar.edu.unlam.pb2.PB2finalJulioKekIvan;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CentroVacunacion {

	private String nombre;
	private Map<Paciente, Vacuna> vacunacion = new HashMap<Paciente, Vacuna>();
	private Set<Paciente> vacunado = new HashSet<Paciente>();

	public CentroVacunacion(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void vacunarPacienteHepatitis(Paciente paciente, Vacuna vacuna) throws NoMoreVaccineException {

		if (paciente.getVacunadoContraCovid() == false && paciente.getVacunadoContraRubreola() == false) {

			if (vacuna instanceof VacunaHepatitisA && paciente.getHepatitisA() == false) {

				vacunacion.put(paciente, vacuna);
				paciente.setHepatitisB(true);
				if (paciente.getHepatitisA() == true && paciente.getHepatitisB() == true
						&& paciente.getHepatitisC() == true)
					;

				paciente.setVacunadoContraHepatitis(true);

			} else {

				if (vacuna instanceof VacunaHepatitisB && paciente.getHepatitisB() == false) {

					vacunacion.put(paciente, vacuna);
					paciente.setHepatitisB(true);
					if (paciente.getHepatitisA() == true && paciente.getHepatitisB() == true
							&& paciente.getHepatitisC() == true)
						;

					paciente.setVacunadoContraHepatitis(true);

				} else {

					if (vacuna instanceof VacunaHepatitisC && paciente.getHepatitisC() == false) {

						vacunacion.put(paciente, vacuna);
						paciente.setHepatitisC(true);

						if (paciente.getHepatitisA() == true && paciente.getHepatitisB() == true
								&& paciente.getHepatitisC() == true)
							;

						paciente.setVacunadoContraHepatitis(true);

					}
				}

			}

		} else {

			throw new NoMoreVaccineException("Este paciente ya esta vacunado de otra cosa");

		}

	}

	public void vacunarPaciente(Paciente paciente, Vacuna vacuna) throws NoCovidVaccineException {

		if (paciente.getVacunadoContraCovid() == false) {

			if (paciente.getEnfermoDeHepatitis() == false)
				;
			if (vacuna instanceof PrimeraDosisVacunaCovid && paciente.getPrimeraDosisCovid() == false) {
				vacunacion.put(paciente, vacuna);
				paciente.setPrimeraDosisCovid(true);

			} else {

				if (vacuna instanceof SegundaDosisVacunaCovid && paciente.getPrimeraDosisCovid() == true) {

					vacunacion.replace(paciente, vacuna);
					paciente.setVacunadoContraCovid(true);
					vacunado.add(paciente);

				} else {

					throw new NoCovidVaccineException("No tiene aplicada la primera dosis");

				}

			}
		}

	}

	public void vacunarRubreola(Paciente paciente, Vacuna vacuna) throws NoMoreVaccineException {

		if (paciente.getEnfermoDeRubreola() == false)
			;

		if (paciente.getVacunadoContraCovid() == false && paciente.getVacunadoContraHepatitis() == false) {

			vacunacion.put(paciente, vacuna);
			paciente.setVacunadoContraRubreola(true);

		} else {

			throw new NoMoreVaccineException("Este paciente ya esta vacunado de otra cosa");
		}

	}

	public Map<Paciente, Vacuna> getVacunacion() {
		return vacunacion;
	}

	public void setVacunacion(Map<Paciente, Vacuna> vacunacion) {
		this.vacunacion = vacunacion;
	}

	public Boolean agregarPacienteVacunado(Paciente paciente) {

		return vacunado.add(paciente);

	}

	public Set<Paciente> getVacunado() {
		return vacunado;
	}

	public void setVacunado(Set<Paciente> vacunado) {
		this.vacunado = vacunado;
	}

	private TreeSet<Paciente> ordenarPacientesVacunadosPorDni(OrdenPorDni orden) {
		TreeSet<Paciente> pacientesOrdenados = new TreeSet<Paciente>(orden);
		pacientesOrdenados.addAll(vacunado);
		return pacientesOrdenados;
	}

}
