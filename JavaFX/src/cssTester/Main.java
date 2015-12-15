package cssTester;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {

		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 400, 400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		primaryStage.setScene(scene);
		primaryStage.show();
		
		Button button = new Button("test");
		Button button2 = new Button("ÄÄÄÄÄ");
		button.setId("kuk");
		//button.setStyle("-fx-underline:true;-fx-border-color:#00ff00");
		root.setCenter(button);
		root.setLeft(button2);
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
