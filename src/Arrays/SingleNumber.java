
package Arrays;


public class SingleNumber {
    
    public static int singleNumber(int[] a){
        
        int x =0;
        
        for (int i = 0; i < a.length; i++) {
            
            x = x^a[i];
        }
        
        return x;
    }
    
    public static void main(String[] args) {
        
        int arr[] = {1,1,2,3,3,4,4};
        
        System.out.println("Single number is : "+singleNumber(arr));
    }
    
}
