package vecka1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Login extends Application {

	@Override
	public void start(Stage primaryStage) {	
		GridPane root = new GridPane();
		  root.setHgap(10);
		    root.setVgap(10);
		    root.setPadding(new Insets(0, 10, 0, 10));
		Scene scene = new Scene(root,400,400);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Login");
		primaryStage.show();
		TextField name = new TextField();
		PasswordField password = new PasswordField();
		Label label = new Label("");
		Button submitButton = new Button("Submit");
		submitButton.setOnAction(event ->{
			label.setText(name.getText() + " tried to sign in");
		});
		Button clear = new Button("clear");
		clear.setOnAction(event -> {
			name.clear();
			password.clear();
		});
		submitButton.setPrefSize(150, 15);
		clear.setPrefSize(150, 15);
		root.add(name, 0, 0);
		root.add(submitButton, 1, 0);
		root.add(password, 0, 1);
		root.add(clear, 1, 1);
		root.add(label, 0, 2);
		label.setWrapText(true);
		
		//root.getChildren().addAll(name,submitButton,password, clear, label);
		
		
		
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
