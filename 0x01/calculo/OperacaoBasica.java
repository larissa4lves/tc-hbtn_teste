
public class OperacaoBasica {

	public static double testar_sqrt(int num) {
		return Math.sqrt(num);

	}

	public static String numero_primo(int num) {
		if (num <= 1) {
			return "Numero invalido. Numero menor ou igual a 1 n�o e primo";
		}

		if (num % 2 == 0) {
			return "Numero v�lido, mas o numero n�o � primo";
		} else {
			return "Numero v�lido, o numero � primo";

		}

	}
}