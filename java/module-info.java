module com.example.eksmansprojekt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eksmansprojekt to javafx.fxml;
    exports com.example.eksmansprojekt;
    exports com.example.eksmansprojekt.presentation;
    opens com.example.eksmansprojekt.presentation to javafx.fxml;
    exports com.example.eksmansprojekt.domain;
    opens com.example.eksmansprojekt.domain to javafx.fxml;
    exports com.example.eksmansprojekt.data;
    opens com.example.eksmansprojekt.data to javafx.fxml;
}