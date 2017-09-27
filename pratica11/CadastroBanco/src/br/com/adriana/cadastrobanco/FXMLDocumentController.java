/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.adriana.cadastrobanco;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Aluno 18
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtIdade;
    @FXML
    private TextField txtRg;
    @FXML
    private TextField txtCpf;
    @FXML
    private TextField txtEndereco;
    @FXML
    private Button btnCadastrar;
    @FXML
    private ImageView imgView;
    @FXML
    private Button btnImagem;

    @FXML
    private void cadastrar(ActionEvent event) throws IOException {
        String nome = txtNome.getText();
        String idade = txtIdade.getText();
        String end = txtEndereco.getText();
        String rg = txtRg.getText();
        String cpf = txtCpf.getText();
        
        Connection conexao = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO cadastro(nome, idade, endereco, rg, cpf) VALUES (?,?,?,?,?)";
        
        PreparedStatement pa;
        
        
        try {
            pa = conexao.prepareStatement(sql);
            pa.setString(1, "Tiago");
            pa.setInt(2, 15);
            pa.setString(3, "Rua São Paulo");
            pa.setString(4, "8347238947");
            pa.setString(5, "00191822");
            pa.execute();
        } catch (SQLException ex) {
           
    }
}
        

   


