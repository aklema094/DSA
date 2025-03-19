
package OOPS;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class FairnessInLock {
    
    private final Lock lock = new ReentrantLock(true);
    
    public void getResourseAccess(){
        lock.lock();
        try{   
            System.out.println(Thread.currentThread().getName()+ " acquring lock ");
            Thread.sleep(2000);
        }catch(Exception e){
            Thread.currentThread().interrupt();
        }finally{   
            System.out.println(Thread.currentThread().getName() + " released the lock");
            lock.unlock();
        }
    }
    
    public static void main(String[] args) {
        
        FairnessInLock fl = new FairnessInLock();
        
         
        Runnable task = new Runnable(){
            @Override
            public void run() {
               fl.getResourseAccess();
            }
            
        };
        
        
        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        Thread t3 = new Thread(task, "Thread 3");
        
        t1.start();
        t2.start();
        t3.start();
    }
    
}
