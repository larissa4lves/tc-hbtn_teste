
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
		if(OperacaoBasica.numero_primo(7) == "Numero v�lido, o numero � primo") {
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean testar_nao_primo() {
		if(OperacaoBasica.numero_primo(4) == "N�mero v�lido, mas o numero n�o � primo") {
			return true;
		}
		else{
			return false;
		}
	}

	public static boolean testar_primo_menor_zero() {
		if(OperacaoBasica.numero_primo(-2) == "N�mero invalido. Numero menor ou igual a 1 n�o � primo") {
			return false;
		}
		else{
			return true;
		}
	}
	
	

}