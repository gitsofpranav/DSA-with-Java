import java.util.*;
public class build_bst{
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int values){
        if(root == null){
            root = new Node(values);
            return root;
        }

        if(root.data > values){
         root.left =    insert(root.left, values);
        }

        if(root.data < values){
           root.right = insert(root.right, values);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
       
        inorder(root.left); 
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root ,  int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
           return search(root.left, key);
        } else {
            return search(root.right, key);
        }
       
    }

    public static Node delete(Node root, int val){

        if (root == null) {
            return null; // Base case: if the tree is empty
        }
        if(root.data > val){
            root.left = delete(root.left, val);
        } else if(root.data < val){
            root.right = delete(root.right, val);
        }else { // case 1
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }

            // case 3
            Node IS = foundInorderSuccessor(root.right);
            root.data = IS.data;
           root.right =  delete(root.right, IS.data);

        }
        return root;
    }

    public static Node foundInorderSuccessor(Node root){
        while(root.left != null){
            root =  root.left;
        }
        return root;
    }
    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }

        if(root.data >= k1 && root.data <=k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+ " ");
            printInRange(root.right, k1, k2);
        } else if(root.data > k2){
            printInRange(root.left, k1, k2);
        }else {
            printInRange(root.right, k1, k2);
        }
    }
    public static void printpath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }
    
    public static void rootTo_leafPath(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printpath(path);
        }
        rootTo_leafPath(root.left, path);
        rootTo_leafPath(root.right, path);
        path.remove(path.size()-1);
    }

    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        } else if(max != null && root.data >= max.data){
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static Node mirror(Node root){
        if(root == null){
            return null;
        }

        Node lefts = mirror(root.left);
        Node rights = mirror(root.right);

        root.left = rights;
        root.right = lefts;

        return root;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int[] values = {8,5,3,1,4,6,10,11,14};
        Node root =  null;

        for(int i =0; i<values.length; i++){
            root = insert(root , values[i]);
        }
        inorder(root);
        System.out.println();

        // if(search(root, 28)){
        //     System.out.println("found");
        // } else {
        //     System.out.println("not found");
        // }

        // root = delete(root, 1);
        // System.out.println();

        // inorder(root);
        // System.out.println();

        // printInRange(root, 5, 12);
        // rootTo_leafPath(root, new ArrayList<>());

        // if(isValidBST(root, null, null)){
        //     System.out.println("is valid");
        // } else {
        //     System.out.println("not valid");
        // }

        mirror(root);
        preorder(root);

    }
}