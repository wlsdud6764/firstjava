package co.yedam.app.service.impl;

import java.util.List;

import co.yedam.app.model.Departments;





public class DeptDAOTest {
	public static void main(String[] args) {
		Departments dept = new Departments();
		dept.setDepartment_id(240);
		dept.setDepartment_name("진영");
		dept.setManager_id(100);		
		dept.setLocation_id(1400);
		
		//DeptServiceImpl.getInstance().insert(dept);
//		DeptServiceImpl.getInstance().delete(230);
		DeptServiceImpl.getInstance().update(dept);
		List<Departments >list = DeptServiceImpl.getInstance().selectAll();
		for (Departments temp :list) {
			System.out.printf("%4d %20s %5d %5d\n",temp.getDepartment_id(),temp.getDepartment_name(),temp.getLocation_id(),temp.getManager_id());
			
		}
	}

}
