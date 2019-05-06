import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class ColorFinderCanvas extends Canvas {

	private static final int CANVAS_WIDTH = 150;
	private static final int CANVAS_HEIGHT = 150;
	
	private GraphicsContext gc;

	ColorFinderCanvas() {
		super(CANVAS_WIDTH, CANVAS_HEIGHT);
		
		gc = getGraphicsContext2D(); 
	}
	
	void setColor(Color c) {
		gc.setFill(c);
		gc.fillRect(0.0, 0.0, getWidth(), getHeight());
	}

}
