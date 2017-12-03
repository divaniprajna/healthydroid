/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthydroid;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
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
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class CekkesehatanController implements Initializable {
    String tmp = "";

    @FXML
    private Label label;

    @FXML
    private RadioButton rdbl;

    @FXML
    private ToggleGroup a;

    @FXML
    private RadioButton rdbp;

    @FXML
    private JFXButton proses_id;

    @FXML
    private JFXButton reset_id;

    @FXML
    private TextField ideal_id;

    @FXML
    private TextArea TA1;

    @FXML
    private TextArea TA2;

    @FXML
    private JFXTextField nama_id;

    @FXML
    private JFXTextField tinggi_id;

    @FXML
    private JFXTextField berat_id;
    
    @FXML
    private Button back;

    @FXML
    void proses(ActionEvent event) {
        double tinggi, berat, tinggihitung = 0;
        
        if(!(rdbl.isSelected() || rdbp.isSelected() )){
            JOptionPane.showMessageDialog(null, "Harap Pilih Jenis Kelamin");
        }else{
            
        
        String gender = null;
        tinggi = Double.valueOf(tinggi_id.getText());
        berat = Double.valueOf(berat_id.getText());
        String nama = nama_id.getText();
        
        if(rdbl.isSelected()){
            gender="Laki-laki";
            
            tinggihitung = (tinggi - 110);
        } else if(rdbp.isSelected()){
            gender="Perempuan";
            tinggihitung = (tinggi - 100);
        }
        
        tmp=Double.toString(tinggihitung);
        String kate, saran;
        if(tinggihitung==berat){
            kate="IDEAL";
            saran="Jaga pola makan anda";
        }else if(tinggihitung>berat){
            kate="UNDERWEIGHT";
            saran="Tingkatkan pola makan anda";
        }else{
            kate="OVERWEIGHT";
            saran="Turunkan pola makan anda";
        
        }
        ideal_id.setText(tmp);
            TA1.setText("Nama: "+nama+"\n Tinggi: "+tinggi+"\n Berat: "+berat+"\n Jenis Kelamin: "+gender+"\n Berat Badan Anda "+kate);
            TA2.setText(saran);
    }
    }

    @FXML
    void reset(ActionEvent event) {
        nama_id.setText("");
        tinggi_id.setText("");
        berat_id.setText("");
        rdbl.setSelected(false);
        rdbp.setSelected(false);
        TA1.setText("");
        TA2.setText("");
    }    
    
    @FXML
    void back(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("opsi.fxml"));
        Scene scene = new Scene (fxmlLoader.load(), 590, 390);
        
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("Healthydroid");
        stage.show();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
