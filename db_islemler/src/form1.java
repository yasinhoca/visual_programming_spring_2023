import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class form1 extends JFrame {
    private JPanel panel;
    private JTable table1;
    private JComboBox comboBox1;
    private JButton button1;
    DefaultTableModel modelim = new DefaultTableModel();
    Object[] kolonlar = {"No","Ad","Soyad","Telefon"};
    Object[] satirlar = new Object[4];
    DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();

    form1(){
        add(panel);
        setSize(400,600);
        setTitle("Veritabanı İşlemleri");
        veritabani.baglan();
        String sorgu = "select * from ogrenci";
        ResultSet rs = veritabani.listele(sorgu);

        modelim.setColumnCount(0);
        modelim.setRowCount(0);
        modelim.setColumnIdentifiers(kolonlar);

        try {
            while(rs.next()) {
                satirlar[0]=rs.getInt("ogrencino");
                satirlar[1]=rs.getString("ad");
                satirlar[2]=rs.getString("soyad");
                satirlar[3]=rs.getString("tel");
                comboBoxModel.addElement(satirlar[0]);
                modelim.addRow(satirlar);
            }
            table1.setModel(modelim);
            comboBox1.setModel(comboBoxModel);
        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = comboBox1.getSelectedItem().toString();
                String sorgu = "Select * from ogrenci where ogrencino='"+s+"'";
                ResultSet rs = veritabani.listele(sorgu);

                modelim.setColumnCount(0);
                modelim.setRowCount(0);
                modelim.setColumnIdentifiers(kolonlar);

                try {
                    while(rs.next()) {
                        satirlar[0]=rs.getInt("ogrencino");
                        satirlar[1]=rs.getString("ad");
                        satirlar[2]=rs.getString("soyad");
                        satirlar[3]=rs.getString("tel");

                        modelim.addRow(satirlar);
                    }
                    table1.setModel(modelim);


                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });
    }
}
