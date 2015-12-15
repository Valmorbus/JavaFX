package mouseincircle;

import javax.swing.text.Position;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {

		AnchorPane root = new AnchorPane();
		Scene scene = new Scene(root, 800, 800);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		primaryStage.setScene(scene);
		primaryStage.show();
		
		Text text = new Text("asdasd");
		root.getChildren().add(text);
		root.setOnMouseDragged(e->{
			text.setVisible(true);
			text.setLayoutX(e.getX());
			text.setLayoutY(e.getY());
			text.setText("Y-pos: "+e.getY()+"\n"+
						 "X-pos: "+e.getX());
			
		});
		
		root.setOnMouseReleased(e->{
			text.setVisible(false);
		});
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
