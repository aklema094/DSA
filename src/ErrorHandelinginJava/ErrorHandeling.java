
package ErrorHandelinginJava;


public class ErrorHandeling {
     
       
    public static void main(String[] args) {
        
     
        int[] numerators = {10,200,30,40};
        int[] denominators = {1,2,0,4};
        
        for (int i = 0; i < numerators.length; i++) {
            
            System.out.println(divide(numerators[i],denominators[i]));
            
        }
       
        
    }
    
    
    public static int divide(int a,int b){
       
        Test t = new Test();
        t = null;
      try{
           t.setValue(10);
            return a/b;
            
    }catch(NullPointerException e){
          System.out.println(e);
          return -1;
    }catch(ArithmeticException e){
          System.out.println(e);
        return -1;
    }
          
}
}

