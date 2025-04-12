
import java.util.HashSet;


/*You are given an array arr consisting of ‘N’ integers. Your task is to find 
the largest number,‘K’, such that both the values ‘K’ and -‘K’ are present in 
the given array 'arr'. If no such number exists, then return '-1'.
For example:
Consider ‘arr’ = [1,2,-2,-1], the largest value of ‘K’ is 2, since a negative 
of 2 is also present in the array. Hence, the answer is 2.
package Arrays; */


public class LargestNumberOfKandminusK {
    
    public static int findLargest(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        
        int largest = -1;
        for(int num : arr){
            if(set.contains(-num)){
                largest = Math.max(Math.abs(num), largest);
            }
            set.add(num);
        }   
        return largest;
         
    }
    public static void main(String[] args) {
        
        int arr[] = {3,2,4,-3,5,-2,-4};
        
        System.out.println("Largest Number is : "+findLargest(arr));
        
    }
}