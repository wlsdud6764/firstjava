package co.yedam.app.model;

import java.security.SignatureException;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

//DTO : Data transfer Objct
// == DO == VO == Beans
public class DepartmentsTable {
	private IntegerProperty departmentId;
	private StringProperty departmentName;
	private IntegerProperty managerId;
	private IntegerProperty locationId;
	
	//생성자 핃드초기화
	public DepartmentsTable() {
		departmentId = new SimpleIntegerProperty();
		departmentName= new SimpleStringProperty();
		managerId= new SimpleIntegerProperty();
		locationId= new SimpleIntegerProperty();
	}
	
	
	public IntegerProperty departmentIdProperty() {
		return departmentId;
	}
	public StringProperty departmentNameProperty() {
		return departmentName;
	}
	public IntegerProperty managerIdProperty() {
		return managerId;
	}
	public IntegerProperty locationIdProperty() {
		return locationId;
	}
	
	
	
	//읽기(조회) 접근메소드( getter&setter)
	public Integer getDepartmentId() {
		return departmentId.get();
	}
	//쓰기(변경)
	public void setDepartment_id(int departmentId) {
		this.departmentId.set(departmentId);
	}
	public String getDepartmentName() {
		return departmentName.get();
	}
	public void setDepartment_name(String departmentName) {
		this.departmentName.set(departmentName);
	}
	public Integer getMnagerId() {
		return managerId.get();
	}
	public void setMnagerId(int managerId) {
		this.managerId.set(managerId);
	}
	public Integer getLocationId() {
		return locationId.get();
	}
	public void setLocationId(int locationId) {
		this.locationId.set(locationId);
	

}
}
