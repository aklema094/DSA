
package BinaryTree;

public class MaximumPathSum {
    public static class Node{
        int data;
        Node left,right;
        
        Node(int d){
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }
    public static int maxi = Integer.MIN_VALUE;
    public static int maxSum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = Math.max(0, maxSum(root.left));
        int rightSum = Math.max(0, maxSum(root.right));
        
        int currentSum = root.data + leftSum + rightSum;
        maxi = Math.max(maxi, currentSum);
        
        return root.data + Math.max(leftSum, rightSum);
        
    }
    public static void main(String[] args) {
        
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.left.left = new Node(-7);
        root.left.right = new Node(-3);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        maxSum(root);
        System.out.println("Maximum path sum = : " +maxi);
    }
    
    
}
