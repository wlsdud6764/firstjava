package dept.javafx;

import javafx.beans.property.SimpleStringProperty;

public class ObservableDept {

	public SimpleStringProperty departmentId = new SimpleStringProperty();
    public SimpleStringProperty departmentname = new SimpleStringProperty();
    public SimpleStringProperty managerId = new SimpleStringProperty();
    public SimpleStringProperty locationId = new SimpleStringProperty();
         
    public String getDepartmentId() {
        return departmentId.get();
    }
 
    public String getDepartmentname() {
        return departmentname.get();
    }
 
    public String getManagerId() {
        return managerId.get();
    }
 
    public String getLocationId() {
        return locationId.get();
    }
}

