package hafta07;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 extends JFrame {

    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JPanel solpanel;
    private JPanel sagpanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button3;
    private JComboBox comboBox1;
    private JTextField textField3;

    boolean sol=true;
    boolean sag=true;

    form2(){
        add(panel);
        setTitle("Paneller");
        setSize(600,400);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sol){
                    solpanel.setVisible(false);
                    sol = false;
                } else {
                    solpanel.setVisible(true);
                    sol = true;
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sag){
                    sagpanel.setVisible(false);
                    sag = false;
                } else {
                    sagpanel.setVisible(true);
                    sag = true;
                }
            }
        });
    }

}
