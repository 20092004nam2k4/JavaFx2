module com.example.thuhanh2 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.thuhanh2 to javafx.fxml;
    exports com.example.thuhanh2;
}