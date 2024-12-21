
package BinaryTree;


public class SubTreeofAnotherTree {
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
   public static boolean isIdentical(Node root, Node subRoot){
       if(root == null && subRoot == null ){
           return true;
       }
       if(root == null || subRoot == null||
               root.val != subRoot.val){
           return false;
       }
       return isIdentical(root.left , subRoot.left) && 
               isIdentical(root.right , subRoot.right);
   }
    
    public static boolean isSubTree(Node root, Node subRoot){
        if(root == null ){
            return false;
        }
        if( isIdentical(root,subRoot) ){
           return true;
        }
        
        return isIdentical(root.left,subRoot) ||
                isIdentical(root.right,subRoot);
    }
    
    
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        
        Node subRoot = new Node(2);
        subRoot.left =  new Node(4);
        subRoot.right =  new Node(5);
        subRoot.right.right = new Node(6);
        
        
         System.out.println("Is Subtree : "+isSubTree(root,subRoot));
    }
    
}
