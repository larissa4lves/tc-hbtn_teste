public class OperacaoBasicaTeste {

	public static boolean testar_sqrt() {
		if(OperacaoBasica.testar_sqrt(49) == 7) {
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean testar_primo() {
		if(OperacaoBasica.numero_primo(7) == "Numero valido, o numero e primo") {
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean testar_nao_primo() {
		if(OperacaoBasica.numero_primo(4) == "Numero valido, mas o numero nao e primo") {
			return true;
		}
		else{
			return false;
		}
	}

	public static boolean testar_primo_menor_zero() {
		if(OperacaoBasica.numero_primo(-2) == "Numero invalido. Numero menor ou igual a 1 não e primo") {
			return false;
		}
		else{
			return true;
		}
	}
	
	

}