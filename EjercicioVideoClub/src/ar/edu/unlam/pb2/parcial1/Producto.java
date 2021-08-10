package ar.edu.unlam.pb2.parcial1;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Estado;

public abstract class Producto extends Vendible{

	private Integer codigo;
	private String descripcion;
	private Estado estadoActual;
	private Cliente cliente;

	public Producto(Integer codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Estado getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(Estado estadoActual) {
		this.estadoActual = estadoActual;
	}

	public Cliente getQuienPoseeElProducto() {

		return cliente;

	}

	public void setClienteQuePoseeElProducto(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public abstract Double getPrecioVenta();

	@Override
	public abstract void setPrecioVenta(Double precioVenta);

}
