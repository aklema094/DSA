
package BinarySearchTree;


public class InsetAndDeleteNode {
    
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
    public static Node insert(Node root,int val){
        if(root == null){
            return new Node(val);
        }
        if(val<root.val){
            root.left = insert(root.left,val);
        }else if(val>root.val){
            root.right = insert(root.right,val);
        }
        return root;
    }
    
    public static void inOrder(Node root){
        if(root == null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static Node deleteNode(Node root,int key){
        if(root == null) return null;
        if(key>root.val){
            root.right = deleteNode(root.right,key);
        }else if(key<root.val){
            root.left = deleteNode(root.left,key);
        }else{// if root.val == key
            // case 1 : if root have no child
            if(root.left == null && root.right == null){
                return null;
            }
            // case 2 : if root have one child
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            // case 3 : if root have both child
            // find in order succesor and replace it's value with root value;
            Node Is = inOrdersuccessor(root.right);
            root.val = Is.val;
            // detete in order succesor from tree 
            root.right = deleteNode(root.right,Is.val);
            
            
        }
        return root;
    }
    public static Node inOrdersuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int[] nodes = {12,5,13,4,10,7,11,8};
        Node root =  null;
        for (int i = 0; i < nodes.length; i++) {
            
            root = insert( root, nodes[i]);
            
        }
        inOrder(root);
        System.out.println("");
        deleteNode(root,5);
        inOrder(root);
        System.out.println("");
        deleteNode(root,10);
        inOrder(root);
        
    }
    
}
