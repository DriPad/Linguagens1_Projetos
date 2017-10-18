/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Aluno 17
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private AnchorPane lblDescricaoProduto;
    @FXML
    private Label lblCadastrar;
    @FXML
    private Label lblNomeProduto;
    @FXML
    private Label lblPrecoProduto;
    @FXML
    private TextField txtNomeProduto;
    @FXML
    private TextField txtDescricaoProduto;
    @FXML
    private TextField txtPrecoProduto;
    @FXML
    private Button btnCadastrar;
    
    Cadastro cadastro = new Cadastro();
    
    @FXML
    private void cadastrarProduto(ActionEvent event) {
        this.cadastro.cadastrarProduto(txtNomeProduto.getText(), txtDescricaoProduto.getText(), Float.parseFloat(txtPrecoProduto.getText()));
                
        System.out.println("Produto cadastrado com sucesso");
        //limpar os campos
    }
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
