
public class InsertionSort {
    
    public static void main(String[] args) {
           int arr[] = {5,4,1,3,2};
      for(int i = 1; i<arr.length;i++){
          int curr = arr[i];
          int pre = i-1;
          while(pre>=0 && curr<arr[pre]){
              arr[pre+1] = arr[pre];
              pre--;
          }
          arr[pre+1] = curr;
      }
      for(int i =0; i<arr.length; i++){
          System.out.print(arr[i] +" ");
      }
    }
    
}
