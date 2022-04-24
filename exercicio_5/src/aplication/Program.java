package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno_1 = new Aluno();
		
		System.out.println("Digite o seu nome: ");
		aluno_1.nome = sc.nextLine();
		
		System.out.println();
		System.out.println("Digite sua nota do primeiro trimestre:");
		aluno_1.n1 = sc.nextDouble();
		
		System.out.println();
		System.out.println("Digite sua nota do segundo trimestre: ");
		aluno_1.n2 = sc.nextDouble();
		
		System.out.println();
		System.out.println("Digite sua nota do ternceiro trimestre: ");
		aluno_1.n3 = sc.nextDouble();
		
		double notaFinal = aluno_1.notaFinal();
		
		if (notaFinal > 60) {
			System.out.printf("FINAL GRADE = " + notaFinal);
			System.out.println();
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING " + (60 - notaFinal ) + " POINTS");
		}
		
		
		sc.close();

	}

}
