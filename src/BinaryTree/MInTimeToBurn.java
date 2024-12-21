/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


public class MInTimeToBurn {
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
     public static Node findTarget(Node root, HashMap<Node, Node> map, int start){
         
         Queue<Node> q = new LinkedList<>();
         q.add(root);
         Node target = null;
         while(!q.isEmpty()){
             int s = q.size();
             for(int i=0; i<s; i++){
                 Node curr = q.remove();
                 if(curr.val == start) {
                     target = curr; 
                 }
                 if(curr.left != null){
                     q.add(curr.left);
                     map.put(curr.left, curr);
                 }
                 if(curr.right != null){
                     q.add(curr.right);
                     map.put(curr.right, curr);
                 }
             }
         }
         
         return target;
         
     }
    
      // find total burn time
     public static int findBurnTime(HashMap<Node, Node> map, Node target){
         
         Queue<Node> q = new LinkedList<>();
         q.add(target);
         HashMap<Node, Integer> visit = new HashMap<>();
         visit.put(target, 1);
         int time = 0;
         while(!q.isEmpty()){
             int s = q.size();
             int count = 0;
             for(int i = 0; i< s; i++){
                 Node curr = q.remove();
                 if(curr.left!=null && visit.get(curr.left) == null){
                     count =1;
                     q.add(curr.left);
                     visit.put(curr.left, 1);
                 }
                  if(curr.right!=null && visit.get(curr.right) == null){
                     count =1;
                     q.add(curr.right);
                     visit.put(curr.right, 1);
                 }
                 if(map.get(curr) != null && visit.get(map.get(curr)) == null){
                     count =1;   
                     q.add(map.get(curr));
                     visit.put(map.get(curr), 1);
                 }
             }
             if(count == 1){
                 time++;
             }
         }
         
         return time;
     }
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(7);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        
        // store all parent node's to the map
        HashMap<Node, Node> parentMap = new HashMap<>();
        Node target = findTarget(root, parentMap, 6 );
        
        //for(Node i : parentMap.keySet()){
       //     System.out.println(i.val +" -> "+parentMap.get(i).val);
        //}
       
        
        int burnTime = findBurnTime(parentMap,target);
        
        System.out.println(" Total burn time "+burnTime);
    }
}
