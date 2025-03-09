
package OOPS;

public class ThreadsUsingthreadclass {
    
    public static void main(String[] args) {
       Test1 t1 = new Test1();
       t1.start();
        for(;;){
            System.out.println("thread name : "+Thread.currentThread().getName());
        }
    }
}
