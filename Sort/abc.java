public class abc {
    public static void character() {
        char ch = 'A';
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        character();
    }
}
