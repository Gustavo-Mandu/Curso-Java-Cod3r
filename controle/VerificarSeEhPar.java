package controle;

import java.util.Scanner;

public class VerificarSeEhPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 0 a 10");
		double numero = sc.nextDouble();
		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("O número é par.");
			} else {
				System.out.println("O número é ímpar");
			}
		} else {
			System.out.println("Insira corretamente na próxima vez.");
		}
		
		
		
		sc.close();
		
	}

}
