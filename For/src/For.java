
public class For {

	double numeroAMultiplicar;
	double numeroPorElQueMultiplicar;
	double resultado;

	public For(double numeroAMultiplicar, double numeroPorElQueMultiplicar) {

		this.numeroAMultiplicar = numeroAMultiplicar;
		this.numeroPorElQueMultiplicar = numeroPorElQueMultiplicar;
	}

	public double multiplicacionConFor() {

		for (int i = 0; i < this.numeroPorElQueMultiplicar; i++) {

			resultado += this.numeroAMultiplicar;

		}

		return resultado;

	}

	public static void main(String[] args) {

		For For = new For(2.5, 4);
		System.out.println("El resultado de la multiplicacion es: " + For.multiplicacionConFor());

	}

}