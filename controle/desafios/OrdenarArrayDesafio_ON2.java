package controle.desafios;

import java.util.Arrays;

public class OrdenarArrayDesafio_ON2 {

	public static void main(String[] args) {
		int[] teste = {7, 6, 4, 9, 2, 4, 1};
		
		for (int i : teste) {
			System.out.print(i + " ");
		}
		System.out.println();
		Arrays.sort(teste);
		
		for (int i : teste) {
			System.out.print(i + " ");
		}
		
		System.out.println('\n');
		
		for (int i : ordenar(7649241)) {
			System.out.print(i + " ");
		}
		
	//	System.out.println(Arrays.toString(ordenar(7649241)));
	}

	// teste: crie uma função ordenar() que receba um número e retorne uma lista
	// ordenada;

	// BubbleSort
	static int[] ordenar(Integer parametro) {
		int[] arrayNumero = new int[parametro.toString().length()];

		for (int i = 0; i < arrayNumero.length; i++) {
			arrayNumero[i] = Character.getNumericValue(parametro.toString().charAt(i));
		}

		System.out.println(Arrays.toString(arrayNumero));
		 for (int i = 0; i < arrayNumero.length - 1; i++) {
	            for (int j = 0; j < arrayNumero.length - i - 1; j++) {
	                if (arrayNumero[j] > arrayNumero[j + 1]) {
	                    int temp = arrayNumero[j];
	                    arrayNumero[j] = arrayNumero[j + 1];
	                    arrayNumero[j + 1] = temp;
	                }
	            }
	        }
		return arrayNumero;
	}
}
