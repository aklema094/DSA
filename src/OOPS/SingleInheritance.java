package OOPS;

public class SingleInheritance {

    public static void main(String[] args) {

        Fishs f = new Fishs();
        f.eat();
    }

    static class Fishs extends Ani {

        int fins;
        
    }

    static class Ani {

        void eat() {
            System.out.println("can eat");
        }
    }

}
