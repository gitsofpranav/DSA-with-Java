public class q1 {
    static class Node{
        int data;
        Node left;
        Node rigth;
        Node(int data){
            this.data = data;
            this.left = null;
            this.rigth = null;
        }
    }

    public static int findClosestInBSt(Node root, int k){
        int closest = root.data;
        while(root != null){
            if(Math.abs(k-root.data) < Math.abs(k-closest)){
                closest = root.data;
            }

            if(k<root.data){
                root = root.left;
            } else if(k>root.data){
                root = root.rigth;
                
            } else {
                return root.data;
            }
        }
        return closest;
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.rigth = new Node(6);
        root.rigth = new Node(11);
        root.rigth.rigth = new Node(20);

        int k = 5;
        System.out.println(findClosestInBSt(root, 5));
    }
}
