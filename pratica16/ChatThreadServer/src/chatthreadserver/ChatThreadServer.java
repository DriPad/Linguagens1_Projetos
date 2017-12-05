package chatthreadserver;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Aluno 17
 */
public class ChatThreadServer implements Runnable {

    static Socket cliente;
    static boolean clienteFechou = false;
    static boolean serverFechou = false;
    
    public static void main(String[] args) {
        
        ServerSocket servidor;
        
              
        try {
            //cliente = new Socket("192.", 12345);
            servidor = new ServerSocket(9000);
            cliente = servidor.accept();
            
            Thread thr_entrada = new Thread(new ChatThreadServer());
            thr_entrada.start();
            
            try(
                    Scanner teclado = new Scanner(System.in);
                    PrintStream saidaRede = new PrintStream(cliente.getOutputStream());
                )
            {
            
                String msg = "";
                while (!msg.equalsIgnoreCase("tchau") && !serverFechou) {
                    msg = teclado.nextLine();
                    saidaRede.println(msg);
                }
            }    
            serverFechou = false;
            cliente.close();

        } catch (IOException ex) {
            Logger.getLogger(ChatThreadServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        try(
        Scanner entradaRede = new Scanner(cliente.getInputStream());)
        { String msg = "";
        
        while(!clienteFechou && !msg.equalsIgnoreCase("tchau")){
            msg = entradaRede.nextLine();
            System.out.println("Cliente:"+msg);
        }
        System.out.println("Cliente encerrou o chat");
        clienteFechou = true;
        }catch (Exception ex){
            System.out.println("Deu ruim");
        }
    }
    
    }
    
 
