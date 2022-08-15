package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Lacos {
	
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i=0; i<vect.length; i++){
			System.out.println(vect[i]);
		}
		
		for (String obj : vect ) {
			
			System.out.println("------------------------------------");
			String obj2 = obj.toLowerCase(); // Transforma todos os caracteres em minusculo.
			String obj3 = obj.toUpperCase(); // Transforma todos os caracteres em maiuscula.
			System.out.println(obj2 + "/ " + obj3); 
		}
		
		sc.close();

	}

}
