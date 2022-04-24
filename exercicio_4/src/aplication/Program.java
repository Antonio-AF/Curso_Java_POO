package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee func_1 = new Employee();
		
		System.out.println("Enter your Name: ");
		func_1.name = sc.nextLine();		
		
		System.out.println();
		System.out.println("Enter your Gross Salary: ");
		func_1.grossSalary = sc.nextDouble();
		
		System.out.println();
		System.out.println("Enter your Tax: ");
		func_1.tax = sc.nextDouble();
		
		double salaryTax = func_1.netSalary();
		System.out.println();
		System.out.printf("Employee: " + func_1.name + ", $" + salaryTax + "%n");
		
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		int incrementSalary = sc.nextInt();
		
		func_1.increaseSalary(incrementSalary);
		System.out.printf("Updated data: " + func_1.name + ", $" + func_1);
		
		sc.close();
	}

}
