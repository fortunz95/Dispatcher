module org.dispatcher.app.dispatcher {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.dispatcher.app.dispatcher to javafx.fxml;
    exports org.dispatcher.app.dispatcher;
}