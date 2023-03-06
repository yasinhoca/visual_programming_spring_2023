package hafta03;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;
import java.beans.PropertyChangeListener;


public class form4 extends JFrame {

    private JSpinner spinner1;
    private JPanel panel;
    private JButton button1;

    SpinnerNumberModel model = new SpinnerNumberModel();

    form4(){
        add(panel);
        setTitle("Spinner");
        setSize(600,400);

        model.setMinimum(0);
        model.setMaximum(100);
        model.setStepSize(3);
        spinner1.setModel(model);


        spinner1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int genislik = (int) spinner1.getValue();
                button1.setSize(genislik,50);
            }
        });
       
    }
}
