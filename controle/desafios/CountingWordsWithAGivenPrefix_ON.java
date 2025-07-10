package controle.desafios;

public class CountingWordsWithAGivenPrefix_ON {

	public static void main(String[] args) {

		System.out.println(prefixCount(new String[] { "pay", "attention", "practice", "attend" }, "at"));

	}

	static public int prefixCount(String[] words, String pref) {
		int count = 0;
		for (String word : words) {
			if (word.startsWith(pref)) {
				count++;
			}
		}
		return count;
	}
}
