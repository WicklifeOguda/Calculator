module com.codenawikie.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.codenawikie.calculator to javafx.fxml;
    exports com.codenawikie.calculator;
}