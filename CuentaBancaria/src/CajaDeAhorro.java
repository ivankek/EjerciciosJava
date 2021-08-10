public class CajaDeAhorro extends Cuenta {

	private Integer extraccion = 0;

	public CajaDeAhorro(String nombre, double saldo, Integer numeroDeCuenta) {
		super(nombre, saldo, numeroDeCuenta);

	}

	public boolean depositar(double monto) {

		setSaldo(saldo + monto);

		return true;

	}

//	@Override
//	public boolean extraer(double monto) {
//		boolean ext = false;
//
//		if (monto <= getSaldo() && getSaldo() > 0) {
//			setSaldo(getSaldo() - monto);
//			this.extraccion++;
//
//			ext = true;
//
//			if (getSaldo() > 0 && this.extraccion > 5 && monto <= getSaldo()) {
//
//				setSaldo(getSaldo() - monto - 6.0);
//				ext = true;
//				this.extraccion++;
//			}
//		}
//		return ext;
//	}
//

	@Override
	public boolean extraer(double monto) {
		boolean test = false;

		if (this.extraccion < 5) {
			if (getSaldo() > 0 && monto < getSaldo()) {
				setSaldo(getSaldo() - monto);
				test = true;
				this.extraccion++;
			}
		} else {
			if (getSaldo() > 0 && monto < getSaldo()) {
				setSaldo(getSaldo() - monto - 6);
				test = true;
				this.extraccion++;
			}
		}

		return test;
	}

}