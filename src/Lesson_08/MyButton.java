/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lesson_08;

import Lesson_07.ConfirmCancel;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Ahmed Abuwarda, Date: Dec 02,2019.
 */
public class MyButton extends Application {

    static Stage window;

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Hi there");

        HBox topMenu = new HBox();
        Button button1 = new Button("File");
        Button button2 = new Button("Edit");
        Button button3 = new Button("View");
        topMenu.getChildren().addAll(button1, button2, button3);

        VBox leftMenu = new VBox();
        Button button4 = new Button("A");
        Button button5 = new Button("B");
        Button button6 = new Button("D");
        leftMenu.getChildren().addAll(button4, button5, button6);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        Scene scene = new Scene(borderPane, 300, 300);
        window.setScene(scene);
        window.show();
    }
}