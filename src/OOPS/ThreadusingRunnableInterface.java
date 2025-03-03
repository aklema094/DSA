
package OOPS;

public class ThreadusingRunnableInterface {
    public static void main(String[] args) {
        
        Tast2 t2 = new Tast2();
        Thread tr = new Thread(t2);
        tr.start();
        
        for(;;){
            System.out.println("Thread name : "+Thread.currentThread().getName());
        }
    }
}
