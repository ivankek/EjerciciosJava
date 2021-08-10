package ar.edu.unlam.pb2.eva03;

public class Camion extends Vehiculo implements Terrestre{

	public Camion(Integer numero, String tipo) {
		super(numero, tipo);
	}

	@Override
	public Double getVelocidad() {
		return 0.0;
	}

}
