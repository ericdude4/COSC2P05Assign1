package account;

public class Account implements AccountInterface {
	
	private double balance;
	private int account_num;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double amount) {
		this.balance = amount;
	}

	public boolean withdraw(double amount) {
		balance = balance - amount;
		return true;
	}

	public boolean deposit(double amount) {
		balance = balance + amount;
		log("Deposit", amount, 0, account_num);
		return true;
	}

	public double getInterestRate(){
		return 0.0;
	}

	public int getAccountNumber() {
		return this.account_num;
	}

	public void setAccountNumber(int number) {
		this.account_num = number;
	}

	public void log(String transfer_type, double amount, int from_account,
			int to_account) {
		// TODO Auto-generated method stub
	}
}
