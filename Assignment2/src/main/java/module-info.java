module harsh.assignment2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens harsh.assignment2 to javafx.fxml;
    exports harsh.assignment2;
}
