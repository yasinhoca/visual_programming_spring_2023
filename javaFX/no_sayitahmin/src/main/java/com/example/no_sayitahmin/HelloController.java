package com.example.no_sayitahmin;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class HelloController {
    @FXML
    private Label lbl;
    @FXML
    public TextField txt;
    Random r = new Random();
    int tahmin = -1, sayac=0, rast=r.nextInt(100);


    @FXML
    protected void tahminEt() {
        tahmin = Integer.parseInt(txt.getText());
        sayac++;
        if(tahmin==rast){
            lbl.setText("Tebrikler " + sayac + ". denemede bildiniz!" );
        } else if (tahmin>rast) {
            lbl.setText("Daha küçük sayı gir! " + sayac + ". denemede." );
        } else if (tahmin<rast) {
            lbl.setText("Daha büyük sayı gir! " + sayac + ". denemede." );
        }
    }
}