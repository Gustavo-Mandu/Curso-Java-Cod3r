package fundamentos;

import java.util.Scanner;

public class ConverterTemperatura {

	public static void main(String[] args) {
		// Criar um programa que leia a temperatura em Fahrenheit e
		// converta para Celsius.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Diga a temperatura em °F: ");
		double fahrenheit = sc.nextDouble();
		
		double valorEmCelsius = (fahrenheit - 32) * 5 / 9;

		System.out.println("Celcius: " + valorEmCelsius);
		
		double calculoFahrenheit = (valorEmCelsius * 9/5) + 32;
		
		System.out.println("Fahrenheit: " + calculoFahrenheit);
		
		sc.close();
	}

}
