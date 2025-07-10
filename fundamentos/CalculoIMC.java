package fundamentos;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		// Criar um programa que leia o peso 
		// e a altura do usuário e imprima no console o IMC.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso: ");
		double peso = sc.nextDouble();
		System.out.println("Digite a altura: ");
		double altura = sc.nextDouble();
		
		double IMC = peso / Math.pow(altura, 2);
		
		System.out.println("IMC: "+ IMC);
		
		sc.close();
	}

}
