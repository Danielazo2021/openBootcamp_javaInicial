module com.example.helloob {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helloob to javafx.fxml;
    exports com.example.helloob;
}