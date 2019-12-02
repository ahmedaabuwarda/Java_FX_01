/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lesson_02;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author Ahmed Abuwarda, Date: Sep 04,2019.
 */
public class PrintFromButton extends Application implements EventHandler<ActionEvent> {

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
        button.setOnAction(this);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(button);

        Scene scene = new Scene(stackPane, 500, 500);
        stage.setScene(scene);
        stage.show();

    }

    /**
     * @param actionEvent Action event.
     */
    @Override
    public void handle(ActionEvent actionEvent) {

        if (actionEvent.getSource() == button) {

            System.out.println("Oh, you clicked me!");

        }

    }

}