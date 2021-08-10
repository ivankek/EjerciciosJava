package ar.edu.unlam.pb2.eva03;

public class Avion extends Vehiculo implements Volador {

	public Avion(Integer numero, String tipo) {
		super(numero, tipo);
	}

	@Override
	public Double getAltura() {

		return 0.0;
	}

}
