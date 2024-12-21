
public class AvlTree {
    
    public static class Node{
        int data;
        Node left;
        Node right;
        int ht;
        Node(int data){
            this.data = data;
            this.ht = 1;
            this.left = null;
            this.right = null;
        }
    }
    public static Node root; 
   
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return root.ht;
    }
   
    // Balance factor
     public static int getBalanced(Node root){
         if(root == null){
             return 0;
         }
         return height(root.left) - height(root.right);
     }
     //left rotation
     public static Node leftRotate(Node x){
          Node y = x.right;
          Node t2 = y.left;
          
          //perform rotation
          y.left = x;
          x.right = t2;
          
          x.ht = Math.max(height(x.left),height(x.right))+1;
          y.ht  = Math.max(height(y.left),height(y.right))+1;
          
          return y;
          
     }
     // right rotation 
     public static Node RightRotate(Node y){
         Node x = y.left;
         Node t2 = x.right;
          
          //perform rotation
          x.right = y;
          y.left = t2;
          
          y.ht = Math.max(height(y.left),height(y.right))+1;
          x.ht = Math.max(height(x.left),height(x.right))+1;
          
          
          return x;
     }
    // insert node to bst
    public static Node insert(Node root, int key){
        if (root == null){
            return new Node(key);
        }
        
        if(key < root.data){
            root.left = insert(root.left,key);
        }
        else if(key > root.data){
            root.right = insert(root.right,key);
        }
        else 
            return root;
        //Update root height
        root.ht = 1+ Math.max(height(root.left), height(root.right));
        
        // Get root's balance factor
        int bf = getBalanced(root);
        
        // left left case
        if(bf > 1 && key<root.left.data){
  
             return RightRotate(root);
        }
        // right right case
         if(bf < -1 && key > root.right.data){
           return leftRotate(root);
        }
         // left right case
         if(bf>1 && key>root.left.data){
            root.left = leftRotate(root.left);
            return RightRotate(root);
        }
         //right left case
         if(bf<-1 && key<root.right.data){
            root.right = RightRotate(root.right);
            return leftRotate(root);
        }
          
        return root;
        
    }
    public static void preOrder(Node root){
        
        if(root == null){
            return ;
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
