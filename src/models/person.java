package models;

public class Person {
	private String name;
	private String gender;
	private long mobileNumber;
	private String email;
	private Address address;

	public Person(String name, String gender, Address address, long mobileNumber, String email) {
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}

	public Person(String name, String gender, Address address, String email) {
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.address = address;
	}

	public Person(String name, String gender, Address address, long mobileNumber) {
		this.name = name;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getGender() {
		return gender;
	}

	void setGender(String gender) {
		this.gender = gender;
	}

	long getMobileNumber() {
		return mobileNumber;
	}

	void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email;
	}

	void getAddress() {
		address.showAddressDetails();
	}

	void setAddress(Address address) {
		this.address = address;
	}

}
