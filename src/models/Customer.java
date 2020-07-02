package models;

import models.Person;

public class Customer extends Person {

	private String panNumber;

	public Customer(String accountHolderName, String panNumber, Address address, String gender, long mobileNumber,
			String email) {

		super(accountHolderName, gender, address, mobileNumber, email);
		this.panNumber = panNumber;
	}

	public Customer(String accountHolderName, String panNumber, String gender, Address address, String email) {
		super(accountHolderName, gender, address, email);

		this.panNumber = panNumber;
	}

	public Customer(String accountHolderName, String panNumber, String gender, Address address, long mobileNumber) {

		super(accountHolderName, gender, address, mobileNumber);
		this.panNumber = panNumber;

	}

	private String getPanNumber() {
		return panNumber;
	}

	private void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public void showCustomerDetails() {
		System.out.println("CUSTOMER NAME: " + getName());
		System.out.println("CUSTOMER PAN NUMBER:" + getPanNumber());
		System.out.println("CUSTOMER ADDRESS IS:");
		getAddress();
		System.out.println("CUSTOMER GENDER:" + getGender());
		System.out.println("CUSTOMER MOBILE NUMBER IS:" + getMobileNumber());
		System.out.println("CUSTOMER EMAIL IS: " + getEmail());

	}

}
