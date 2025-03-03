
package OOPS;

/**
 *
 * @author user
 */
public class Test1  extends Thread {
    
    @Override
    
    public void run(){
        for(;;){
            System.out.println("thread name : "+Thread.currentThread().getName());
        }
    }
    
    
}
