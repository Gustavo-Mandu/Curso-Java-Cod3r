package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		double c = 0.2;
        
		a++; // a = a + 1
		a--; // a = a - 1
		c++; // c = c + 1 // 1.2
		
		System.out.println(c);
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); // 2 == 2
		
		System.out.println(a + " " + b); // a = 2 | b = 1
	}

}
