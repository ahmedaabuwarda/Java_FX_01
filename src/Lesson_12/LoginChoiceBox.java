/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lesson_12;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 * @author Ahmed Abuwarda, Date: Nov 27,2019.
 */
public class LoginChoiceBox extends Application {

    private Stage window;

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("Ahmed");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(50, 40, 50, 40));
        gridPane.setHgap(10);
        gridPane.setVgap(8);

        Label userLabel = new Label("Username:");
        GridPane.setConstraints(userLabel, 0, 0);

        TextField userInput = new TextField();
        userInput.setPromptText("Username");
        GridPane.setConstraints(userInput, 1, 0);

        Label passLabel = new Label("Password");
        GridPane.setConstraints(passLabel, 0, 1);

        TextField passInput = new TextField();
        passInput.setPromptText("Password");
        GridPane.setConstraints(passInput, 1, 1);

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Remember Me", "Don not Remember Me");
        choiceBox.setValue("Remember Me");
        GridPane.setConstraints(choiceBox, 1, 2);

        Button login = new Button("Login");
        GridPane.setConstraints(login, 1, 3);

        gridPane.getChildren().addAll(userLabel, userInput, passLabel, passInput, choiceBox, login);

        login.setOnAction(e -> System.out.println(isInt(userInput, passInput) + " " + choiceBox.getValue()));

        Scene scene = new Scene(gridPane, 300, 250);
        window.setScene(scene);
        window.show();

    }

    private boolean isInt(TextField userInput, TextField passInput) {
        if (userInput.getText().equals("aa") && passInput.getText().equals("aa")) {
            return true;
        } else {
            return false;
        }
    }
}