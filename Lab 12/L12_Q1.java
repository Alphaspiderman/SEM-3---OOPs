package Lab_12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class L12_Q1 extends Application {

    private TextField n1Field, n2Field;
    private Label resLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator App");

        n1Field = new TextField();
        n2Field = new TextField();

        Button computeButton = new Button("Compute");
        computeButton.setOnAction(e -> compute());

        resLabel = new Label();

        Canvas canvas = new Canvas(150, 150);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.drawImage(new Image("calculator.png"), 0, 0, 150, 150);

        VBox layout = new VBox(10);
        layout.getChildren().addAll(n1Field, n2Field, computeButton, resLabel, canvas);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void compute() {
        try {
            double num1 = Double.parseDouble(n1Field.getText());
            double num2 = Double.parseDouble(n2Field.getText());

            double sum = num1 + num2;
            double product = num1 * num2;
            double difference = num1 - num2;
            double quotient = num1 / num2;

            resLabel.setText("Sum: " + sum + "\nProduct: " + product + "\nDifference: " + difference + "\nQuotient: " + quotient);
        } catch (NumberFormatException e) {
            resLabel.setText("Invalid input. Please enter valid numbers.");
        } catch (ArithmeticException e) {
            resLabel.setText("Error: Division by zero.");
        }
    }
}