public class abstra {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();

        chicken c = new chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal {
    String color;
    Animal() {
       color = "brown";
    }
    void eat() {
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("wilks on 4 legs");
    }
}

class chicken extends Animal{
    void changeColor() {
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}

