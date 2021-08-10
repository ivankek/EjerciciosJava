package ar.edu.unlam.pbii.grupo03;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String NombreEmpresa;
	List<Persona> empresa = new ArrayList<Persona>();
	List<Producto> productos = new ArrayList<Producto>();

	public Empresa(String nombreEmpresa) {
		super();
		NombreEmpresa = nombreEmpresa;
	}

	public String getNombreEmpresa() {
		return NombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		NombreEmpresa = nombreEmpresa;
	}

	public Boolean buscarPersona(Persona persona) {
		Boolean seEncontro = false;
		for (Persona personaBuscar : empresa) {
			if (personaBuscar.getDni().equals(persona.getDni())) {
				seEncontro = true;
			}

		}

		return seEncontro;

	}

	public void vincularPersona(Persona persona) {
		if (buscarPersona(persona) == false) {
			empresa.add(persona);
		}
	}

	public Integer getCantidadDePersonasVinculadas() {
		return empresa.size();
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);

	}

	public Double registrarCompra(Persona persona, Producto producto)
			throws ConflictoDeInteresesException, ProductoNoEncontradoException {
		for (Persona personaBuscar : empresa) {
			if (personaBuscar.equals(persona)) {
				if (persona instanceof Director) {

					throw new ConflictoDeInteresesException("Un director no puede comprar productos de la empresa");

				}

				if (persona instanceof Empleado) {
					for (Producto productoBuscar : productos) {
						if (productoBuscar.equals(producto)) {
							return persona.getPrecioDelProducto(producto);
						}
						throw new ProductoNoEncontradoException("No se encontró el producto");
					}

				}

				else {
					for (Producto productoBuscar : productos) {
						if (productoBuscar.equals(producto)) {
							return persona.getPrecioDelProducto(producto);
						}
						throw new ProductoNoEncontradoException("No se encontró el producto");
					}
				}
			}

		}
		return null;
	}

}
