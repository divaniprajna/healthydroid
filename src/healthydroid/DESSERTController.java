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
public class DESSERTController implements Initializable {

    @FXML
    private CheckBox creamid;
    @FXML
    private CheckBox cookieid;
    @FXML
    private CheckBox sandwichid;
    @FXML
    private CheckBox pieid;
    @FXML
    private CheckBox saladid;
    @FXML
    private CheckBox pudingid;
    @FXML
    private CheckBox lasagnaid;
    @FXML
    private CheckBox jajanid;
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
    private void cream(ActionEvent event) {
    }

    @FXML
    private void cookie(ActionEvent event) {
    }

    @FXML
    private void sandwich(ActionEvent event) {
    }

    @FXML
    private void pie(ActionEvent event) {
    }

    @FXML
    private void salad(ActionEvent event) {
    }

    @FXML
    private void puding(ActionEvent event) {
    }

    @FXML
    private void lasagna(ActionEvent event) {
    }

    @FXML
    private void jajan(ActionEvent event) {
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
