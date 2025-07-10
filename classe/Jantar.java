package classe;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Fernanda", 55); // em kg
		
		Comida comida1 = new Comida("Feijão", 0.223);
		Comida comida2 = new Comida("Arroz", 0.3);
		
		System.out.println("Olá, " + pessoa1.nome + ".");
		System.out.println("Peso da pessoa: " + pessoa1.peso + " kg");
		System.out.println("Peso do " + comida1.nome + ": " + comida1.peso + " kg");
		System.out.println("Peso do " + comida2.nome + ": " + comida2.peso + " kg");
		
		pessoa1.comer(comida2);
		System.out.println("Peso da pessoa após "
				+ "comer um dos alimentos: " + pessoa1.peso);
	}
}
