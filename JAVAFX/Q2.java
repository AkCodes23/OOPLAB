import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultiplicationTableApp extends Application {

    public void start(Stage primaryStage) {
        Label label = new Label("Enter a number:");
        TextField numberField = new TextField();
        Label resultLabel = new Label();
        Button calculateButton = new Button("Calculate");

        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(label, numberField, resultLabel, calculateButton);

        calculateButton.setOnAction(event -> {
            try {
                int number = Integer.parseInt(numberField.getText());
                StringBuilder result = new StringBuilder();
                for (int i = 1; i <= 10; i++) {
                    result.append(number + " * " + i + " = " + (number * i) + "\n");
                }
                resultLabel.setText(result.toString());
            } catch (NumberFormatException e) {
                resultLabel.setText("Please enter a valid integer.");
            }
        });

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Multiplication Table");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
