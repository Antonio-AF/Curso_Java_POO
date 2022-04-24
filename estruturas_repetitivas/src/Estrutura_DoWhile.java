// Sintaxe  ou Regra

/* 
 * do {
 * 		comando 1
 * 		comando 2
 * 
 * } While (condição);
 * 
 * Regra:
 * 
 * Para Verdadeiro/True : Volta.
 * Para Falso/False: Pula fora do bloco.
 * 
 * 
 * */

import java.util.Locale;
import java.util.Scanner;

public class Estrutura_DoWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		char resp = 0;
		
		
		do {
			System.out.print("Digite a temperatura em Celcius: ");
			Double C = sc.nextDouble();
			Double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
			
		} while (resp != 'n');
		

	}

}
