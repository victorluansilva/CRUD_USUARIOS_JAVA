module com.vls.crud_usuarios_java {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.vls.crud_usuarios_java to javafx.fxml;
    exports com.vls.crud_usuarios_java;
    exports com.vls.crud_usuarios_java.controller;
    opens com.vls.crud_usuarios_java.controller to javafx.fxml;
}