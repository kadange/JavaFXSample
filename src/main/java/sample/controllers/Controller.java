package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    public TextField usernameId;
    public PasswordField passwordId;
    public Button loginId;

    public void onLoginClick(ActionEvent actionEvent) throws IOException {
        System.out.println(usernameId.getText());
        System.out.println(passwordId.getText());
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/dashboard.fxml"));
        Parent root = loader.load();

        DashboardController dashboardController = loader.getController();
        dashboardController.initData(usernameId.getText());

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Dashboard");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
