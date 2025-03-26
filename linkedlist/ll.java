public class ll{
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;
    static int size;

    public ll(){
        this.size = 0;
    }

    public static void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public static void addLast(int data){
        Node newLastNode = new Node(data);
        if(head == null){
            head = tail = newLastNode;
            return;
        }
        tail.next = newLastNode;
        tail = newLastNode;

        size++;
    }

    public static void addAtIndex(int val, int idx){
        if(idx == 0){
            addFirst(val);
            return;
        }
        if(idx == size){
            addLast(idx);
            return;
        }

        Node temp = get(idx);
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public static int removeFirst(){
        if(head == null){
            return 0;
        }
        int data =  head.data;
        head = head.next;
        size--;
        return data;
    }

    public static int removeLast(){
        if(size <= 1){
            return removeFirst();
        }
        Node secNode = get(size-1);
        int val = tail.data;
        tail = secNode;
        tail.next = null;
        size--;

        return val;
    }

    public static int removeAtIndex(int idx){
        if(idx == 0){
            return removeFirst();
        }
        if(idx == size-1){
            return removeLast();
        }

        Node prev = get(idx-1);
        int val = prev.next.data;
        prev.next = prev.next.next;
        size--;

        return val;
        
    }

    public static Node find(int Value){
        Node temp = head;
        
        while(temp != null){
            if(temp.data == Value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public static Node get(int idx){
        Node temp = head;
        int i=0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        return temp;
    }

    public static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("The likedLIst has Empty Now");
    }
    public static void main(String[] args){
        ll list = new ll();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(9);
        ll.addLast(1);
        ll.addLast(7);
        ll.addLast(16);
        ll.print();
        // ll.addAtIndex(42, 4);
        // ll.print();

        // System.out.println(ll.removeFirst());
        // ll.print();

        System.out.println(ll.removeLast());
        ll.print();

        // System.out.println(removeAtIndex(2));
        // ll.print();

        // System.out.println(find(1098));
    }
}