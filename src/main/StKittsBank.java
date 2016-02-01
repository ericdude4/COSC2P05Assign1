package main;
import BasicIO.*;
import account.*;

public class StKittsBank {
	
	BasicForm form;	//form in which all user interaction is displayed
	Account s;
	
	/**
	 * Main thread. displays options to user and controls initialization
	 * of instance variables.
	 */
	
	public StKittsBank() {
		initForm();
		s = new Savings(1000.0);
		while( true ) {
			int button_choice = form.accept();
			buttonHandler(button_choice);
		}
	}
	
	/**
	 * This method handles the choice that the user had made regarding their account
	 * interactions.
	 * @param choice
	 */
	
	public void buttonHandler(int choice) {
		switch( choice ) {
		case 0:
			print("balance");
			form.accept("OK");
			break;
		case 1:
			print("deposit");
			form.accept("OK");
			break;
		case 2:
			print("withdraw");
			form.accept("OK");
			break;
		case 3:
			print("transfer");
			form.accept("OK");
			break;
		case 4:
			System.exit(0);
		}
	}
	
	/**
	 * Initializes the basic form for user interaction
	 */
	
	public void initForm() {
		form = new BasicForm("Balance", "Deposit", "Withdraw", "Transfer", "Quit");
		form.setTitle("Bank of St. Kitts");
		form.addRadioButtons("account", "Account", true, 10, 10, "savings", "vacation", "chequing", "investment", "student");
		form.addRadioButtons("otheraccount", "Other Account", true, 350, 10, "savings", "vacation", "chequing", "investment", "student");
		form.addTextField("prompt", 65);
		form.addTextField("amount", "Amount", 15, 150, 20);
	}
	
	/**
	 * useful method for speeding up bug fixing
	 * @param in
	 */
	
	public void print (String in) {
		System.out.println( in );
	}
	
	public static void main(String[] args) {
		new StKittsBank();
	}

}
