package testeheranca2;

public class Funcinario {
    protected String nome;
    protected String cpf;
    protected int registro;
    protected double salarioBase;
    protected double horaExtra;
    
    public Funcinario(String n, String cpf, int reg, double sal){
        this.setNome(n);
        this.setCpf(cpf);
        this.setRegistro(reg);
        this.setSalarioBase(sal);
    }
    
    
    public double calcularBonus(double bIndividual){
        return bIndividual;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
    
    public void exibirResumo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Registro: " + this.registro);
        System.out.println("Salario base:" + this.salarioBase);
        System.out.println("Salario base:" + this.salarioBase);
        
        
    }
    
}

