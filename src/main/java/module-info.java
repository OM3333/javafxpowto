module com.example.javafxpowto {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.javafxpowto to javafx.fxml;
    exports com.example.javafxpowto;
}