package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		// Primeiro programa escrito em Java
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello Word!");
		System.out.println("Informe seu Nome: ");
		String nome = sc.nextLine();
		System.out.println("Olá " + nome);		
		
		sc.close();
	}

}
