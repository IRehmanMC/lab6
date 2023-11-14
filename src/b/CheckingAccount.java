package b;

public class CheckingAccount extends BankAccount {
	private final double FEE = 0.15;
	
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		setAccountNumber(numberOfAccounts + "-10");
	}
	public boolean withdraw(double amount) {
		double amount1 = amount + FEE;
		return super.withdraw(amount1);
	}
}

