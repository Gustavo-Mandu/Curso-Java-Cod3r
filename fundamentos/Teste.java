package fundamentos;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		System.out.println("Olá terminal do ascomputador!");
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = entrada.nextLine();
		
		System.out.println("Valor é: " + valor);
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		entrada.close();

	}

}
