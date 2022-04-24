package aplication;

import entities.Product;

public class TiposReferencia {

	public static void main(String[] args) {
		
		// Essas variaveis são do tipo Classe e devem ser entendidas como ponteiros e não caixas.
		Product p1, p2; 
		
		p1 = new Product("TV", 900.00, 10);
		
		p2 = new Product("Radio", 345.00, 2);
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
