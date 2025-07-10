package fundamentos;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		
		int a = 1, 
			b = 12,
			c = -13;
		
        double delta = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
        
        double x1 = (-b + delta) / (2 * a);
        double x2 = (-b - delta) / (2 * a);
        
        System.out.println("A raiz x1 é: " + x1);
        System.out.println("A raiz x2 é: " + x2);
        
   /*     double nota1 = 900;
        double nota2 = 626.80;
        double nota3 = 580;
        double nota4 = 672.40;
        double nota5 = 833.20;
        
        double resultado = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.println(resultado); */
		
	}

}
