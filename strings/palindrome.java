public class palindrome {
    public static boolean palindrome(String str) {
      for(int i=0; i<str.length()/2; i++) {
      if(str.charAt(i) != str.charAt(str.length()-1-i)) {

        }
      } 
      return true;     
    }

    public static float getshortestPath(String path) {
      int x=0, y=0;
      for(int i=0; i<path.length(); i++) {
        char dir = path.charAt(i);
        //south
        if(dir == 'S') {
          y--;
        }
        //north
        else if(dir == 'N') {
          y++;
        }
        //west
        else if(dir == 'W') {
          x--;
        }
        //east
        else {
          x++;
        }
      }
      //int X2 = x*x; 
      //int Y2 = y*y;  
      //return (float)Math.sqrt(X2 + Y2);
      return (float) Math.sqrt(x * x + y * y);
    }
    public static void main(String[] args) {
        //String str = "racecar";
        //System.out.println(palindrome(str));

        String path = "WEENESENNN";
        System.out.println(getshortestPath(path));
    }
}
