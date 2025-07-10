package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data(31, 12, 2020);

		var d2 = new Data();
		d2.ano = 2010;
	
		var d3 = new Data();
		
		System.out.print("Data com Construtor(): ");
		System.out.println(d1.obterDataFormatada());
		
		System.out.print("Data com d2.atributo: ");
		System.out.println(d2.obterDataFormatada());
		
		System.out.print("Data com Construtor Padrão: ");
		System.out.println(d3.obterDataFormatada());
		
	   // d1.imprimirDataFormatada();
	}

}
