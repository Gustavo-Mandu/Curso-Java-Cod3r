package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		// a = "..."; (da erro)
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		
		// c = 4.5;
		
		double d; // variável foi inicializada
		d = 123.65; // variável foi inicializada
		System.out.println(d);
		
		var e = 123.45;
		System.out.println(e);
		
		var f = 12; // inteiro
		System.out.println(f);
		//  f = 12.01;  da erro pois vira double e o tipo é var(int)
	}
}
