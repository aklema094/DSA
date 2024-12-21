
package BinaryTree;

import java.util.ArrayList;


public class BoundaryOrderTraversal {
    

    

   
    public static class Node {
        int val;
        Node left;
        Node right;
        
        Node(int v) {
            this.val = v;
            this.left = null;
            this.right = null;
        }
    }
    // chack current is leaf node
    public static boolean isLeaf(Node root){
        if(root.left == null && root.right == null){
            return true;
        }
        return false;
    }
    // left Boundary
     private static void leftBoundary(Node root, ArrayList<Integer> list) {
       
          Node curr = root.left;
          while(curr != null){
              if(!isLeaf(curr)){
                  list.add(curr.val);
              }
              if(curr.left != null){
                  curr = curr.left;
              }
              curr = curr.right;
          }
    }
      private static void leafNodes(Node root, ArrayList<Integer> list) {
          
          if(root == null){
              return;
          }
          
          if(isLeaf(root)){
              list.add(root.val);
      
          }
          leafNodes(root.left, list);
          leafNodes(root.right,list);
          
      }
     // right Boundary
    public static void rightBoundary(Node root, ArrayList<Integer> list) {
         Node curr = root.right;
          while(curr != null){
              if(!isLeaf(curr)){
                  list.add(curr.val);
              }
              if(curr.right != null){
                  curr = curr.right;
              }
              curr = curr.left;
          }
    }
    
    
    public static void main(String[] args) {
          Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(!isLeaf(root)){
            list.add(root.val);
        }
        // add all node's from left boundary
        leftBoundary(root, list);
        // all leaf nodes
        leafNodes(root, list);
        // add all node's from right boundary
        rightBoundary(root, list);
        
        System.out.println(list);
        
        
    }
    
}
