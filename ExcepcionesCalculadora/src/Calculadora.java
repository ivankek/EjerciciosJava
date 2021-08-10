public class Calculadora {

	private Double valor1;
	private Double valor2;

	public Calculadora(Double valor1, Double valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;

	}

	public Double dividir() {
		Double division = 0.0;
		if (this.valor2 != 0) {
			division = (this.valor1 / this.valor2);
		}

		return division;
	}

}
