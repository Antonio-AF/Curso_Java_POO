import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next(); // Lendo uma String.
		System.out.println("Você digitou " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou o numero: " + y);
		
		
		
		
		sc.close();
		

	}

}
