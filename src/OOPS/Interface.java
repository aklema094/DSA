
package OOPS;
interface Animal{
    public void sleep();
}
class Dog implements Animal{

      
    public void sleep() {
        
        System.out.println("Dog slep : wee wee!!!");
        
    }
    
}
public class Interface {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sleep();
        Dog d = new Dog();
        d.sleep();
        
    }
}
