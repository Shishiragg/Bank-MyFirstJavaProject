package models;

import models.Person;

public class BankEmployee extends Person {

	private String employeeDesignation;
	private int salary;

	public BankEmployee(String name, String employeeDesignation, String gender, Address address, long mobileNumber,
			String email, int salary) {
		super(name, gender, address, mobileNumber, email);
		this.employeeDesignation = employeeDesignation;
		this.salary = salary;
	}

	private String getEmployeeDesignation() {
		return employeeDesignation;
	}

	private void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	private int getSalary() {
		return salary;
	}

	private void setSalary(int salary) {
		this.salary = salary;
	}

	public void showEmployeeDetails() {
		System.out.println("EMPLOYEE NAME IS: " + getName());
		System.out.println("EMPLOYEE GENDER IS :" + getGender());
		System.out.println("EMPLOYEE DESIGNATION IS : " + getEmployeeDesignation());
		System.out.println("EMPLOYEE SALARY IS :" + getSalary());
		System.out.println("EMPLOYEE MOBILENUMBER IS :" + getMobileNumber());
		System.out.println("EMPLOYEE EMAIL IS :" + getEmail());
		System.out.println("EMPLOYEE ADDRESS IS :");
		getAddress();
	}

}
