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

	public Employee() {
		employeeNumber++;
	}

	public Employee(int employeeNumber) {
		super();
		this.employeeNumber = employeeNumber;
	}

	public Employee(int employeeNumber, String firstName) {

		this(employeeNumber);
		this.firstName = firstName;
	}

	public Employee(int employeeNumber, String firstName, String lastName) {

		this(employeeNumber, firstName);
		this.lastName = lastName;
	}

	public Employee(int employeeNumber, String firstName, String lastName,
			String houseNumber) {

		this(employeeNumber, firstName, lastName);
		this.houseNumber = houseNumber;
	}

	public Employee(int employeeNumber, String firstName, String lastName,
			String houseNumber, String postCode) {
		this(employeeNumber, firstName, lastName, houseNumber);
		this.postCode = postCode;
	}

	public Employee(int employeeNumber, String firstName, String lastName,
			String houseNumber, String postCode, String nationalInsuranceNumber) {
		this(employeeNumber, firstName, lastName, houseNumber, postCode);
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}

	public Employee(int employeeNumber, String firstName, String lastName,
			String houseNumber, String postCode,
			String nationalInsuranceNumber, float startingSalary) {
		this(employeeNumber, firstName, lastName, houseNumber, postCode,
				nationalInsuranceNumber);
		this.startingSalary = startingSalary;
	}

	public Employee(int employeeNumber, String firstName, String lastName,
			String houseNumber, String postCode,
			String nationalInsuranceNumber, float startingSalary,
			String department) {
		this(employeeNumber, firstName, lastName, houseNumber, postCode,
				nationalInsuranceNumber, startingSalary);
		this.department = department;
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
