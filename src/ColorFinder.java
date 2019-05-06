import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class ColorFinder extends Application {

	
    public static void main(String[] args) {

        // Start the JavaFX application by calling launch().  
        launch(args);
    }


    public void start(Stage myStage) {

        // Give the stage a title.  
        myStage.setTitle("Color Finder");

        // Create the Gmajor HBox. 
        HBox rootNode = new HBox(10);
        rootNode.setPadding(new Insets(10, 10, 10, 10)); // Gaps at the outside borders
        
        ColorFinderCanvas cfCanvas = new ColorFinderCanvas();
        ColorSelector cfSelector = new ColorSelector(cfCanvas);

        // Create a scene.  
        rootNode.getChildren().addAll(cfSelector, cfCanvas);
        Scene myScene = new Scene(rootNode, rootNode.getMinWidth(), rootNode.getMinHeight());

        // Set the scene on the stage.  
        myStage.setScene(myScene);

        // Parametrize and show the stage and its scene.
        myStage.setResizable(false);
        myStage.show();
    }
}
