package b;

public class SavingsAccount extends BankAccount {
	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber = "";
	
	public SavingsAccount(String name, double balance) {
		super(name, balance);
		this.accountNumber = super.getAccountNumber() + " : " + savingsNumber;
	}
	public SavingsAccount( SavingsAccount otherAccount, double balance) {
		super(otherAccount, balance);
		this.savingsNumber = ++otherAccount.savingsNumber;
		this.accountNumber = super.getAccountNumber() + " : " + savingsNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void postInterest() {
		super.deposit(super.getBalance() * (rate/12));
	}
}
