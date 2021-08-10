package ar.edu.unlam.pb2.orquesta;

/**
 * El banjo o banyo​ es un instrumento musical de 4, 5, 6 o 10 cuerdas.
 * 
 * Es afinable.
 */
public class Banyo extends InstrumentoDeCuerdas implements Afinable {

	public Banyo() {
		super(5);
	}

	public String tocar() {
		return "Banyo.tocar()";
	}

	@Override
	public String afinar() {
		return "Banyo.afinar()";
	}

}
