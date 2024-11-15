package date_13_11_24;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderLayout;
import javafx.scene.control.Button;

public class ButtonGUI extends Application{
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    public void start(Stage primaryStage) {
        BorderPane layout = new BorderPane();
        this.button1 = new Button("button 1");
        this.button2 = new Button("button 2");
        this.button3 = new Button("button 3");
        this.button4 = new Button("button 4");

        button1.setOnAction(new RespondToBasicClick());
        button2.setOnAction(new RespondToBasicClick());
        layout.setTop(button1);
        layout.setLeft(button2);
        layout.setRight(button3);
        layout.setBottom(button4);

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    private class RespondToBasicClick implements EventHandler<ActionEvent> {

        public void handle(ActionEvent event) {
            Button b = (Button)event.getSource();
            if (b == button1) {
                System.out.println("ouch");
            } else {
                System.out.println("yippee");
            }
        }
    }
}