package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Vetor_1{

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Intancia um vetor com n sendo o numero de elementos.
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		// Estrutura de repetição for, aqui é registrado os dados nas posiçoes do vetor.
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		// Soma os elementos do vetor e realiza a media entre eles.
		double soma = 0;
		for (int i=0; i<n; i++) {
			soma += vect[i];
		}
		double avg = soma / n;
		
		// Impre o resultado na tela.
		System.out.printf("AVERAGE HEIGHT: %.2f", avg);
		
		
		sc.close();
	}

}