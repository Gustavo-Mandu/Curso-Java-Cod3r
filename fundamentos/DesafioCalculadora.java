package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		 // Ler num1
		 // Ler num2
		 // + - * / %
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double valor1 = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		double valor2 = sc.nextDouble();
		
		System.out.println("Qual operação você quer?\n");
		System.out.println("Adição (1)\n"
				         + "Subtração (2)\n" 
				         + "Multiplicação (3)\n"
	                   	 + "Divisão (4)\n"
		                 + "Módulo (5)");
		
		char valorOperacao = sc.next().charAt(0);
		
		sc.close();
		
		double resultado = valorOperacao == '1' ? valor1+valor2 : 
			               valorOperacao == '2' ? valor1-valor2 : 
			               valorOperacao == '3' ? valor1*valor2 :
			               valorOperacao == '4' ? valor1/valor2 :
			               valorOperacao == '5' ? valor1%valor2 :
			               0; 

		String simbolo = valorOperacao == '1' ? "+" :
		                 valorOperacao == '2' ? "-" :
		                 valorOperacao == '3' ? "*" :
	                     valorOperacao == '4' ? "/" :
		                 valorOperacao == '5' ? "%" :
		                 "?";
		
		System.out.println(valor1 + " " + simbolo + " " + valor2 + " = " + resultado);
	}

}
