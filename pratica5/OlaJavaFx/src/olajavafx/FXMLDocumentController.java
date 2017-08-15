/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olajavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Aluno 17
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblPrimeiro;
    private Button btnPrimeiro;
    
    
    @FXML
    private void cliqueBotao(ActionEvent event) {
        lblPrimeiro.setText("Parabens!");
        btnPrimeiro.setText("valeu");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
