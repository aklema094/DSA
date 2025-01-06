package OOPS;

class Fishs extends Anial {
   @Override
   void eat(){
       System.out.println("Fish can eat");
   }

}

class Anial {

    void eat() {
        System.out.println("can eat");
    }
}

public class MethodOverridingg {

    public static void main(String[] args) {

        Fishs f = new Fishs();
        //f.eat();
        Anial a = new Anial();
        a.eat();
        Anial b = new Fishs();
        b.eat();
    }

}
