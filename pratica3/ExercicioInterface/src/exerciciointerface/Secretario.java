package exerciciointerface;

public class Secretario extends Funcionario implements IExibicao {
    
    public Secretario(String nome, int registro, double salario){
        this.setNome(nome);
        this.setRegistro(registro);
        this.setSalario(salario);
    }
    
    public boolean atenderTelefone(boolean ocupado){
        
        return !ocupado; 
    }
    
    @Override
    public void exibirResumo(){
        System.out.println("Resumo aqui");
    }

}
