package controle;

import java.util.Scanner;

public class PrimoOuNaoSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int number = sc.nextInt();
		System.out.println(checkPrime(number) ? "É primo!" : "Não é primo!");

		sc.close();
	}

	public static boolean checkPrime(int num) {
		switch (num) {
		case 0:
		case 1:
			return false;

		default:
			if (num < 0) {
				return false;
			} else {
				for (int i = 2; i <= Math.sqrt(num); i++) {
					if (num % i == 0) {
						return false;
					}
				}
				return true;
			}
		}

	}
}