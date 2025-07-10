package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2"); // true
		 
		String s = new String("2");
		System.out.println("2" == s); // false
		System.out.println("2".equals(s)); // true
		
		String x = "3";
		System.out.println("3" == x); // true
		
		Scanner entrada = new Scanner(System.in);
		
		String s1 = entrada.next(); // 2
		entrada.nextLine(); // remover o bug do buffer de entrada
		String s2 = entrada.nextLine(); // 2
		System.out.println("2" == s1.trim()); // false
		System.out.println("2".equals(s1)); // true
		System.out.println(s1 + "\n" + s2);
		entrada.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
