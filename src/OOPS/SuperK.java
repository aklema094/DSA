/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPS;

class Anim{
    void eats(){
        System.out.println("animal can eats");
    }
}
class Cats extends Anim {
    void eats(){
        System.out.println("cat can eats");
    }
    void show(){
        super.eats();
    }
}
public class SuperK {
    
    public static void main(String[] args) {
        
        Cats c = new Cats();
        c.eats();
        c.show();
        
    }
    
}
