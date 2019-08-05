package employee.model;

import java.util.List;

import boader.model.Boader;

public interface EmpService {
	// 한건조회.
	public Employee getEmployee(int empId);
	// 리스트 조회(전체)
	public List<Employee> getEmpList();
	// 리스트 조회(입사일 이후)
	public List<Employee> getEmpList(String hireDate);
	
	// 사원등록
	public void insertEmp(Employee emp);
	
	// 급여변경
	public void updateEmp(int empId, int salary);
	
	// 부서변경, 전화번호 변경
	public void updateEmp(Employee emp);
	// 사원삭제
	public void deleteEmp(int empId);
	
}
