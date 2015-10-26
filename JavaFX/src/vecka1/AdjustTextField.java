package vecka1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Callback;

public class AdjustTextField extends Application {

	@Override
	public void start(Stage primaryStage) {
		StackPane stackPane = new StackPane();
		HBox hbox = new HBox();
		RadioButton left = new RadioButton("left");
		RadioButton center = new RadioButton("center");
		RadioButton right = new RadioButton("right");
		Label cmSize = new Label ("Column size");
		Label textfi = new Label ("Text Field: ");
		TextField tx = new TextField();
		TextField cb = new TextField();
		cb.setOnAction(event -> {
			float f = Float.parseFloat(cb.getText());
			tx.resize(f, f); // check correction
		});
		ToggleGroup tg = new ToggleGroup();
		left.setToggleGroup(tg);
		left.setOnAction(event->{
			tx.setAlignment(Pos.CENTER_LEFT);
		});
		center.setToggleGroup(tg);
		center.setOnAction(event -> {
			tx.setAlignment(Pos.CENTER);
		});
		right.setToggleGroup(tg);
		right.setOnAction(event->{
			tx.setAlignment(Pos.CENTER_RIGHT);
		});
		
		hbox.getChildren().addAll(textfi, tx);
		HBox hb2 = new HBox();
		hb2.getChildren().addAll(left, center, right, cmSize, cb);
		stackPane.getChildren().add(hbox);
		stackPane.getChildren().add(hb2);
		
		hbox.setAlignment(Pos.TOP_CENTER);
		hb2.setAlignment(Pos.CENTER);
		Scene scene = new Scene(stackPane, 400, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Shape");
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
