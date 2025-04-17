
package Arrays;


public class MissingNumber {
    
   static int missingNumber(int a[]){
        
        int sum =0;
        int n = 5;
        
        for (int i = 0; i < a.length; i++) {
             sum += a[i];
        }
       
        return (n*(n+1))/2 - sum;
    }
    
    public static void main(String[] args) {
        
        int arr[] = {1,3,4,5};
        missingNumber(arr);
        System.out.println("Missing Number is : "+missingNumber(arr));
    }
    
}
