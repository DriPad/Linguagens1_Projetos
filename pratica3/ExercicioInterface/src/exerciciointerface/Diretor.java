package exerciciointerface;

public class Diretor extends Funcionario implements IAutenticavel {
    
   
    private int senha;
    
    public Diretor(String nome, String cpf, int registro, double salario, int senha) {
        super(nome, cpf, registro, salario);
        this.senha = senha;
    }
    
    @Override
    public boolean alterarSenha(int senhaNova, int senhaAntiga){
        boolean retorno =false;
        if (senhaAntiga==this.senha){
            this.senha = senhaNova;
            retorno = true;
        }
        return retorno;}
    
    public boolean darAumento(Funcionario f, int senha, double aumento){
        boolean retorno = false;
        
        if (this.autentica(senha)){
            f.setSalario(f.getSalario()+aumento);
            retorno = true;
        }
        return retorno;
    }
    
    @Override
    public boolean autentica(int senha){
        if(this.senha != senha) {
            return false;}
        else
            return true;
    }
}
