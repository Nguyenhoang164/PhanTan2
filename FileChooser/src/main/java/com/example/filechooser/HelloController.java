package com.example.filechooser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class HelloController {
    @FXML
    protected ImageView imageView;
    @FXML
    protected AnchorPane ap;

    @FXML
    protected void chooserImage(ActionEvent event) {
        Stage stage = (Stage) ap.getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Chooser Image :");
        FileChooser.ExtensionFilter Image = new FileChooser.ExtensionFilter("Image file","*jpeg","*jpg","*png");
        fileChooser.getExtensionFilters().add(Image);
        File file =  fileChooser.showOpenDialog(stage);
        if(file != null){
            Image image = new Image(file.toURI().toString());
            imageView.setImage(image);
        }
    }
}