
package Arrays;

//Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.
public class LeftRotation {
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        rotation(arr,3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void rotation(int[] arr, int k) {
        
        int n = arr.length;
        int r = k%n;
        
        reverse(0,r-1,arr);
        reverse(r,n-1,arr);
        reverse(0,n-1,arr);
        
    }

    private static void reverse(int s, int e, int[] arr) {
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    
}
