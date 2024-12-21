/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Polymor {
    
    public static void main(String[] args) {
        
        Animal ani = new Animal();
        ani.eat();
           
        Animal anim = new Deer();
        anim.eat();
        
        Deer d = new Deer();
        d.eat();
        
        
    }
    
}
class Animal{
    void eat(){
        System.out.println("can eat");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}
