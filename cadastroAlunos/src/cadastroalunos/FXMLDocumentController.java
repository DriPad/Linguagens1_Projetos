/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroalunos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
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

        String linha = "Nome: " + nome
                + "\nIdade: " + idade
                + "\nEndereço: " + end
                + "\nRG: " + rg
                + "\nCPF:" + cpf;

        String path = "/Users/caroline/Desktop/Mauá/linguagens/cadastroAlunos" + rg + ".txt";

        File file = new File(path);

        if (!file.exists()) {
            file.createNewFile();
            System.out.println("Aluno cadastrado com sucesso!");
        } else {
            System.out.println("O aluno já está cadastrado!");
        }

        FileWriter fw = new FileWriter(file, true);

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(linha);

        bw.newLine();
        bw.flush();
        bw.close();

        // Aluno aluno = new Aluno(nome, idade, end, rg, cpf);
        // aluno.gravarAlunos();
    }
    
    @FXML
    private void adicionarImagem(ActionEvent event) throws MalformedURLException{
         FileChooser chooser = new FileChooser();
        chooser.setTitle("Open File");
        FileChooser.ExtensionFilter extFilterJPG = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.JPG");
        FileChooser.ExtensionFilter extFilterPNG = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.PNG");
        chooser.getExtensionFilters().addAll(extFilterJPG, extFilterPNG);
        File file = chooser.showOpenDialog(imgView.getScene().getWindow());
        
        URL url = file.toURI().toURL();
        //imgView.setImage(url);
        imgView.setImage(new Image(url.toExternalForm()));
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb
    ) {
        // TODO
    }

}
