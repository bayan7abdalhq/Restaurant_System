module ps.project.resturantgroup8 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens ps.project.resturantgroup8 to javafx.fxml;
    exports ps.project.resturantgroup8;
}