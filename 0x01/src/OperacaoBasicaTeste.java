public class OperacaoBasicaTeste {

	public static boolean testar_soma() {

		if (OperacaoBasica.somar(5, 3) == 8) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean testar_subtracao() {
		if (OperacaoBasica.subtrair(5, 3) == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean testar_multiplicacao() {
		if (OperacaoBasica.multiplicar(5, 3) == 15) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean testar_divisao() {
		if (OperacaoBasica.dividir(9, 3) == 3) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean testar_sqrt() {
		if (OperacaoBasica.sqrt(49) == 7) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean testar_primo() {
		if (OperacaoBasica.numero_primo(7).equals("Numero v�lido, o numero � primo")) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean testar_nao_primo() {
		if (OperacaoBasica.numero_primo(4).equals("N�mero v�lido, mas o numero n�o � primo")) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean testar_primo_menor_zero() {
		if (OperacaoBasica.numero_primo(-2).equals("N�mero invalido. Numero menor ou igual a 1 n�o � primo")) {
			return false;
		} else {
			return true;
		}
	}

}