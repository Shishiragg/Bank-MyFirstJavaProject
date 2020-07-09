package models;

public interface TemplateAccount {

	static final String CURRENT_BALANCE = "MONEY DEPOSITED SUCCESSFULLY.....\nYOUR CURRENT ACCOUNT BALANCE IS ";
	static final String CURRENTS_BALANCE = "MONEY WITHDRAWN SUCCESSFULLY...\nYOUR CURRENT ACCOUNT BALANCE IS ";
	static final String NOT_ENOUGH_BALANCE = "NOT ENOUGH BALANCE TO WITHDRAW !!";

	public void deposit(int amount);

	public void withdraw(int amount);

}
