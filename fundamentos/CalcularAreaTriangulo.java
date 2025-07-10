package fundamentos;

import java.util.Scanner;

public class CalcularAreaTriangulo {

	public static void main(String[] args) {
		// Criar um programa que leia o valor da base 
		// e da altura de um triângulo e calcule a área.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");
		double base = sc.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		double altura = sc.nextDouble();
		
		double areaTriangulo = (base * altura) / 2;
		
		System.err.println("Área desse triângulo: " + areaTriangulo + " cm²");
		
		sc.close();
		
	}
}
