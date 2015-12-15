package gitter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {

		AnchorPane root = new AnchorPane();
		Scene scene = new Scene(root, 400, 400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Line v1 = new Line(125,0,125,400);
		Line v2 = new Line(275,0,275,400);
		
		v1.setStyle("-fx-stroke:red");
		v2.setStyle("-fx-stroke:red");
		
		v1.startXProperty().bind(root.widthProperty().divide(3));
		v1.endXProperty().bind(root.widthProperty().divide(3));
		v1.endYProperty().bind(root.heightProperty());
		
		v2.startXProperty().bind(root.widthProperty().divide(1.5));
		v2.endXProperty().bind(root.widthProperty().divide(1.5));
		v2.endYProperty().bind(root.heightProperty());
		
		
		Line h1 = new Line(0,125,400,125);
		Line h2 = new Line(0,275,400,275);
		h1.setStyle("-fx-stroke:blue");
		h2.setStyle("-fx-stroke:blue");
		h1.startYProperty().bind(root.heightProperty().divide(3));
		h1.endYProperty().bind(root.heightProperty().divide(3));
		h1.endXProperty().bind(root.widthProperty());
		
		h2.startYProperty().bind(root.heightProperty().divide(1.5));
		h2.endYProperty().bind(root.heightProperty().divide(1.5));
		h2.endXProperty().bind(root.widthProperty());
		
		root.getChildren().addAll(v1,v2,h1,h2);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
