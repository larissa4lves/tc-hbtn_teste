public class OperacaoBasica {

	public static double testar_sqrt(int num) {
		return Math.sqrt(num);

	}

	public static String numero_primo(int num) {
		if (num <= 1) {
			return "Numero invalido. Numero menor ou igual a 1 não e primo";
		}

		if (num % 2 == 0) {
			return "Numero válido, mas o numero não é primo";
		} else {
			return "Numero válido, o numero é primo";

		}

	}
}