package Lab6;

public class SavingsAccount extends BankAccount {

	private double rate = 0.025;
	private int savingsNumber = 0;
	public String accountNumber;
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = getAccountNumber();
		
	}
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
	}
	public void postInterest() {
		setBalance(getBalance() + (getBalance() * rate) / 12);
	}
	public String getAccountNumber() {
		return accountNumber;
	}
}

