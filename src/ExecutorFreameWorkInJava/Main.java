
package ExecutorFreameWorkInJava;


public class Main {
    
    public static void main(String[] args) {
        
        long startTime = System.currentTimeMillis();
            Thread[] tr = new Thread[9];
        for (int i = 1; i < 10; i++) {
              int finalval = i;
 
            tr[i-1] = new Thread(()->{
                long res = factorial(finalval);
                System.out.println(res);
            });
            
            tr[i-1].start();
            
        }
        
        for(Thread t : tr){
            try{
                t.join();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Total time : "+(System.currentTimeMillis()-startTime));
        
    }
    
    private static long factorial(int n){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
       long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
}
