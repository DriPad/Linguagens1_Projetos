/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorchat;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Aluno 17
 */
public class ServidorChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServerSocket servidor;
        try{
            servidor = new ServerSocket(9000);
            System.out.println("Esperando por conexões na porta 9000 para começar o chat");
            
            Socket cliente = servidor.accept();
            System.out.println("Nova conexao com o cliente" + cliente.getInetAddress().getHostAddress());
        }
        
        
    }
    
}
