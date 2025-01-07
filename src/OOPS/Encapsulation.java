package OOPS;

public class Encapsulation {

    private int age = 5;

    int get() {

        return age;

    }

    void set(int a) {
        this.age = a;
    }

    public static void main(String[] args) {
        Encapsulation ep = new Encapsulation();
        System.out.println(ep.age);
    }

}

class Test {

    public static void main(String[] args) {
        Encapsulation epp = new Encapsulation();
        // epp.age --> not accessage
        System.out.println(epp.get());
        epp.set(10);
        System.out.println(epp.get());
    }
}
