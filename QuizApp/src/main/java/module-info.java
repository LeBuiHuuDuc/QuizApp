module com.lbhd.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.lbhd.quizapp to javafx.fxml;
    exports com.lbhd.quizapp;
}
