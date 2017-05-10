package exerciciointerface;

public class Diretor extends Funcionario implements IAutenticavel {
    
    private double senha;
    
    public boolean autentica(int senha){
        return false;
    }    
}
