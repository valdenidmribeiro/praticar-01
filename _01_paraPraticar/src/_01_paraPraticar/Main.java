package _01_paraPraticar;

public class Main {

	public static void main(String[] args) {
		String produto1 = "computador";
		String produto2 = "mesa de escritório";

		int age = 30;
		int code = 5290;
		char genero = 'F';

		double preco1 = 2100.00;
		double preco2 = 650.50;
		double medir = 53.234567;

		System.out.println("Produtos:");
		System.out.printf("%s, que custa R$%.2f.", produto1, preco1);
		System.out.printf("\n%s que custa R$%.2f.", produto2, preco2);
		System.out.println("\n______________________________________________\n");
		System.out.printf("Registro: %d anos, codigo: %d, genero '%c'.", age, code, genero);
		System.out.println("\n______________________________________________\n");
		System.out.printf("Medida com 8 digitos: %.8f.\n", medir);
		System.out.printf("Arredondado (três casas decimais): %.3f.\n", medir);
		System.out.printf("Ponto decimal dos EUA: %.3f.", medir);
	}

}
