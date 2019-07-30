package employee.controller;

import java.util.Scanner;

import employee.impl.EmpServiceImpl2;
import employee.model.Department;
import employee.model.EmpService;
import employee.model.Employee;

public class HumanResources {
	Scanner sc = new Scanner(System.in);
	Employee[] employees = new Employee[10];
	EmpService service = new EmpServiceImpl2();
	private int empId;
	Department[] departments = { new Department(10, "Administration"), new Department(20, "Marketing"),
			new Department(30, "purchasing"), new Department(40, "Human Resource") };

	public void execute() {// 두번째 실행
		int menu = 0;
		while (true) {
			printMenu();
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				System.out.println("<등록 화면>");
				register();
			} else if (menu == 2) {
				System.out.println("<조회화면>");
				serch();
			} else if (menu == 3) {
				System.out.println("리스트화면");
				list();
			} else if (menu == 4) {
				System.out.println("<변경 화면>");
				updatesalary();
			} else if (menu == 5) {
				System.out.println("<삭제 화면>");
				delete();
			} else if (menu == 6) {
				System.out.println("<부서수정>");
				update();
			} else if (menu == 7) {
				System.out.println("종료");
				System.exit(0);
			}
		}

	}

	public void printMenu() {
		System.out.println("메뉴룰 선택  1)등록  2)조회  3)전체리스트 4)변경 5)삭제 6) 부서수정 7) 종료");

	}

	public void register() {
		System.out.println("사번입력하세요");
		int employeeId = sc.nextInt();
		sc.nextLine();
		System.out.println("이름을입력하세요");
		String firstName = sc.nextLine();
		System.out.println("성을입력하세요");
		String lastName = sc.nextLine();
		System.out.println("급여를 입력하세요");
		int salary = sc.nextInt();
		sc.nextLine();
		
		Employee emp = new Employee(employeeId, firstName, lastName, salary);
		service.registerEmp(emp, employees);

	}

	public void serch() {
		System.out.println("조회할 사번을 입력하세요");
		int employeeId = sc.nextInt();
		sc.nextLine();
		service.searchEmp(employeeId, employees);
	}

	public void list() {
		service.emplist(employees,departments);
//		System.out.println("ddkkllll");
//		System.out.println(employees);
	}

	public void updatesalary() {
		System.out.println("변경할 사번을 입력하세요");
		int employeeId = sc.nextInt();
		sc.nextLine();
		System.out.println("변경할 급여을 입력하세요");
		int salary = sc.nextInt();
		sc.nextLine();
		service.updatesalaryEmp(employeeId, salary, employees);
	}

	public void delete() {
		System.out.println("삭제할 사번을 입력하세요");
		int employeeId = sc.nextInt();
		sc.nextLine();
		service.deleteEmp(employeeId, employees);
	}

	public void update() {
		EmpService.showDeptList(departments);
		System.out.println("변경할 사번을 입력하세요");
		int employeeId = sc.nextInt();
		System.out.println("부서를 입력하세요");
		int deptId = sc.nextInt();
		sc.nextLine();
		service.setDept(employeeId, deptId, employees);
	}

}
