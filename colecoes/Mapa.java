package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		
	//	@SuppressWarnings("unused")
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		usuarios.put(30, "Rafaela");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));
		
		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(123));
		
		for (Integer chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for (String values : usuarios.values()) {
			System.out.println(values);
		}
		
		for (Map.Entry<Integer, String> entry : usuarios.entrySet()) {
			int key = entry.getKey();
			String val = entry.getValue();
			System.out.println("{" + key + " = " + val + "}");
		}                                                                
	}
}
