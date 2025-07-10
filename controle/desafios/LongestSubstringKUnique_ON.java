package controle.desafios;

import java.util.*;

public class LongestSubstringKUnique_ON {
	
    static void findLongestSubstring(String entrada, int k) {
        // Verificar se a string tem caracteres únicos suficientes
        if (entrada.chars().distinct().count() < k) {
            System.out.println("Not enough unique characters");
            return;
        }

        int maxLength = 0;
        String maxSubstring = "";
        Map<Character, Integer> charFrequency = new HashMap<>();
        int start = 0;

        // Usando dois ponteiros (start e end) para formar substrings
        for (int end = 0; end < entrada.length(); end++) {
            // Adiciona o caractere atual ao mapa de frequências
            char currentChar = entrada.charAt(end);
            charFrequency.put(currentChar, charFrequency.getOrDefault(currentChar, 0) + 1);

            // Verifica se temos mais de k caracteres únicos
            while (charFrequency.size() > k) {
                // Remove o caractere mais à esquerda (start)
                char startChar = entrada.charAt(start);
                charFrequency.put(startChar, charFrequency.get(startChar) - 1);
                if (charFrequency.get(startChar) == 0) {
                    charFrequency.remove(startChar);
                }
                start++;
            }

            // Atualiza o comprimento máximo e a substring correspondente
            if (charFrequency.size() == k) {
                int currentLength = end - start + 1;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxSubstring = entrada.substring(start, end + 1);
                }
            }
        }

        // Imprime o resultado
        System.out.println("Length: " + maxLength);
        System.out.println("Substring: " + maxSubstring);
        System.out.println();
    }

    public static void main(String[] args) {
        findLongestSubstring("aabbcc", 1); // Output: 2, Substring: aa (ou bb ou cc)
        findLongestSubstring("aabbcc", 2); // Output: 4, Substring: aabb (ou bbcc)
        findLongestSubstring("aabbcc", 3); // Output: 6, Substring: aabbcc
        findLongestSubstring("aaabbb", 3); // Output: Not enough unique characters
    }
}
