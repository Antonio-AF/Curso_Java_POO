//package entities;

//public class SavingsAccountPlus extends SavingsAccount  {

//}

/* Ao colocar a palavra reservada final na classe SavingsAccount ela não poderá
ser herdada por outra classe. */

package entities;

public class SavingsAccountPlus extends SavingsAccount  {
	
	@Override
	public void withdraw(double amount) {
		balance -= amount + 2.0;
	}

}

/* Ao colocar a palavra reservada final no metodo withdraw da classe SavingsAccount
 * ela não poderá ser herdada por outra classe. */