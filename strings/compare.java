public class compare {
    public static void main(String[] args) {
        String s1 = "tony";
        String s2 ="tony";
        String s3 = new String("tony");

        if(s2.equals(s3)) {
            System.out.println("strings are equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
