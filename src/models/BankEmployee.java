package models;


public class BankEmployee {

	private String employeeName;
	private String employeeDesignation;
	private String employeeGender;
	private Address employeeAddress;
	private int salary;

	public BankEmployee(String employeeName, String employeeDesignation, String employeeGender, Address employeeAddress,
			int salary) {

		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeGender = employeeGender;
		this.employeeAddress = employeeAddress;
		this.salary = salary;
	}

	private String getEmployeeName() {
		return employeeName;
	}

	private void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	private String getEmployeeDesignation() {
		return employeeDesignation;
	}

	private void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	private String getEmployeeGender() {
		return employeeGender;
	}

	private void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	private Address getEmployeeAddress() {
		return employeeAddress;
	}

	private void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	private int getSalary() {
		return salary;
	}

	private void setSalary(int salary) {
		this.salary = salary;
	}

	public void showEmployeeDetails() {
		System.out.println("EMPLOYEE NAME IS: " + getEmployeeName());
		System.out.println("EMPLOYEE GENDER IS :" + getEmployeeGender());
		System.out.println("EMPLOYEE DESIGNATION IS : " + getEmployeeDesignation());
		System.out.println("EMPLOYEE SALARY IS :" + getSalary());
		System.out.println("EMPLOYEE ADDRESS IS :");
		employeeAddress.showAddressDetails();

	}
}
