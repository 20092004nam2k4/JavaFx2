module com.example.thuhanh1 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.thuhanh1 to javafx.fxml;
    exports com.example.thuhanh1;
}