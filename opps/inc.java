public class inc {
    public static void ince(int n) {
        if(n==1) {
            System.out.print(n+ " ");
            return;
        }
        
        ince(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
        int n = 10;
        ince(n);
    }
}
