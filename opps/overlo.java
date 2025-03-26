public class overlo {
    public static void main(String[] args) {
        Claculator c1 = new Claculator();
        System.out.println(c1.sum(4,2));
        System.out.println(c1.sum((float)1.5,(float)2.5));
    }
}

class Claculator {
    int sum(int a, int b) {
        return a+b;
    }

    float sum(float a ,float b) {
        return a+b;
    }
    int sum(int a, int b, int c) {
        return a+b+c;
    }
    
}
