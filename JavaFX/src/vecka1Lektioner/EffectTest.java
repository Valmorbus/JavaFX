package vecka1Lektioner;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.Glow;
import javafx.scene.effect.MotionBlur;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class EffectTest extends Application {
 
        @Override
        public void start(Stage primaryStage) {
                FlowPane root = new FlowPane();
                Scene scene = new Scene(root,400,400);
                scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.show();
               
                Image image = new Image("image/icon.png");
                ImageView view = new ImageView(image);
               
                Button button = new Button("testing effects", view);
               
                root.getChildren().add(button);
                root.setAlignment(Pos.CENTER);
               
                MotionBlur blur = new MotionBlur();
                blur.setRadius(9);
                blur.setAngle(-15);
               
                button.setEffect(blur);
               
                Glow glow = new Glow(0.5);
               
                button.setEffect(glow);
               
                Bloom bloom = new Bloom();
                bloom.setThreshold(0.525f);
               
                button.setEffect(bloom);
               
                Reflection refl = new Reflection();
                refl.setFraction(0.7);
               
                button.setEffect(refl);
               
        }
 
        public static void main(String[] args) {
                launch(args);
        }
}