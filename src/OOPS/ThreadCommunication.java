
package OOPS;


class SharedResource{
    private int data;
    private boolean hasData;
    
    public synchronized void produceData( int value){
        
        while(hasData){
            try{
                wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced "+value);
        notify();
        
    }
    
   public synchronized int consumeData(){
       
       while(!hasData){
           try{
               wait();
           }catch(InterruptedException e){
                Thread.currentThread().interrupt();
           }
       }
       hasData = false;
       System.out.println("Consumed "+data);
       notify();
       return data;
       
   }
}

class Producer implements Runnable{
    
    private SharedResource resource;
    Producer(SharedResource r){
        this.resource = r;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
           resource.produceData(i);       
        }
    }
    
}


class Consumer implements Runnable{
    
    private SharedResource resource;
    Consumer(SharedResource r){
        this.resource = r;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
               int val = resource.consumeData();       
        }
    }
    
}
public class ThreadCommunication {
    
    public static void main(String[] args) {
        
        SharedResource resource = new SharedResource();
        
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));
        
        producerThread.start();
        consumerThread.start();
        
    }
    
}
