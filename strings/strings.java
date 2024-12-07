import java.util.*;
public class strings {
    public static void printletter(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("enter your name");
        //String name = sc.nextLine();
        //String name = "Anshu";
        // System.out.println(name.length());

        //concatenation 
        String fullname = "anshu";
        String lastname = "priya";
        fullname = fullname + " " + lastname;
        printletter(fullname);
    }
}