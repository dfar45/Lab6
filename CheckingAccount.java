package Lab6;

public class CheckingAccount extends BankAccount {

	private double FEE = 0.15;
	public CheckingAccount(String owner, double balance) {
		super (owner, balance);
		super.setAccountNumber(getAccountNumber()+"-"+10);
	}
	
	@Override
	public boolean withdraw(double amount) {
		FEE += amount;
		return super.withdraw(FEE);
	}
}

