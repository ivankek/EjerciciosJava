package ar.edu.unlam.pb2.PB2finalJulioKekIvan;

import java.util.HashSet;
import java.util.Set;

public class Paciente {

	private String nombre;
	private String apellido;
	private Integer dni;
	private Boolean primeraDosisCovid = false;
	private Boolean hepatitisA = false;
	private Boolean hepatitisB = false;
	private Boolean hepatitisC = false;
	private Boolean rubreola = false;
	private Boolean vacunadoContraCovid = false;
	private Boolean vacunadoContraHepatitis = false;
	private Boolean vacunadoContraRubreola = false;
	private Boolean enfermoDeHepatitis;
	private Boolean enfermoDeRubreola;

	public Paciente(String nombre, String apellido, Integer dni, Boolean enfermoDeHepatitis,
			Boolean enfermoDeRubreola) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.enfermoDeHepatitis = enfermoDeHepatitis;
		this.enfermoDeRubreola = enfermoDeRubreola;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Boolean getPrimeraDosisCovid() {
		return primeraDosisCovid;
	}

	public void setPrimeraDosisCovid(Boolean primeraDosisCovid) {
		this.primeraDosisCovid = primeraDosisCovid;
	}

	public Boolean getHepatitisA() {
		return hepatitisA;
	}

	public void setHepatitisA(Boolean hepatitisA) {
		this.hepatitisA = hepatitisA;
	}

	public Boolean getHepatitisB() {
		return hepatitisB;
	}

	public void setHepatitisB(Boolean hepatitisB) {
		this.hepatitisB = hepatitisB;
	}

	public Boolean getHepatitisC() {
		return hepatitisC;
	}

	public void setHepatitisC(Boolean hepatitisC) {
		this.hepatitisC = hepatitisC;
	}

	public Boolean getRubreola() {
		return rubreola;
	}

	public void setRubreola(Boolean rubreola) {
		this.rubreola = rubreola;
	}

	public Boolean getVacunadoContraCovid() {
		return vacunadoContraCovid;
	}

	public void setVacunadoContraCovid(Boolean vacunadoContraCovid) {
		this.vacunadoContraCovid = vacunadoContraCovid;
	}

	public Boolean getVacunadoContraHepatitis() {
		return vacunadoContraHepatitis;
	}

	public void setVacunadoContraHepatitis(Boolean vacunadoContraHepatitis) {
		this.vacunadoContraHepatitis = vacunadoContraHepatitis;
	}

	public Boolean getVacunadoContraRubreola() {
		return vacunadoContraRubreola;
	}

	public void setVacunadoContraRubreola(Boolean vacunadoContraRubreola) {
		this.vacunadoContraRubreola = vacunadoContraRubreola;
	}

	public Boolean getEnfermoDeHepatitis() {
		return enfermoDeHepatitis;
	}

	public void setEnfermoDeHepatitis(Boolean enfermoDeHepatitis) {
		this.enfermoDeHepatitis = enfermoDeHepatitis;
	}

	public Boolean getEnfermoDeRubreola() {
		return enfermoDeRubreola;
	}

	public void setEnfermoDeRubreola(Boolean enfermoDeRubreola) {
		this.enfermoDeRubreola = enfermoDeRubreola;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Paciente other = (Paciente) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	
	
}
