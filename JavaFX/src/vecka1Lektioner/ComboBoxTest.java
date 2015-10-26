package vecka1Lektioner;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ComboBoxTest extends Application {

	@Override
	public void start(Stage primaryStage) {

		ComboBox<String> cb;
		Label label = new Label("inget val"); 
		ObservableList<String >entries=FXCollections.observableArrayList("JavaFx", "HTML5", "JavaScript");
		cb = new ComboBox<String>(entries);
		cb.setValue(cb.getItems().get(0));
		cb.setOnAction(event-> {
			label.setText(cb.getValue());
		});

		FlowPane root = new FlowPane(20,20);
		root.getChildren().addAll(label, cb);
		Scene scene = new Scene(root,400,400);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("H FX");
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
