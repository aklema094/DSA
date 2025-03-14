
package OOPS;

public class SyncronizationInJava {
    
    public static void main(String[] args) {
        Counter count = new Counter();
        MyThread t1 = new MyThread(count);
        MyThread t2 = new MyThread(count);
        t1.start();
        t2.start();
        
        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            
        }
        System.out.println(count.getCount());
    }
   
   
}
