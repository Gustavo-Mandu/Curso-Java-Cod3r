package fundamentos;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu time favorito? 1, 2 ou 3 (vai ser na sorte ta)");
		int valorDigitado = sc.nextInt();
		
		if (valorDigitado == 1) {
			System.out.println("Palmeirense");
		} else
			if (valorDigitado == 2) {
				System.out.println("São Paulino");
			} else
				if (valorDigitado == 3) {
					System.out.println("Vasco");
				} else 
					if (valorDigitado == 51) {
					System.out.println("Pinga");
				} else {
					System.out.println("Não é nada!!!");
				}
		
	/*	Scanner sc = new Scanner(System.in);
		
		double matematica = 0;
		double portugues = 0;
		double ciencias = 0;
		
		System.out.println("Digite a sua nota de matematica: " );
		matematica = sc.nextDouble();
		
		System.out.println("Digite a sua nota de português: " );
		portugues = sc.nextDouble();
		
		System.out.println("Digite a sua nota de ciência: " );
		ciencias = sc.nextDouble();
		
		System.out.println(matematica);
		System.out.println(portugues);
		System.out.println(ciencias);
		
		double media = (matematica + portugues + ciencias) / 3;
		
		System.out.println(media);
*/
	}
}
