import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GCDCalculator extends Application {

    public void start(Stage primaryStage) {
        // Create UI elements
        Label number1Label = new Label("Enter the first number:");
        TextField number1Field = new TextField();
        Label number2Label = new Label("Enter the second number:");
        TextField number2Field = new TextField();
        Label resultLabel = new Label();
        Button calculateButton = new Button("Calculate GCD");

        // Create a GridPane layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Add elements to the GridPane
        gridPane.add(number1Label, 0, 0);
        gridPane.add(number1Field, 1, 0);
        gridPane.add(number2Label, 0, 1);
        gridPane.add(number2Field, 1, 1);
        gridPane.add(resultLabel, 0, 2, 2, 1);
        gridPane.add(calculateButton, 1, 3);

        // Handle button click event
        calculateButton.setOnAction(event -> {
            try {
                int num1 = Integer.parseInt(number1Field.getText());
                int num2 = Integer.parseInt(number2Field.getText());

                if (num1 <= 0 || num2 <= 0) {
                    resultLabel.setText("Please enter positive integers.");
                } else {
                    int gcd = calculateGCD(num1, num2);
                    resultLabel.setText("Number 1: " + num1 + "\nNumber 2: " + num2 + "\nGCD: " + gcd);
                }
            } catch (NumberFormatException e) {
                resultLabel.setText("Please enter valid integers.");
            }
        });

        // Create a scene and set it to the stage
        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setTitle("GCD Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateGCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
