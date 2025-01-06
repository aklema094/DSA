
package OOPS;
interface First{
    public void firstI();
    public void run();
}
interface Sec{
    public void secI();
    public void run();
}

class C implements First, Sec{

    @Override
    public void firstI() {
        System.out.println("First");
    }
    
    public void run(){
        System.out.println("can run");
    }

    @Override
    public void secI() {
        System.out.println("2nd");
       
    }
    
}
public class MultipleInheritance {
    
    public static void main(String[] args) {
        C c = new C();
        c.firstI();
        c.secI();
        c.run();
       
    }
    
}
