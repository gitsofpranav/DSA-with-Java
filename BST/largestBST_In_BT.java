public class largestBST_In_BT {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        static class INFO {
            boolean isBST;
            int size;
            int min;
            int max;
            INFO(boolean isBST,int size, int min, int max){
                this.isBST = isBST;
                this.size = size;

                this.min = min;
                this.max = max;
            }
        }
        public static int maxBST = 0;
        public static INFO largestBST(Node root){

           INFO leftInfo = largestBST(root.left);
           INFO rightInfo = largestBST(root.right);

           int size = leftInfo.size + rightInfo.size +1;
           int min = Math.min(root.data, Math.min(leftInfo.min , rightInfo.min));
           int max = Math.max(root.data, Math.max(leftInfo.max , rightInfo.max));

           if(root.data <= leftInfo.max || root.data >= rightInfo.min);{
           return new INFO(false, size, min, max);
        }

        if(leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(maxBST,size);
            new INFO(true , size,min,max);

        }

        }
    }
    public static void main(String[] args) {
        Node root = new Node(50);
root.left = new Node(30);
root. left. left = new Node( 5);
root. left.right = new Node(20);

root.right = new Node(60);
root. right. left = new Node(45);
root.right.right = new Node(70);
root. right. right. left = new Node( 65);
root. right.right. right = new Node(80);
    }
}
