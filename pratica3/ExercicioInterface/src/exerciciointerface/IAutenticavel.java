package exerciciointerface;

public interface IAutenticavel {
    
    public boolean autentica(int senha);
    public boolean alterarSenha(int senhaNova, int senhaAntiga);
}
