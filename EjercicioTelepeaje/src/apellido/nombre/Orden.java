package apellido.nombre;

import java.util.Comparator;

public class Orden implements Comparator<Cabina> {

	@Override
	public int compare(Cabina cabina1, Cabina cabina2) {

		return cabina2.getRecaudacion().compareTo(cabina1.getRecaudacion());

	}

}
