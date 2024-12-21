
package BinaryTree;

public class Diameter {
    
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
    public static class Info{
        int diam, ht;
        Info(int d, int h){
            this.diam = d;
            this.ht = h;
        }
    }
    
    public static Info diameter(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftDiam = diameter(root.left);
        Info rightDiam = diameter(root.right);
        int selfDiam = leftDiam.ht + rightDiam.ht;
        
        int diam = Math.max(selfDiam, Math.max(leftDiam.diam, rightDiam.diam));
        int ht = Math.max(leftDiam.ht, rightDiam.ht)+1;
        
        return new Info(diam,ht);  
    }
   
      public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.right.right = new Node(8);
        
       
        System.out.println(diameter(root).diam);
        
           
    }
    
}
