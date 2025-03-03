/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPS;

/**
 *
 * @author user
 */
public class Tast2 implements Runnable {

    @Override
    public void run() {
         for(;;){
            System.out.println("Thread name : "+Thread.currentThread().getName());
        }
    }
    
}
