package employee.impl;

import employee.model.Department;
import employee.model.EmpService;
import employee.model.Employee;

public class EmpServiceImpl2 implements EmpService {

	@Override
	public void registerEmp(Employee emp, Employee[] ary) {// register 등록
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] == null) {
				ary[i] = emp;
				break;
			}
		}
	}

	@Override
	public void searchEmp(int empId, Employee[] ary) {// search 한사람 찾기
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != null && ary[i].getEmployeeId() == empId)
				System.out.println(ary[i]);
		}
	}

	@Override
	public void updatesalaryEmp(int empId, int salary, Employee[] ary) {// pdatesalary 급여 변경
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != null && ary[i].getEmployeeId() == empId) {
				ary[i].setSalary(salary);
				break;
			}

		}

	}

	@Override
	public void deleteEmp(int empId, Employee[] ary) {// delete 한사람 삭제
		int i = 0;
		for (; i < ary.length - 1; i++) {
			if (ary[i] != null && ary[i].getEmployeeId() == empId) {
				ary[i] = ary[i + 1];
				ary[i + 1] = null;
			}
		}
		Employee tmp = null;
		for (; i < ary.length; i++) {// 정렬
			for (int j = i + 1; j < ary.length; j++) {
				if (ary[i].getEmployeeId() > ary[j].getEmployeeId()) {
					tmp = ary[i];
					ary[i] = ary[j];
					ary[j] = tmp;

				}

			}
		}

	}

	@Override
	public void emplist(Employee[] ary , Department[] ari) {// list 전체리스트 조회
		System.out.println("==================================");
		System.out.println("사번" + "\t" + "이름" +  "\t" + "성" + "\t" + "급여" + "\t" + "부서이름"+ "\t" + "부서번호");
		System.out.println("==================================");
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != null) {
				System.out.println(ary[i].getEmployeeId()+"\t"+ary[i].getFirstName()+"\t"+ary[i].getLastName()+"\t"+ary[i].getSalary()+"\t"+ary[i].getDepartment()+"\t"+ari[i].getDepartmentName());
			}

		}
	}

	public void setDept(int empId, int deptId, Employee[] ary) {// 부서변경
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != null && ary[i].getEmployeeId() == empId) {
				ary[i].setDepartment(deptId);
			}
		}

	}

}
