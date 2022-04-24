package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// A forma de instanciar uma Lista!
		// Instaciando da seguinte forma List<String> listOfString = new ArrayList<>();
		System.out.println();
		List<String> listOfString = new ArrayList<>();
		
		// Adicionando um Elemento a Lista!
		// Usamos o comando listOfString.add("Nome do Elemento");
		
		listOfString.add("Maria");
		listOfString.add("Anderson");
		listOfString.add("Mara");
		listOfString.add("Andre");
		listOfString.add("João");
		listOfString.add("Marcia");
		listOfString.add("Antonio");
		
		List<Integer> listOfInteger = new ArrayList<>();
		listOfInteger.add(123456);
		listOfInteger.add(950684);
		
		// Removendo um Elemento da Lista pelo Nome!
		// Usamos o .remove da seguinte forma
		listOfString.remove("Pedro");
		
		// Removendo um Elemento da Lista pelo numerod a Posição!
		// Usamos o .remove(numero da posição)!
		listOfString.remove(2);
		
		
		for (String x : listOfString) {
			System.out.println(x);
		}
		
		for (Integer y : listOfInteger) {
			System.out.println(y);
		}
		
		System.out.println("----------------------------");
		
		// Removendo itens da lista com uma condição!
		// Remoção com predicado usando função lambda!
		// Usaremos o .removeIf(x -> x.chatAt(Posição da caracter que deseja comparar Ex: 0, 1, 2 ...) == 'Elemento da Comparação'
		listOfString.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : listOfString) {
			System.out.println(x);
		}
		
		System.out.println("----------------------------");
		
		// Encontrar a Posição em que um dado elemento da lista se encontra!
		System.out.println("Index of João: " + listOfString.indexOf("João"));
		System.out.println("Index of João: " + listOfString.indexOf("João"));
		
		System.out.println("----------------------------");
		
		List<String> result = listOfString.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
			
		}
		
		System.out.println("----------------------------");
		
		String name = listOfString.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		String name2 = listOfString.stream().filter(x -> x.charAt(0) == 'V').findFirst().orElse(null);
		System.out.println(name2);
		sc.close();

	}

}
