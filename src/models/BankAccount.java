package models;


public class BankAccount {
	private Account account;
	private Customer customer;
	private static final String NOT_ENOUGH_BALANCE = "NOT ENOUGH BALANCE TO WITHDRAW !!";
	private static final String CURRENT_BALANCE = "MONEY DEPOSITED SUCCESSFULLY.....\nYOUR CURRENT ACCOUNT BALANCE IS ";
	private static final String CURRENTS_BALANCE = "MONEY WITHDRAWN SUCCESSFULLY...\nYOUR CURRENT ACCOUNT BALANCE IS ";

	public BankAccount(Account acc, Customer custmer) {
		account = acc;
		customer = custmer;
	}

	public void withdraw(int amount) {
		int presentAmount = account.getAmount();
		if (presentAmount < amount) {
			System.out.println(NOT_ENOUGH_BALANCE);
		} else {
			presentAmount = presentAmount - amount;
			account.setAmount(presentAmount);
			System.out.println(CURRENTS_BALANCE + presentAmount);
		}

	}

	public void deposit(int amount) {
		int presentAmount = account.getAmount();
		presentAmount = presentAmount + amount;
		account.setAmount(presentAmount);
		System.out.println(CURRENT_BALANCE + presentAmount);

	}

	public void showBankAccountDetails() {

		System.out.println("BANK ACCOUNT DETAILS: ");
		account.showAccountDetails();
		customer.showCustomerDetails();

	}
}