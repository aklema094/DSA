package BinaryTree;

public class SkewedTree {
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
    
    public static boolean isSkewed(Node root) {
        if (root == null) {
            return true;
        }
        
        // Check if the current node is skewed
        if (root.left != null && root.right != null) {
            return false;
        }
        
        // Recursively check the left and right subtrees
        boolean leftSkewed = isSkewed(root.left);
        boolean rightSkewed = isSkewed(root.right);
        
        return leftSkewed && rightSkewed;
    }

    public static void main(String[] args) {
        Node root = new Node(0);
        root.left = new Node(1);
        //root.right = new Node(-1);
        root.left.left = new Node(2);
        root.left.left.left = new Node(3);
        root.left.left.left.left = new Node(4);
        root.left.left.left.left.left = new Node(5);
        root.left.left.left.left.left.left = new Node(6);
        
        System.out.println(isSkewed(root)); 
       // should output false, because the tree is not skewed.
    }
}
