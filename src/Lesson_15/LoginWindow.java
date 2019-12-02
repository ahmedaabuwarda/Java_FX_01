/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lesson_15;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


/**
 * @author Ahmed Abuwarda, Date: Nov 27,2019.
 */
public class LoginWindow extends Application {

    private Stage window;
    private ListView<String> listView;

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        launch(args);

    }

    /**
     * @param primaryStage
     */
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

        listView = new ListView<>();
        GridPane.setConstraints(listView, 1, 2);
        listView.getItems().addAll("Remember Me", "Don not Remember Me");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        Button add = new Button("Add Selected");
        //GridPane.setConstraints(add, 1, 3);
        add.setOnAction(e -> getSelectedItems());

        Button login = new Button("Login");
        //GridPane.setConstraints(login, 1, 3);

        HBox hBox = new HBox();
        GridPane.setConstraints(hBox, 1, 3);
        hBox.getChildren().addAll(login, add);

        gridPane.getChildren().addAll(userLabel, userInput, passLabel, passInput, listView, hBox/*add, login*/);

        login.setOnAction(e -> System.out.println(isInt(userInput, passInput)));

        Scene scene = new Scene(gridPane, 500, 500);
        window.setScene(scene);
        window.show();

    }

    /**
     * @param userInput user name
     * @param passInput user password
     * @return true or false
     */
    private boolean isInt(TextField userInput, TextField passInput) {
        if (userInput.getText().equals("aa") && passInput.getText().equals("aa")) {
            return true;
        } else {
            return false;
        }
    }

    private void getSelectedItems() {
        String message = "";
        ObservableList<String> observableList = listView.getSelectionModel().getSelectedItems();
//        observableList = ;

        for (String m : observableList) {
            message += m + "\n";
        }
        System.out.printf(message);
    }

}