module com.example.aufgabensammlungjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aufgabensammlungjavafx to javafx.fxml;
    exports com.example.aufgabensammlungjavafx;
}