/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author ADRIANA
 */
public class FXMLDocumentController implements Initializable {
    
    
    
    @FXML
    private Label lblNome;
    
    @FXML
    private Label lbldade;
    
    @FXML
    private Label lblEndereco;
    
    @FXML
    private Label lblCpf;
    
    @FXML
    private Label lblRg;
    
    @FXML
    private TextField txtIdade;
    
    @FXML
    private TextField txtRg;
    
    @FXML
    private TextField txtCpf;
    
    @FXML
    private TextField txtEndereco;
    
    @FXML
    private TextField txt;
    
    
    @FXML
    private Button btnEnviar ;
    
    @FXML
    private void btnEnviar(ActionEvent event) {
        System.out.println("You clicked me!");
       
        
        try{
            // Create file 
            FileWriter fstream = new FileWriter("C:\\Users\\ADRIANA\\Documents\\Maua-3ano\\Linguagem de programação\\NetBeansProjects\\cadastro\\out.txt");
            BufferedWriter out = new BufferedWriter(fstream);
            out.write("Nome: " + txt.getText());
            out.newLine();
            out.write("Idade: " + txtIdade.getText());
            out.newLine();
            out.write("Endereço: " + txtEndereco.getText());
            out.newLine();
            out.write("CPF: " + txtCpf.getText());
            out.newLine();
            out.write("RG: " + txtRg.getText());
            
            
            //Close the output stream
            out.close();
            }catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        } 
        
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
