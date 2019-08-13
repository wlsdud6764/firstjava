package dept.javafx;

import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

import dept.Dept;
import dept.DeptDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class DeptController implements Initializable{

	@FXML private TableView<Dept> tableView;
	
	@FXML private TextField txtDepartmentId;
	@FXML private TextField txtDepartmentName;
	@FXML private TextField txtManagerId;
	@FXML private TextField txtLocationId;
	
    @FXML TableColumn<ObservableDept, String> colDepartmentId;
    @FXML TableColumn<ObservableDept, String> colDepartmentName;
    @FXML TableColumn<ObservableDept, String> colManagerId;
    @FXML TableColumn<ObservableDept, String> colLocationId;
    
	private Alert alert;
	DeptDAO  dao = new DeptDAO();
	
	@FXML
	protected void addDept(ActionEvent event) {
		//DB에 저장
		Dept dept = new Dept();
		dept.setLocationId(txtLocationId.getText());
		dept.setDepartmentName(txtDepartmentName.getText());
		dept.setManagerId(txtManagerId.getText());
		dao.insertDB(dept);
		
		//TableView에 추가
        ObservableList<Dept>data = tableView.getItems();
        data.add(dept);

        //저장완료 메시치 출력
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("ADD MESSAGE");
        alert.setHeaderText("추가되었습니다.");
        alert.setContentText("추가 처리되었습니다.");
        alert.showAndWait();

        //입력필드 초기화
        txtDepartmentId.setText("");
        txtLocationId.setText("");
        txtDepartmentName.setText("");
        txtManagerId.setText("");
	}
	
	@FXML
	protected void delDept(ActionEvent event) {
        Dept dept = tableView.getSelectionModel().getSelectedItem();
        ObservableList<Dept> data = tableView.getItems();

        alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("삭제 메시지");
        alert.setHeaderText("칼럼을 삭제하려합니다.");
        alert.setContentText("정말 삭제하시겠습니까?");

        Optional<ButtonType>result = alert.showAndWait();
        if(result.get() == ButtonType.OK) {
        	//DB에서 삭제
        	dao.deleteDB(dept);
        	//tableview 에서 삭제
        	data.remove(dept);
        }
	}
	
	@FXML
	protected void updDept(ActionEvent event) {
		Dept dept = new Dept();
		dept.setLocationId(txtLocationId.getText());
		dept.setDepartmentName(txtDepartmentName.getText());
		dept.setManagerId(txtManagerId.getText());
		dept.setDepartmentId(txtDepartmentId.getText());
		dao.updateDB(dept);
	}
	

    @FXML
    protected void getInformation(MouseEvent event) {
    	txtDepartmentName.setText(tableView.getSelectionModel().getSelectedItem().getDepartmentName());
    	txtManagerId.setText(tableView.getSelectionModel().getSelectedItem().getManagerId());
    	txtDepartmentId.setText(tableView.getSelectionModel().getSelectedItem().getDepartmentId());
    	txtLocationId.setText(tableView.getSelectionModel().getSelectedItem().getLocationId());
    }
	
	@FXML
	protected void getListDept(ActionEvent event) {
		ArrayList<Dept> list = dao.getDBList();
		
		tableView.setItems(FXCollections.observableArrayList(list) );
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Set up the table data
		colDepartmentId.setCellValueFactory(new PropertyValueFactory<ObservableDept, String>("departmentId"));
		colDepartmentName.setCellValueFactory(new PropertyValueFactory<ObservableDept, String>("departmentName"));
		colManagerId.setCellValueFactory(new PropertyValueFactory<ObservableDept, String>("managerId"));
		colLocationId.setCellValueFactory(new PropertyValueFactory<ObservableDept, String>("locationId"));
	}
}
