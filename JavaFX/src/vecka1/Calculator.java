package vecka1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Calculator extends Application {

	@Override
	public void start(Stage primaryStage) {
		FlowPane root = new FlowPane(40,40);
		Scene scene = new Scene(root,400,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculator");
		primaryStage.show();
		
		TextField numb1 = new TextField();
		TextField numb2 = new TextField();
		TextField result = new TextField();
		Button add = new Button("Add"); 
		Button subtract = new Button("Subtract"); 
		Button multi = new Button("Multiply"); 
		Button divide = new Button("Divide"); 
		
		add.setOnAction(event -> {
			float n1 =Float.parseFloat(numb1.getText().toString());
			float n2 =Float.parseFloat(numb2.getText().toString());
			String s  = String.valueOf(n1+n2);

			result.setText(s);
		});
		subtract.setOnAction(event -> {
			float n1 =Float.parseFloat(numb1.getText().toString());
			float n2 =Float.parseFloat(numb2.getText().toString());
			String s = String.valueOf(n1-n2);
			
			result.setText(s);
		});
		multi.setOnAction(event -> {
			float n1 =Float.parseFloat(numb1.getText().toString());
			float n2 =Float.parseFloat(numb2.getText().toString());
			String s= String.valueOf(n1*n2);
			result.setText(s);
		});
		divide.setOnAction(event -> {
			float n1 =Float.parseFloat(numb1.getText().toString());
			float n2 =Float.parseFloat(numb2.getText().toString());
			String s = String.valueOf(n1/n2);
			result.clear();
			result.setText(s);
		});
		Label first = new Label("First");
		Label Second = new Label("Second");
		Label resultat = new Label("Result");
		root.getChildren().addAll(first, numb1,Second, numb2,resultat, result, add, subtract, multi, divide);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
