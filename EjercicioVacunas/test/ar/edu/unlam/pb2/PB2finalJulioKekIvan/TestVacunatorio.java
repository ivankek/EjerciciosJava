package ar.edu.unlam.pb2.PB2finalJulioKekIvan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestVacunatorio {

	@Test
	public void queSePuedaCrearUnPaciente() {

		Paciente paciente = new Paciente("Ivan", "Kek", 122, false, false);

		assertEquals(122, paciente.getDni(), 0);

	}

	@Test
	public void queSePuedaVacunarUnPaciente() throws NoCovidVaccineException {

		Paciente paciente = new Paciente("Ivan", "Kek", 122, false, false);
		CentroVacunacion centro = new CentroVacunacion("Gorki grana");
		Vacuna vacuna = new PrimeraDosisVacunaCovid();

		centro.vacunarPaciente(paciente, vacuna);
		assertEquals(1, centro.getVacunacion().size());

	}

	@Test
	public void queUnPacienteEsteCompletamenteVacunado() throws NoCovidVaccineException {

		Paciente paciente = new Paciente("Ivan", "Kek", 122, false, false);
		CentroVacunacion centro = new CentroVacunacion("Gorki grana");
		Vacuna vacuna = new PrimeraDosisVacunaCovid();
		Vacuna vacuna2 = new SegundaDosisVacunaCovid();

		assertEquals(false, paciente.getVacunadoContraCovid());
		centro.vacunarPaciente(paciente, vacuna);
		centro.vacunarPaciente(paciente, vacuna2);

		assertEquals(1, centro.getVacunacion().size());
		assertEquals(true, paciente.getVacunadoContraCovid());
		assertEquals(1, centro.getVacunado().size(), 0);

	}

	@Test(expected = NoCovidVaccineException.class)
	public void queUnPacienteNoSePuedaAplicarLaSegundaDosisDeCovidSiNoTieneLaPrimera() throws NoCovidVaccineException {

		Paciente paciente = new Paciente("Ivan", "Kek", 122, false, false);
		CentroVacunacion centro = new CentroVacunacion("Gorki grana");
		Vacuna vacuna = new PrimeraDosisVacunaCovid();
		Vacuna vacuna2 = new SegundaDosisVacunaCovid();

		assertEquals(false, paciente.getVacunadoContraCovid());
		centro.vacunarPaciente(paciente, vacuna2);

		assertEquals(1, centro.getVacunacion().size());
		assertEquals(true, paciente.getVacunadoContraCovid());
		assertEquals(1, centro.getVacunado().size(), 0);

	}

	@Test(expected = NoMoreVaccineException.class)
	public void queUnPacienteNoSePuedaAplicarMasDeUnaVacuna() throws NoCovidVaccineException, NoMoreVaccineException {

		Paciente paciente = new Paciente("Ivan", "Kek", 122, false, false);
		CentroVacunacion centro = new CentroVacunacion("Gorki grana");
		Vacuna vacuna = new PrimeraDosisVacunaCovid();
		Vacuna vacuna2 = new SegundaDosisVacunaCovid();
		Vacuna vacuna3 = new VacunaHepatitisA();

		assertEquals(false, paciente.getVacunadoContraCovid());
		centro.vacunarPaciente(paciente, vacuna);
		centro.vacunarPaciente(paciente, vacuna2);
		centro.vacunarPacienteHepatitis(paciente, vacuna);

	}

	public void queNoSePuedaVacunarUnPacienteEnfermoDeHepatitis() throws NoCovidVaccineException {

		Paciente paciente = new Paciente("Ivan", "Kek", 122, true, false);
		CentroVacunacion centro = new CentroVacunacion("Gorki grana");

		Vacuna vacuna3 = new VacunaHepatitisA();

		centro.vacunarPaciente(paciente, vacuna3);

		assertEquals(paciente.getHepatitisA(), false);

	}

}
