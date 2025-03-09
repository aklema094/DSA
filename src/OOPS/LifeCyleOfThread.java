
package OOPS;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LifeCyleOfThread extends Thread{
    @Override
    public void run(){
        System.out.println("Running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
    public static void main(String[] args) throws InterruptedException {

        LifeCyleOfThread t1 = new LifeCyleOfThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }
    
}
