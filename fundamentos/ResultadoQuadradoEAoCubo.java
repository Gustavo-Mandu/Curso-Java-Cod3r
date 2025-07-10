package fundamentos;

import java.util.Scanner;

public class ResultadoQuadradoEAoCubo {

	public static void main(String[] args) {
		// Criar um programa que leia um valor e apresente 
		// os resultados ao quadrado e ao cubo do valor.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double valor = sc.nextDouble();
		
	    double valorAoQuadrado = Math.pow(valor, 2);
	    double valorAoCubo = Math.pow(valor, 3);
	    
	    System.out.println("Valor ao quadrado: " + valorAoQuadrado);
	    System.out.println("Valor ao cubo: " + valorAoCubo);
		
		sc.close();
	}

}
