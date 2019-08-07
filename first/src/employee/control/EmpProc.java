package employee.control;

import java.util.ArrayList;
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
	EmpService service = new EmpServiceImpl();
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

		boolean flag = true;
		while (flag) {
			System.out.println("1)전체 리스트  2)사원 조회  3)입사일 조회  4)사원 등록  5)연봉 변경  6)부서 및 연락처 변경  7)사원 삭제  8)종료");
			int menu = sc.nextInt();
			switch (menu) {
			case 1: // 전체 조회
				System.out.println("사원 전체의 이름을 조회합니다.");
				List<Employee> list = service.getEmpList();
				for (Employee emp : list)
					System.out.println(emp.getFirstName() + " " + emp.getLastName());
				break;
			case 2: // 한 사람 조회
				System.out.println("조회할 사번 입력>>");
				int empId = sc.nextInt();
				Employee emp = service.getEmployee(empId);
//			System.out.println(emp); 주소값나옴
				System.out.println(emp.getFirstName() + " " + emp.getLastName());
				break;

			case 3: // 입사일 조회
				System.out.println("언제 이후 입사한 사원들을 알고 싶나요?");
				String hireDate = sc.next();
				List<Employee> list2 = new ArrayList<>();
				list2 = service.getEmpList(hireDate);
				for (Employee emp1 : list2)
					System.out.println("Last Name: " + emp1.getLastName() + ", Hire Date: " + emp1.getHireDate());
				break;

			}

		}
	}
}
