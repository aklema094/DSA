
public class HierarchialInheritance {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.fly();
        b.eat();
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}

class Creature{
    void eat(){
        System.out.println("Eating");
    }
}
class Bird extends Creature{
    void fly(){
        System.out.println("flying");
    }
}
class Dog extends Creature {
    void bark(){
        System.out.println("barking");
    }
}
