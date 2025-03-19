
package OOPS;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class ReadWriteLocksExample {
    
    int data = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();
    
    public void increment(){
        writeLock.lock();
        
        try{
            data++;
        }finally{
            writeLock.unlock();
        }
        
    }
    
      
    public int getData(){
        readLock.lock();   
        try{
            return data;
        }finally{
            readLock.unlock();
        }
        
        
    }
    
    public static void main(String[] args) {
        
        ReadWriteLocksExample rw = new ReadWriteLocksExample();
        
        Runnable read = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName()+" read : "+rw.getData());
                }
            }
            
        };
        
         Runnable write = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    rw.increment();
                    System.out.println(Thread.currentThread().getName()+" write : incremented ");
                }
            }
            
        };
         
         Thread t1 = new Thread(write);
         Thread t2 = new Thread(read);
         Thread t3 = new Thread(read);
         
         t1.start();
         t2.start();
         t3.start();
        
         
    }
    }
    

