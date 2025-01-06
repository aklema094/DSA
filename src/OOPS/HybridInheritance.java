package OOPS;

public class HybridInheritance {

    public static void main(String[] args) {

        peacock p = new peacock();
        p.eat();
        p.fly();

        Human h = new Human();
        h.blood();
        h.eat();
        Dog d = new Dog();
        d.blood();
        d.eat();
       
        
    }

    static class Animal {

        void eat() {
            System.out.println("Animal can eat");
        }
    }

    static class Fishh extends Animal {

        void fins() {
            System.out.println("Have fins");
        }
    }

    static class Bird extends Animal {

        void fly() {
            System.out.println("Can fly");
        }
    }

    static class Mammal extends Animal {

        void blood() {
            System.out.println("have warm blood");
        }
    }

    static class peacock extends Bird {

    }

    static class Human extends Mammal {

    }

    static class Dog extends Mammal {
        
        void walk(){
            System.out.println("Can walk");
        }

    }
}
