package ar.edu.unlam.pb2.ordenes;

/*
 * Es un tipo "especial" de Producto.
 */
public class ProductoDeLujo extends Producto {

	public ProductoDeLujo(Integer numero, String descripcion, Double precio) {
		super(numero, descripcion, precio);
	}

	/*
	 * Se le aplica el 21% y un 15% de impuesto adicional por derechos de
	 * importación.
	 */

	@Override
	public Double getImpuesto() {
		return this.getPrecio() * 0.21 + this.getPrecio() * 0.15;
	}

}
