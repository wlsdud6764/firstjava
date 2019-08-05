package employee.control;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import employee.impl.DeptDAO;
import employee.impl.EmpServiceImpl;
import employee.model.EmpService;
import employee.model.Employee;

public class EmpProc {
	EmpService service =  new EmpServiceImpl();
	Scanner sc = new Scanner(System.in);

	public void execute() {
		DeptDAO dao = new DeptDAO();
		Map<Integer, String> map = dao.getDept();
		Set<Integer> keySet = map.keySet();
//		for (Integer intValue : keySet) {
//			System.out.println("부서번호: " + intValue 
//					+ ", 부서명: " + map.get(intValue));
//		}
//		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
//		for(Map.Entry<Integer, String> mapEntry : entrySet) {
//			System.out.println(mapEntry.getKey()+ ", " + mapEntry.getValue());
//		}
//		Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();
		
		Map<String, List<Employee>> mapEmp = new HashMap<>();
		
		System.out.println("1)리스트 2)단건");
		int menu = sc.nextInt();
		sc.nextLine();
		if (menu == 1) {
			List<Employee> list = service.getEmpList();
			for (Employee emp : list) {
				System.out.println(emp.getFirstName());
			}
		} else if (menu == 2) {
			System.out.println("조회할 사번 입력>>");
			int empId = sc.nextInt();
			Employee emp = service.getEmployee(empId);
			System.out.println(emp);
		}
	}
}
