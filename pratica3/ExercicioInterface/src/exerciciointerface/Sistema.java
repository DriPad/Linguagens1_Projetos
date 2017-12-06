package exerciciointerface;

public class Sistema {
    
    public boolean login(IAutenticavel a, int senhaDeAcesso){
        return  a.autentica(senhaDeAcesso);
        }
}
