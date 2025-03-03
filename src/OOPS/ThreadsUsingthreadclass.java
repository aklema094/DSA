/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPS;

/**
 *
 * @author user
 */
public class ThreadsUsingthreadclass {
    
    public static void main(String[] args) {
       Test1 t1 = new Test1();
       t1.start();
        for(;;){
            System.out.println("thread name : "+Thread.currentThread().getName());
        }
    }
}
