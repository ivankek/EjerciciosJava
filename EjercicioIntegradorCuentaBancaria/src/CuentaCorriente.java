public class CuentaCorriente extends CuentaBancaria {

	private double limiteDescubierto;
	private Integer cantidadExtracciones;

	public CuentaCorriente(long dni, String nombre, String apellido, double saldo, Integer cbu, Integer cliente) {
		super(dni, nombre, apellido, 0, cbu, cliente);
		this.limiteDescubierto = 100;

	}

	@Override
	public boolean extraer(double monto) {
		boolean test = false;

		if (getSaldo() > 0) {

			if (monto <= getSaldo()) {
				setSaldo(getSaldo() - monto);
				test = true;
			} else if (monto <= (getSaldo() + this.limiteDescubierto)) {
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
