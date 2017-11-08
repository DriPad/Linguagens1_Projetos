
package hellothread;


public class HelloThread {

    
    public static void main(String[] args) {
        
        Programa1 p1 = new Programa1();
        Thread t1 = new Thread(p1);
        t1.start();
        
        Programa2 p2 = new Programa2();
        Thread t2 = new Thread(p2);
        t2.start();
    }
    
}
