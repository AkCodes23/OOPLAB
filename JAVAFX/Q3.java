import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaFXWelcomeWindow extends Application {

    public void start(Stage primaryStage) {
        // Create UI elements
        Label welcomeLabel = new Label("Welcome");
        Label usernameLabel = new Label("User Name:");
        TextField usernameField = new TextField();
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        Label resultLabel = new Label();
        Button signInButton = new Button("Sign in");

        // Create a GridPane layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Add elements to the GridPane
        gridPane.add(welcomeLabel, 0, 0);
        gridPane.add(usernameLabel, 0, 1);
        gridPane.add(usernameField, 1, 1);
        gridPane.add(passwordLabel, 0, 2);
        gridPane.add(passwordField, 1, 2);
        gridPane.add(resultLabel, 0, 3, 2, 1);
        gridPane.add(signInButton, 1, 4);

        // Handle button click event
        signInButton.setOnAction(event -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            if (!username.isEmpty() && !password.isEmpty()) {
                resultLabel.setText("Welcome " + username);
            } else {
                resultLabel.setText("Please enter both username and password.");
            }
        });

        // Create a scene and set it to the stage
        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setTitle("JavaFX Welcome");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
