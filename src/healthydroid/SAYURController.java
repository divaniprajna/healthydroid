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
public class SAYURController implements Initializable {

    @FXML
    private CheckBox cahid;
    @FXML
    private CheckBox oporid;
    @FXML
    private CheckBox rendangid;
    @FXML
    private CheckBox captjayid;
    @FXML
    private CheckBox sayurasemid;
    @FXML
    private CheckBox sotoid;
    @FXML
    private CheckBox supayamid;
    @FXML
    private CheckBox urapid;
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
    private void cah(ActionEvent event) {
    }

    @FXML
    private void opor(ActionEvent event) {
    }

    @FXML
    private void rendang(ActionEvent event) {
    }

    @FXML
    private void captjay(ActionEvent event) {
    }

    @FXML
    private void sayurasem(ActionEvent event) {
    }

    @FXML
    private void soto(ActionEvent event) {
    }

    @FXML
    private void supayam(ActionEvent event) {
    }

    @FXML
    private void urap(ActionEvent event) {
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
