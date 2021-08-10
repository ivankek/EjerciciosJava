public class CuentaSueldo extends CuentaBancaria {

	public CuentaSueldo(long dni, String nombre, String apellido, double saldo, Integer cbu, Integer cliente) {
		super(dni, apellido, apellido, 0, cbu, cliente);

	}

	@Override
	public boolean extraer(double monto) {
		if (monto <= getSaldo()) {
			setSaldo(getSaldo() - monto);

			return true;
		}
		return false;

	}

}
