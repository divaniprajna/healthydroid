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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class LoginloginController implements Initializable {

    @FXML
    private TextField nameid;
    @FXML
    private TextField pssid;
    @FXML
    private Label label;
    @FXML
    private Button okeid;
    
    @FXML
    private Button exit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void oke(ActionEvent event) throws IOException {
    if(nameid.getText().equals("admin")) 
        {
            if(pssid.getText().equals("123")) 
            {
                JOptionPane.showMessageDialog(null,"Anda berhasil login");
                FXMLLoader baru = new FXMLLoader();
                baru.setLocation(getClass().getResource("opsi.fxml"));
        
                Scene scene = new Scene(baru.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();


            }else
            {
                JOptionPane.showMessageDialog(null,"Incorrect Password","Error",JOptionPane.ERROR_MESSAGE);
                pssid.setText("");
                pssid.requestFocus();
            }
        }

        else
        {
            //jika username salah
            JOptionPane.showMessageDialog(null,"User ID And Password is Invalid","Error",JOptionPane.ERROR_MESSAGE);
            nameid.setText("");
            pssid.setText("");
            nameid.requestFocus();
        }
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }
    }
    

