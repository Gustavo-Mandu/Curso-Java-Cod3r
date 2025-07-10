package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoParcial = media >= 5.0 ? 
				"em recuperação" : "reprovado";
		String resultadoFinal = media >= 7.0 ? 
				"passou." : resultadoParcial;
	/*  String resultado = media >= 7.0 ? 
		       "aprovado" : media >= 5 ? 
		       "em recuperação" : "reprovado";
    */
        System.out.println("O aluno " + resultadoFinal);
        
        double nota = 7.3;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim." : "não.";
		
		System.out.printf("Tem desconto? %s", resultado);
        
        
        
        
	}

}
