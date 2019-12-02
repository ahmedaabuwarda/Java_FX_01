/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lesson_04;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 * @author Ahmed Abuwarda, Date: Nov 27,2019.
 */
public class Scence extends Application {
    private Stage window;
    private Scene scene1, scene2;

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        launch(args);

    }

    public void start(Stage primaryStage) {

        window = primaryStage;
        Label label = new Label("Welcome");
        Button button1 = new Button("Go to scene2");
        button1.setOnAction(e -> window.setScene(scene2));
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label, button1);
        scene1 = new Scene(layout1, 200, 200);

        Button button2 = new Button("This is 1");
        button2.setOnAction(e -> window.setScene(scene1));
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 200, 200);

        window.setScene(scene1);
        window.setTitle("Title");
        window.show();

    }
}