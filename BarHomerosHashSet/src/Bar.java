import java.util.HashSet;

public class Bar {

	private String nombre;
	private Integer cantidadDeClientes;

	public Bar(String nombre) {
		this.nombre = nombre;

	}

	HashSet<Cliente> bar = new HashSet<>();

	public Boolean agregarCliente(Cliente cliente) {

		return bar.add(cliente);

	}

	public HashSet<Cliente> getClientes() {
		return bar;
	}

	public Integer cantidaDeClientesEnElBar() {

		return bar.size();

	}

}
