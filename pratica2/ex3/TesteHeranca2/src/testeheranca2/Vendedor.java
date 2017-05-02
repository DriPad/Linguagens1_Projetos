package testeheranca2;

public class Vendedor extends Funcinario {
    private double vendas = 0;
    protected static double taxaComissao = 0.03;
    protected static double taxaExtraSalario = 0.25;

    public Vendedor(String n, String cpf, int reg, double salario) {
        n = this.nome;
        cpf = this.cpf;
        reg = this.registro;
        salario = this.salarioBase;
    }
    

    @Override
    public double calcularBonus(double bonusIndividual){
        return this.vendas*Vendedor.taxaComissao + bonusIndividual;
    }
    
    
    public void realizarVenda(double valorVenda){
        if (valorVenda > 0) {
            this.vendas += valorVenda;
        }
        
        
    }
    
    public double getVendas(){
        return this.vendas;
    }
    
    @Override
    public void exibirResumo(){
        super.exibirResumo();
        System.out.println("Vendas:" + this.vendas);
        
        
    }
}
