package aula03v2;
public class Conta {
    private int numero;
    private Cliente titular;
    private double saldo;
    
    public Conta(int numero, String nome, String sobrenome, String cpf){
        this.titular = new Cliente(nome, sobrenome, cpf);
        this.numero = numero;
    }
    
    void visualizarSaldo(){
        System.out.println("Saldo = " + this.saldo);
    }
    
    void depositar(double valor){
        if (valor > 0){
            this.saldo = this.saldo + valor;
        }
    }
    
    void VisualizarConta (){
       System.out.println("Nome do titular: " + this.titular.getNome());
       System.out.println("Sobrenome: " + this.titular.getSobrenome());
       System.out.println("Cpf: " + this.titular.getCpf());
       System.out.println("Saldo: " + this.saldo);
    }
    
    boolean sacar(double valor){
        if (valor > this.saldo){
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }
    
    boolean transferirPara(Conta x, double valor){
        if (this.sacar(valor)){
            x.depositar(valor);
            System.out.println("Transferencia realizada");
            return true;
        }
        else {
            System.out.println("Transferencia não realizada");
            return false;
        }
    }
}

    
