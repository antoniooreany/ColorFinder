import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ColorFinderCanvas extends Canvas {

	private static final int CANVASWIDTH = 150;
	private static final int CANVASHEIGHT = 150;
	
	private GraphicsContext gc = null; 

	public ColorFinderCanvas() {
		super(CANVASWIDTH, CANVASHEIGHT);
		
		gc = getGraphicsContext2D(); 
	}
	
	public void setColor(Color c) {
		gc.setFill(c);
		gc.fillRect(0.0, 0.0, getWidth(), getHeight());
	}

}
