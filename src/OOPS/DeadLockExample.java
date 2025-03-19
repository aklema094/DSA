
package OOPS;


class Pen{
    
    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName()+" is using pen  " +this+ "  and trying to use paper");
        paper.finishWriting();
    }
    
    public  synchronized void finishWriting(){
          System.out.println(Thread.currentThread().getName()+" finish writing " +this);
    }
}
class Paper{
    
     public synchronized void writeWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName()+" is using Paper  " +this+ "  and trying to use pen ");
        pen.finishWriting();
    }
    
    public  synchronized void finishWriting(){
        
          System.out.println(Thread.currentThread().getName()+" finish writing " +this);
    }
}

class Task1 implements Runnable{
    
    private Pen pen;
    private Paper paper;
    
    Task1(Pen pen,Paper paper){
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper);
    }
    
}
class Task2 implements Runnable{
    
    private Pen pen;
    private Paper paper;
    
    Task2(Pen pen,Paper paper){
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        paper.writeWithPaperAndPen(pen);
    }
    
}
public class DeadLockExample {
    
    public static void main(String[] args) {
        
        Paper paper = new Paper();
        Pen pen = new Pen();
        
        Thread t1 = new Thread(new Task1(pen,paper),"Thread 1");
        Thread t2 = new Thread(new Task2(pen,paper),"Thread 2");
        
        t1.start();
        t2.start();
        
    }
    
}
