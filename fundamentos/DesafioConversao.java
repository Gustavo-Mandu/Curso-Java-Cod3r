package fundamentos;

import java.util.Scanner;
import java.util.Locale;

public class DesafioConversao {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu salario de 1 mês atrás: ");
		String salario1 = sc.nextLine().replace(",", ".");
		
		System.out.print("Digite de 2 meses atrás: ");
		String salario2 = sc.nextLine().replace(",", ".");
		
		System.out.print("Digite de 3 meses atrás: ");
		String salario3 = sc.nextLine().replace(",", ".");

		System.out.println(Locale.getDefault());
		
		Double media = (Double.parseDouble(salario1)
				      + Double.parseDouble(salario2) 
			          + Double.parseDouble(salario3)) / 3; 
		
		
		if (media.toString().contains(".")) {
			System.out.print("A média do seu salário é de: " + media.toString().replace(".", ","));
		} 
		else System.out.print("A média do seu salário é de: " + media);
		
		sc.close();
	}

}
