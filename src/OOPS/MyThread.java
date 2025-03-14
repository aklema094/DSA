
package OOPS;

public class MyThread extends Thread {
    public Counter counter;
     
    MyThread ( Counter c){  
        this.counter = c;   
    }
    
    @Override 
    public void run(){
        
        for (int i = 1; i <=100; i++) { 
            counter.increment();
        }
    }
    
    
    
}
