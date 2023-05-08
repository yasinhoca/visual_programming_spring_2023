package crud;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

public class form1 extends JFrame {
    private JPanel panel;
    private JTable table1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    DefaultTableModel modelim = new DefaultTableModel();
    Object[] kolonlar = {"Numara","Ad","Soyad","Tel"};
    Object[] satirlar = new Object[4];

    form1(){
        add(panel);
        setTitle("CRUD");
        setSize(600,400);
        veritabani.baglan();
        String sorgu = "select * from ogrenci";

        ResultSet rs = veritabani.listele(sorgu);

        modelim.setColumnCount(0);
        modelim.setRowCount(0);
        modelim.setColumnIdentifiers(kolonlar);

        try {
            while(rs.next()){
                satirlar[0]=rs.getString("ogrencino");
                satirlar[1]=rs.getString("ad");
                satirlar[2]=rs.getString("soyad");
                satirlar[3]=rs.getString("tel");
                modelim.addRow(satirlar);
            }
            table1.setModel(modelim);
        } catch(SQLException e2){
            e2.printStackTrace();
        }

        table1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int s = table1.getSelectedRow();

                textField1.setText(table1.getValueAt(s,0).toString());
                textField2.setText(table1.getValueAt(s,1).toString());
                textField3.setText(table1.getValueAt(s,2).toString());
                textField4.setText(table1.getValueAt(s,3).toString());

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sorgu = "insert into ogrenci(ogrencino,ad,soyad,tel)"
                        + "values('"+textField1.getText()+"','"+textField2.getText()+"','"+textField3.getText()+"','"
                        + textField4.getText()+"')";
                veritabani.ekle(sorgu);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sorgu = "update ogrenci " +
                        "set ogrencino='"+textField1.getText()+"' , ad='"+textField2.getText()+"' , soyad='"+textField3.getText()+"', tel='"+textField4.getText()+"' " +
                        "where ogrencino='"+textField1.getText()+"'";
                veritabani.guncelle(sorgu);

            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sorgu = "delete from ogrenci where ogrencino='"+textField1.getText()+"'";
                veritabani.sil(sorgu);

            }
        });
    }
}
