package lamda;

import java.awt.Event;
import java.awt.event.ActionListener;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EventTset extends Application{

    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World");
        AnchorPane root = new AnchorPane();
//        root.setOnMouseClicked(value);
        Scene scene = new Scene(root, 300, 250);
        Button btn = new Button();
        btn.setLayoutX(100);
        btn.setLayoutY(80);
        btn.setText("Hello World");
        
        ///익명객체(추상메서드가 하나인 인터페이스 구현클래스)->람다식
        btn.setOnAction((event)-> {
        		System.out.println("핸들러 구현 클래스");
        });
        

// //       람다식으로 표현
//        btn.setOnAction((e)->{System.out.println("event"); });
//        root.getChildren().add(btn);
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        //클래스 안에 클래스 사용 => 내부 클래스
//        class Btn2EventHandler implements EventHandler<ActionEvent> {
//        	// 이벤트핸들러
//        	@Override
//        	public void handle(ActionEvent e) {
//        		System.out.println("핸들러 구현 클래스");
//        	}
//        }
        
        
        
        
//      btn.setOnAction(new EventHandler<ActionEvent>() {
//    	@Override
//    	public void handle(ActionEvent envent) {
//    		System.out.println("event");
//    	}
//    });
        
        
        
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World");
//            }
//        });
//        btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            public void handle(MouseEvent event) {
//                System.out.println("Hello World" + event.getX());//event는 마우스 이벤트 위치
//            }
//        });
        
        
        
//        BtnEventHandler handler = new BtnEventHandler();
//        btn.addEventHandler(Event.ACTION_EVENT, new ActionListener() {
//			
//			@Override
//			public void actionPerformed(java.awt.event.ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
       
    }

}
