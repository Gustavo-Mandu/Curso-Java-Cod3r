package oo.heranca.desafio.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {

		Ferrari ferrari = new Ferrari(124); // Ferrari ferreri = var Ferrari; todos funcionam!
	    ferrari.ligarTurbo();
		
		Carro civic = new Civic(); // Carro civic também funciona!; Carro ferrari também!

		// 90 é a Velocidade Máxima Padrão!

		System.out.println("Ferrari: " + ferrari.velocidadeAtual);
		System.out.println("Civic: " + civic.velocidadeAtual);
		System.out.println();

		ferrari.acelerar();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.desligarTurbo();
		ferrari.ligarAr();
		ferrari.desligarAr();
		
		System.out.println(ferrari.velocidadeDoAr());
		
		ferrari.acelerar();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);
		
		System.out.println();

		civic.acelerar(); // + 10
		System.out.println(civic);
		
		civic.acelerar();
		System.out.println(civic);
		
		civic.acelerar();
		System.out.println(civic);
		
		civic.acelerar();
		System.out.println(civic);
		
		civic.acelerar();
		System.out.println(civic);
		
		civic.acelerar();
		System.out.println(civic);
		
		civic.acelerar();
		System.out.println(civic);
		
		civic.acelerar();
		System.out.println(civic);
		
		civic.acelerar();
		System.out.println(civic);
		
		civic.acelerar();
		System.out.println(civic);
	

		ferrari.frear();
		civic.frear();
		
		System.out.println();
		System.out.println(ferrari);
		System.out.println(civic);
		
	}
}
