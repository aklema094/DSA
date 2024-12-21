
package BinaryTree;

public class PostOrder {
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
   // print in PostOrder using recursion
   public static void postOrder(Node root){
       if(root == null){
           return;
       }
       postOrder(root.left);
       postOrder(root.right);
       System.out.print(root.val +" ");
      
   }
      public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        postOrder(root);
        System.out.println("");
           
    }
}
