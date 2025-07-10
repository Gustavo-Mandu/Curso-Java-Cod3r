package controle;

import java.util.Scanner;

public class SequenciaFibonnaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número que a sequência começa: ");
		int inicio = sc.nextInt();
		System.out.println("Digite o número de iterações: ");
		int tamanho = sc.nextInt();
		
		if(tamanho < inicio) {
			tamanho += inicio;
		}
			
		for (int i = inicio; i < tamanho; i++) {
			System.out.print("(" + i + "): " + fibo(i) + "\n");
		}
		
		System.out.println();
		
		for (int i = 0; i < 30; i++) {
			System.out.print("(" + i + "): " + fibo2(i) + "\n");
		}
	}
   
	// Iterativo
	static long fibo(int n) {
		int a = 0, b = 1, c;
		if (n == 0) {
			return a;
		}
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

	// Recursivo
	static long fibo2(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}
}
