
package BinaryTree;


public class BalancedBinaryTree {
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
     public static int isBalanced(Node root){
         
         if(root == null){
             return 0;
         }
         int left = isBalanced(root.left);
         if(left == -1){
             return -1;
         }
         int right = isBalanced(root.right);
         if(right == -1){
             return -1;
         }
         if(Math.abs(left - right)> 1){
             return -1;
         }
         return 1 + Math.max(left, right);
         
     }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        if(isBalanced(root) == -1){
            System.out.println("It's not a balanced binary tree");
        }else{
            System.out.println("It's a balanced binary tree");
        }
        
    }
    
}
