package com.example.tracnghiem;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

    @FXML
    private RadioButton chose1;
    @FXML
    private RadioButton chose2;
    @FXML
    private RadioButton chose3;
    @FXML
    private RadioButton chose4;
    @FXML
    private RadioButton chose5;

    @FXML
    protected void onclick(){
        int Value = 0;
        if(chose1.isSelected()){
            Value ++;
        }
        if (chose2.isSelected()){
            Value ++;
        }
        if (chose3.isSelected()){
            Value ++;
        }
        if (chose4.isSelected()){
            Value ++;
        }
        if (chose5.isSelected()){
            Value ++;
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Tổng điểm ");
        alert.setContentText("Số điểm bạn có : " + Value);
        alert.show();



    }
}