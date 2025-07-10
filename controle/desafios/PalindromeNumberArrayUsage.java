package controle.desafios;

import java.util.Arrays;

public class PalindromeNumberArrayUsage {

	public static void main(String[] args) {

		System.out.println(isPalindrome(-121));

	}

	public static boolean isPalindrome(int x) {
		String temp = String.valueOf(x);
		char[] arrayNormal = new char[temp.length()];
		char[] arrayInverse = new char[temp.length()];

		int j = 0;
		for (int i = 0; i < temp.length(); i++) {
			arrayNormal[j] = temp.charAt(i);
			j++;
		}

		j = 0;
		for (int i = temp.length(); i > 0; i--) {
			arrayInverse[j] = temp.charAt(i - 1);
			j++;

		}

		for (int i = 0; i < temp.length(); i++) {
			if (Arrays.toString(arrayNormal).equals(Arrays.toString(arrayInverse))) {
				System.out.println(Arrays.toString(arrayNormal));
				System.out.println(Arrays.toString(arrayInverse));
				return true;
			}
		}

		System.out.println(Arrays.toString(arrayNormal));
		System.out.println(Arrays.toString(arrayInverse));
		return false;
	}
}
