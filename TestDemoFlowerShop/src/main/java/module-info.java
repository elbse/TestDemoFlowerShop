module com.example.testdemoflowershop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testdemoflowershop to javafx.fxml;
    exports com.example.testdemoflowershop;
}