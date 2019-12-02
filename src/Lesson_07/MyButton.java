/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lesson_07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author Ahmed Abuwarda, Date: Dec 02,2019.
 */
public class MyButton extends Application {

    static Stage window;
    static Button button;

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
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });
        button = new Button("Click here");
        button.setOnAction(e -> {
            closeProgram();
        });
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();
    }

    public void closeProgram() {
        Boolean answer = ConfirmCancel.display("Exit program","Sure you want to exit");
        if (answer) {
            System.out.println("file saved");
            window.close();
        }

    }
}