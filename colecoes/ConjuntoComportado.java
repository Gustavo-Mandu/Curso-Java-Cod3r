package colecoes;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		// Set<String> lista = new HashSet<String>();
		SortedSet<String> listaAprovados = new TreeSet<String>();
		listaAprovados.add("Ana");
		listaAprovados.add("Luca");
		listaAprovados.add("Carlos");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new TreeSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		for (int n : nums) {
			System.out.println(n);
		}
	}
}
