
package BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewofBinaryTree {
     public static class Node{
       int val ;
       Node left;
       Node right;
       Node(int v){
           this.val = v;
           this.left = null;
           this.right = null;
       }
   }
     public static class Pair{
         int hd;
         Node node;
         Pair(int hd, Node n){
             this.hd = hd;
             this.node = n;
         }
     }
     static ArrayList<Integer> list = new ArrayList<>();
     
     public static void topView(Node root){
         
         Queue<Pair> q = new LinkedList<>();
         q.add(new Pair(0,root));
         HashMap<Integer,Integer> map = new HashMap<>();
         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
         while(!q.isEmpty()){
             int s = q.size();
             for(int i =0; i<s; i++){
                 Pair curr = q.remove();
                 max = Math.max(max, curr.hd);
                 min = Math.min(min, curr.hd);
                 
                 if(!map.containsKey(curr.hd)){
                     map.put(curr.hd, curr.node.val);
                 }
                 if(curr.node.left != null){
                     q.add(new Pair(curr.hd-1,curr.node.left));
                 }
                  if(curr.node.right != null){
                     q.add(new Pair(curr.hd+1,curr.node.right));
                 }
             }
             
         }
         for (int i = min; i <= max; i++) {
             list.add(map.get(i));
             
         }
         
     }
     public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        
        topView(root);
        System.out.println(list);
                
        
    }
    
}
