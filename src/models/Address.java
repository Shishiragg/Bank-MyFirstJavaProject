package models;


public class Address {
	private double houseNumber;
	private String Street;
	private String colony;
	private String city;
	private String pin;
	private String state;
	private String country;

	public Address(double houseNumber, String street, String colony, String city, String pin, String state,
			String country) {

		this.houseNumber = houseNumber;
		Street = street;
		this.colony = colony;
		this.city = city;
		this.pin = pin;
		this.state = state;
		this.country = country;
	}

	private double getHouseNumber() {
		return houseNumber;
	}

	private void setHouseNumber(double houseNumber) {
		this.houseNumber = houseNumber;
	}

	private String getStreet() {
		return Street;
	}

	private void setStreet(String street) {
		Street = street;
	}

	private String getColony() {
		return colony;
	}

	private void setColony(String colony) {
		this.colony = colony;
	}

	private String getCity() {
		return city;
	}

	private void setCity(String city) {
		this.city = city;
	}

	private String getPin() {
		return pin;
	}

	private void setPin(String pin) {
		this.pin = pin;
	}

	private String getState() {
		return state;
	}

	private void setState(String state) {
		this.state = state;
	}

	private String getCountry() {
		return country;
	}

	private void setCountry(String country) {
		this.country = country;
	}

	public void showAddressDetails() {
		System.out.println("HOUSE NUMBER:" + getHouseNumber());
		System.out.println("STREET IS :" + getStreet());
		System.out.println("COLONY IS :" + getColony());
		System.out.println("CITY IS : " + getCity());
		System.out.println("STATE IS:" + getState());
		System.out.println("COUNTRY IS: " + getCountry());
	}

}
