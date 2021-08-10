package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Vehiculo implements Volador, Acuatico{

	public HidroAvion(Integer numero, String tipo) {
		super(numero, tipo);
	}

	@Override
	public Double getProfundidad() {
		return 0.0;
	}

	@Override
	public Double getAltura() {
		return 0.0;
	}

}
