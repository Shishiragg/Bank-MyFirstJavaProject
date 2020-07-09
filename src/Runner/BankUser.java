package Runner;

import models.*;

public class BankUser {

	public static void main(String args[]) {
		
		Address customerAddress = new Address(1984, "kh road", "gandhinagar", "muzaffarnagar", "251001", "UP", "INDIA");

		Customer customer = new Customer("SHISHIR", "ATMPG6754", customerAddress, "Male", 9897502651l,
				"shishir@gmail.com");

		Address employeeAddress = new Address(1984, "kh road", "gandhinagar", "muzaffarnagar", "251001", "UP", "INDIA");

		BankEmployee bankEmployee = new BankEmployee("ANSHIKA", "BRANCH MANAGER", "FEMALE", employeeAddress,
				7906454647l, "anshika@gmail.com", 100000);

		Account account = new Account(100);

		BankAccount b = new BankAccount(account, customer);

		Address bankAddress = new Address(23, "vakil road", "new mandi", "muzaffarnagar", "251001", "UP", "INDIA");

		BankEmployee[] bankEmployees = new BankEmployee[1];
		bankEmployees[0] = bankEmployee;

		BankAccount[] bankAccounts = new BankAccount[1];
		bankAccounts[0] = b;

		SBI sbi = new SBI(bankAddress, bankEmployees, bankAccounts, "STATE BANK OF INDIA");
		HDFC hdfc = new HDFC(bankAddress, bankEmployees, bankAccounts, "HDFC BANK");
		b.deposit(100);
		System.out.println("==========================================");

		b.withdraw(5);
		System.out.println("==========================================");

		b.withdraw(200);
		System.out.println("==========================================");

		b.showBankAccountDetails();

		sbi.showBankDetails();
		System.out.println("==========================================");
		hdfc.showBankDetails();

	}
}
