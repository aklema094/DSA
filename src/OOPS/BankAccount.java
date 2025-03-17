
package OOPS;


public class BankAccount {
     private int balance = 200;
    
    public synchronized void withdraw(int amount){
        
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw " + amount);
        
        if(amount<=balance){
            
             System.out.println(Thread.currentThread().getName()+" proceeding with withdrawal " + amount);
             try{
                 Thread.sleep(3000);
             }catch(InterruptedException e){
                 
             }
             balance -= amount;
              System.out.println(Thread.currentThread().getName()+" completed withdrawal " + amount);
            
        }else{
            System.out.println(Thread.currentThread().getName()+" insufficient balance");
        }
    }
}


