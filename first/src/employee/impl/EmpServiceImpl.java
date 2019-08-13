package employee.impl;

import java.util.List;

import boader.model.Boader;
import co.yedam.app.co.model.Employee;
import employee.model.EmpService;

public class EmpServiceImpl implements EmpService {
	EmpDAO dao = new EmpDAO();

	@Override
	public Employee getEmployee(int empId) {
		Employee emp = dao.getEmployee(empId);
		return emp;
	}

	@Override
	public List<Employee> getEmpList() {
		return dao.getEmpList();
	}

	@Override
	public List<Employee> getEmpList(String hireDate) {
		return null;
	}

	@Override
	public void insertEmp(Employee emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmp(int empId, int salary) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmp(Employee emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmp(int empId) {
		// TODO Auto-generated method stub

	}

}
