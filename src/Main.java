import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args); // Launches the JavaFX application
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            // Create a new Group object to hold the root node of the scene
            Group root = new Group();

            // Create a new Scene object with the root node and a black background color
            Scene scene = new Scene(root, Color.BLACK);

            // Set the scene for the primary stage
            primaryStage.setScene(scene);

            // Set the title of the primary stage
            primaryStage.setTitle("Nice");
            // Create a new Text object with the text "Hello, World!"
            Text text = new Text("Hello, World!");

// Set the x-coordinate of the text to 100
            text.setX(100);

// Set the y-coordinate of the text to 100
            text.setY(100);

// Set the font of the text to Verdana with a size of 50
            text.setFont(Font.font("Verdana", 50));

// Set the fill color of the text to white
            text.setFill(Color.WHITE);

            Line line = new Line();
            line.setStartX(200);
            line.setStartY(200);
            line.setEndX(500);
            line.setEndY(200);
            line.setStroke(Color.WHITE);
            line.setStrokeWidth(3);
            line.setRotate(45);

            // Create a rectangle object
            Rectangle rectangle = new Rectangle();
            rectangle.setX(100);
            rectangle.setY(100);
            rectangle.setWidth(100);
            rectangle.setHeight(100);
            rectangle.setFill(Color.RED);

            // Create a polygon object
            Polygon polygon = new Polygon();
            polygon.getPoints().addAll(200.0, 200.0, 300.0, 300.0, 200.0, 300.0);
            polygon.setFill(Color.BLUE);

            // Create a circle object
            Circle circle = new Circle();
            circle.setCenterX(350);
            circle.setCenterY(350);
            circle.setRadius(50);
            circle.setFill(Color.GREEN);

            // Create an image object and image view
            Image image = new Image("logo.png");
            ImageView imageView = new ImageView(image);
            imageView.setX(400);
            imageView.setY(400);
            imageView.setFitHeight(100);
            imageView.setFitWidth(100);

            // Add the text, line, rectangle, polygon, circle, and image view to the root group of the scene
            root.getChildren().add(line);
            root.getChildren().add(text);
            root.getChildren().add(rectangle);
            root.getChildren().add(polygon);
            root.getChildren().add(circle);
            root.getChildren().add(imageView);

            // Load the logo image and add it as an icon to the primary stage
            Image image1 = new Image("logo.png");
            primaryStage.getIcons().add(image1);

            // Set the width and height of the primary stage
            primaryStage.setWidth(750);
            primaryStage.setHeight(750);

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
            //e.printStackTrace();
        }
    }
}