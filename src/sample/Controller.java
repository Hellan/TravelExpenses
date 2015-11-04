package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField kilometer;
    @FXML
    private TextField lKm;
    @FXML
    private TextField price;
    @FXML
    private TextField result;

    public void calculate(ActionEvent actionEvent) {
        double expense = (Double.parseDouble(kilometer.getText()) / (Double.parseDouble(lKm.getText())) * Double.parseDouble(price.getText()));
        result.setText(Double.toString(expense));
    }
}