package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		Supplier<List<Object>> lista =
			() -> Arrays.asList("Batata", "Alface", 1, 23);
		
		System.out.println(lista.get());
	}
}
