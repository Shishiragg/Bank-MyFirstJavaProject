package models;


public class Customer {

	private String accountHolderName;
	private String panNumber;
	private Address address;
	private String gender;
	private long mobileNumber;
	private String email;

	public Customer(String accountHolderName, String panNumber, Address address, String gender, long mobileNumber,
			String email) {
		super();
		this.accountHolderName = accountHolderName;
		this.panNumber = panNumber;
		this.address = address;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}

	public Customer(String accountHolderName, String panNumber, Address address, String gender, String email) {

		this.accountHolderName = accountHolderName;
		this.panNumber = panNumber;
		this.address = address;
		this.gender = gender;
		this.email = email;
	}

	public Customer(String accountHolderName, String panNumber, Address address, String gender, long mobileNumber) {

		this.accountHolderName = accountHolderName;
		this.panNumber = panNumber;
		this.address = address;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
	}

	String getAccountHolderName() {
		return accountHolderName;
	}

	private void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	String getPanNumber() {
		return panNumber;
	}

	private void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	private String getGender() {
		return gender;
	}

	private void setGender(String gender) {
		this.gender = gender;
	}

	private String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	private Address getAddress() {
		return address;
	}

	private void setAddress(Address address) {
		this.address = address;
	}

	private long getMobileNumber() {
		return mobileNumber;
	}

	private void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void showCustomerDetails() {
		System.out.println("CUSTOMER NAME: " + getAccountHolderName());
		System.out.println("CUSTOMER PAN NUMBER:" + getPanNumber());
		System.out.println("CUSTOMER ADDRESS IS:");
		address.showAddressDetails();
		System.out.println("CUSTOMER GENDER:" + getGender());
		System.out.println("CUSTOMER MOBILE NUMBER IS:" + getMobileNumber());
		System.out.println("CUSTOMER EMAIL IS: " + getEmail());

	}

}
