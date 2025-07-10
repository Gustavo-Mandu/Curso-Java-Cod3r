package fundamentos;

public class TipoString {

	public static void main(java.lang.String[] daPraRodarSemArgsKKKK) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + ("!!!"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("Tarde"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;;;
		var salario = 12345.987;
		
		String maisUmaFrase = "\nNome: " + nome + "\nSobrenome: "
		          + sobrenome + "\nIdade: " + idade + "\nSalario: "
		          + salario + "\n\n";
		
		System.out.println(maisUmaFrase);
		
		System.out.printf("O senhor %s %s tem %d anos e %.2f de salário.",
				nome, sobrenome, idade, salario);
		
		System.out.println(); // Só pra pular a linha
		
		String frase = String.format("\nO senhor %s %s tem %d anos e %.2f de salário.",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
	    System.out.println("Frase qualquer");
	}

}
