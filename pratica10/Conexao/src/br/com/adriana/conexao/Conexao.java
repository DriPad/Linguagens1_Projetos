package br.com.adriana.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Connection conexao = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO tblalunos (nome, idade, ra) VALUES (?,?,?)";
        
        PreparedStatement pa;
        
        
        try {
            pa = conexao.prepareStatement(sql);
            pa.setString(1, "Tiago");
            pa.setInt(2, 15);
            pa.setString(3, "32190321");
            pa.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
