/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplowrap;

import java.util.ArrayList;

/**
 *
 * @author Aluno 17
 */
public class ExemploWrap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declarando o arraylist e qual o tipo que esta contido na lista
        //criando a lista
        ArrayList<String> lista = new ArrayList<String>();
        ArrayList<String> lista2 = new ArrayList<String>();
        
        lista.add("numero: 1");
        lista.add("numero: 2");
        lista.add("numero: 2");
        
        
        printList(lista);
        
        lista.add(1, "numero 2.5");
        lista.set(2, "numero super 2");
        printList(lista);
        
        lista.remove(1);
        printList(lista);
        
        lista2.add("original lista2 - 1");
        lista2.add("original lista2 - 2");
        lista2.add("original lista2 - 3");
        lista2.addAll(1,lista);
        printList(lista2);
        
        
    }
    
    //ler o array e exibir
    public static void printList(ArrayList<String> arrayLista){
        System.out.println("-------- Inicio lista --------");
        for (int i = 0; i < arrayLista.size(); i++) {
            System.out.println(arrayLista.get(i));
        }
    }
    
}
