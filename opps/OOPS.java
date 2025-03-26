public class OOPS {
    public static void main(String[] args) {
        Student s3 = new Student();
        Student s1 = new Student("pranav");
        System.out.println(s1.name);
        Student s2 = new Student(2209);
        System.out.println(s2.roll);

    }
}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("the constructor is called");
    }

    Student(String name) {
        this.name = name;
        //System.out.println();
    }

    Student(int roll){
        this.roll = roll;
    }
}
