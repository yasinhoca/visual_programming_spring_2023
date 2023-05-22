module com.example.no_sayitahmin {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.no_sayitahmin to javafx.fxml;
    exports com.example.no_sayitahmin;
}