package vecka1Lektioner;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class ListTest extends Application {
 
        @Override
        public void start(Stage primaryStage) {
                FlowPane root = new FlowPane(20, 20);
                Scene scene = new Scene(root, 400, 400);
                scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Listan");
                primaryStage.show();
               
                //initiera och lägg till precis som en comboBox
                ListView<String> listView;
                ObservableList<String> entries=FXCollections.observableArrayList("JavaFx","HTML5","Javascript");
               
                listView = new ListView<>(entries);
                root.setAlignment(Pos.CENTER);
                Label label = new Label("Inget val");
                root.getChildren().addAll(listView,label);
               
                //lägga till funktionalitet. lamba ser annorlunda ut för att metoden i interface
                //har fler parametrar
                MultipleSelectionModel<String> model=listView.getSelectionModel();
                model.selectedIndexProperty().addListener(  (observable,oldvalue,newvalue)->{
                        label.setText(model.getSelectedItem());
                       
                });
               
               
               
        }
 
        public static void main(String[] args) {
                launch(args);
        }
}