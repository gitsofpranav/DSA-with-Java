public class hire {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.eat();
        b1.fly();
    }
}
//base class
class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }


    void breadth(){
        System.out.println("breadth");
    }
}

//derived class
class Mammals extends Animal {
     void walk(){
        System.out.println("walks");
     }
}

class Fish extends Animal {
    void swim(){
       System.out.println("swim in water");
    }
}

class Bird extends Animal {
    void fly(){
       System.out.println("fly");
    }
}


