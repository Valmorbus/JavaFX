package vecka1Lektioner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		FlowPane root = new FlowPane(20,20);
		Scene scene = new Scene(root,400,400);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("H FX");
		primaryStage.show();
		
		RadioButton rb1 = new RadioButton("snabb");
		RadioButton rb2 = new RadioButton("Billig");
		
		ToggleGroup tg = new ToggleGroup();
		rb1.setToggleGroup(tg);
		rb2.setToggleGroup(tg);
		Label label = new Label("Vilken sorts leverans vill du ha");
		root.getChildren().addAll(rb1, rb2, label);
		
		
		rb1.setOnAction(event->{
			label.setText("det kommer vara dyrt");
			
		
		});
		rb2.setOnAction(event->{label.setText("Det kommer gå låååångsamt");
			
		});
			
	
	}

	public static void main(String[] args) {
		launch(args);
	}
}
