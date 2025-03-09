
package OOPS;


public class SetPriorityofthread extends Thread {
    
    SetPriorityofthread(String n){
        super(n);
    }
    @Override
    public void run(){  
        
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" Priority : "+Thread.currentThread().getPriority() +
                    " Count :"+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
        }        
    }
        
   }
    
    public static void main(String[] args) {
        SetPriorityofthread l = new SetPriorityofthread("low Thread - ");
        SetPriorityofthread m = new SetPriorityofthread("Medium Thread - ");
        SetPriorityofthread h = new SetPriorityofthread("High Thread - ");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
    }
}
