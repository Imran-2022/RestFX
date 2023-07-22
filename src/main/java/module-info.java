module com.example.restfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson; // Add this line to require Gson
            requires com.dlsc.formsfx;
    opens com.example.restfx to javafx.fxml, com.google.gson; // Add this line to open the package
    exports com.example.restfx;
}