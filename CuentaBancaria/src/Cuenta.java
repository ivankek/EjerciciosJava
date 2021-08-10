public abstract class Cuenta {

	private String nombre;
	protected double saldo;
	private Integer numeroDeCuenta;

	public Cuenta(String nombre, double saldo, Integer numeroDeCuenta) {

		this.nombre = nombre;
		this.saldo = saldo;
		this.numeroDeCuenta = numeroDeCuenta;

	}

	public abstract boolean extraer(double monto);

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Integer getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public void setNumeroDeCuenta(Integer numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

}
