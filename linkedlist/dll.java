public class dll {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            this.data = d;
        }
    }
    static Node head;
    static Node tail;
    static int size;
    public dll(){
        this.size = 0;
    }

    public static void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if(head != null){
            head.prev = newNode;
        }else {
            tail = newNode;
        }
        
        head = newNode;
        size++;

    }


    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }


        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        newNode.next = null;
        last.next = newNode;
        newNode.prev = last;
    }

    public static void addAtIndex(int after,int val){
        Node p = find(after);
        if(p == null){
            System.out.println("Node does not exits");
            return;
        }

        Node newNode = new Node(val);
        newNode.prev = p;
        newNode.next = p.next;
        p.next = newNode;
        if(newNode.next != null){
            newNode.next.prev = newNode;
        }
        
    }

    public static int remove(){
     Node p = head;
     while(p != null){
        
     }
    }

    public static Node find(int val){
        Node node = head;
        while(node != null){
            if(node.data == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public static void print(){
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.data+" ->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        while(last != null){
            System.out.print(last.data+" ->");
            last = last.prev;
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        dll list = new dll();
        list.addFirst(3);
        list.addFirst(5);
        list.addFirst(79);
        list.addLast(83);
        list.addLast(76);
        list.addAtIndex(3, 4);
        print();
    }
}
