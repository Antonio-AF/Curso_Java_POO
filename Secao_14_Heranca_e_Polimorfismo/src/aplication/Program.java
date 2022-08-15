package aplication;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {


		new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
				if (acc3 instanceof BusinessAccount) {
					BusinessAccount acc5 = (BusinessAccount)acc3;
					acc5.loan(200.0);
					System.out.println("Loan!");
				}
				
				if (acc3 instanceof SavingsAccount) {
					SavingsAccount acc5 = (SavingsAccount)acc3;
					acc5.updateBalance();
					System.out.println("Update!");
				}
				
		// @Override
		
		Account acc41 = new Account(1005, "Af", 2300.00);
		acc41.withdraw(400.00);
		System.out.println(acc41.getBalance());
		
		Account acc23 = new Account(1008, "Dora", 4500.00);
		acc23.withdraw(400.00);
		acc23.deposit(1000.00);
		System.out.printf("Senhora " + acc23.getHolder()
			+"Você possue " + "R$" +acc23.getBalance()
			+ "na conta" + acc23.getNumber());
		
		Account acc33 = new SavingsAccount(2000, "Tais", 1000.00, 0.01);
		acc33.withdraw(200.00);
		System.out.println(acc33.getBalance());
		
		
		
		// Usando o super()
		Account acc12 = new BusinessAccount(1032, "Antonio", 10000.00, 1000.00);
		acc12.withdraw(800.00);	
		System.out.println("Saque: R$" + acc12.getBalance() + "Você sacou: ");
		
		
		//Polimorfismo
		
		Account x = new Account(2002, "Antonio", 1000.00);
		Account y = new SavingsAccount(2004, "Amaral", 1000.00, 0.1);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
	}
	
	

}
