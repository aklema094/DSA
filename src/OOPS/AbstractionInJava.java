
package OOPS;

abstract class Animal{
    
    public void walk(){
        System.out.println("Animal can walk");
    }
    
    abstract public void sleep();
}

class Cat extends Animal{
    @Override
    public void sleep(){
        System.out.println("Cat sleep Zzzz...");
    }
}
public class AbstractionInJava {
    public static void main(String[] args) {
        Cat c= new Cat();
        c.sleep();
        c.walk();
    }
}
