package mouseUppgifter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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
		Label label = new Label("Ett");
		
		
		root.setCenter(label);
		
		root.setOnMouseClicked(e->{
			changeLabel(label);
		});
	
		
		
		
	}
	
	
	private void changeLabel(Label label){
		
		if(label.getText()=="Ett"){
			label.setText("Två");
		}
		else
			label.setText("Ett");
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
