package hafta06;

import javax.swing.*;

public class form1 extends JFrame{
    private JPanel panel;
    private JList list1;

    DefaultListModel<String> liste_model = new DefaultListModel<>();

    form1(){
        add(panel);
        setTitle("Liste");
        setSize(400,400);
        liste_model.add(0,"Elma");
        liste_model.add(1,"Armut");
        list1.setModel(liste_model);

    }


}
