package hafta04;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class form2 extends JFrame {
    private JPanel panel;
    private JSlider vs;
    private JSlider fs;
    private JSlider os;
    private JLabel vl;
    private JLabel fl;
    private JLabel ol;
    static int v,f;
    static float o;

    form2(){
        add(panel);
        setTitle("Vize Final");
        setSize(600,400);

        v=f=0;


        vs.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                v = (int) vs.getValue();
                f = (int) fs.getValue();
                o = (float) ((float) v*0.4 + f*0.6);
                os.setValue(Math.round(o));
                vl.setText("VİZE = "+ Integer.toString(v));
                fl.setText("FİNAL = "+ Integer.toString(f));
                ol.setText("ORTALAMA = "+ Float.toString(o));
                if(o>=60 && o<=100) os.setBackground(Color.GREEN);
                else if(0>=55 && o<60) os.setBackground(Color.orange);
                else os.setBackground(Color.red);
            }
        });

        fs.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                v = (int) vs.getValue();
                f = (int) fs.getValue();
                o = (float) ((float) v*0.4 + f*0.6);
                os.setValue(Math.round(o));
                vl.setText("VİZE = "+ Integer.toString(v));
                fl.setText("FİNAL = "+ Integer.toString(f));
                ol.setText("ORTALAMA = "+ Float.toString(o));
                if(o>=60 && o<=100) os.setBackground(Color.GREEN);
                else if(o>=55 && o<60) os.setBackground(Color.ORANGE);
                else os.setBackground(Color.RED);
            }
        });

    }
}
