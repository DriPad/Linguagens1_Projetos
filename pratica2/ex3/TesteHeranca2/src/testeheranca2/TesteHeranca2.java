package testeheranca2;
import java.util.Scanner;

public class TesteHeranca2 {
    Concessionaria concessionaria;
    
    public static void main(String[] args) {
        
        Concessionaria cons = new Concessionaria(0,0);
        
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int i = scan.nextInt();
        System.out.println("s= "+ s);
        System.out.println("i= "+ i);
        
        //perguntar o numero de vendedores e gerentes
        //perguntar n vendedor
        //perguntar n gerente
        
        
       
    }
    public void menuA(){
        int opcao = 0;
        String nome;
        String cpf;
        int registro;
        double salarioBase;
        double horaExtra;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Menu A");
            System.out.println("1- Inserir funcionário");
            System.out.println("2- Realizar venda");
            System.out.println("3- Exibir resumo");
            System.out.println("4- Sair");
            opcao = scan.nextInt();
            
            switch(opcao){
                case 1:                    
                    System.out.println("Nome: ");
                    nome = scan.next();
                    System.out.println("Cpf: ");
                    cpf = scan.next();
                    System.out.println("Registro: ");
                    registro = scan.nextInt();
                    System.out.println("Salário base: ");
                    salarioBase = scan.nextDouble();
                    System.out.println("Hora extra: ");
                    horaExtra = scan.nextDouble();
                    
                    break;
                case 2:
                    break;
                    
                case 3:
                    break;
                    
                case 4:
                    break;
                    
                default: System.out.println("Opção inválida");
            }
            
            } while (opcao !=0);
        
    }

    public void menuB(){
        int opcao = 0;
        do {
            
            Scanner scan = new Scanner(System.in);
            System.out.println("Menu B");
            System.out.println("1- Inserir gerente");
            System.out.println("2- Inserir vendedor");
            System.out.println("3- Voltar ao menu anterior");
            opcao = scan.nextInt();
            switch(opcao){
                case 1:
                    break;
                
                case 2:
                    break;
                    
                case 3:
                    break;
                    
                default: System.out.println("Opção inválida");
                    
            }
            
            } while (opcao !=0);
        
    }
    
}

//qual numero de funcioanrio
//numero de vendedor
//numero de gerentes
//for entra com as informacaos do vendedor 1, vendedor 2...
