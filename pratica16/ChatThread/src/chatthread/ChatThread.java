/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatthread;

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
 * @author Aluno 18
 */
public class ChatThread implements Runnable{
    static Socket cliente;
    static boolean clienteFechou = false;
    static boolean serverFechou = false;
    /**
     * @param args the command line arguments
     */
    
    //CÓDIGO DO SERVIDOR
    public static void main(String[] args) {
              // 192.168.0.178
        Thread thr_entrada = new Thread(new ChatThread());
        ServerSocket servidor;
        
        thr_entrada.start();
              
        try {
            servidor = new ServerSocket(9000);
            Scanner teclado = new Scanner(System.in);
            PrintStream saidaRede = new PrintStream(cliente.getOutputStream());
           
            
            String msg = "";
            while (!msg.equalsIgnoreCase("tchau") && !serverFechou) {
                msg = teclado.nextLine();
                saidaRede.println(msg);
            }
            
            saidaRede.close();
            teclado.close();
            cliente.close();

        } catch (IOException ex) {
            Logger.getLogger(ChatThread.class.getName()).log(Level.SEVERE, null, ex);
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
