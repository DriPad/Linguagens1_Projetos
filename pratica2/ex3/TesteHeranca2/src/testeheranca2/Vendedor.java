package testeheranca2;

public class Vendedor extends Funcinario {
    private double vendas;
    private double taxaComissao = 0.03;
    
    @Override
    public double calcularBonus(double bonusIndividual){
        return this.vendas * this.taxaComissao + bonusIndividual;
    }
    
}
