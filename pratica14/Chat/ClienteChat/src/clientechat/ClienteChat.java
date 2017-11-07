
package clientechat;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno 17
 */
public class ClienteChat {

    
    public static void main(String[] args) {
        String serverAddress = JOptionPane.showInputDialog("Informe o IP do servidor que está \n executando o serviço de chat na porta 9000");
        Socket cliente;
        
        try(
            cliente = new Socket(serverAddress, 9000);
            
            try(
                Scanner entradaRede = new Scanner(cliente.getInputStream());
                Scanner teclado = new Scanner(System.in);
                PrintStream saidaRede = new PrintStream(cliente.getOutputStream());
                
            )
            
        (
        
            System.out.println(entradaRede.nextLine());
            String msg = "";
            while (!msg.equalsIgnoreCase("tchau")){
                
                msg = teclado.nextLine();
                saidaRede.println(msg);
                msg = entradaRede.nextLine();
                System.out.println(msg);
            }
            System.out.println("Aplicação finalizada. Pressione ENTER para fechar o programa");
            teclado.nextLine();
            cliente.close();
        )
    } catch (IOException ex){
        Logger.getLogger(ClienteChat.class.getName()).log(Level.SEVERE, null, ex);
    }
        System.exit(0);
    
}
