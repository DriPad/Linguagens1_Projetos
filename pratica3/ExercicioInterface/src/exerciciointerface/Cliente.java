package exerciciointerface;

public class Cliente implements IExibicao, IAutenticavel {
    private String nome;
    private String cpf;
    private String endereco;
    private int senha;
    private String pew;
    
    public Cliente (String nome, String cpf, String senha){
        this.setNome(nome); 
        this.setCpf(cpf);
        this.pew = senha;

    }
    
    public boolean alterarSenha(int senhaNova, int senhaAntiga){
        boolean retorno =false;
        if (autentica(senhaNova)){
            this.senha = senhaNova;
            retorno = true;
        }
        return retorno;
    }
    
    
    public boolean autentica(int senha){
        return false;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nomeNovo) {
        this.nome = nomeNovo;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void exibirResumo(){
        System.out.println("");
    }
    
    public void imprimirResumo(){
        System.out.println("");
        this.exibirResumo();
    }
    
}
