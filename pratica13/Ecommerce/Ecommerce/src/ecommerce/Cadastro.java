package ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Cadastro {
    
    private String nome;
    private String descricao;
    private float preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    public void cadastrarProduto(String nome, String descricao, float preco){
        Connection conexao = ConnectionFactory.getConnection();
        String sql = "INSERT INTO tblproduto (`nome`, `descricao`, `preco`) VALUES (?, ?, ?)";
        PreparedStatement ps;

        try {
            ps = conexao.prepareStatement(sql);

            ps.setString(1, nome);
            ps.setString(2, descricao);
            ps.setFloat(3, preco);

            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Problemas na conexão");
        }
    }
}
