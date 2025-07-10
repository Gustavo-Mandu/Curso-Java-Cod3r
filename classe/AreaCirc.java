package classe;

public class AreaCirc {

	double raio;
	final static double PI = 3.14159;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return Math.pow(raio, 2) * PI;
	}
	
	static double area(double raio) {
		return Math.pow(raio, 2) * PI;
	}
}
