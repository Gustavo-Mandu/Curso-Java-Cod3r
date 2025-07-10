package fundamentos;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
	/*  byte number1 = 127;
		short number2 = 2831;
		int number3 = 31231241;
		long number4 = 1238120318;
		float number5 = 51321231.2f;
		double number6 = 612312312223.5;
		char letter7 = 'a';
		String word8 = "awadas"; */
		
		Scanner scanner = new Scanner(System.in);
		// we need to build a calculator with 2 numbers and these operatos (+ - * /)
		// System.out.println("Hello world!");
		
		System.out.println("Insert the first number: ");
		double firstNumber = scanner.nextDouble();
		
		System.out.println("Insert the second number: ");
		double secondNumber = scanner.nextDouble();
		
		System.out.println("Which operation would you like to do?");
		System.out.println("+ - * /");
		scanner.nextLine();
		String operator = scanner.nextLine();
		
		double resultado = 0;
		switch (operator) {
		case "+":
			resultado = firstNumber + secondNumber;
			break;
		case "-":
			resultado = firstNumber - secondNumber;
			break;
		case "*":
			resultado = firstNumber * secondNumber;
			break;
		case "/":
			resultado = firstNumber / secondNumber;
			break;
		default:
			System.out.println("Botou errado mano");
			break;
		}	
		System.out.println(resultado);
	}
}