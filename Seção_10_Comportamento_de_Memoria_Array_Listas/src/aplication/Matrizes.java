package aplication;

import java.util.Scanner;

// Exerc�cio resolvido

// Fazer um programa para ler um n�mero inteiro N e uma matriz de ordem N contendo n�meros
// inteiros. Em seguida, mostrar diagonal principal e a quantidade de valores negativos
// da matriz.

public class Matrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for (int i=0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
		}		
		System.out.println();
		
		int count = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				
				if(mat[i][j] < 0) {
					count++;
				}
				
			}
		}
		
		System.out.println("Negative numbers: " + count);
		
		
		
		sc.close();

	}

}
