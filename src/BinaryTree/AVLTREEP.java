
public class AVLTREEP {
    public static class Node{
        int data;
        int height;
        Node left,right;
        Node(int d){
            this.data = d;
            this.height = 1;
            this.left = null;
            this.right = null;
        }
    }
    public static Node root;
    // Height count
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return root.height;
    }
    // Balance factor
    public static int getBalanceFactor(Node root){
        if(root == null){
            return 0;
        }
        return height(root.left)-height(root.right);
    }
    // Left rotation
    public static Node leftRotation(Node x){
        Node y = x.right;
        Node t2 = y.left;
        // perform rotation
        y.left = x;
        x.right = t2;
        
        // update height 
        x.height = 1+Math.max(height(x.left),height(x.right));
        y.height = 1+Math.max(height(y.left),height(y.right));
        
        return y;   

          
    }
    // Right rotation
    
    public static Node rightRotation(Node y){
        Node x = y.left;
        Node t2 = x.right;
        
        //perform rotation 
        x.right = y;
        y.left = t2;
        
        // update height
        y.height = 1+Math.max(height(y.left),height(y.right));
        x.height = 1+Math.max(height(x.left),height(x.right));
        
        return x;
        
    }
    // Insert node
    public static Node insert(Node root, int key){
        if(root == null){
            return new Node(key);
        }
        if(key < root.data){
            root.left = insert(root.left,key); // Insert in left side
        } else if(key > root.data){
            root.right = insert(root.right,key); // Insert in right side
        } else{
            return root; // No duplicate value allowed in bst
        }
        
        // Update height
        root.height = 1+ Math.max(height(root.left), height(root.right));
        
        // Get root's balance factor
         int bf = getBalanceFactor(root);
         
         // Left left case:
         if(bf>1 && key< root.left.data){
             return rightRotation(root);
         }
         // Right right case;
         if(bf<-1 && key> root.right.data){
             return leftRotation(root);
         }
         // Left right case:
         if(bf > 1 && key>root.left.data ){
             root.left = leftRotation(root.left);
             return rightRotation(root);
         }
         // Right left case:
         if(bf < -1 && key<root.right.data ){
             root.right = rightRotation(root.right);
             return leftRotation(root);
         }
        
        return root;
            
    }
    // Print in preOrder
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    
    public static void main(String[] args) {
         
         root = insert(root, 10);
         root = insert(root, 20);
         root = insert(root, 30);
         root = insert(root, 40);
         root = insert(root, 50);
         root = insert(root, 25);
         
         
         preOrder(root);
    }
    
}
