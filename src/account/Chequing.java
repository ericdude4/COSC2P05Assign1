package account;

public class Chequing extends Account{
	
	private double transaction_fee;
	private double interest_rate;
	
	public Chequing(double balance) {
		super.setBalance(balance);
		this.interest_rate = 0.018;
		this.transaction_fee = 1.0;
	}
	/**
	 * if balance is greater than minimum balance, no transaction fee is applied.
	 * Otherwise there is a fee applied. always returns true because overdrawing
	 * is allowed
	 */
	@Override
	public boolean withdraw(double amount) {
		super.setBalance(super.getBalance() - transaction_fee - amount);
		return true;
	}
	
}
