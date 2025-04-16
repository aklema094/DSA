
package Arrays;

import java.util.ArrayList;

// union of two sorted array.
public class UnionOfTwoSortedArray {
    
    public static ArrayList<Integer> union(int[] a, int[] b){
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int i=0;
        int j =0;
        
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]){
                if(list.size() == 0 || list.get(list.size() -1 ) != a[i]){
                    list.add(a[i]);
                }
                i++;
            }else{
                if(list.size() == 0 || list.get(list.size() -1 ) != b[j]){
                    list.add(b[j]);
                }
                j++;
            }
        }
        
        while(i<a.length){
            if(list.size() == 0 || list.get(list.size() -1 ) != a[i]){
                    list.add(a[i]);
                }
            i++;
        }
        
        while(j<b.length){
            if(list.size() == 0 || list.get(list.size() -1 ) != b[j]){
                    list.add(b[j]);
                }
            j++;
        }
        
        
        return list;
    }
    
    public static void main(String[] args) {
        
        int a[] ={1,1,2,3,3,4,5};
        int b[] = {1,2,3,3,6};
        
        ArrayList<Integer> result = union(a,b);
        System.out.println(result);
        
    }
    
}
