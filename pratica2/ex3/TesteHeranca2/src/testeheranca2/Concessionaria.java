package testeheranca2;

public class Concessionaria {
    private int totalFuncionarios;
    private double totalVendas;
    private double bonusIndividual;
    
    public void bonificacaoConcessionaria(){
        this.bonusIndividual = (this.totalVendas/this.totalFuncionarios) * 0.05;
    }
}
