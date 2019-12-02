/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lesson_01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.scene.control.Button;

/**
 * @author Ahmed Abuwarda, Date: Sep 04,2019.
 */
public class HelloFX extends Application {

    private Button button;

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        launch(args);

    }

    /**
     * @param stage Stage.
     * @throws Exception Exception.
     */
    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Hello everyone!");
        button = new Button();
        button.setText("Hello everyone!");

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(button);

        Scene scene = new Scene(stackPane, 500, 500);
        stage.setScene(scene);
        stage.show();

    }

}