import java.util.*;

public class hea {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            //add at the last index
            arr.add(data);
            // child index
            int x = arr.size()-1;
            // parent index
            int parent = (x-1)/2;

            while(arr.get(x) < arr.get(parent)){ //O(logn)
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);

                x = parent;
                parent = (x-1)/2;
            }

        }
        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                //swap

                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove(){
            int data = arr.get(0);

            // swap
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));

            arr.set(arr.size()-1, temp);
            arr.remove(arr.size() - 1);  // Remove the last element (now at root)


            heapify(0);

            return data;
        }

        public boolean isEmpty(){

            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(3);
        hp.add(4);
        hp.add(1);
        hp.add(5);

        while (!hp.isEmpty()) {
            System.out.print(hp.peek()+" ");
            hp.remove();
        }
        
    }
}
