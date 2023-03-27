package hafta06;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form3 extends JFrame{
    private JPanel panel;
    private JTable table1;
    private JTable table2;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JButton button1;
    private JTable table3;

    DefaultTableModel model1 = new DefaultTableModel();
    DefaultTableModel model2 = new DefaultTableModel();
    DefaultTableModel model3 = new DefaultTableModel();

    form3(){
        add(panel);
        setTitle("Matris Üret");
        setSize(900,400);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model1.setRowCount(0);
                model1.setColumnCount(0);
                model2.setRowCount(0);
                model2.setColumnCount(0);
                model3.setRowCount(0);
                model3.setColumnCount(0);
                int r,c;
                r = (int) spinner1.getValue();
                c = (int) spinner2.getValue();
                model1.setRowCount(r);
                model1.setColumnCount(c);
                model2.setRowCount(r);
                model2.setColumnCount(c);
                model3.setRowCount(r);
                model3.setColumnCount(c);

                int[][] m1 = Matris.matrisUret(r,c);
                int[][] m2 = Matris.matrisUret(r,c);

                table1.setModel(model1);
                table1.setTableHeader(null);
                table2.setModel(model2);
                table2.setTableHeader(null);
                table3.setModel(model3);
                table3.setTableHeader(null);

                int toplam = 0;
                for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                        table1.setValueAt(m1[i][j],i,j);
                        table2.setValueAt(m2[i][j],i,j);
                        toplam = m1[i][j] + m2[i][j];
                        table3.setValueAt(toplam, i, j);
                    }
                }

            }
        });
    }




}
