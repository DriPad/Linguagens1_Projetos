/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.adriana.cadastrobanco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno 18
 */
public class Aluno {
    private String nome;
    private String idade;
    private String endereco;
    private String rg;
    private String cpf;

    public Aluno(String nome, String idade, String endereco, String rg, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void gravarAlunos() throws IOException{
        
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
        
        /*String linha = "Nome: "+this.nome+
                "\n Idade: "+ this.idade +
                "\n Endereço: "+ this.endereco+
                "\n RG: "+ this.rg+
                "\n CPF:"+ this.cpf;
        String path = "/Users/caroline/Desktop/Mauá/linguagens/file.txt";
        FileWriter fw = new FileWriter(path, true);
        PrintWriter pw = new PrintWriter(fw);
        BufferedWriter bw = new BufferedWriter(pw);
        bw.write(linha);
        bw.newLine();
        bw.flush();
        bw.close();*/
    }
}
