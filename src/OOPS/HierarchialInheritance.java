package OOPS;

public class HierarchialInheritance {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        Cat c = new Cat();
        c.eat();
        Fish f = new Fish();
        f.eat();

    }

    static class Anim {

        void eat() {
            System.out.println("Animal can eat");
        }
    }

    static class Dog extends Anim {

        void walk() {
            System.out.println("Have four lags");
        }
    }

    static class Cat extends Anim {

        void talk() {
            System.out.println("Can talk like mew");
        }
    }

    static class Fish extends Anim {

        void swim() {
            System.out.println("Can swim");
        }

    }

}
