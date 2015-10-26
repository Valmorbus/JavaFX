package vecka1Lektioner;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ScrollPaneTest extends Application {

	@Override
	public void start(Stage primaryStage) {

		FlowPane root = new FlowPane(20, 20);
		Scene scene = new Scene(root, 700, 400);
		// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("H FX");
		primaryStage.show();

		TextArea area = new TextArea();
		
		root.getChildren().add(area);
		root.setAlignment(Pos.CENTER);
		area.setWrapText(true);
		ScrollPane scroll = new ScrollPane(area);
		scroll.setPrefViewportHeight(130);
		scroll.setPrefViewportWidth(80);
		root.getChildren().add(scroll);
		
		Button b = new Button ("reset");
		b.setOnAction(event ->{
			scroll.setHvalue(0);
			scroll.setVvalue(0);
		});
		root.getChildren().add(b);
		

	}

	public static void main(String[] args) {
		launch(args);
	}
}
