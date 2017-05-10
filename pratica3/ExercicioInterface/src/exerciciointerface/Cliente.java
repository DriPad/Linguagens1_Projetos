package exerciciointerface;

public class Cliente implements IImprimivel, IAutenticavel {
    protected String nome;
    protected String cpf;
    protected String endereco;
    protected String senha;
    
    public boolean autentica(int senha){
        return false;
    }
    
}
