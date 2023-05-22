package com.example.no_javafx_giris;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class NewviewController {
    @FXML
    public TextField txt;
    @FXML
    public Button btn;

    @FXML
    public void calistir(){
        btn.setText(txt.getText());
    }

}
