package hafta03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class form3 extends JFrame {
    private JComboBox cr;
    private JComboBox cg;
    private JComboBox cb;
    private JButton button1;
    private JPanel panel;
    DefaultComboBoxModel rmodel= new DefaultComboBoxModel();
    DefaultComboBoxModel gmodel= new DefaultComboBoxModel();
    DefaultComboBoxModel bmodel= new DefaultComboBoxModel();

    static int r,g,b;

    form3(){
        add(panel);
        setTitle("ComboBox Renk");
        setSize(600,400);
        ArrayList<String> sayi = new ArrayList<>();
        for(int i=0; i<256;i++){
            sayi.add(Integer.toString(i));
        }
        rmodel.addAll(sayi);
        gmodel.addAll(sayi);
        bmodel.addAll(sayi);

        cr.setModel(rmodel);
        cg.setModel(gmodel);
        cb.setModel(bmodel);

        cr.setSelectedIndex(0);
        cg.setSelectedIndex(0);
        cb.setSelectedIndex(0);


        cr.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                r = (int) cr.getSelectedIndex();
                g = (int) cg.getSelectedIndex();
                b = (int) cb.getSelectedIndex();
                button1.setBackground(new Color(r,g,b));
            }
        });

        cg.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                r = (int) cr.getSelectedIndex();
                g = (int) cg.getSelectedIndex();
                b = (int) cb.getSelectedIndex();
                button1.setBackground(new Color(r,g,b));
            }
        });

        cb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                r = (int) cr.getSelectedIndex();
                g = (int) cg.getSelectedIndex();
                b = (int) cb.getSelectedIndex();
                button1.setBackground(new Color(r,g,b));
            }
        });




    }
}
