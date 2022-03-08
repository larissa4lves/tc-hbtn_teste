public class OperacaoBasica {

	public static double somar(double a, double b) {

		return a + b;
	}

	public static double subtrair(double a, double b) {

		return a - b;
	}

	public static double multiplicar(double a, double b) {

		return a * b;
	}

	public static double dividir(double a, double b) {

		return a / b;
	}
	
	public static double sqrt(double a) {
		return Math.sqrt(a);
	}

	public static String numero_primo(int numero) {
	
		if (numero <= 1 ) {
			return "N�mero invalido. Numero menor ou igual a 1 n�o � primo";
	}
		if (numero % numero == 0) {
			return "Numero v�lido, o numero � primo";
		}
		
		else {
			return "N�mero v�lido, mas o numero n�o � primo";
		}
			
	}

}