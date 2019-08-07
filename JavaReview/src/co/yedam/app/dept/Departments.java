package co.yedam.app.dept;

//DTO : Data transfer Objct
// == DO == VO == Beans
public class Departments {
	private int department_id;
	private String department_name;
	private int manager_id;
	private int location_id;
	
	
	//읽기(조회) 접근메소드( getter&setter)
	public int getDepartment_id() {
		return department_id;
	}
	//쓰기(변경)
	public void setDepartment_id(int department_id) {
		this.department_id=department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	

}
