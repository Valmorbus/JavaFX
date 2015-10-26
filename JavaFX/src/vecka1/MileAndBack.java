package vecka1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MileAndBack extends Application {

	@Override
	public void start(Stage primaryStage) {
		GridPane root = new GridPane();
		Scene scene = new Scene(root, 300, 300);
		Label label1 = new Label("Mile");
		Label label2 = new Label("Kilometer");
		TextField tfkilo = new TextField();
		TextField tf = new TextField();

		root.add(label1, 0, 0);
		root.add(tf, 1, 0);
		root.add(label2, 0, 1);
		root.add(tfkilo, 1, 1);

		tf.setOnAction(event -> {

			float mile = Float.parseFloat(tf.getText().toString());
			// float kilo = mile/0.62137f;
			String s = String.valueOf(mile / 0.62137f);
			tfkilo.setText(s);
		

		});
		tfkilo.setOnAction(event -> {

			float kilo = Float.parseFloat(tfkilo.getText().toString());
			// float kilo = mile/0.62137f;
			String s = String.valueOf(kilo *0.62137f);
			tf.setText(s);
		

		});

		primaryStage.setScene(scene);
		primaryStage.setTitle("Mile and back");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
