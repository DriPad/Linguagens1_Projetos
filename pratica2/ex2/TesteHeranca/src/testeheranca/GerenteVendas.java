package testeheranca;

public class GerenteVendas extends Vendedor {
    private String senha;
    private int numVendedores;
    
    public GerenteVendas(String n, String c, int r, double s, double h){
        this.nomeCompleto = n;
        this.cpf = c;
        this.registro = r;
        this.salarioBase = s;
        this.horaExtra = h;
    }
    
    
    public void contabilizarVendedor(){
        this.numVendedores = this.numVendedores + 1;
    }
    
    
    public boolean darAumento(Vendedor vend, double aumento, String senha){
        if (this.registro == vend.getRegistro()){
            if(senha.equals(this.senha)){
                if(aumento > 0 ){
                    vend.setSalario(vend.getSalario() * aumento + vend.getSalario());
                    return true;
                }
                else
                    return false;
            }
            else
                return false;
        }
        else
            return false;
    }
    
}
