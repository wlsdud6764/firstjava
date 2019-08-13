package co.yedam.app.view;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import co.yedam.app.model.Departments;
import co.yedam.app.model.DepartmentsTable;
import co.yedam.app.service.DeptService;
import co.yedam.app.service.impl.DeptServiceImpl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class DeptController implements Initializable {
	@FXML
	private Button btnInsert;
	@FXML
	private Button btnUpsate;
	@FXML
	private Button btnDelect;
	@FXML
	private Button btnSelectIOne;
	@FXML
	private TextArea areaResult;
	@FXML
	private TextField txtDepartmentId;
	@FXML
	private TextField txtDepartmentName;
	@FXML
	private TextField txtManagerId;
	@FXML
	private TextField txtLocayionId;
	@FXML
	private TableView<DepartmentsTable> tvDept;
	@FXML
	private TableColumn<DepartmentsTable, Integer> columnDepartmentsId;
	@FXML
	private TableColumn<DepartmentsTable, String> columnDepartmentName;
	@FXML
	private TableColumn<DepartmentsTable, Integer> columnManagerId;
	@FXML
	private TableColumn<DepartmentsTable, Integer> columnLocationId;
//쓰레드풀 지정
	private Executor exec;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		columnDepartmentsId.setCellValueFactory(cellData -> cellData.getValue().departmentIdProperty().asObject());
		columnDepartmentName.setCellValueFactory(cellData -> cellData.getValue().departmentNameProperty());
		columnManagerId.setCellValueFactory(cellData -> cellData.getValue().managerIdProperty().asObject());
		columnLocationId.setCellValueFactory(cellData -> cellData.getValue().locationIdProperty().asObject());
		// 쓰레드풀 생성
		exec = Executors.newCachedThreadPool((runnable) -> {
			Thread t = new Thread(runnable);
			t.setDaemon(true);
			return t;
		});
	}

//이벤트 만들기
	@FXML // 추가
	private void inseruDept(ActionEvent actionEvent) {
		try {

			Departments dept = new Departments();
			dept.setDepartment_id(Integer.parseInt(txtDepartmentId.getText()));
			dept.setDepartment_name(txtDepartmentId.getText());
			dept.setLocation_id(Integer.parseInt(txtLocayionId.getText()));
			dept.setManager_id(Integer.parseInt(txtManagerId.getText()));

			DeptServiceImpl.getInstance().insert(dept);

			areaResult.setText("deptno: " + txtDepartmentId.getText() + "\n");

		} catch (Exception e) {
			areaResult.setText("Problem occurred while insert: " + e);
		}
	}

	@FXML // 삭제
	private void DelectDept(ActionEvent actionEvent) {
		try {
			//테이블뷰에서 선책한 부서 읽기
			int deptId = Integer.parseInt(txtDepartmentId.getText());
			// DB삭제
			int deprtmentId= tvDept.getSelectionModel().getSelectedItem().getDepartmentId();
			
			DeptServiceImpl.getInstance().delete(deprtmentId);
			ObservableList<DepartmentsTable> dates =tvDept.getItems();//전체 데이터
			DepartmentsTable dept = tvDept.getSelectionModel().getSelectedItem();//선택행
			dates.remove(dept);
			
			areaResult.setText("삭제");
		} catch (Exception e) {
			areaResult.setText("Problem occurred while delecte: " + e);
		}
		
			
	}

	@FXML // 업데이트
	private void updateDept(ActionEvent actionEvent) {
		try {

			Departments dept = new Departments();
			dept.setDepartment_id(Integer.parseInt(txtDepartmentId.getText()));
			dept.setDepartment_name(txtDepartmentId.getText());
			dept.setLocation_id(Integer.parseInt(txtLocayionId.getText()));
			dept.setManager_id(Integer.parseInt(txtManagerId.getText()));

			DeptServiceImpl.getInstance().update(dept);

			areaResult.setText("deptno: " + txtDepartmentId.getText() + "\n");

		} catch (Exception e) {
			areaResult.setText("Problem occurred while update: " + e);
		}
	}

	@FXML // 전체조회
	private void SelectAllDept(ActionEvent actionEvent) {
		Task<ObservableList<DepartmentsTable>> task = new Task<ObservableList<DepartmentsTable>>() {
			@Override
			public ObservableList<DepartmentsTable> call() throws Exception {
				List<DepartmentsTable> list = DeptServiceImpl.getInstance().selectAllTable();
				ObservableList<DepartmentsTable> obsList = FXCollections.observableArrayList(list);
				return obsList;
			}
		};

		// 작업실행 완료후 호출
		task.setOnSucceeded(e -> tvDept.setItems((ObservableList<DepartmentsTable>) task.getValue()));
		// 작업실행 시작
		exec.execute(task);
	}

	@FXML // 하나조회
	private void showDeptDetails(ActionEvent actionEvent) {
		try {
			Departments dept = new Departments();
			if (dept != null) {
				txtDepartmentId.setText(Integer.toString(dept.getDepartment_id()));
				txtDepartmentName.setText(dept.getDepartment_name());
				txtManagerId.setText(Integer.toString(dept.getManager_id()));
				txtLocayionId.setText(Integer.toString(dept.getLocation_id()));
			}
		} catch (Exception e) {

		}
	}

	@FXML // 하나조회
	protected void getInformation(MouseEvent mouseenvent) {

		txtDepartmentName.setText(tvDept.getSelectionModel().getSelectedItem().getDepartmentName());
		String manager = String.valueOf(tvDept.getSelectionModel().getSelectedItem().getDepartmentId());
		txtDepartmentId.setText(manager);
		txtManagerId.setText(String.valueOf(tvDept.getSelectionModel().getSelectedItem().getDepartmentId()));
		txtLocayionId.setText(String.valueOf(tvDept.getSelectionModel().getSelectedItem().getDepartmentId()));

	}
}
