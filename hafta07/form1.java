package hafta07;

import javax.print.attribute.SetOfIntegerSyntax;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.concurrent.TimeUnit;

public class form1 extends JFrame {
    private JPanel panel;
    private JProgressBar progressBar1;
    private JButton button1;

    form1(){
        add(panel);
        setTitle("Progress Bar");
        setSize(400,400);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<100;i++){
                            try {
                                TimeUnit.MILLISECONDS.sleep(40);
                            } catch (InterruptedException ex) {
                                throw new RuntimeException(ex);
                            }
                            progressBar1.setValue(i);
                        }
                    }
                }).start();
            }
        });
    }

}
