public class cqueue {
    static class circleq {
        int arr[];
        int size;
        int rear;
        int front;

        circleq(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
     
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
    }

    public static void main(String[] args) {
        
    }
}