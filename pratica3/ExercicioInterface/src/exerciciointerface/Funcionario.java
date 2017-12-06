package exerciciointerface;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private int registro;
    private double salario;
    
    public Funcionario(String nome, String cpf, int registro, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.registro = registro;
        this.salario = salario;
                
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nomeNovo) {
        this.nome = nomeNovo;
    }

    public int getRegistro() {
        return this.registro;
    }

    public void setRegistro(int registroNovo) {
        this.registro = registroNovo;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
