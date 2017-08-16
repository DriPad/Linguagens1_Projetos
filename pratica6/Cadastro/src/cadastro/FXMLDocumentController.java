/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;



/**
 *
 * @author Aluno 17
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblNome;
    private Label lblIdade;
    private Label lblEbdereco;
    private Label lblCpf;
    private Label lblRg;
    private TextField txtNome;
    private TextField txtIdade;
    private TextField txtEndereco;
    private TextField txtCpf;
    private TextField txtRg;
    private Button btnEnviar;
    
    
    
    @FXML
    private void btnEnviar(ActionEvent event) throws IOException {
        try {

	      File file = new File("c:\\newfile.txt");

	      if (file.createNewFile()){
	        System.out.println("File is created!");
	      }else{
	        System.out.println("File already exists.");
	      }

    	} catch (IOException e) {
	      e.printStackTrace();
	}
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
