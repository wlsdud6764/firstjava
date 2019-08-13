package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private TableView<Person>tableView;
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField emailField;
    @FXML private TextField phoneField;
    private Alert alert;

    @FXML
    protected void addPerson(ActionEvent event) {
        Person currentPerson = new Person(firstNameField.getText(), lastNameField.getText(), emailField.getText(), phoneField.getText());
        ObservableList<Person>data = tableView.getItems();
        data.add(currentPerson);

        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("ADD MESSAGE");
        alert.setHeaderText("추가되었습니다.");
        alert.setContentText("추가 처리되었습니다.");
        alert.showAndWait();

        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");
        phoneField.setText("");
    }

    @FXML
    protected void delPerson(ActionEvent event) {
        Person currentPerson = tableView.getSelectionModel().getSelectedItem();
        ObservableList<Person>data = tableView.getItems();

        alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("삭제 메시지");
        alert.setHeaderText("칼럼을 삭제하려합니다.");
        alert.setContentText("정말 삭제하시겠습니까?");

        Optional<ButtonType>result = alert.showAndWait();
        if(result.get() == ButtonType.OK) {
            data.remove(currentPerson);
        }
    }

    @FXML
    protected void getInformation(MouseEvent event) {
        firstNameField.setText(tableView.getSelectionModel().getSelectedItem().getFirstName());
        lastNameField.setText(tableView.getSelectionModel().getSelectedItem().getLastName());
        emailField.setText(tableView.getSelectionModel().getSelectedItem().getEmail());
        phoneField.setText(tableView.getSelectionModel().getSelectedItem().getPhone());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}