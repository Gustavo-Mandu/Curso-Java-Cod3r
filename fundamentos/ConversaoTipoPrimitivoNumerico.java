package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
	
		int i = 11;
		long i2 = i; // implícito
		System.out.println(i2);
		
		double a = 1; // implicita
		System.out.println(a);
		
		float b = (float) 11.123456789; // explícita (CAST)
        System.out.println(b);
		
        int c = 340;
        byte d = (byte) c; // explícita (cast)
        System.out.println(d);
        
        float e = 1.9999999f;
        int f = (int) e; // explícita (cast)
        System.out.println(f);
	}
}
