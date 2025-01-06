
package OOPS;
interface First{
    public void firstI();
}
interface Sec{
    public void secI();
}

class C implements First, Sec{

    @Override
    public void firstI() {
        System.out.println("First");
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
       
    }
    
}
