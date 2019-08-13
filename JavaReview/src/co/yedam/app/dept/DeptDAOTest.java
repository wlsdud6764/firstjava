package co.yedam.app.dept;

import java.util.List;



public class DeptDAOTest {
	public static void main(String[] args) {
		Departments dept = new Departments();
		dept.setDepartment_id(240);
		dept.setDepartment_name("인사");
		dept.setManager_id(100);		
		dept.setLocation_id(1400);
		DeptDAOImpl.getInstance().insert(dept);
		
		List<Departments >list = DeptDAOImpl.getInstance().selectAll();
		for (Departments temp :list) {
			System.out.printf("%4d %20s %5d %5d\n",temp.getDepartment_id(),temp.getDepartment_name(),temp.getLocation_id(),temp.getManager_id());
			
		}
	}

}
