package hafta05;

import javax.swing.*;

public class form3 extends JFrame {
    private JPanel panel;
    private JTextArea textArea1;

    form3(){
        add(panel);
        setTitle("multiline text");
        setSize(400,600);

        String s="Bugün hava yağmurlu geçiyordu.\n\n\n Ders online olarak işleniyordu.";
        textArea1.setText(s);


    }
}
