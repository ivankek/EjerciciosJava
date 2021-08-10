package apellido.nombre;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EstacionDePeaje {

	private List<Cabina> cabinas = new ArrayList<Cabina>();

	private Integer cantidadDeCabinas;

	/*
	 * Al momento de la creacion de la estacion de peajes se deben crear todas las
	 * cabianas donde en la posicion 0 hay una cabina de Telepase y el resto de las
	 * cabinas son comunes
	 */

	// Metodo que agrega todas las cabinas (No Obligatorio)
	public void agregarCabinas(Cabina cabina) {
		cabinas.add(cabina);
		setCantidadDeCabinas(getCantidadDeCabinas() + 1);
	}

	/*
	 * obtiene todas un listado de cabinas ordenas por importe recaudado en forma
	 * descendete
	 */

	public Set<Cabina> otenerCabinasOrdenadaImporteDescendente(Orden orden) {

		TreeSet<Cabina> cabinasOrdenadas = new TreeSet<Cabina>(orden);
		cabinasOrdenadas.addAll(cabinas);

		return cabinasOrdenadas;

	}

	public Integer getCantidadDeCabinas() {
		if (cantidadDeCabinas == null) {

			return 0;

		}

		return cantidadDeCabinas;
	}

	public void setCantidadDeCabinas(Integer cantidadDeCabinas) {
		this.cantidadDeCabinas = cantidadDeCabinas;
	}

	public List<Cabina> getCabinas() {
		return cabinas;
	}

	public void setCabinas(List<Cabina> cabinas) {
		this.cabinas = cabinas;
	}

}
