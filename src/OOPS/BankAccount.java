
package OOPS;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class BankAccount {
     private int balance = 200;
     private final Lock lock = new ReentrantLock();
    
    public  void withdraw(int amount){
        
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw " + amount);
        
       try{
           
           if(lock.tryLock(1,TimeUnit.SECONDS)){
                  if(amount<=balance){
            
                   try{
                 
                 System.out.println(Thread.currentThread().getName()+" proceeding with withdrawal " + amount);
                 Thread.sleep(3000);
                  balance -= amount;
              System.out.println(Thread.currentThread().getName()+" completed withdrawal " + amount);
             }catch(InterruptedException e){
                 
             }finally{
                       lock.unlock();
                   }
            
            
        }else{
            System.out.println(Thread.currentThread().getName()+" insufficient balance");
        }
               
           }else{
               System.out.println(Thread.currentThread().getName()+" could not acquire the lock! will try later. ");
           }
           
       }catch(Exception e){
           
       }
    }
}


