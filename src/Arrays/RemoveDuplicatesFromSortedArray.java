
package Arrays;


public class RemoveDuplicatesFromSortedArray {
    
    public static int removeDuplicates(int[] arr){
        int j =0;
        for (int i = 1; i < arr.length; i++) {
            
            if(arr[j] != arr[i]){
                arr[j+1] = arr[i];
                j++;
            }
        }
        
        return j;
    }
    
    
    public static void main(String[] args) {
        
        int arr[] = {1,1,2,3,3,4,5,6,6};
        int j = removeDuplicates(arr);
        for (int i = 0; i <=j; i++) {
            
            System.out.print(arr[i]+", ");
            
        }
    }
    
}
