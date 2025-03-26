import java.util.ArrayList;
public class al {
    public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<>();
     list.add(1);
     list.add(2);
     list.add(4);
     System.out.println(list); 
     int ele = list.get(2);
     System.out.println(ele);  
     //delete
    // list.remove(2);
     //System.out.println(list);
     //set
    // list.set(2, 10);
     //System.out.println(list);
     System.out.println(list.contains(9));
     System.out.println(list.contains(4));
    }
}
