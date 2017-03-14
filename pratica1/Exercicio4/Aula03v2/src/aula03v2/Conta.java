package aula03v2;
public class Conta {
    int numero;
    Cliente titular;
    double saldo;
    
    
    void visualizarSaldo(){
        System.out.println("Saldo = " + this.saldo);
    }
    
    void depositar(double valor){
        if (valor > 0){
            this.saldo = this.saldo + valor;
        }
        
    }
    
    void VisualizarConta (){
       System.out.println("Nome do titular: " + this.titular.nome);
       System.out.println("Sobrenome: " + this.titular.sobrenome);
       System.out.println("Cpf: " + this.titular.cpf);
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
