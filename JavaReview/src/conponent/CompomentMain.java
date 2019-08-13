package conponent;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CompomentMain extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	final ToggleGroup group = new ToggleGroup();// 중복선택이 안되게 하기위해서 그룹으로 묶어줌

	@Override
	public void start(Stage primaryStage) throws Exception {// stage가 윈도우창// 씬을 만들어서 추가

		GridPane grid = FXMLLoader.load(getClass().getResource("component.fxml"));
		
		
		Scene scene = new Scene(grid, 300, 275);
		primaryStage.setScene(scene);
		primaryStage.setTitle("연습");
		primaryStage.show();
		
//		fxml 사용안하고 직접 코딩해서 ui만드는법
		//		GridPane grid = new GridPane();
//		grid.setAlignment(Pos.CENTER);
//		grid.setHgap(10);
//		grid.setVgap(10);
//		grid.setPadding(new Insets(25, 25, 25, 25));
//
//		RadioButton rb1 = new RadioButton();
//		rb1.setText("Home");
//		rb1.setUserData("H");
//		rb1.setToggleGroup(group);
//
//		RadioButton rb2 = new RadioButton("Calendar");
//		rb2.setUserData("C");
//		rb2.setToggleGroup(group);
//
//		grid.add(rb1, 0, 0);// 라디오 박스 grid에 추가하기
//		grid.add(rb2, 1, 0);
//
//		// 이벤투 추가
//		group.selectedToggleProperty()
//				.addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
//					if (group.getSelectedToggle() != null) {
//						String slectDate = group.getSelectedToggle().getUserData().toString();/// getSelectedToggle()는 유저가 선택한것을 가져와라
//						System.out.println(slectDate);
//					}
//				});

//		Scene scene = new Scene(grid, 300, 275);
//		primaryStage.setScene(scene);
//		primaryStage.show();
	}

}
