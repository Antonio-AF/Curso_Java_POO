package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle x;
		
		x = new Rectangle();
		
		
		System.out.println("Entre Rectangle width and height: ");
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();
		
		double areaX = x.area()	;
		System.out.printf("AREA = %.2f%n", areaX);
		
		double perimeterX = x.perimeter();
		System.out.printf("PERIMETER = %.2f%n", perimeterX);
		
		double diagonalX = x.diagonal();
		System.out.printf("DIAGONAL = %.2f%n", diagonalX);
		
		
		sc.close();

	}

}
