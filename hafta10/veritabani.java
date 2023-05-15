package hafta10;

import java.sql.*;

public class veritabani {
    static String url = "jdbc:postgresql://localhost:5432/ioveritabani";
    //uzak serverda ise localhost yerine oranın ip adresi yazılır
    static Connection conn = null;

    static void baglan(){
        try {
            conn = DriverManager.getConnection(url,"postgres","1234");
            System.out.println("Veritabanı bağlantısı başarılı");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    static ResultSet listele(String sorgu){
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sorgu);
            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    static void ekle(String sorgu){
        Statement st;
        try {
            st = conn.createStatement();
            st.executeUpdate(sorgu);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    static void guncelle(String sorgu){
        Statement st;
        try {
            st = conn.createStatement();
            st.executeUpdate(sorgu);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    static void sil(String sorgu){
        Statement st;
        try {
            st = conn.createStatement();
            st.execute(sorgu);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    static void olustur(String sorgu){
        Statement st;
        try {
            st = conn.createStatement();
            st.execute(sorgu);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
