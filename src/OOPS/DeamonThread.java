
package OOPS;


public class DeamonThread extends Thread {
    
    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread is running");
        } else {
            System.out.println("User thread is running");
        }
    }



    public static void main(String[] args) {
        DeamonThread t1 = new DeamonThread();
        DeamonThread t2 = new DeamonThread();

        // Set t1 as a daemon thread
        t1.setDaemon(true);

        t1.start();
        t2.start();
    
}

     
    
}
