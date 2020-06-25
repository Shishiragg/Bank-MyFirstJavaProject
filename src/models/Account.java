package models;


import java.util.Random;

public class Account {
	private int accountId;
	private int amount;
	private boolean isActive;

	public Account(int amount) {

		this.accountId = getUniqueID();
		this.amount = amount;
		this.isActive = true;
	}

	private int getUniqueID() {
		Random rand = new Random();
		return rand.nextInt(1000000) + 1;
	}

	int getAccountId() {
		return accountId;
	}

	private void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	int getAmount() {
		return amount;
	}

	void setAmount(int amount) {
		this.amount = amount;
	}

	private boolean isActive() {
		return isActive;
	}

	private void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	void showAccountDetails() {

		System.out.println("ACCOUNT DETAILS:");
		System.out.println("ACCOUNT ID:- " + getAccountId());
		System.out.println("ACCOUNT STATUS:- " + isActive);
		System.out.println("AMOUNT PRESENT:- " + amount);

	}

}
