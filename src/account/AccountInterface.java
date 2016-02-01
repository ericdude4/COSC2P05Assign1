package account;

public interface AccountInterface {
	
	/**
	 * returns current account balance
	 * @return float
	 */
	public double getBalance();
	/**
	 * setter method for the balance
	 * @return void
	 */
	public void setBalance(double amount);
	/**
	 * returns the account number of the account
	 * @return int
	 */
	public int getAccountNumber();
	/**
	 * setter method for the account number
	 * @param number
	 */
	public void setAccountNumber(int number);
	/**
	 * subtracts given amount from the account and returns true if successful
	 * @param amount
	 * @return boolean
	 */
	public boolean withdraw(double amount);
	/**
	 * adds given amount to account and returns true if successful
	 * @param amount
	 * @return boolean
	 */
	public boolean deposit(double amount);
	/**
	 * returns the interest rate being applied to the account
	 * @return float
	 */
	public double getInterestRate();
	/**
	 * logs transactions with given information to logs.txt file
	 * @param transfer_type
	 * @param amount
	 * @param from_account
	 * @param to_account
	 */
	public void log(String transfer_type, double amount, int from_account, int to_account);
	
}
