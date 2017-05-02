package testeheranca2;

public class Gerente extends Funcinario {
    private double vendas;
    private int vendedor;

    public Gerente(String n, String cpf, int reg, double sal) {
        this.nome = nome;
        this.cpf = cpf;
        this.registro = registro;
    }
    
    public double getVendas(){
        return this.vendas;
    }
    
    public double calcularBonus(double bIndividual){
        return this.vendedor*Vendedor.taxaComissao + bIndividual;
    }
    
    public double remuneracaoFinal(double bIndividual){
        return this.calcularBonus(bIndividual) + this.salarioBase;
    }
    
    @Override
    public void exibirResumo(){
        super.exibirResumo();
        System.out.println("Vendas:" + this.vendas);
    }
}
