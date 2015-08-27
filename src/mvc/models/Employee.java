package mvc.models;

public class Employee {

	private int employeeNumber;
	private String firstName;
	private String lastName;
	private String houseNumber;
	private String postCode;
	private String nationalInsuranceNumber;
	private float startingSalary;
	private String department;
	private String bankDetails;

	public Employee() {
	
	}


	public Employee(String firstName) {

		
		this.firstName = firstName;
	}

	public Employee(String firstName, String lastName) {

		this(firstName);
		this.lastName = lastName;
	}

	public Employee(String firstName, String lastName,
			String houseNumber) {

		this(firstName, lastName);
		this.houseNumber = houseNumber;
	}

	public Employee(String firstName, String lastName,
			String houseNumber, String postCode) {
		this(firstName, lastName, houseNumber);
		this.postCode = postCode;
	}

	public Employee(String firstName, String lastName,
			String houseNumber, String postCode, String nationalInsuranceNumber) {
		this(firstName, lastName, houseNumber, postCode);
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}

	public Employee(String firstName, String lastName,
			String houseNumber, String postCode,
			String nationalInsuranceNumber, float startingSalary) {
		this(firstName, lastName, houseNumber, postCode,
				nationalInsuranceNumber);
		this.startingSalary = startingSalary;
	}

	public Employee(String firstName, String lastName,
			String houseNumber, String postCode,
			String nationalInsuranceNumber, float startingSalary,
			String department) {
		this(firstName, lastName, houseNumber, postCode,
				nationalInsuranceNumber, startingSalary);
		this.department = department;
	}
	
	public Employee( String firstName, String lastName,
			String houseNumber, String postCode,
			String nationalInsuranceNumber, float startingSalary,
			String department,String bankDetails) {
		this(firstName, lastName, houseNumber, postCode,
				nationalInsuranceNumber, startingSalary,department);
		this.bankDetails = bankDetails;
	}
	
	

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getNationalInsuranceNumber() {
		return nationalInsuranceNumber;
	}

	public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}

	public float getStartingSalary() {
		return startingSalary;
	}

	public void setStartingSalary(float startingSalary) {
		this.startingSalary = startingSalary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(String bankDetails) {
		this.bankDetails = bankDetails;
	}

	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", firstName="
				+ firstName + ", lastName=" + lastName + ", houseNumber="
				+ houseNumber + ", postCode=" + postCode
				+ ", nationalInsuranceNumber=" + nationalInsuranceNumber
				+ ", startingSalary=" + startingSalary + ", department="
				+ department + "]";
	}

}
