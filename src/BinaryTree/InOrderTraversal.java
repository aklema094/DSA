
package BinaryTree;

import java.util.ArrayList;
import java.util.Stack;


public class InOrderTraversal {
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
   // print in InOrder using recursion
   public static void inOrder(Node root){
       if(root == null){
           return;
       }
       inOrder(root.left);
       System.out.print(root.val +" ");
       inOrder(root.right);
       
   }
        // Print in Inorder using iteration 
   public static ArrayList<Integer> inOrderT(Node root){
       Stack<Node> s = new Stack<>();
       ArrayList<Integer> list = new ArrayList<>();
       
       Node node = root;
       
       while(true){
           if(node != null){
               s.push(node);
               node = node.left;  
           }else{
               if(s.isEmpty()){
                   break;
               }
               node = s.pop();
               list.add(node.val);
               node = node.right;
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
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        inOrder(root);
        System.out.println("");
        
        ArrayList<Integer> list = inOrderT(root);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("");
          
    }
 
    
}
