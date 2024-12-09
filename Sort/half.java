public class half {
    public static void half_reversed() {
        for(int i=1; i<=4; i++) {
            // inner loop
            for(int j=1; j<= 4-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        half_reversed();
    }
}
