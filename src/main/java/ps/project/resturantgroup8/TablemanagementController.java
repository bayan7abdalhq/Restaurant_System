package ps.project.resturantgroup8;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class TablemanagementController {

    @FXML
    private Text Tables;

    @FXML
    private Button addtable_btn;

    @FXML
    private Button employee_btn;

    @FXML
    private Button menu_btn;

    @FXML
    private Button notification_btn;

    @FXML
    private Button order_btn;

    @FXML
    private ImageView profile_btn;

    @FXML
    private Button reservation_btn;

    @FXML
    private Button scan_btn;

    @FXML
    private Button search_btn;

    @FXML
    private Button setting_btn;

    @FXML
    private Button tables_btn;

    @FXML
    protected void onclickaddtable() throws IOException {
        addtable_btn.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("Add table.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
