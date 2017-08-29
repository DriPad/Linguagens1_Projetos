/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author Aluno 17
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    private TableView tabela;
    
    @FXML
    private Label lblNome;
    @FXML
    private TextField txtNome;
    @FXML
    private Label lblTelefone;
    @FXML
    private TextField txtTelefone;
    @FXML
    private Button btnAdicionar;
    
    private void btnAdicionar(ActionEvent event) {
        
        
        label.setText("Hello World!");
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
