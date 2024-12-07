public class bit {
    public static void oddorEven(int n ) {
       int bitMask = 1;
       if((n & bitMask) == 0) {
        System.out.println("Even");
       }
       else {
        System.out.println("odd");
       }
    }
    public static void main(String[] args) {
        oddorEven(4);
        oddorEven(3);
        oddorEven(11);
    }
}
