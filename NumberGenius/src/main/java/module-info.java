module br.com.numbergenius {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens br.com.numbergenius to javafx.fxml;
    exports br.com.numbergenius;
}