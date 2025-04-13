/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;


public class SecondLargestandSmallest {
      public static int[] getSecondOrderElements(int n, int []arr) {
     
     int largest = arr[0];
     int slargest = Integer.MIN_VALUE;
     int smallest = arr[0];
     int sSmallest = Integer.MAX_VALUE;


     for(int i =0; i<n; i++){
         if(arr[i]>largest){
             slargest = largest;
             largest = arr[i];
         }else if(arr[i]>slargest && arr[i] != largest){
             slargest = arr[i];
         }
          if(arr[i]<smallest){
             sSmallest = smallest;
             smallest = arr[i];
         }else if(arr[i]<sSmallest && arr[i] != smallest){
             sSmallest = arr[i];
         }

     }

     return new int[]{slargest,sSmallest};
     
    }
    
    
    public static void main(String[] args) {
        
        int[] arr = {3,4,5,2};
        
       int[] result = getSecondOrderElements(arr.length,arr);
        System.out.println(result[0]+", "+result[1]);
    }
    
}
