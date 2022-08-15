package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Vetor_2 {

	public static void main(String[] args) {
		
		
		// Comando para troca da Virgula pelo Ponto no tipo Double.
		Locale.setDefault(Locale.US);
		// Comandos para importa��o do Scanner para inser��o de dados pelo usu�rio.
		Scanner sc = new Scanner(System.in);
		
		// Comando para instanciar um novo Vetor com n posi��es.
		int n = sc.nextInt();		
		Product[] vect = new Product[n];
		
		// Loop for para inserir os dados nas posi��es do Vetor.
		for (int i=0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		
		// Comandos para realizar a soma dos elementos do Vetor e realizar a M�dia.
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / n;
		
		System.out.printf("AVERAGE PRICE: %.2f", avg);
		
		sc.close();

	}

}
