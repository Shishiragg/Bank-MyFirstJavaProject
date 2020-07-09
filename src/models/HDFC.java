package models;

public class HDFC extends Bank {

	public HDFC(Address bankAddress, BankEmployee[] bankEmployee, BankAccount[] bankAccounts, String bankName) {
		super(bankAddress, bankEmployee, bankAccounts, bankName);

	}

	@Override
	public int getRateOfInterest() {
		return 10;
	}

}
