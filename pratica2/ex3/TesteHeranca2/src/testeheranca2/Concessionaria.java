package testeheranca2;

public class Concessionaria {
    public int totalFuncionarios;
    public double totalVendas;
    public double bonusIndividual;
    private int nVendedor = 0;
    private int nGerente = 0;
    private double taxaBonus = 0.05;
    private Vendedor[] vendedor;
    private Gerente[] gerente;
    
    public Concessionaria(int nVend, int nGer){
        vendedor = new Vendedor[nVend];
        gerente = new Gerente[nGer];
    }
    
    private double calcularTotalVendas(){
        double totalVendas = 0;
        
        for (int i = 0; i < this.nVendedor; i++) {
            totalVendas += this.vendedor[i].getVendas();
        }
        
        for (int i = 0; i < this.nGerente; i++) {
            totalVendas += this.vendedor[i].getVendas();
        }
        return totalVendas;
    }
    
    
    public boolean novoVendedor(String n, String cpf, int reg, double salario){
        boolean result;
        
        if (nVendedor < vendedor.length ) {
            
            vendedor[nVendedor] = new Vendedor(n, cpf, reg, salario);
            this.nVendedor++;
            result = false;
        } else
            result = false;
        
        return result;
    }
    
    public boolean novoGerente(String n, String cpf, int reg, double salario){
        boolean result;
        
        if ( this.nGerente < this.gerente.length ) {
            
            this.gerente[this.nGerente] = new Gerente(n, cpf, reg, salario);
            this.nGerente++;
            this.totalFuncionarios++;
            result = true;
        } else
            result = false;
        
        return result;
    }
    
    public double bonificacaoConcessionaria(){
        return ( (this.calcularTotalVendas() / this.totalFuncionarios)*this.taxaBonus);
    }
    
    public void setTaxaBonus (double tx){
        this.taxaBonus = taxaBonus;
    }
}
