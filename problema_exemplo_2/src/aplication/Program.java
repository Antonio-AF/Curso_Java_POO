package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Product p1 = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();		
		System.out.println("Price: ");
		double price = sc.nextDouble();
		//System.out.println("Quantity in Stock: ");
		//int quantity = sc.nextInt();
		
		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int  quantity = sc.nextInt();
		product.addProductsint(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: " + product);
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		
		sc.close();
	}

}
