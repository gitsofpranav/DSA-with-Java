public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
           return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (tail == null) {  // If the list is empty
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printll(){
        Node temp = head;
        if(head == null) {
            System.out.print("null");
            return;
        }
        while(temp != null) {
            System.out.print(temp.data+ "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1){
           temp = temp.next;
           i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public int removeFirst(){
        int val = head.data;
        head = head.next;
        return val;
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }
        head = prev;
    }

    public void deleteNthFromEnd(int n) {
        int size = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }

        if(n == size) {
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = size-n;
        Node prev = head;
        while(i != iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow =  slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //LinkedList ll = new LinkedList();
       
       // ll.addFirst(2);
        
       // ll.addFirst(1);
        
        //ll.addLast(3);
        
       // ll.addLast(4);
       // ll.add(2, 10);
       // ll.printll();
        //System.out.println(ll.size);
       // ll.removeFirst();
        //ll.printll();
        //ll.reverse();
        //ll.printll();
       // ll.deleteNthFromEnd(3);
       // ll.printll();
       head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = head;
       System.out.println(isCycle());


    }
    
}
