import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.beans.value.*;

public class ColorComponentSelector extends HBox {
	
	private static final int NAMEWIDTH = 60;
	private static final int VALUEWIDTH = 40;
	private static final int SLIDERWIDTH = 300;
	
	private ColorSelector selector = null;
	private Label lblCurrValue = null;
	private Slider sldrComponent = null;
	int currValue = 0;

	public ColorComponentSelector(ColorSelector selector, String name) {
		super(10);
		
		this.selector = selector;
		
		Label lblName = new Label(name);
		lblName.setMinWidth(NAMEWIDTH);

		lblCurrValue = new Label("0");
		lblCurrValue.setMinWidth(VALUEWIDTH);
		
        sldrComponent = new Slider(0.0, 255.0, 0.0);
		sldrComponent.setMinWidth(SLIDERWIDTH);

        // Configure the component slider. 
        sldrComponent.setShowTickMarks(true);
        sldrComponent.setShowTickLabels(true);
        sldrComponent.setBlockIncrement(1.0);
        sldrComponent.setSnapToTicks(true);
        sldrComponent.setMajorTickUnit(32.0);
        sldrComponent.setMinorTickCount(31);

        // Handle change events on the slider's value. 
        sldrComponent.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> changed,
                    Number oldVal, Number newVal) {
            	currValue = newVal.intValue();
                lblCurrValue.setText("" + currValue);
                selector.repaint();
            }
        });

        getChildren().addAll(lblName, lblCurrValue, sldrComponent);
	}
	
	public int getValue() {
		return currValue;
	}

}
