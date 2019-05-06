import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

class ColorSelector extends VBox {
	
	private ColorFinderCanvas cfCanvas = null;
	private ColorComponentSelector ccsRed = null;
	private ColorComponentSelector ccsGreen = null;
	private ColorComponentSelector ccsBlue = null;

	ColorSelector(ColorFinderCanvas cfCanvas) {
		super(10);
		
		this.cfCanvas = cfCanvas;
		
		ccsRed = new ColorComponentSelector(this, "Red");
		ccsGreen = new ColorComponentSelector(this, "Green");
		ccsBlue = new ColorComponentSelector(this, "Blue");
		
		this.getChildren().addAll(ccsRed, ccsGreen, ccsBlue);
		
		repaint();
	}
	
	void repaint() {
		cfCanvas.setColor(Color.rgb(ccsRed.getValue(), ccsGreen.getValue(), ccsBlue.getValue()));
	}

}
