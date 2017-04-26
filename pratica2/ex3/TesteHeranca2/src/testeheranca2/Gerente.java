package testeheranca2;

public class Gerente extends Funcinario {
    
    

    Gerente(String n, String cpf, int reg, double salario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    public void exibirResumo(){
        super.exibirResumo();
        System.out.println("Vendas:" + this.vendas);
    }
}
