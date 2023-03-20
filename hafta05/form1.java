package hafta05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame{
    private JPanel panel;
    private JButton button1;
    static boolean durum;


    form1(){
        add(panel);
        setTitle("Toggle Button");
        setSize(400,400);
        durum = true;

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(durum){
                    panel.setBackground(new Color(74, 69, 69));
                    button1.setText("AYDINLIK");
                    durum=false;
                } else {
                    panel.setBackground(new Color(242, 242, 242));
                    button1.setText("KARANLIK");
                    durum=true;
                }
            }
        });
    }

}
