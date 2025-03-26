import java.util.*;
import java.util.LinkedList;

public class qjcf {
    public static void main(String[] args) {
      Queue<Integer> q = new LinkedList<>(); 
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(15);

      while(!q.isEmpty()){
          System.out.println(q.peek());
          q.remove();
      }
    }
}
