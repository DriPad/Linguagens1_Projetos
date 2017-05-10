package exerciciointerface;

public class Gerente extends Funcionario implements IAutenticavel {
    
    private String senha;
    
    public boolean autentica(int senha){
    return false;    
    }
    

}
