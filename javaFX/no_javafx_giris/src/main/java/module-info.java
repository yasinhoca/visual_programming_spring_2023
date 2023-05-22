module com.example.no_javafx_giris {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.no_javafx_giris to javafx.fxml;
    exports com.example.no_javafx_giris;
}