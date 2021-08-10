public class CuentaSaldo extends Cuenta {

	public CuentaSaldo(String nombre, double saldo, Integer numeroDeCuenta) {
		super(nombre, saldo, numeroDeCuenta);

	}

	public boolean depositar(double monto) {

		this.saldo = saldo + monto;

		return true;
	}

	@Override
	public boolean extraer(double monto) {
		if (monto <= super.saldo) {
			setSaldo(saldo - monto);

			return true;
		}
		return false;

	}

}
