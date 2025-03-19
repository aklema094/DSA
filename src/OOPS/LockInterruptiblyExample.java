package OOPS;

import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private final ReentrantLock lock = new ReentrantLock();

    public void accessResource() {
        try {
            System.out.println(Thread.currentThread().getName() + " trying to acquire lock...");
            lock.lockInterruptibly();  // Can be interrupted while waiting
            try {
                System.out.println(Thread.currentThread().getName() + " acquired the lock!");
                Thread.sleep(3000);  // Simulate some work
            } finally {
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + " released the lock.");
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted while waiting for the lock.");
        }
    }
}

public class LockInterruptiblyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(resource::accessResource, "Thread 1");
        Thread t2 = new Thread(resource::accessResource, "Thread 2");

        t1.start();
        t2.start();

        // Interrupt Thread 2 while it is waiting for the lock
        try {
            Thread.sleep(1000);
            System.out.println("Main thread interrupting Thread 2...");
            t2.interrupt();  // Interrupt the second thread while it is waiting
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
