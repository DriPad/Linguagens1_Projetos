package exerciciointerface;

public class Gerente extends Funcionario implements IAutenticavel{
    private int senha;

    public Gerente(String nome, String cpf, int registro, double salario, int senha) {
        super(nome, cpf, registro, salario);
        this.senha = senha;
    }
    
    @Override
    public boolean autentica(int senha){
        if(this.senha != senha) {
            return false;}
        return false;
    }
    
    @Override
    public boolean alterarSenha(int senhaNova, int senhaAntiga){
        boolean retorno =false;
        if (senhaAntiga==this.senha){
            this.senha = senhaNova;
            retorno = true;
        }
        return retorno;
    }

}
