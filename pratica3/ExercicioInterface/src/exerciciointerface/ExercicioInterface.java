package exerciciointerface;

public class ExercicioInterface {
    
    public static void main(String[] args) {
     
        Secretario secretario = new Secretario("joao", 1, 4500);
        
        Gerente gerente = new Gerente("joao", 1, 4500, "Minha senha é");
        
        Diretor diretor = new Diretor("Dir", 3, 18000, "Minha senha é");
        
        Cliente cliente = new Cliente("Cliente", "455.038.383-93", "senha cliente");
        cliente.imprimirResumo();
        
        Sistema sistema = new Sistema();
        
        String senhaTentativaAcessoSistema = "5555";
        if (sistema.login(cliente ,senhaTentativaAcessoSistema)){
            
            System.out.println("Acessou");
        }
        
    }
    
}
