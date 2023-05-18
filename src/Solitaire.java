
// Libraries for the program 
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;

// Solitaire Class
public class Solitaire extends Application {
    
    private static final int WIDTH = 680;
    private static final int HEIGHT = 500;
    private static final String TITLE = "Solitaire";
    private static final String VERSION = "3.1";
    public static void main(String [] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle(TITLE + " " + VERSION);

        GridPane root = new GridPane();

        
        root.setStyle("-fx-background-color:green");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
    }
}