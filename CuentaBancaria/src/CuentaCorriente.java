
public class CuentaCorriente extends Cuenta {

	double limite;

	public CuentaCorriente(String nombre, double saldo, Integer numeroDeCuenta) {
		super(nombre, saldo, numeroDeCuenta);
		this.limite = 100;
	}

	public boolean depositar(double monto) {

		setSaldo(saldo + monto);

		return true;
	}

//	@Override
//	public boolean extraer(double monto) {
//		boolean ext = false;
//
//		if (monto <= saldo) {
//			setSaldo(saldo - monto);
//			ext = true;
//		}
//
//		else if (monto <= (saldo + limite)) {
//
//			double descubierto = monto - saldo;
//			setSaldo(saldo - (monto - (descubierto * 0.05)));
//			ext = true;
//
//		} else {
//
//			return ext;
//		}
//
//		return ext;
//	}

	@Override
	public boolean extraer(double monto) {
		boolean test = false;

		if (getSaldo() > 0) {

			if (monto <= getSaldo()) {
				setSaldo(getSaldo() - monto);
				test = true;
			} else if (monto <= (getSaldo() + this.limite)) {
				Double aux = monto - getSaldo();
				setSaldo(getSaldo() - monto - (aux * 0.05));
				test = true;
			} else {
				return test;
			}

		}

		return test;
	}

}
