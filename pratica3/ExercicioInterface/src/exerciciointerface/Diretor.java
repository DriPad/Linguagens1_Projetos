package exerciciointerface;

public class Diretor extends Funcionario implements IAutenticavel {
    
    private String pew;
    
    public Diretor (String nome, int registro, double salario, String senha){
        this.setNome(nome); 
        this.setRegistro(registro);
        this.setSalario(salario);
        this.pew = senha;

    }
    
    public boolean alterarSenha(String senhaNova, String senhaAntiga){
        boolean retorno = false;
        
        if (this.autentica(senhaAntiga)){
            
            this.pew = senhaNova;
            retorno = true;
        }
        return retorno;
    }
    
    public boolean darAumento(Funcionario f, String senha, double aumento){
        
        boolean retorno = false;
        
        if (this.autentica(senha)){
            f.setSalario(f.getSalario() + aumento);
            retorno = true;
        }
        return retorno;
    }
    
    @Override
    public boolean autentica(String senha){
        
        return this.pew.equals(senha);
        
    }    
}
