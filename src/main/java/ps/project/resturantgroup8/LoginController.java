package ps.project.resturantgroup8;

import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class LoginController {
    @FXML
    private TextField username;

   @FXML
   private PasswordField password;

   @FXML
   private Button loginbtn;

   @FXML
   protected void clicklogin() throws IOException {
       loginbtn.getScene().getWindow().hide();
       Parent root = FXMLLoader.load(getClass().getResource("basic-page.fxml"));
       Stage stage = new Stage();
       Scene scene =new Scene(root);
       stage.setScene(scene);
       stage.show();
   }

}