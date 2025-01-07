
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
