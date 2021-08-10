package ar.edu.unlam.pb2.orquesta;

/**
 * El oboe es un instrumento musical de la familia viento madera, de taladro
 * c�nico, cuyo sonido se emite mediante la vibraci�n de una leng�eta doble que
 * hace de conducto para el soplo de aire.
 * 
 * El oboe est� afinado en do.
 */
public class Oboe extends InstrumentoDeViento implements Afinable{

	public String tocar() {
		return "Oboe.tocar()";
	}

	@Override
	public String afinar() {
		return "Oboe.afinar()";
	}

}
