package ps.project.resturantgroup8;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AddTableSuccessfullyController {

    @FXML
    private Button done_btn;

    @FXML
    protected void onclickdone() throws IOException{
        done_btn.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("Table management.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
