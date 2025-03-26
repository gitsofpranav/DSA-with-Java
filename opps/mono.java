import java.util.*;
public class mono {
    public static boolean monotonic(ArrayList<Integer>list) {
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                //monotonic increasing
                if(list.get(i) <= list.get(j)) {
                    return true;
                }
                // momotonic decreasing
                if(list.get(i) >= list.get(j)) {
                    return true;
                }
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(monotonic(list));
    }
}
