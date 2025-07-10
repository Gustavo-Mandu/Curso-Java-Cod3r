package controle;

public class For1 {
	
	public static void main(String[] args) {
		
		int contador = 0;
		while(contador <= 10) {
			System.out.printf("While = %d \n", contador);
			if (contador == 10) {
				System.out.println();
			}
			contador += 2;
		}
		
		for(contador = 0; contador <= 10; contador += 2) {
			System.out.println("For = " + contador);
		}
		
		/* da pra usar o for assim:
		int x = 2;
		for (; x < 10;){
		System.out.println("x = " + x);
		x++;} // inclusive posso tirar esse x++, ai vai dar loop */

		/* assim também é possível, laço infinito
		for(;;) {
			System.out.println("Fim!");
		} */
	}
}
