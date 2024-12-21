
package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class LevelOrderTraversal {
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
    // print in level order by Iterative
    
    public static ArrayList<ArrayList<Integer>> levelOrder(Node root){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int s = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < s; i++) {
                Node curr = q.peek();
                list.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
                q.remove();
            }
            mainList.add(list);       
        }     
        return mainList;         
    }
    
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        System.out.println(levelOrder(root));
    }
    
}
