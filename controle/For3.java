package controle;

public class For3 {

	public static void main(String[] args) {
		int i = 0;
		for(; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n"+ i);
		
		for(int l = 0; l < 10; l++) {
			for(int j = 0; j < 10; j++) {
				System.out.println("i" + l + " " + "j" + j);
			}
		}
	}

}
