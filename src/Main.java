import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args); // Launches the JavaFX application
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            // Create a new Group object to hold the root node of the scene
            Group root = new Group();

            // Create a new Scene object with the root node and a black background color
            Scene scene = new Scene(root, Color.BLACK);

            // Set the scene for the primary stage
            primaryStage.setScene(scene);

            // Set the title of the primary stage
            primaryStage.setTitle("Nice");

            // Load the logo image and add it as an icon to the primary stage
            Image image = new Image("logo.png");
            primaryStage.getIcons().add(image);

            // Set the width and height of the primary stage
            primaryStage.setWidth(550);
            primaryStage.setHeight(550);

            // Disable resizing of the primary stage
            primaryStage.setResizable(false);

            // Set the primary stage to full screen mode
            primaryStage.setFullScreen(true);

            // Set the hint text and key combination for exiting full screen mode
            primaryStage.setFullScreenExitHint("Press Q");
            primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

            // Show the primary stage
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}