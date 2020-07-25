package models;


public class BankAccount implements TemplateAccount {
	private Account account;
	private Customer customer;
	

	public BankAccount(Account acc, Customer custmer) {
		account = acc;
		customer = custmer;
	}

	@Override
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

	@Override
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