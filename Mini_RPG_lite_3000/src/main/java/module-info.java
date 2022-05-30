module com.isep.rpg {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.isep.rpg to javafx.fxml;
    exports com.isep.rpg;
}