public class inhe {
    
    public static void main(String[] args) {
       Dog doggy = new Dog();
       doggy.eat();
       doggy.legs = 4;
       System.out.println(doggy.legs);
        
    }
}
//base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breadth() {
        System.out.println("breadth");
    }
}

class Mammals extends Animal {
    int legs;
}

//derived class

class Dog extends Mammals {
    String breed;
}
