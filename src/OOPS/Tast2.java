
package OOPS;

public class Tast2 implements Runnable {

    @Override
    public void run() {
         for(;;){
            System.out.println("Thread name : "+Thread.currentThread().getName());
        }
    }
    
}
