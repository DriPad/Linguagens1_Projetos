package exerciciointerface;

public class Secretario extends Funcionario implements IExibicao {
    
    public Secretario(String nome, String cpf, int registro, double salario) {
        super(nome, cpf, registro, salario);
    }
    
    public boolean atenderTelefone(boolean ocupado){
        
        return !ocupado; 
    }
    
    @Override
    public void exibirResumo(){
        System.out.println("Resumo aqui");
    }

}
