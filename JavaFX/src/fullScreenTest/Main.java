package fullScreenTest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {

		AnchorPane root = new AnchorPane();
		Scene scene = new Scene(root, 400, 400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		primaryStage.setScene(scene);
		primaryStage.show();
		
		Circle circle = new Circle(50);
		circle.setStyle("-fx-stroke:black;-fx-fill:red");
		circle.centerXProperty().bind(root.widthProperty().divide(2));
		circle.centerYProperty().bind(root.heightProperty().divide(2));
		circle.radiusProperty().bind(root.widthProperty().divide(2));
		root.getChildren().add(circle);
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
