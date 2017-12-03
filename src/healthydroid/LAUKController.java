/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthydroid;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class LAUKController implements Initializable {

    @FXML
    private CheckBox ayamid;
    @FXML
    private CheckBox udangid;
    @FXML
    private CheckBox telorid;
    @FXML
    private CheckBox semurid;
    @FXML
    private CheckBox pepesid;
    @FXML
    private CheckBox roladeid;
    @FXML
    private CheckBox bandengid;
    @FXML
    private CheckBox tahutempeid;
    @FXML
    private Button backid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ayam(ActionEvent event) {
    }

    @FXML
    private void udang(ActionEvent event) {
    }

    @FXML
    private void telor(ActionEvent event) {
    }

    @FXML
    private void semur(ActionEvent event) {
    }

    @FXML
    private void pepes(ActionEvent event) {
    }

    @FXML
    private void rolade(ActionEvent event) {
    }

    @FXML
    private void bandeng(ActionEvent event) {
    }

    @FXML
    private void tahutempe(ActionEvent event) {
    }

    @FXML
    private void back(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("menu.fxml"));
        Scene scene = new Scene (fxmlLoader.load(), 590, 390);
        
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("Healthydroid");
        stage.show();
    }
    
}
