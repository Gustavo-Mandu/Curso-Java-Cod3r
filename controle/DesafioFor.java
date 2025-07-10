package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		String unicode5 = "\u0035";
		String unicode1 = "\u0031";
		int contador5 = Integer.parseInt(unicode5);
		int contador1 = Integer.parseInt(unicode1);
		
		// usei unicode mas não era isso, pois vira número 
		// de qualquer forma kkk
		for(int i = contador1; i <= contador5; i = i + contador1) {
			System.out.println(valor);
			valor += "#";
		}
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
		
		// Versão do desafio
		// Não pode usar valor númerico pra controlar o laço!
	}

}
