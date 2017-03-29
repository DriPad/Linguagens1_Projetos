package concessionaria;

public class Concessionaria {

   public static void main(String[] args) {
        
       Funcionarios x = new Funcionarios("Adriana Maria Padilla", "455.950.418-03", 1, 2500, 300);
       x.contabilizarVenda(1000);
       x.exibirResumo();
    }
    
}
