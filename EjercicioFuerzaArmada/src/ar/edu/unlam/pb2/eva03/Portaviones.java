package ar.edu.unlam.pb2.eva03;

public class Portaviones extends Vehiculo implements Acuatico{

	public Portaviones(Integer numero, String tipo){
		super(numero, tipo);
	}

	@Override
	public Double getProfundidad() {
		return 0.0;
	}

}
