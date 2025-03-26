public class cll {
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
        }
    }
    static Node head;
    static Node tail;


    public static void add(int data){
        Node nwNode = new Node(data);
        if(head == null){
            head = tail = nwNode;
            return;
        }
        nwNode.next = head;
        tail.next = nwNode;
        tail = nwNode;
    }

    public static Node find(int val){
        if(head == null){
            return null;
        }

        Node temp = head;
        if(temp != null){
            if(temp.data == val){
                do{
                    return temp;
                    
                } while(temp != head);
            }
        }
        
    }

    public static void print(){
        Node temp = head;
        if(temp != null){
            do{
                System.out.print(temp.data+" ->");
                temp = temp.next;
            } while(temp != head);
        }
        System.out.println("End");
    }
    public static void main(String[] args) {
        cll list = new cll();
        list.add(2);
        list.add(8);
        list.add(9);
        list.add(23);

        print();

    }
}
