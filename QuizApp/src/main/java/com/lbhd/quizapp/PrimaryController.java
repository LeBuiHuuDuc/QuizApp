package com.lbhd.quizapp;

import com.lbhd.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController {
    public void handleQuanLyCauHoi(ActionEvent event) throws IOException
    {
        Scene scene = new Scene (new FXMLLoader(App.class.getResource("questions.fxml")).load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    public void handleLuyenTap(ActionEvent event)
    {
        MyAlert.getInstance().showMsg("LuyenTap:Comming soon....");
    }
}
