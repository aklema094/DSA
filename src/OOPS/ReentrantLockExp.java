
package OOPS;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ReentrantLockExp {
    
        private final Lock lock = new ReentrantLock();
        
        public void outerMethod(){
            lock.lock();
            try{
                System.out.println("Outer method");
                Thread.sleep(2000);
                innerMethod();
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                lock.unlock();
            }
        }
         public void innerMethod(){
            lock.lock();
            try{
                System.out.println("Inner method");
                Thread.sleep(2000);    
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                lock.unlock();
            }
        }
      public static void main(String[] args) {
        
          ReentrantLockExp rl = new ReentrantLockExp();
          rl.outerMethod();
        
    }
}
