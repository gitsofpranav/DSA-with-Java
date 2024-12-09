public class number {
    public static void half_pyramid() {
        int num =1;
        // outer loop
        for(int i=1; i<= 4; i++) {
            // inner loop
            for(int j=1; j<=i; j++) {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        half_pyramid();
    }
}
