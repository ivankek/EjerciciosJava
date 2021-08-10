package ar.edu.unlam.pb2.orquesta;

public abstract class InstrumentoDeCuerdas extends Instrumento{
	
private Integer cantidadDeCuerdas;

public InstrumentoDeCuerdas(Integer cantidadDeCuerdas) {
	super();
	this.cantidadDeCuerdas = cantidadDeCuerdas;
}

public Integer getCantidadDeCuerdas() {
	return cantidadDeCuerdas;
}

public void setCantidadDeCuerdas(Integer cantidadDeCuerdas) {
	this.cantidadDeCuerdas = cantidadDeCuerdas;
}

public abstract String tocar();

}
