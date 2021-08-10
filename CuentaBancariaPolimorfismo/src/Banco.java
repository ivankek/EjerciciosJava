import java.util.ArrayList;

public class Banco {

	ArrayList<CuentaBancaria> arrayCuenta = new ArrayList<>();

	public Banco() {

	}

	public boolean agregarCuenta(CuentaBancaria cuentaBancaria) {

		arrayCuenta.add(cuentaBancaria);
		return true;
	}

	public CuentaBancaria buscarCuenta(Integer cbu) {
		for (CuentaBancaria cuentaBancaria : arrayCuenta) {
			if (cuentaBancaria.getCbu().equals(cbu))
				return cuentaBancaria;

		}

		return null;
	}

	public boolean transferirACuenta(Integer cbuOrigen, Integer cbuDestino, Integer montoATranferir) {

		CuentaBancaria cuentaOrigen = buscarCuenta(cbuOrigen);
		CuentaBancaria cuentaDestino = buscarCuenta(cbuDestino);

		boolean extraccionExitosa = cuentaOrigen.extraer(montoATranferir);

		if (cuentaOrigen != null && cuentaDestino != null) {
			if (extraccionExitosa == true) {

				cuentaDestino.depositar(montoATranferir);
				return true;
			}
		}

		return false;
	}

	public ArrayList<CuentaBancaria> obtenerListadoDeCuentasDeUnCliente(long dni) {

		ArrayList<CuentaBancaria> cuentasCliente = new ArrayList<>();

		for (CuentaBancaria cuentaBancaria : arrayCuenta) {
			if (cuentaBancaria.getDni() == dni) {
				cuentasCliente.add(cuentaBancaria);
			}

		}

		return cuentasCliente;
	}

	public Integer obtenerCantDeCuentasDeUnCliente(long dni) {

		ArrayList<CuentaBancaria> cuentasCliente = new ArrayList<>();

		for (CuentaBancaria cuentaBancaria : arrayCuenta) {
			if (cuentaBancaria.getDni() == dni) {
				cuentasCliente.add(cuentaBancaria);
			}

		}

		return cuentasCliente.size();
	}

}
