
package Arrays;


public class MovesZeros {
    
    public static void main(String[] args) {
        int result[] = new int[10];
        int arr[] = {1,0,2,3,0,0,4,5,0,6};
        result = setZeros(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

    private static int[] setZeros(int[] a) {
        int arr[] = a;
        int j = -1;
      
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] == 0){
                j =  i;
                break;
            }
            
        }
        System.out.println(" value of j : "+j);
        if(j == -1){
            return arr;
        }
        for (int i = j+1; i < arr.length; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}
