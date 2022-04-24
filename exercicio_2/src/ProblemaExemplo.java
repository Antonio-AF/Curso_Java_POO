import java.util.Scanner;

/*
 * Problema Exemplo
 * 
 * Uma operadora de telefonia cobra R$50.00 por um plano básico que
 * dá direito a 100 minutos de telefone. Cada munuto que exceder a
 * franquia de 100 minutos custra R$2.00. Fazer um programa para ler a
 * quatidade de minutos que uma pessoa consumiu, daí mostrar o valor
 * a ser pago.
 * 
 * */
import java.util.Scanner;

public class ProblemaExemplo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int franquia, valor, excedente, conta;		
		franquia = 100;
		excedente = 2;
		valor = 50;
		
		System.out.println("Digite os Minutos Consumidos: ");
		int consumo = sc.nextInt();
		
		
		if (consumo <= franquia) {
			conta = valor;
			System.out.println("Valor da conta é R$" + conta);
		}
		else {
			conta = ((consumo - franquia) * excedente) + valor;
			System.out.println("O valor da Contra é R$" + conta);
		}
		

	}

}
