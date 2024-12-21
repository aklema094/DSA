
package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class LeftViewandRightView {
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
     // left view of binary tree
     public static ArrayList<Integer> leftView(Node root){
        
         ArrayList<Integer> list = new ArrayList<>();
         Queue<Node> q = new LinkedList<>();
         
         q.add(root);
         while(!q.isEmpty()){
             int s = q.size();
             
             for (int i = 0; i < s; i++) {
                 Node curr = q.poll();
                 if(i == 0){
                     list.add(curr.val);
                 }
                 if(curr.left != null){
                     q.add(curr.left);
                 }
                 if(curr.right != null){
                     q.add(curr.right);
                 }
             }
             
             
         }
         return list;
         
     }
     // right view of binary tree
     public static ArrayList<Integer> rightView(Node root){
        
         ArrayList<Integer> list = new ArrayList<>();
         Queue<Node> q = new LinkedList<>();
         
         q.add(root);
         while(!q.isEmpty()){
             int s = q.size();
             
             for (int i = 0; i < s; i++) {
                 Node curr = q.poll();
                 if(i == s-1){
                     list.add(curr.val);
                 }
                 if(curr.left != null){
                     q.add(curr.left);
                 }
                 if(curr.right != null){
                     q.add(curr.right);
                 }
             }
                  
         }
         return list;
         
     }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.left.right.right = new Node(6);
        
        
        System.out.println(leftView(root));
        System.out.println(rightView(root));
        
        
        
    }
    
}
