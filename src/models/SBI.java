package models;

public class SBI extends Bank {

	public SBI(Address bankAddress, BankEmployee[] bankEmployee, BankAccount[] bankAccounts, String bankName) {
		super(bankAddress, bankEmployee, bankAccounts, bankName);

	}

	@Override
	public int getRateOfInterest() {
		return 9;

	}

}
