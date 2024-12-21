/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewofBinaryTree {
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
    
    public static class Pair {
        int hd;
        Node node;
        
        Pair(int hd, Node n) {
            this.hd = hd;
            this.node = n;
        }
    }
    
    public static ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
      
        
        q.add(new Pair(0, root));
        
        while (!q.isEmpty()) {
            int s = q.size();
            for (int i = 0; i < s; i++) {
                Pair curr = q.remove();
                 map.put(curr.hd, curr.node.val);
              
                if (curr.node.left != null) {
                    q.add(new Pair(curr.hd - 1, curr.node.left));
                }
                
                if (curr.node.right != null) {
                    q.add(new Pair(curr.hd + 1, curr.node.right));
                }
            }
        }
        
       for(int i : map.values()){
           list.add(i);
       }
        
        return list;
    }
    
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        
        ArrayList<Integer> result = bottomView(root);
        System.out.println(result);
    }
}
