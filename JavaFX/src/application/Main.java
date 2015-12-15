package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = new AnchorPane();
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			primaryStage.setScene(scene);
			primaryStage.show();
			int size = 400;
			Circle circle = new Circle(size / 2, size / 2, size / 5);
			circle.setFill(Color.BLUE);
			circle.setStroke(Color.BLACK);

			Circle circle2 = new Circle(size / 2, size / 2, size/7);
			root.getChildren().addAll(circle, circle2);
			root.setOnMouseDragged(e -> {
				circle2.setCenterX(e.getX());
				circle2.setCenterY(e.getY());

			});

			circle2.setOnKeyPressed(e -> {
				switch (e.getCode()) {
				case W:
					circle2.setCenterY(circle2.getCenterY() - 15);
					break;
				case S:
					circle2.setCenterY(circle2.getCenterY() + 15);
					break;
				case A:
					circle2.setCenterX(circle2.getCenterX() - 15);
					break;
				case D:
					circle2.setCenterX(circle2.getCenterX() + 15);
					break;
				case PLUS:
					circle2.setRadius(circle2.getRadius()+10);
					break;
				case MINUS:
					circle2.setRadius(circle2.getRadius()-10);
					break;
					
				case R:
					circle2.setFill(Color.ALICEBLUE);
					break;
				case T:
					circle2.setFill(Color.RED);
					break;
					
				case Y:
					circle2.setFill(Color.YELLOW);
					break;
				case U:
					circle2.setFill(Color.GREEN);
					break;
					
					
				default:
					break;

				}

			});
			circle.requestFocus();
			circle2.requestFocus();

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
