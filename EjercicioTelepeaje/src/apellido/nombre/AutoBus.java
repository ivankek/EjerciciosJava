package apellido.nombre;

public class AutoBus extends Vehiculo {

	private Tag tag;

	public AutoBus(String patente, Tag tag) {
		super(patente);
		this.tag = tag;

	}

	@Override
	public String getTipo() {
		return "AutoBus";
	}

	public void recargarTag(Double montoAAgregar) {

		tag.setSaldo(montoAAgregar);

	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

}
