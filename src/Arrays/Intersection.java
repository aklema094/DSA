
package Arrays;

import java.util.ArrayList;


public class Intersection {
    
    static ArrayList<Integer> findIntersection(int[] a, int[] b){
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int i =0, j=0;
        
        while(i<a.length && j<b.length){
            
            int x = a[i];
            int y = b[j];
          
            if(x<y) i++;
            else if(x>y) j++;
            else{
                list.add(x);
                i++;
                y++;
            }
            
        }
        
        return list;
    }
    
    
    public static void main(String[] args) {
        
        int a[] = {1,2,2,3,4};
        int b[] = {2,2,3};
        
        System.out.println("Intersection is : "+ findIntersection(a,b));
    }
    
}
