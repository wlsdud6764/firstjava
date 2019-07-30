package employee.model;

public interface EmpService {
	public void registerEmp(Employee emp, Employee[] ary);

	public void searchEmp(int empId, Employee[] ary);

	public void emplist(Employee[] ary, Department[] ari);

	public void updatesalaryEmp(int empId, int salary, Employee[] ary);

	public void deleteEmp(int empId, Employee[] ary);

	default void setDept(int empId, int deptId, Employee[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != null && ary[i].getEmployeeId() == empId) {
				ary[i].setDepartment(deptId);
			}
		}
	}

	static void showDeptList(Department[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != null){
				System.out.println(ary[i].getDepartmentId()+ary[i].getDepartmentName());
			}
			
			}
		}
}
	

	
