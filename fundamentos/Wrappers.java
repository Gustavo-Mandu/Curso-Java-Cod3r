package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// byte
		Byte b = 100;
		Short s = Short.parseShort(entrada.nextLine());
		Integer i = Integer.parseInt("1000");
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s * 2);
		System.out.println(i.doubleValue());
		System.out.println(l / 3);
		
		Float f = 123.10f;
		System.out.println(f);
		
		Double d = 123.1234;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		
		Character c = '#'; // char
		System.out.println(c + "batata");

		long l1 = 1l;
		int l2 = (int) l1;
		Long l3 = 1l;
	    String l4 = String.valueOf(l1 + l2);
		
	    System.out.println(l4);
		System.out.println(String.valueOf(l3));
				
		int x = 5;
		long z = 10l;
		
		int resultado = (int) (x + z);
		System.out.println(resultado);
		entrada.close();
	}

}
