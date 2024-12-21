
package BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class AllNodesFromKthDistenceFromTargetNode {
    
    
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
    // find target node's and all of the parent nodes
    public static Node findTarget(Node root,HashMap<Node,Node> map, int tar){
       Queue<Node> q = new LinkedList<>();
       q.add(root);
       Node target = null;
       while(!q.isEmpty()){
           int s = q.size();
           for (int i = 0; i < s; i++) {
               Node curr = q.remove();
               if(curr.val == tar){
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
    // find all of the node's in kth distance
    public static ArrayList<Integer> findAllNodes(Node target, int dist,  ArrayList<Integer> list,HashMap<Node,Node> parantMap){
          Queue<Node> q = new LinkedList<>();
          HashMap<Node,Integer> visitMap = new HashMap<>();
          visitMap.put(target,1);
          q.add(target);
          int level =0;
          while(!q.isEmpty()){
              int s = q.size();
              int count =0;
              for (int i = 0; i < s; i++) {
                  
                  Node curr = q.remove();
                  if(curr.left != null && visitMap.get(curr.left) == null ){
                      count =1;
                      q.add(curr.left);
                      visitMap.put(curr.left,1);
                  }
                  if(curr.right != null && visitMap.get(curr.right) == null ){
                      count =1;
                      q.add(curr.right);
                      visitMap.put(curr.right,1);
                  }
                  if(parantMap.get(curr) != null && visitMap.get(parantMap.get(curr))== null){
                      count = 1;
                      q.add(parantMap.get(curr));
                      visitMap.put(parantMap.get(curr), 1);
                  }
              }
              if(count ==1){
                  level++;
              }
              if(level == dist){
                while(!q.isEmpty()){
                    list.add(q.remove().val);
                }
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
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(8);
        
        HashMap<Node,Node> parantMap = new HashMap<>();
        int tar = 2;
        int dist = 2;
        Node target = findTarget(root,parantMap,dist);
        
        //System.out.println(target.val);
       // for(Node i : parantMap.keySet()){
          // System.out.println(i.val +" -> "+parantMap.get(i).val);
       // }
        ArrayList<Integer> list = new ArrayList<>();
        findAllNodes(target,dist,list,parantMap);
        System.out.println(list);
        
        
    }
    
}
