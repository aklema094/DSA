
package OOPS;


public class InturruptThreadMethod extends Thread{
    
    @Override
    public void run(){
        
        System.out.println("Thread is runnig");
        try{
            Thread.sleep(5000);       
          
        }catch(InterruptedException e){
            System.out.println(e);
      }
    }
    
    public static void main(String[] args) {
        InturruptThreadMethod t1 = new InturruptThreadMethod();
        t1.start();
        t1.interrupt();
        
        
    }
    }
    

