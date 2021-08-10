package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Vehiculo implements Terrestre, Acuatico {

	public Anfibio(Integer numero, String tipo) {
		super(numero, tipo);
	}

	@Override
	public Double getProfundidad() {
		return 0.0;
	}

	@Override
	public Double getVelocidad() {
		return 0.0;
	}

}
