module com.example.szklarnia {
    requires javafx.controls;
    requires javafx.fxml;
        requires javafx.web;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
            requires net.synedra.validatorfx;
            requires org.kordamp.ikonli.javafx;
        
    opens com.example.szklarnia to javafx.fxml;
    exports com.example.szklarnia;
}