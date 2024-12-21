
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class PreOrderTraversal {
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
   public static Node root;
   static int idx = -1;
   public static Node buildTree(int[] nodes){ // construct tree using preOrder.
       idx++;
       if(nodes[idx] == -1){
           return null;
       }
       Node newNode = new Node(nodes[idx]);
       newNode.left = buildTree(nodes);
       newNode.right = buildTree(nodes);
      
       return newNode;
   }
   // print in PreOrder using recursion
   public static void preOrder(Node root){
       if(root == null){
           return;
       }
       System.out.print(root.val +" ");
       preOrder(root.left);
       preOrder(root.right);
       
   }
        static ArrayList<Integer> list = new ArrayList<>();
       // print in PreOrder using iterative
   public static void preOrderT(Node root){
       
       Stack<Node> s = new Stack<>();
       s.push(root);
       while(!s.isEmpty()){
           int size = s.size();
           for(int i =0; i<size; i++){
               Node curr = s.pop();
               if(curr.right != null){
                   s.add(curr.right);
               }
               if(curr.left != null){
                   s.add(curr.left);
               }
               list.add(curr.val);
           }  
       }
       
   }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        root = buildTree(nodes);
        preOrder(root);
        System.out.println("");
        preOrderT(root);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("");
        
    }

}
