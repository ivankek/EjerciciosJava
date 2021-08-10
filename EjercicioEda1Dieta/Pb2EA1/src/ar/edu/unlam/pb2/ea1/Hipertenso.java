package ar.edu.unlam.pb2.ea1;

public class Hipertenso extends Paciente {

	private Integer presionMinima;
	private Integer presionMaxima;

	public Hipertenso(String nombre, String apellido, Integer dni, Integer presionMinima, Integer presionMaxima) {
		super(nombre, apellido, dni);
		this.presionMinima = presionMinima;
		this.presionMaxima = presionMaxima;
	}

	public Integer getPresionMinima() {
		return presionMinima;
	}

	public void setPresionMinima(Integer presionMinima) {
		this.presionMinima = presionMinima;
	}

	public Integer getPresionMaxima() {
		return presionMaxima;
	}

	public void setPresionMaxima(Integer presionMaxima) {
		this.presionMaxima = presionMaxima;
	}

	@Override
	public void agregarDietaDiaria(DietaDiaria dieta) {
		if (dieta.aptaHipertenso() == true) {
			getIngesta().add(dieta);
		}
	}

}
