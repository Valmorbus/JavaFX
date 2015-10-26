package vecka1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Geometry extends Application {

	@Override
	public void start(Stage primaryStage) {
		StackPane stackPane = new StackPane();
		HBox hbox = new HBox();
		RadioButton circle = new RadioButton("Circle");
		RadioButton rectangle = new RadioButton("Rectangle");
		RadioButton ellipse = new RadioButton("Ellipse");
		CheckBox fill = new CheckBox("Fill");
		ToggleGroup tg = new ToggleGroup();
		
		HBox figureBox = new HBox();
		figureBox.autosize();
		Circle c = new Circle(40);
		c.setVisible(false);
		c.setStroke(Color.AZURE);
		c.setFill(Color.TRANSPARENT);
		Rectangle r = new Rectangle(50, 50);
		r.setVisible(false);
		r.setStroke(Color.STEELBLUE);
		r.setFill(Color.TRANSPARENT);
		Ellipse e = new Ellipse(50, 75);
		e.setVisible(false);
		e.setStroke(Color.RED);
		e.setFill(Color.TRANSPARENT);
		figureBox.getChildren().addAll(c, r, e);
		figureBox.setPrefSize(150, 150);
		
		circle.setToggleGroup(tg);
		rectangle.setToggleGroup(tg);
		ellipse.setToggleGroup(tg);
		hbox.getChildren().addAll(circle, rectangle, ellipse, fill);
		hbox.setAlignment(Pos.BOTTOM_CENTER);
		//stackPane.getChildren().add(c);
		//stackPane.getChildren().add(figureBox);
		stackPane.getChildren().addAll( c, r, e, hbox);	
		fill.setOnAction(event->{
			if(fill.isSelected()){
				c.setFill(Color.AZURE);
				r.setFill(Color.STEELBLUE);
				e.setFill(Color.RED);
			}
			else{
				c.setFill(Color.TRANSPARENT);
				r.setFill(Color.TRANSPARENT);
				e.setFill(Color.TRANSPARENT);
			}
		});
		circle.setOnAction(event ->{
			c.setVisible(true);
			r.setVisible(false);
			e.setVisible(false);
		});
		rectangle.setOnAction(event ->{
			c.setVisible(false);
			r.setVisible(true);
			e.setVisible(false);
		});
		ellipse.setOnAction(event ->{
			c.setVisible(false);
			r.setVisible(false);
			e.setVisible(true);
		});
		
		Scene scene = new Scene(stackPane, 350, 350);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Shape");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
