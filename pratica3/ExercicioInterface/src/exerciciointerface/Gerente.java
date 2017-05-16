package exerciciointerface;

public class Gerente extends Funcionario implements IAutenticavel {
    
    public String senha;
    private String pew;

    Gerente(String joao, int i, int i0, String minha_senha_é) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public boolean autentica(String senha){
        return this.pew.equals(senha);
    }
    

}
