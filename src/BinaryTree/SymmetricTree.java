/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTree;

/**
 *
 * @author user
 */
public class SymmetricTree {
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
     public static boolean isMirror(Node left, Node right){
         if(left == null || right == null){
             return left == right;
         }
         
         return (left.val == right.val) && isMirror(left.left,right.right)
                 && isMirror(left.right,right.left);
     }
     
     public static boolean isSymmetric(Node root){
         if(root == null ){
             return true;
         }
         return isMirror(root.left,root.right);
     }
    
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(5);
        root.right.right = new Node(4);
        
        System.out.println("Is symmetrical : "+isSymmetric(root));
    }
    
}
