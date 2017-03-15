package aula03v2;
public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    
    public Cliente (String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    
    String getNome(){
        return this.nome;
    }
    
    String getSobrenome(){
        return this.sobrenome;
    }
    
    String getCpf(){
        return this.cpf;
    }
}

