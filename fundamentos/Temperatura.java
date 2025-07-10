package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C

		final int valor1 = 32;
		final double valor2 = 5/9.0;
		double fahrenheit = 120;
		double celsius = (fahrenheit - valor1) * valor2;
		System.out.println("O resultado em °C do °F 120 é: " + celsius);
		
		fahrenheit = 86;
	    celsius = (fahrenheit - valor1) * valor2;
		
		System.out.println("O resultado em °C do °F 120 é: " + celsius);
	}

}
