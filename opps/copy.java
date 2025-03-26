public class copy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Pranav";
        s1.roll = 1234;
        s1.password = "qwer";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

       Student s2 = new Student(s1); //copy
       s2.password = "asdf";
       s1.marks[2] = 100; 
       for(int i=0; i<3; i++) {
        System.out.println(s2.marks[i]);
       }
    }
}

class Student {
    int marks[];
    String name;
    int roll;
    String password;

    Student() {
        marks = new int[3];
    }
       // shallowcopy constructor
   // Student(Student s1) {
     //   marks = new int[3];
       //  this.name = s1.name;
         //this.roll = s1.roll;
        // this.marks = s1.marks;
    //}

    //deep copy constructor 
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
