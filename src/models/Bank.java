package models;


public class Bank {
	private Address bankAddress;
	private BankEmployee[] bankEmployee;
	private BankAccount[] bankAccounts;
	private String bankName;

	public Bank(Address bankAddress, BankEmployee[] bankEmployee, BankAccount[] bankAccounts, String bankName) {
		super();
		this.bankAddress = bankAddress;
		this.bankEmployee = bankEmployee;
		this.bankAccounts = bankAccounts;
		this.bankName = bankName;
	}

	private Address getBankAddress() {
		return bankAddress;
	}

	private void setBankAddress(Address bankAddress) {
		this.bankAddress = bankAddress;
	}

	private BankEmployee[] getBankEmployee() {
		return bankEmployee;
	}

	private void setBankEmployee(BankEmployee[] bankEmployee) {
		this.bankEmployee = bankEmployee;
	}

	private BankAccount[] getBankAccounts() {
		return bankAccounts;
	}

	private void setBankAccounts(BankAccount[] bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	private String getBankName() {
		return bankName;
	}

	private void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void showBankDetails() {

		System.out.println("BANK NAME IS: " + getBankName());
		System.out.println("BANK ADDRESS IS: ");
		bankAddress.showAddressDetails();
		System.out.println("BANK EMPLOYEES ARE:");
		for (int i = 0; i < bankEmployee.length; i++) {
			bankEmployee[i].showEmployeeDetails();
		}
		for (int i = 0; i < bankAccounts.length; i++) {
			bankAccounts[i].showBankAccountDetails();
		}
	}
}