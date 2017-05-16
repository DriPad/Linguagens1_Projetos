package exerciciointerface;

public class Cliente implements IImprimivel, IAutenticavel {
    private String nome;
    private String cpf;
    private String endereco;
    private String senha;
    private String pew;
    
    public Cliente (String nome, String cpf, String senha){
        this.setNome(nome); 
        this.setCpf(cpf);
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
    
    @Override
    public void imprimirResumo(){
        System.out.println("");
        this.exibirResumo();
    }
    
}
