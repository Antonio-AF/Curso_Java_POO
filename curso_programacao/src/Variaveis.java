public class Variaveis {

	public static void main(String[] args) {
		
		int x, ncirculos = 10; // Tipo da Variavel Inteiro.
		float r=9.5f; // Tipo da Variavel Ponto Flutuante
		double pi=3.1415926; // Tipo de Variavel Ponto Flutuante maior Precisão.
		
		x = ncirculos;
		
		System.out.println("nciculos: " +ncirculos);
		System.out.println("x: " +x);
		System.out.println("r: "+r);
		System.out.println("pi: %n%n"+pi);
		
		System.out.println("A area do Circulo! %n%n");
		
		double areaCirculo = pi * (r * r);
		
		System.out.println("A area do circulo = " + areaCirculo);
	}

}