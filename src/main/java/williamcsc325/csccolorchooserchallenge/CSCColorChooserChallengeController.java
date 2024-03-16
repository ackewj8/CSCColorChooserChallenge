package williamcsc325.csccolorchooserchallenge;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class CSCColorChooserChallengeController implements Initializable {

    @FXML private Slider redSlider;
    @FXML private Slider greenSlider;
    @FXML private Slider blueSlider;
    @FXML private Slider alphaSlider;
    @FXML private TextField redTextField;
    @FXML private TextField greenTextField;
    @FXML private TextField blueTextField;
    @FXML private TextField alphaTextField;
    @FXML private Rectangle colorRectangle;

    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1.0;
    private static final int INIT_VALUE = 0;
    private static final double ALPHA_VALUE = 1;

    public void initialize(URL location, ResourceBundle resources) {
        redSlider.setValue(INIT_VALUE);
        redTextField.setText(new Double(INIT_VALUE).toString());
        redTextField.textProperty().bindBidirectional(
                redSlider.valueProperty(), NumberFormat.getNumberInstance());

        greenSlider.setValue(INIT_VALUE);
        greenTextField.setText(new Double(INIT_VALUE).toString());
        greenTextField.textProperty().bindBidirectional(
                greenSlider.valueProperty(), NumberFormat.getNumberInstance());

        blueSlider.setValue(INIT_VALUE);
        blueTextField.setText(new Double(INIT_VALUE).toString());
        blueTextField.textProperty().bindBidirectional(
                blueSlider.valueProperty(), NumberFormat.getNumberInstance());

        alphaSlider.setValue(ALPHA_VALUE);
        alphaTextField.setText(new Double(INIT_VALUE).toString());
        alphaTextField.textProperty().bindBidirectional(
                alphaSlider.valueProperty(), NumberFormat.getNumberInstance());

        /*redTextField.textProperty().bind(
                redSlider.valueProperty().asString("%.0f"));
        greenTextField.textProperty().bind(
                greenSlider.valueProperty().asString("%.0f"));
        blueTextField.textProperty().bind(
                blueSlider.valueProperty().asString("%.0f"));*/
        /*alphaTextField.textProperty().bind(
                alphaSlider.valueProperty().asString("%.2f"));*/

        redSlider.valueProperty().addListener(
                new ChangeListener<Number>(){
                    @Override
                    public void changed(ObservableValue<? extends Number> ov,
                                        Number oldValue, Number newValue) {
                        red = newValue.intValue();
                        colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
                    }
                }
        );
        greenSlider.valueProperty().addListener(
                new ChangeListener<Number>(){
                    @Override
                    public void changed(ObservableValue<? extends Number> ov,
                                        Number oldValue, Number newValue) {
                        green = newValue.intValue();
                        colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
                    }
                }
        );
        blueSlider.valueProperty().addListener(
                new ChangeListener<Number>(){
                    @Override
                    public void changed(ObservableValue<? extends Number> ov,
                                        Number oldValue, Number newValue) {
                        blue = newValue.intValue();
                        colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
                    }
                }
        );
        alphaSlider.valueProperty().addListener(
                new ChangeListener<Number>(){
                    @Override
                    public void changed(ObservableValue<? extends Number> ov,
                                        Number oldValue, Number newValue) {
                        alpha = newValue.doubleValue();
                        colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
                    }
                }
        );
    }
}

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/