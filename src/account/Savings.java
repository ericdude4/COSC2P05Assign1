package account;

public class Savings extends Account{
	
	private double minimum_balance;
	private double transaction_fee;
	private double interest_rate;
	
	public Savings(double balance) {
		super.setBalance(balance);
		this.minimum_balance = 1000.0;
		this.interest_rate = 0.013;
		this.transaction_fee = 0.5;
	}
	/**
	 * if balance is greater than minimum balance, no transaction fee is applied.
	 * Otherwise there is a fee applied. returns false if overdraw.
	 */
	@Override
	public boolean withdraw(double amount) {
		if (super.getBalance() - amount < 0) return false;
		
		if (super.getBalance() >= minimum_balance){
			super.withdraw(amount);
			return true;
		}	else {
			super.setBalance(super.getBalance() - transaction_fee);
			super.withdraw(amount);
			return true;
		}	
	}
	
}
