import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.beans.value.*;

class ColorComponentSelector extends HBox {
	
	private static final int NAME_WIDTH = 60;
	private static final int VALUE_WIDTH = 40;
	private static final int SLIDER_WIDTH = 300;

	private Label lblCurrValue;
	private int currValue = 0;

	ColorComponentSelector(ColorSelector selector, String name) {
		super(10);

		Label lblName = new Label(name);
		lblName.setMinWidth(NAME_WIDTH);

		lblCurrValue = new Label("0");
		lblCurrValue.setMinWidth(VALUE_WIDTH);

		Slider sldrComponent = new Slider(0.0, 255.0, 0.0);
		sldrComponent.setMinWidth(SLIDER_WIDTH);

        // Configure the component slider. 
        sldrComponent.setShowTickMarks(true);
        sldrComponent.setShowTickLabels(true);
        sldrComponent.setBlockIncrement(1.0);
        sldrComponent.setSnapToTicks(true);
        sldrComponent.setMajorTickUnit(32.0);
        sldrComponent.setMinorTickCount(31);

        // Handle change events on the slider's value. 
        sldrComponent.valueProperty().addListener((changed, oldVal, newVal) -> {
			currValue = newVal.intValue();
			lblCurrValue.setText("" + currValue);
			selector.repaint();
		});

        getChildren().addAll(lblName, lblCurrValue, sldrComponent);
	}
	
	int getValue() {
		return currValue;
	}

}
