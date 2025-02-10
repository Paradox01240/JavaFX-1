import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
    launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
      try {
//          Parent root = FXMLLoader.load(getClass().getResource("simple.fxml"));
          Group root = new Group();
          Scene scene = new Scene(root, Color.BLACK);
          primaryStage.setScene(scene);
          primaryStage.setTitle("Nice");
          Image image = new Image("logo.png");
          primaryStage.getIcons().add(image);
          primaryStage.setWidth(550);
          primaryStage.setHeight(550);
          primaryStage.setResizable(false);
          primaryStage.setFullScreen(true);
          primaryStage.setFullScreenExitHint("Press Q");
          primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
          primaryStage.show();
      } catch (Exception e) {
          e.printStackTrace();
      }
            }
}