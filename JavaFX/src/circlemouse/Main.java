package circlemouse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {

		AnchorPane root = new AnchorPane();
		Scene scene = new Scene(root, 500, 500);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		primaryStage.setScene(scene);
		primaryStage.show();

		Text text = new Text("asdasd");
		Circle circle = new Circle(250, 250, 50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);

		root.getChildren().addAll(text, circle);
		text.toFront();
		root.setOnMouseMoved(e -> {

			if (circle.contains(e.getX(), e.getY())) {
				text.setX(e.getX());
				text.setY(e.getY()-20);
				text.setText("Mouse is in circle." + "\n" + "X: " + e.getX() + " Y: " + e.getY());
			}

			else {
				text.setX(e.getX());
				text.setY(e.getY()-20);
				text.setText("Mouse is outside circle." + "\n" + "X: " + e.getX() + " Y: " + e.getY());
			}

		});
		
		root.setOnMouseClicked(e->{
			circle.setCenterX(e.getX());
			circle.setCenterY(e.getY());
		});
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
