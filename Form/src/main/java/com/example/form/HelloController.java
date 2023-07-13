package com.example.form;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.*;

public class HelloController {
    @FXML
    TextField name;

    @FXML
    private TextField phone;
    @FXML
    private TextField address;
    @FXML
    private TextField number;
    File file = new File("database.txt");
    @FXML
    protected void button() {
         String name = this.name.getText();
         String phone = this.phone.getText();
         String address = this.address.getText();
         String number = this.number.getText();
         int Value = 0 ;
         String regex = "^(?=.*[a-zA-Z])[^\\d]{8,}$";
         if (name.equals("")||phone.equals("")||address.equals("")){
          Alert alertError = new Alert(Alert.AlertType.ERROR);
          alertError.show();
         }else{
             if (name.matches(regex)){
                 String [] array = {"---------------" , "name " + name , "phone " + phone , "address " + address };
                 int number1 = Integer.parseInt(number);
                 Value = number1 + 1;
                 Alert alert = new Alert(Alert.AlertType.INFORMATION);
                 alert.setHeaderText("Thành công ");
                 alert.setContentText("Cảm ơn bạn " + name + " đã đăng kí thông tin" );
                 alert.show();
                 try{
                     BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter(file));
                     for (String s : array) {
                         bufferedWriter.write(s);
                         bufferedWriter.newLine();
                         bufferedWriter.flush();
                     }
                     bufferedWriter.close();
                 }catch (IOException e){
                     e.printStackTrace();
                 }
             }else{
                 Alert alert = new Alert(Alert.AlertType.ERROR);
                 alert.show();
             }

         }
         this.number.setText(String.valueOf(Value));
         this.name.setText(null);
         this.phone.setText(null);
         this.address.setText(null);
    }
}