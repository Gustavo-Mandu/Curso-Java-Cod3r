package oo.abstrato;

public class TesteAbstrato {

	public static void main(String[] args) {
		
		Animal animal = new Cachorro(); 
        Mamifero mamifero = new Cachorro();
		
        System.out.println("Animal: ");
		System.out.println(animal.mover());
		System.out.println(animal.respirar());
		
		System.out.println("\nMamífero: ");
		System.out.println(mamifero.mover());
		System.out.println(mamifero.mamar());
		System.out.println(mamifero.respirar());
	}
}
