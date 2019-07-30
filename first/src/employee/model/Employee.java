package employee.model;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private int salary;
	private int department;

	public Employee(int employeeId, String firstName, String lastName, int salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() { ///한명씩조회
		return "사원번호: " + employeeId + "이름 : " + firstName  +  "성: "  + lastName+  "뤌급은" + salary +  "부서: " + department;
	}
	

}
