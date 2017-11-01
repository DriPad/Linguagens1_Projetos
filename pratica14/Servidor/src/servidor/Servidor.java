/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Aluno 17
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            ServerSocket servidor = new ServerSocket(8000);
            System.out.println("Servidor ouvindo a porta 8000");
            while(true){
                Socket cliente = servidor.accept();
                System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
                
                
                PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
                out.println("ola, bem vindo: seu ip é: cliente");
                
                Scanner in = new Scanner(cliente.getInputStream());
                
                
                Scanner scan = new Scanner(System.in);
                String a = scan.nextLine();
                System.out.println(a);
                
                
                String s = in.nextLine();
                System.out.println(s);
            }
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
