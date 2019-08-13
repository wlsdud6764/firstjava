package co.yedam.app.view;

import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javafx.application.Platform;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootControler implements Initializable {
	@FXML
	MenuBar menuBar;
	@FXML
	Button btnStart;
	@FXML
	Button btnStop;
	@FXML
	Label lblTimer;
	@FXML
	BorderPane borderPane;
	private Executor exec;
	boolean roop = true;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 스레드풀 생성
		exec = Executors.newCachedThreadPool((runnable) -> {
			Thread t = new Thread(runnable);
			t.setDaemon(true);
			return t;
		});
		btnStart.setOnAction((e) -> handlerTimerServiceStart(e));
		btnStop.setOnAction((e) -> {
			//handlerTimerServiceStop(e);
		});
		
	}
	
	
	@FXML
	public void handlePageDept(ActionEvent actionEvent) {
		try {
			AnchorPane deptView = 
				FXMLLoader.load(getClass().getResource("DeptFxml.fxml"));
			borderPane.setCenter(deptView);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void handlePageEmployee(ActionEvent actionEvent) {
		try {
			AnchorPane deptView = 
				FXMLLoader.load(getClass().getResource("Empfxml.fxml"));
			borderPane.setCenter(deptView);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	class TimeService extends Service<Void> {
		@Override
		protected Task<Void> createTask() {
			Task<Void> task = new Task<Void>() {

				@Override
				protected Void call() throws Exception {
					SimpleDateFormat sdt = new SimpleDateFormat("HH:mm:ss");
					while (roop) {
						Platform.runLater(() -> {
							lblTimer.setText(sdt.format(new Date()));
						});// Platform
						if (isCancelled())
							break;
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e1) {
							if (isCancelled())
								break;
						} // catch
					} // while
					return null;
				}// Void call()
			};// new Task<Void>()
			return task;
		}// Task<Void>
	}// TimeService

	private TimeService timeService;

	public void handlerTimerServiceStart(ActionEvent actionEvent) {
		Task<Void> task = new Task<Void>() {
			@Override
			protected Void call() throws Exception {
				SimpleDateFormat sdt = new SimpleDateFormat("HH:mm:ss");
				while (roop) {
					Platform.runLater(() -> {
						lblTimer.setText(sdt.format(new Date()));
					});// Platform
					if (isCancelled())
						break;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						if (isCancelled())
							break;
					} // catch
				} // while
				return null;
			}// Void call()
		};// new Task<Void>()
		exec.execute(task);
	}// handlerTimerServiceStart

	public void handlerTimerServiceStop(ActionEvent actionEvent) {
		timeService.cancel();
	}

	

	@FXML
	public void handleExit(ActionEvent actionEvent) {
		System.exit(0);
	}

	@FXML
	public void handleHelp(ActionEvent actionEvent) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("프로그램");
		alert.setHeaderText("사원관리 도움말");
		alert.setContentText("ㅇㅇㅇㅇ");
		alert.show();
	}

	@FXML
	public void handlPopup(ActionEvent actionEvent) {
		try {
			Popup popup = new Popup();
			popup.setAutoHide(true);
//			popup.setX(300);
//			popup.setY(200);
			AnchorPane loginView = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
			popup.getContent().add(loginView);
			ImageView img = (ImageView) loginView.lookup("#img");
			img.setOnMouseClicked(event -> popup.hide());
			Stage primaryStage = (Stage) menuBar.getScene().getWindow();
			popup.show(primaryStage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void handleDialog(ActionEvent actionEvent) {
		try {

			AnchorPane loginView = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
			Stage primaryStage = (Stage) menuBar.getScene().getWindow();
			Stage dialog = new Stage(StageStyle.UTILITY);
			dialog.initModality(Modality.WINDOW_MODAL);
			dialog.initOwner(primaryStage);
			dialog.setTitle("로그인");
			Scene scene = new Scene(loginView);
			dialog.setScene(scene);
			dialog.setResizable(false);
			dialog.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void handleOpen(ActionEvent actionEvent) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Text File", "*.txt"),
				new ExtensionFilter("Image Files", "*.jpg", "*.png", "*.gif"),
				new ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"), new ExtensionFilter("All Files", "*.*"));
		Stage primaryStage = (Stage) menuBar.getScene().getWindow();
		File selectedFile = fileChooser.showOpenDialog(primaryStage);
		String selectedFilePath = selectedFile.getPath();
		System.out.println(selectedFilePath);

	}

}
