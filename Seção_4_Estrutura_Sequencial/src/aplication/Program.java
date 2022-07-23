package aplication;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int y = 32;
		
		System.out.println(y);
		System.out.println(++y);
		System.out.println(y += y + 2);
		
		double x = 3.141592;
		System.out.println(x);
		System.out.printf("%.4f%n", x);
		System.out.printf("%.2f%n", x);
		
		System.out.println("O Valor do PI é " + x + " Unidades de Medidas");
		
		System.out.println(
				"O Valor de PI é " 
				+ x
				+ " Unidades de Medidas");
		
		System.out.printf("O valor dado a x é %f", x);
		
		String product1 = "Computer";
		String product2 = "Office desk";
		byte age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);

	}

}
