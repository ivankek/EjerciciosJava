import java.util.ArrayList;

public class Banco {

//	CuentaCorriente cuentacorriente;
//	CuentaSueldo cuentasueldo;
	ArrayList<CuentaSueldo> arraySueldo = new ArrayList<>();
	ArrayList<CuentaCorriente> arrayCorriente = new ArrayList<>();

	public Banco() {

	}

	public boolean agregarCuentaCorriente(CuentaCorriente cuentacorriente) {
		arrayCorriente.add(cuentacorriente);
		return true;
	}

	public boolean agregarCuentaSueldo(CuentaSueldo cuentasueldo) {
		arraySueldo.add(cuentasueldo);
		return true;
	}

	public CuentaCorriente buscarCuentaCorriente(Integer cbu) {

		CuentaCorriente retornarCorriente = null;

		for (CuentaCorriente cuentacorriente : arrayCorriente) {
			if (cuentacorriente.getCbu() == cbu) {
				retornarCorriente = cuentacorriente;
			}

		}

		return retornarCorriente;
	}

	public CuentaSueldo buscarCuentaSueldo(Integer cbu) {

		CuentaSueldo retornarSueldo = null;

		for (CuentaSueldo cuentasueldo : arraySueldo) {
			if (cuentasueldo.getCbu() == cbu) {
				retornarSueldo = cuentasueldo;
			}

		}

		return retornarSueldo;
	}

	public boolean transferirEnCuentasCorrientes(Integer cbuOrigen, Integer cbuDestino, double montoATransferir) {

//		boolean seTransfirio = false;

//		if (buscarCuentaCorriente(cbuOrigen) != null) {
//			CuentaCorriente cuentacorriente1 = null;
//			if (buscarCuentaCorriente(cbuDestino) != null) {
//				CuentaCorriente cuentacorriente2 = null;
//				if (cbuOrigen != cbuDestino) {
//					cuentacorriente1.extraer(montoATransferir);
//					cuentacorriente2.depositar(montoATransferir);
//
//					seTransfirio = true;
//				}
//
//			}
//		}
//		return seTransfirio;

		CuentaCorriente ccOrigen = this.buscarCuentaCorriente(cbuOrigen);
		CuentaCorriente ccDestino = this.buscarCuentaCorriente(cbuDestino);

		boolean extraccionExitosa = ccOrigen.extraer(montoATransferir);
		if (extraccionExitosa == true) {
			ccDestino.depositar(montoATransferir);
			return true;

		}

		return false;

	}

	public boolean transferirEnCuentaSueldo(Integer cbuOrigen, Integer cbuDestino, double montoATransferir) {

		CuentaSueldo csOrigen = this.buscarCuentaSueldo(cbuOrigen);
		CuentaSueldo csDestino = this.buscarCuentaSueldo(cbuDestino);
		boolean extraccionExitosa = csOrigen.extraer(montoATransferir);

		if (extraccionExitosa == true) {
			csDestino.depositar(montoATransferir);
			return true;
		}

		return false;
	}

	public ArrayList<CuentaBancaria> obtenerListadoDeCuentasDeUnCliente(long dni) {

		ArrayList<CuentaBancaria> cuentaBancaria = new ArrayList<>();

		for (CuentaCorriente cuentacorriente : arrayCorriente) {
			if (cuentacorriente.getDni() == dni) {
				cuentaBancaria.add(cuentacorriente);
			}

		}

		for (CuentaSueldo cuentasueldo : arraySueldo) {
			if (cuentasueldo.getDni() == dni) {
				cuentaBancaria.add(cuentasueldo);
			}
		}
		return cuentaBancaria;
	}

	public Integer cantidadDeCuentasDelBanco() {

		return this.arrayCorriente.size() + this.arraySueldo.size();

	}

	public Integer obtenerCantDeCuentasDeUnCliente(long dni) {

		ArrayList<Cliente> ClienteCuentas = new ArrayList<>();

		for (CuentaCorriente cuentacorriente : arrayCorriente) {
			if (cuentacorriente.getDni() == dni) {
				ClienteCuentas.add(cuentacorriente);
			}

		}

		for (CuentaSueldo cuentasueldo : arraySueldo) {
			if (cuentasueldo.getDni() == dni) {
				ClienteCuentas.add(cuentasueldo);
			}
		}
		return ClienteCuentas.size();
	}

}
