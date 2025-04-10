
package ErrorHandelinginJava;


public class ErrorHandeling {
        static int[] numerators = {10,200,30,40};
        static int[] denominators = {1,2,0,4};
       
    public static void main(String[] args) {
        
     
     
        
        for (int i = 0; i < numerators.length; i++) {
            
            System.out.println(divide(numerators[i],denominators[i]));
            
        }
        
         try{
              for (int i = 0; i < 10; i++) {
               System.out.println(denominators[i]);
          }
         }catch(ArrayIndexOutOfBoundsException e){
          System.out.println(e);
         
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
    }catch(ArrayIndexOutOfBoundsException e){
          System.out.println(e);
          return -1;
    }
          
}
}

