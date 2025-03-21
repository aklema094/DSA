
package OOPS;


public class LamdaExpressionExp {
    
    public static void main(String[] args) {
        
        Runnable task = () -> System.out.println(Thread.currentThread().getName()+" This is lamda expression");
        Thread t1 = new Thread(task);
        t1.start();
        
        // another way to concise way to use lamda expression in thread using runnable interface;
        
         Thread t2 = new Thread(() -> {  
             for (int i = 0; i < 10; i++) {
                 System.out.println(i+ " "+Thread.currentThread().getName()); 
             }
         },"Thread 2");
         
         t2.start();
         // lamda expression using functional interface
         FunctionalInterface fi = (a,b) -> a+b;
         
         System.out.println("Sum : "+fi.sum(5,3));
         
    }
}
