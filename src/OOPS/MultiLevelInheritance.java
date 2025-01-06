
package OOPS;

public class MultiLevelInheritance {
    
    
    public static void main(String[] args) {
        
        BabyFish bf = new BabyFish();
        bf.swim();;
        bf.eat();
              
    }
    static class BabyFish extends Fishs{
        int babyf;
    }
    static class Fishs extends Ani {

        int fins;
        
        void swim(){
            System.out.println("can swim");
        }
        
    }

    static class Ani {

        void eat() {
            System.out.println("can eat");
        }
    }
    
}
