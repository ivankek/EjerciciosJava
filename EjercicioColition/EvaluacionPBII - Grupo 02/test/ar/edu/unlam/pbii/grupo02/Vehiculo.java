package ar.edu.unlam.pbii.grupo02;

public class Vehiculo {

	private Double Latitud;
	private Double Longitud;

	public Vehiculo(Double Latitud, Double Longitud) {

		this.Latitud = Latitud;
		this.Longitud = Longitud;

	}

	public Double getLatitud() {
		return Latitud;
	}

	public void setLatitud(Double latitud) {
		Latitud = latitud;
	}

	public Double getLongitud() {
		return Longitud;
	}

	public void setLongitud(Double longitud) {
		Longitud = longitud;
	}

	public void actualizarCoordenadas(Double latitud, Double longitud) {
		Latitud = latitud;
		Longitud = longitud;
	}

}
