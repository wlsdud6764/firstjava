package co.yedam.app.dept;

import java.util.List;
import java.util.Scanner;



public class DeptFrame {
	Scanner sc = new Scanner(System.in);
	DeptDAOImpl deptdao = new DeptDAOImpl();
	

	public DeptFrame() {
		menuPrint();
		int menuNo = menuSelect();
		if (menuNo == 1) {
			insertDept();
		} else if (menuNo == 2) {
			updateDept();
		} else if (menuNo == 3) {
			delecteDept();
		} else if (menuNo == 4) {
			selectOne();
		} else if (menuNo == 5) {
			selectAll();
		} else if (menuNo == 9) {
			end();
//				break;
		}
	}

	public void end() {
		System.out.println("종료");
	}

	public void selectAll() {
//		int deptNo = intputDeptNo();
		DeptDAOImpl.getInstance().selectAll();
		List<Departments> dlist = deptdao.selectAll();
		for (Departments str : dlist) {
			System.out.println(
					"부서번호" + str.getDepartment_id() + "부서이름" + str.getDepartment_name() + "매니저아이디 " + str.getManager_id());
			
		}
	}

	public void selectOne() {
		int deptNo = intputDeptNo();
		Departments dept = DeptDAOImpl.getInstance().selectOne(deptNo);
		if(dept==null) {
			System.out.println(deptNo + "없는 부서입니다");
		}else {
			System.out.printf("부서번호:%d  부서명:%s   매니저:%d\n",dept.getDepartment_id(), dept.getDepartment_name(), dept.getManager_id());
		}
	}

	public void delecteDept() {
		int deptNo = intputDeptNo();
		DeptDAOImpl.getInstance().delete(deptNo);

	}

	public void updateDept() {
		Departments dept =inputAll();
		DeptDAOImpl.getInstance().update(dept);

	}

	public void insertDept() {
		Departments dept =inputAll();
		DeptDAOImpl.getInstance().insert(dept);

	}

	public int menuSelect() {
		int menu = 0;
		try {
			System.out.println("메뉴를 선택하세요");
			menu = sc.nextInt();
		} catch (Exception e) {
			System.out.println("숫자를 입력하세요");
		}

		return menu;
	}

	public void menuPrint() {
		System.out.println("=========================================");
		System.out.println("1.등록 2.수정 3.삭제 4.부서조회 5.부서전체조회 9.종료");
		System.out.println("=========================================");

	}
	public Departments inputAll(){
		Departments depts = new Departments();	
		try {
		System.out.println("부서번호");
		depts.setDepartment_id(sc.nextInt());
		System.out.println("부서명");
		depts.setDepartment_name(sc.nextLine());
		System.out.println("매니저");
		depts.setLocation_id(sc.nextInt());
		System.out.println("지역");
		depts.setLocation_id(sc.nextInt());
		} catch (Exception e) {
			System.out.println("숫자를 입력하세요");
		}
		return depts;
	}
	public int intputDeptNo(){
		int deptNo=0;	
		System.out.println("부서번호를 입력하세요");
		deptNo = sc.nextInt();
		return deptNo;
		
	}

}
